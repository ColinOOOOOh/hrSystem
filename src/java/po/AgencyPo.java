/***********************************************************************
 * Module:  Agency.java
 * Author:  acer
 * Purpose: Defines the Class Agency
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

@Table(name = "agency")
@Entity
public class AgencyPo {

	private java.lang.String agencyName;
	private long agencyId;
	private java.util.Collection<EmployeePo> employee;
	private java.util.Collection<AgencyPo> agencyB;
	private java.util.Collection<SalaryPo> salary;
	private AgencyPo agencyA;

	@Column
	public java.lang.String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(java.lang.String agencyName) {
		this.agencyName = agencyName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(long agencyId) {
		this.agencyId = agencyId;
	}

	@OneToMany
	@JoinColumn(name = "employeeAgency")
	public java.util.Collection<EmployeePo> getEmployee() {
		return employee;
	}

	public void setEmployee(java.util.Collection<EmployeePo> employee) {
		this.employee = employee;
	}

	@OneToMany
	@JoinColumn(name = "agencyParent")
	public java.util.Collection<AgencyPo> getAgencyB() {
		return agencyB;
	}

	public void setAgencyB(java.util.Collection<AgencyPo> agencyB) {
		this.agencyB = agencyB;
	}

	@OneToMany
	@JoinColumn(name = "salaryAgency")
	public java.util.Collection<SalaryPo> getSalary() {
		return salary;
	}

	public void setSalary(java.util.Collection<SalaryPo> salary) {
		this.salary = salary;
	}

	@ManyToOne
	@JoinColumn(name = "agencyParent")
	public AgencyPo getAgencyA() {
		return agencyA;
	}

	public void setAgencyA(AgencyPo agencyA) {
		this.agencyA = agencyA;
	}

}