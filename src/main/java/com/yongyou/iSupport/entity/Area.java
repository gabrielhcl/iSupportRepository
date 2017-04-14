package com.yongyou.iSupport.entity;

import java.io.Serializable;

public class Area implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2332197033264083894L;

	private Integer pk_area;

    private String areacode;

    private String areaname;


	public Integer getPk_area() {
		return pk_area;
	}

	public void setPk_area(Integer pk_area) {
		this.pk_area = pk_area;
	}

	public String getAreacode() {
		return areacode;
	}

	@Override
	public String toString() {
		return "Area [pk_area=" + pk_area + ", areacode=" + areacode + ", areaname=" + areaname + "]";
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
    
    
}
