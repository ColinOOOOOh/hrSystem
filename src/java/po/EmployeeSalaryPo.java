/***********************************************************************
 * Module:  EmployeeSalary.java
 * Author:  acer
 * Purpose: Defines the Class EmployeeSalary
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

@Table(name = "employeeSalary")
@Entity
public class EmployeeSalaryPo {

	private long employeeSalaryId;
	private double baseSalary;
	private double transportationAllowance;
	private double lunchBenefits;
	private double communicationsAllowance;
	private double oldAgeInsurance;
	private double medicalInsurance;
	private double unemploymentInsurance;
	private double housingAccumulationFund;
	private double totalSalary;
	private double rewards;
	private double fine;
	private short isConfirm;
	private java.lang.String publishTime;
	private int employeeSalary;
	private java.util.Collection<EmployeePo> employee;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getEmployeeSalaryId() {
		return employeeSalaryId;
	}

	public void setEmployeeSalaryId(long employeeSalaryId) {
		this.employeeSalaryId = employeeSalaryId;
	}

	@Column
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
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
	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Column
	public double getRewards() {
		return rewards;
	}

	public void setRewards(double rewards) {
		this.rewards = rewards;
	}

	@Column
	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	@Column
	public short getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(short isConfirm) {
		this.isConfirm = isConfirm;
	}

	@Column
	public java.lang.String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(java.lang.String publishTime) {
		this.publishTime = publishTime;
	}

	@Column
	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@OneToMany
	@JoinColumn(name = "employeeSalarys")
	public java.util.Collection<EmployeePo> getEmployee() {
		return employee;
	}

	public void setEmployee(java.util.Collection<EmployeePo> employee) {
		this.employee = employee;
	}

}