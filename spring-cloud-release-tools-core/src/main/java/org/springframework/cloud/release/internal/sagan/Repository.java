package org.springframework.cloud.release.internal.sagan;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Marcin Grzejszczak
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Repository {
	public String id;
	public String name;
	public String url;
	public Boolean snapshotsEnabled;

	@Override public String toString() {
		return "Repository{" + "id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", url='"
				+ this.url + '\'' + ", snapshotsEnabled=" + this.snapshotsEnabled + '}';
	}
}
