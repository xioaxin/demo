package com.example.demo.Employee;

import java.io.Serializable;

/**
 * roles_t
 * @author 
 */
public class RolesT implements Serializable {
    private Integer employeeid;

    private Integer employeerole;

    private static final long serialVersionUID = 1L;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getEmployeerole() {
        return employeerole;
    }

    public void setEmployeerole(Integer employeerole) {
        this.employeerole = employeerole;
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
        RolesT other = (RolesT) that;
        return (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getEmployeerole() == null ? other.getEmployeerole() == null : this.getEmployeerole().equals(other.getEmployeerole()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getEmployeerole() == null) ? 0 : getEmployeerole().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeid=").append(employeeid);
        sb.append(", employeerole=").append(employeerole);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}