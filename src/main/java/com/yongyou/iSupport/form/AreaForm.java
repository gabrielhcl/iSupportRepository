package com.yongyou.iSupport.form;

import java.io.Serializable;
import java.util.List;

public class AreaForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2332197033264083894L;

	private Integer pk_area;

    private List<String> areacode;

    private List<String> areaname;


	public Integer getPk_area() {
		return pk_area;
	}

	public void setPk_area(Integer pk_area) {
		this.pk_area = pk_area;
	}


	public List<String> getAreacode() {
		return areacode;
	}

	public void setAreacode(List<String> areacode) {
		this.areacode = areacode;
	}

	public List<String> getAreaname() {
		return areaname;
	}

	public void setAreaname(List<String> areaname) {
		this.areaname = areaname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Area [pk_area=" + pk_area + ", areacode=" + areacode + ", areaname=" + areaname + "]";
	}

    
    
}
