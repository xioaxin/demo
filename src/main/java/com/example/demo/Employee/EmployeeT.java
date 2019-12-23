package com.example.demo.Employee;

import java.io.Serializable;
import java.util.Date;

/**
 * employee_t
 * @author 
 */
public class EmployeeT implements Serializable {
    private Integer employeeid;

    private String employeename;

    private String employeesex;

    private Integer employeeage;

    private String employeeaddress;

    private String employeepost;

    private Date employeestarttime;

    private Date employeeendtime;

    private static final long serialVersionUID = 1L;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeesex() {
        return employeesex;
    }

    public void setEmployeesex(String employeesex) {
        this.employeesex = employeesex;
    }

    public Integer getEmployeeage() {
        return employeeage;
    }

    public void setEmployeeage(Integer employeeage) {
        this.employeeage = employeeage;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public String getEmployeepost() {
        return employeepost;
    }

    public void setEmployeepost(String employeepost) {
        this.employeepost = employeepost;
    }

    public Date getEmployeestarttime() {
        return employeestarttime;
    }

    public void setEmployeestarttime(Date employeestarttime) {
        this.employeestarttime = employeestarttime;
    }

    public Date getEmployeeendtime() {
        return employeeendtime;
    }

    public void setEmployeeendtime(Date employeeendtime) {
        this.employeeendtime = employeeendtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EmployeeT other = (EmployeeT) that;
        return (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getEmployeename() == null ? other.getEmployeename() == null : this.getEmployeename().equals(other.getEmployeename()))
            && (this.getEmployeesex() == null ? other.getEmployeesex() == null : this.getEmployeesex().equals(other.getEmployeesex()))
            && (this.getEmployeeage() == null ? other.getEmployeeage() == null : this.getEmployeeage().equals(other.getEmployeeage()))
            && (this.getEmployeeaddress() == null ? other.getEmployeeaddress() == null : this.getEmployeeaddress().equals(other.getEmployeeaddress()))
            && (this.getEmployeepost() == null ? other.getEmployeepost() == null : this.getEmployeepost().equals(other.getEmployeepost()))
            && (this.getEmployeestarttime() == null ? other.getEmployeestarttime() == null : this.getEmployeestarttime().equals(other.getEmployeestarttime()))
            && (this.getEmployeeendtime() == null ? other.getEmployeeendtime() == null : this.getEmployeeendtime().equals(other.getEmployeeendtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getEmployeename() == null) ? 0 : getEmployeename().hashCode());
        result = prime * result + ((getEmployeesex() == null) ? 0 : getEmployeesex().hashCode());
        result = prime * result + ((getEmployeeage() == null) ? 0 : getEmployeeage().hashCode());
        result = prime * result + ((getEmployeeaddress() == null) ? 0 : getEmployeeaddress().hashCode());
        result = prime * result + ((getEmployeepost() == null) ? 0 : getEmployeepost().hashCode());
        result = prime * result + ((getEmployeestarttime() == null) ? 0 : getEmployeestarttime().hashCode());
        result = prime * result + ((getEmployeeendtime() == null) ? 0 : getEmployeeendtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeid=").append(employeeid);
        sb.append(", employeename=").append(employeename);
        sb.append(", employeesex=").append(employeesex);
        sb.append(", employeeage=").append(employeeage);
        sb.append(", employeeaddress=").append(employeeaddress);
        sb.append(", employeepost=").append(employeepost);
        sb.append(", employeestarttime=").append(employeestarttime);
        sb.append(", employeeendtime=").append(employeeendtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}