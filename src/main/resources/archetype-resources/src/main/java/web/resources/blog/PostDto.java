#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.resources.blog;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostDto {
	private String title;
	private String content;
}
