#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.web.resources.blog;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import ${package}.${artifactId}.entities.Post;
import ${package}.${artifactId}.repository.PostRepository;

@Path("/blog/posts")
@Singleton
public class PostResource {

	private PostRepository postRepository;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPots() {
		return Response.ok(this.postRepository.findAll()).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public Response save(final PostDto post) {
		final Post newPost = new Post();
		newPost.setTitle(post.getTitle());
		newPost.setContent(post.getContent());

		final Post savedPost = this.postRepository.save(newPost);
		return Response.ok(savedPost).build();
	}

	@Inject
	public void setPostRepository(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
}
