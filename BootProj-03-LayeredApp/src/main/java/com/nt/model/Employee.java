package com.nt.model;

import java.util.Objects;




public class Employee {
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptno="
				+ deptno + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptno, ename, eno, grossSalary, job, netSalary, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && Objects.equals(ename, other.ename)
				&& Objects.equals(eno, other.eno) && Objects.equals(grossSalary, other.grossSalary)
				&& Objects.equals(job, other.job) && Objects.equals(netSalary, other.netSalary)
				&& Objects.equals(salary, other.salary);
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(Double netSalary) {
		this.netSalary = netSalary;
	}
	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
}
