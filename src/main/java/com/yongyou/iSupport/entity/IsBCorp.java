package com.yongyou.iSupport.entity;

public class IsBCorp {
    private Integer pk_corp;

    private String corpcode;

    private String corpname;

    private String groupname;

    private String remark;


    
    
    
    public Integer getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(Integer pk_corp) {
		this.pk_corp = pk_corp;
	}

	public String getCorpcode() {
        return corpcode;
    }

    public void setCorpcode(String corpcode) {
        this.corpcode = corpcode == null ? null : corpcode.trim();
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname == null ? null : corpname.trim();
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