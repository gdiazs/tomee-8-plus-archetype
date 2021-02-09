#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.entities;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posts")
@Getter @Setter
@NoArgsConstructor
public class Post {
	
	@Id
	private String id;
	private String title;
	private String content;
	private Date createdAt;
	private Date updatedAt;
	
	@PrePersist
	private void beforePersist() {
		var now = new Date();
		this.id = UUID.randomUUID().toString();
		this.createdAt = now;
		this.updatedAt = now;
	}

}
