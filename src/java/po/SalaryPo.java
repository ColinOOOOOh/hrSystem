/***********************************************************************
 * Module:  Salary.java
 * Author:  acer
 * Purpose: Defines the Class Salary
 ***********************************************************************/
package po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "salary")
@Entity
public class SalaryPo {
	private long salaryId;
	private double salaryType;
	private double isConfirm;
	private double salaryNum;
	private java.lang.String salaryEnrollee;
	private java.lang.String salaryRegistrant;
	private java.lang.String salaryRegistTime;
	private java.lang.String confirmNotes;
	private double transportationAllowance;
	private double lunchBenefits;
	private double communicationsAllowance;
	private double oldAgeInsurance;
	private double medicalInsurance;
	private double unemploymentInsurance;
	private double housingAccumulationFund;
	private double baseSalary;
	private java.util.Collection<EmployeePo> employee;
	private AgencyPo agency;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(long salaryId) {
		this.salaryId = salaryId;
	}

	@Column
	public double getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(double salaryType) {
		this.salaryType = salaryType;
	}

	@Column
	public double getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(double isConfirm) {
		this.isConfirm = isConfirm;
	}

	@Column
	public double getSalaryNum() {
		return salaryNum;
	}

	public void setSalaryNum(double salaryNum) {
		this.salaryNum = salaryNum;
	}

	@Column
	public java.lang.String getSalaryEnrollee() {
		return salaryEnrollee;
	}

	public void setSalaryEnrollee(java.lang.String salaryEnrollee) {
		this.salaryEnrollee = salaryEnrollee;
	}

	@Column
	public java.lang.String getSalaryRegistrant() {
		return salaryRegistrant;
	}

	public void setSalaryRegistrant(java.lang.String salaryRegistrant) {
		this.salaryRegistrant = salaryRegistrant;
	}

	@Column
	public java.lang.String getSalaryRegistTime() {
		return salaryRegistTime;
	}

	public void setSalaryRegistTime(java.lang.String salaryRegistTime) {
		this.salaryRegistTime = salaryRegistTime;
	}

	@Column
	public java.lang.String getConfirmNotes() {
		return confirmNotes;
	}

	public void setConfirmNotes(java.lang.String confirmNotes) {
		this.confirmNotes = confirmNotes;
	}

	@Column
	public double getTransportationAllowance() {
		return transportationAllowance;
	}

	public void setTransportationAllowance(double transportationAllowance) {
		this.transportationAllowance = transportationAllowance;
	}

	@Column
	public double getLunchBenefits() {
		return lunchBenefits;
	}

	public void setLunchBenefits(double lunchBenefits) {
		this.lunchBenefits = lunchBenefits;
	}

	@Column
	public double getCommunicationsAllowance() {
		return communicationsAllowance;
	}

	public void setCommunicationsAllowance(double communicationsAllowance) {
		this.communicationsAllowance = communicationsAllowance;
	}

	@Column
	public double getOldAgeInsurance() {
		return oldAgeInsurance;
	}

	public void setOldAgeInsurance(double oldAgeInsurance) {
		this.oldAgeInsurance = oldAgeInsurance;
	}

	@Column
	public double getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(double medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	@Column
	public double getUnemploymentInsurance() {
		return unemploymentInsurance;
	}

	public void setUnemploymentInsurance(double unemploymentInsurance) {
		this.unemploymentInsurance = unemploymentInsurance;
	}

	@Column
	public double getHousingAccumulationFund() {
		return housingAccumulationFund;
	}

	public void setHousingAccumulationFund(double housingAccumulationFund) {
		this.housingAccumulationFund = housingAccumulationFund;
	}

	@Column
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@OneToMany
	@JoinColumn(name = "employeeSalary")
	public java.util.Collection<EmployeePo> getEmployee() {
		return employee;
	}

	public void setEmployee(java.util.Collection<EmployeePo> employee) {
		this.employee = employee;
	}

	@ManyToOne
	@JoinColumn(name = "salaryAgency")
	public AgencyPo getAgency() {
		return agency;
	}

	public void setAgency(AgencyPo agency) {
		this.agency = agency;
	}

}