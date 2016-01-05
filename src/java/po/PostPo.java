/***********************************************************************
 * Module:  Post.java
 * Author:  acer
 * Purpose: Defines the Class Post
 ***********************************************************************/
package po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class PostPo {

	private java.lang.String postType;
	private java.lang.String postName;
	private java.lang.String postTitle;
	private int postId;
	private java.util.Collection<EmployeePo> employee;

	@Column
	public java.lang.String getPostType() {
		return postType;
	}

	public void setPostType(java.lang.String postType) {
		this.postType = postType;
	}

	@Column
	public java.lang.String getPostName() {
		return postName;
	}

	public void setPostName(java.lang.String postName) {
		this.postName = postName;
	}

	@Column
	public java.lang.String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(java.lang.String postTitle) {
		this.postTitle = postTitle;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@OneToMany
	@JoinColumn(name = "employeePost")
	public java.util.Collection<EmployeePo> getEmployee() {
		return employee;
	}

	public void setEmployee(java.util.Collection<EmployeePo> employee) {
		this.employee = employee;
	}

}