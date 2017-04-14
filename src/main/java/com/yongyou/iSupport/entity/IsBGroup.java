package com.yongyou.iSupport.entity;

public class IsBGroup {
    private Integer pk_group;

    private String groupcode;

    private String groupname;

    private String remark;


    
    
    public Integer getPk_group() {
		return pk_group;
	}

	public void setPk_group(Integer pk_group) {
		this.pk_group = pk_group;
	}

	public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode == null ? null : groupcode.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}