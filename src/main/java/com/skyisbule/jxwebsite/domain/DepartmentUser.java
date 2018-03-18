package com.skyisbule.jxwebsite.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class DepartmentUser implements Serializable {
    private Integer bmId;

    private String userId;

    /**
     * 职位
     */
    private String works;

    private static final long serialVersionUID = 1L;

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWorks() {
        return works;
    }

    public void setWorks(String works) {
        this.works = works;
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
        DepartmentUser other = (DepartmentUser) that;
        return (this.getBmId() == null ? other.getBmId() == null : this.getBmId().equals(other.getBmId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getWorks() == null ? other.getWorks() == null : this.getWorks().equals(other.getWorks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBmId() == null) ? 0 : getBmId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getWorks() == null) ? 0 : getWorks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bmId=").append(bmId);
        sb.append(", userId=").append(userId);
        sb.append(", works=").append(works);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}