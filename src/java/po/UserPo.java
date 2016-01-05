/***********************************************************************
 * Module:  User.java
 * Author:  acer
 * Purpose: Defines the Class User
 ***********************************************************************/
package po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity
public class UserPo {
	private double userNum;
	private java.lang.String postName;
	private java.lang.String userPassword;
	private java.lang.String userName;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public double getUserNum() {
		return userNum;
	}

	public void setUserNum(double userNum) {
		this.userNum = userNum;
	}

	@Column
	public java.lang.String getPostName() {
		return postName;
	}

	public void setPostName(java.lang.String postName) {
		this.postName = postName;
	}

	@Column
	public java.lang.String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(java.lang.String userPassword) {
		this.userPassword = userPassword;
	}

	@Column
	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

}
