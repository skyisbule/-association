package com.skyisbule.jxwebsite.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class DepartmentName implements Serializable {
    private Integer bmId;

    private String depName;

    private String isExist;

    private static final long serialVersionUID = 1L;

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getIsExist() {
        return isExist;
    }

    public void setIsExist(String isExist) {
        this.isExist = isExist;
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
        DepartmentName other = (DepartmentName) that;
        return (this.getBmId() == null ? other.getBmId() == null : this.getBmId().equals(other.getBmId()))
            && (this.getDepName() == null ? other.getDepName() == null : this.getDepName().equals(other.getDepName()))
            && (this.getIsExist() == null ? other.getIsExist() == null : this.getIsExist().equals(other.getIsExist()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBmId() == null) ? 0 : getBmId().hashCode());
        result = prime * result + ((getDepName() == null) ? 0 : getDepName().hashCode());
        result = prime * result + ((getIsExist() == null) ? 0 : getIsExist().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bmId=").append(bmId);
        sb.append(", depName=").append(depName);
        sb.append(", isExist=").append(isExist);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}