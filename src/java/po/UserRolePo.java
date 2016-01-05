/***********************************************************************
 * Module:  UserRole.java
 * Author:  acer
 * Purpose: Defines the Class UserRole
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

@Table(name = "role")
@Entity
public class UserRolePo {
	private java.lang.String userRole;
	private int userRoleID;
	private java.util.Collection<UserPo> user;

	@Column
	public java.lang.String getUserRole() {
		return userRole;
	}

	public void setUserRole(java.lang.String userRole) {
		this.userRole = userRole;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}

	@OneToMany
	@JoinColumn(name = "userRole")
	public java.util.Collection<UserPo> getUser() {
		return user;
	}

	public void setUser(java.util.Collection<UserPo> user) {
		this.user = user;
	}

}