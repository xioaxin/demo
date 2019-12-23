package com.example.demo.Department;

import java.io.Serializable;

/**
 * 部门实体类
 *
 * @author ZPX
 */
public class DepartmentT implements Serializable {
    private Integer departmentid;      //部门编号

    private String departmentname;     //部门名称

    private Integer departmentsum;     //部门人数

    private static final long serialVersionUID = 1L;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Integer getDepartmentsum() {
        return departmentsum;
    }

    public void setDepartmentsum(Integer departmentsum) {
        this.departmentsum = departmentsum;
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
        DepartmentT other = (DepartmentT) that;
        return (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
                && (this.getDepartmentname() == null ? other.getDepartmentname() == null : this.getDepartmentname().equals(other.getDepartmentname()))
                && (this.getDepartmentsum() == null ? other.getDepartmentsum() == null : this.getDepartmentsum().equals(other.getDepartmentsum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getDepartmentname() == null) ? 0 : getDepartmentname().hashCode());
        result = prime * result + ((getDepartmentsum() == null) ? 0 : getDepartmentsum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departmentid=").append(departmentid);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", departmentsum=").append(departmentsum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}