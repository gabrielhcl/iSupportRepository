package com.yongyou.iSupport.entity;

public class IsColumn {
    private Integer pkColumn;

    private String columncode;

    private String columnname;

    private String columnremark;
    
    private String sort;

    public Integer getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(Integer pkColumn) {
        this.pkColumn = pkColumn;
    }

    public String getColumncode() {
        return columncode;
    }

    public void setColumncode(String columncode) {
        this.columncode = columncode == null ? null : columncode.trim();
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getColumnremark() {
        return columnremark;
    }

    public void setColumnremark(String columnremark) {
        this.columnremark = columnremark == null ? null : columnremark.trim();
    }

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
    
    
}