/***********************************************************************
 * Module:  Employee.java
 * Author:  acer
 * Purpose: Defines the Class Employee
 ***********************************************************************/
package po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "employee")
@Entity
public class EmployeePo {
	private long employeeId;
	private java.lang.String employeeName;
	private short employeeSex;
	private java.lang.String employeeEmail;
	private java.lang.String employeeTel;
	private double employeeQQ;
	private double employeeMobile;
	private java.lang.String employeeHomeAddress;
	private java.lang.String employeeBirthplace;
	private java.lang.String employeeBirthday;
	private java.lang.String employeeNational;
	private java.lang.String employeeReligion;
	private java.lang.String employeePolitics;
	private java.lang.String employeeIDCard;
	private java.lang.String employeeSocialSecurityCard;
	private short employeeAge;
	private java.lang.String employeeMajor;
	private java.lang.String employeeQualifications;
	private java.lang.String employeeBank;
	private java.lang.String employeeBankCard;
	private java.lang.String employeeAdvantage;
	private java.lang.String employeeHobby;
	private java.lang.String employeeCurriculumVitae;
	private java.lang.String employeeFamilyInfo;
	private java.lang.String employeeNotes;
	private java.lang.String employeeFileCreateTime;
	private java.lang.String emplyeePhoto;
	private double fileNumber;
	private short isConfirm;
	private short isDelete;
	private AgencyPo agency;
	private PostPo post;
	private UserPo user;
	private SalaryPo salary;
	private EmployeeSalaryPo employeeSalary;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	@Column
	public java.lang.String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(java.lang.String employeeName) {
		this.employeeName = employeeName;
	}

	@Column
	public short getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(short employeeSex) {
		this.employeeSex = employeeSex;
	}

