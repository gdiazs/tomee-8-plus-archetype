#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import ${package}.${artifactId}.entities.Post;

@Repository
public interface PostRepository extends EntityRepository<Post, String>{
}