	@Column
	public java.lang.String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(java.lang.String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Column
	public java.lang.String getEmployeeTel() {
		return employeeTel;
	}

	public void setEmployeeTel(java.lang.String employeeTel) {
		this.employeeTel = employeeTel;
	}

	@Column
	public double getEmployeeQQ() {
		return employeeQQ;
	}

	public void setEmployeeQQ(double employeeQQ) {
		this.employeeQQ = employeeQQ;
	}

	@Column
	public double getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(double employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	@Column
	public java.lang.String getEmployeeHomeAddress() {
		return employeeHomeAddress;
	}

	public void setEmployeeHomeAddress(java.lang.String employeeHomeAddress) {
		this.employeeHomeAddress = employeeHomeAddress;
	}

	@Column
	public java.lang.String getEmployeeBirthplace() {
		return employeeBirthplace;
	}

	public void setEmployeeBirthplace(java.lang.String employeeBirthplace) {
		this.employeeBirthplace = employeeBirthplace;
	}

	@Column
	public java.lang.String getEmployeeBirthday() {
		return employeeBirthday;
	}

	public void setEmployeeBirthday(java.lang.String employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}

	@Column
	public java.lang.String getEmployeeNational() {
		return employeeNational;
	}

	public void setEmployeeNational(java.lang.String employeeNational) {
		this.employeeNational = employeeNational;
	}

	@Column
	public java.lang.String getEmployeeReligion() {
		return employeeReligion;
	}

	public void setEmployeeReligion(java.lang.String employeeReligion) {
		this.employeeReligion = employeeReligion;
	}

	@Column
	public java.lang.String getEmployeePolitics() {
		return employeePolitics;
	}

	public void setEmployeePolitics(java.lang.String employeePolitics) {
		this.employeePolitics = employeePolitics;
	}

	@Column
	public java.lang.String getEmployeeIDCard() {
		return employeeIDCard;
	}

	public void setEmployeeIDCard(java.lang.String employeeIDCard) {
		this.employeeIDCard = employeeIDCard;
	}

	@Column
	public java.lang.String getEmployeeSocialSecurityCard() {
		return employeeSocialSecurityCard;
	}

	public void setEmployeeSocialSecurityCard(java.lang.String employeeSocialSecurityCard) {
		this.employeeSocialSecurityCard = employeeSocialSecurityCard;
	}

	@Column
	public short getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(short employeeAge) {
		this.employeeAge = employeeAge;
	}

	@Column
	public java.lang.String getEmployeeMajor() {
		return employeeMajor;
	}

	public void setEmployeeMajor(java.lang.String employeeMajor) {
		this.employeeMajor = employeeMajor;
	}

	@Column
	public java.lang.String getEmployeeQualifications() {
		return employeeQualifications;
	}

	public void setEmployeeQualifications(java.lang.String employeeQualifications) {
		this.employeeQualifications = employeeQualifications;
	}

	@Column
	public java.lang.String getEmployeeBank() {
		return employeeBank;
	}

	public void setEmployeeBank(java.lang.String employeeBank) {
		this.employeeBank = employeeBank;
	}

	@Column
	public java.lang.String getEmployeeBankCard() {
		return employeeBankCard;
	}

	public void setEmployeeBankCard(java.lang.String employeeBankCard) {
		this.employeeBankCard = employeeBankCard;
	}

	@Column
	public java.lang.String getEmployeeAdvantage() {
		return employeeAdvantage;
	}

	public void setEmployeeAdvantage(java.lang.String employeeAdvantage) {
		this.employeeAdvantage = employeeAdvantage;
	}

	@Column
	public java.lang.String getEmployeeHobby() {
		return employeeHobby;
	}

	public void setEmployeeHobby(java.lang.String employeeHobby) {
		this.employeeHobby = employeeHobby;
	}

	@Column
	public java.lang.String getEmployeeCurriculumVitae() {
		return employeeCurriculumVitae;
	}

	public void setEmployeeCurriculumVitae(java.lang.String employeeCurriculumVitae) {
		this.employeeCurriculumVitae = employeeCurriculumVitae;
	}

	@Column
	public java.lang.String getEmployeeFamilyInfo() {
		return employeeFamilyInfo;
	}

	public void setEmployeeFamilyInfo(java.lang.String employeeFamilyInfo) {
		this.employeeFamilyInfo = employeeFamilyInfo;
	}

	@Column
	public java.lang.String getEmployeeNotes() {
		return employeeNotes;
	}

	public void setEmployeeNotes(java.lang.String employeeNotes) {
		this.employeeNotes = employeeNotes;
	}

	@Column
	public java.lang.String getEmployeeFileCreateTime() {
		return employeeFileCreateTime;
	}

	public void setEmployeeFileCreateTime(java.lang.String employeeFileCreateTime) {
		this.employeeFileCreateTime = employeeFileCreateTime;
	}

	@Column
	public java.lang.String getEmplyeePhoto() {
		return emplyeePhoto;
	}

	public void setEmplyeePhoto(java.lang.String emplyeePhoto) {
		this.emplyeePhoto = emplyeePhoto;
	}

	@Column
	public double getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(double fileNumber) {
		this.fileNumber = fileNumber;
	}

	@Column
	public short getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(short isConfirm) {
		this.isConfirm = isConfirm;
	}

	@Column
	public short getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(short isDelete) {
		this.isDelete = isDelete;
	}

	@ManyToOne
	@JoinColumn(name = "employeeAgency")
	public AgencyPo getAgency() {
		return agency;
	}

	public void setAgency(AgencyPo agency) {
		this.agency = agency;
	}

	@ManyToOne
	@JoinColumn(name = "employeePost")
	public PostPo getPost() {
		return post;
	}

	public void setPost(PostPo post) {
		this.post = post;
	}

	@ManyToOne
	@JoinColumn(name = "employeeLogger")
	public UserPo getUser() {
		return user;
	}

	public void setUser(UserPo user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "employeeSalary")
	public SalaryPo getSalary() {
		return salary;
	}

	public void setSalary(SalaryPo salary) {
		this.salary = salary;
	}

	@ManyToOne
	@JoinColumn(name = "employeeSalarys")
	public EmployeeSalaryPo getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(EmployeeSalaryPo employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
