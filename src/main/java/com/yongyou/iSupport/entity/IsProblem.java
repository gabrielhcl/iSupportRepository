package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsProblem {
    private Integer pkProblem;

    private String problemcode;

    private String projectname;

    private String customername;

    private String companyrelated;

    private String productrelated;

    private String modulerelated;

    private String problempriority;

    private String problemtype;

    private String submitter;

    private String contact;

    private Date submitdate;

    private String officerincharge;

    private String problemstatus;

    private Date finishdate;

    private String processingtime;

    private String supportmethod;

    private String problemdescription;

    private String detaileddescription;

    private String solution;

    private String corpname;

    private String accountname;

    private String nodename;

    private String billcode;

    public Integer getPkProblem() {
        return pkProblem;
    }

    public void setPkProblem(Integer pkProblem) {
        this.pkProblem = pkProblem;
    }

    public String getProblemcode() {
        return problemcode;
    }

    public void setProblemcode(String problemcode) {
        this.problemcode = problemcode == null ? null : problemcode.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCompanyrelated() {
        return companyrelated;
    }

    public void setCompanyrelated(String companyrelated) {
        this.companyrelated = companyrelated == null ? null : companyrelated.trim();
    }

    public String getProductrelated() {
        return productrelated;
    }

    public void setProductrelated(String productrelated) {
        this.productrelated = productrelated == null ? null : productrelated.trim();
    }

    public String getModulerelated() {
        return modulerelated;
    }

    public void setModulerelated(String modulerelated) {
        this.modulerelated = modulerelated == null ? null : modulerelated.trim();
    }

    public String getProblempriority() {
        return problempriority;
    }

    public void setProblempriority(String problempriority) {
        this.problempriority = problempriority == null ? null : problempriority.trim();
    }

    public String getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype == null ? null : problemtype.trim();
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getOfficerincharge() {
        return officerincharge;
    }

    public void setOfficerincharge(String officerincharge) {
        this.officerincharge = officerincharge == null ? null : officerincharge.trim();
    }

    public String getProblemstatus() {
        return problemstatus;
    }

    public void setProblemstatus(String problemstatus) {
        this.problemstatus = problemstatus == null ? null : problemstatus.trim();
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public String getProcessingtime() {
        return processingtime;
    }

    public void setProcessingtime(String processingtime) {
        this.processingtime = processingtime == null ? null : processingtime.trim();
    }

    public String getSupportmethod() {
        return supportmethod;
    }

    public void setSupportmethod(String supportmethod) {
        this.supportmethod = supportmethod == null ? null : supportmethod.trim();
    }

    public String getProblemdescription() {
        return problemdescription;
    }

    public void setProblemdescription(String problemdescription) {
        this.problemdescription = problemdescription == null ? null : problemdescription.trim();
    }

    public String getDetaileddescription() {
        return detaileddescription;
    }

    public void setDetaileddescription(String detaileddescription) {
        this.detaileddescription = detaileddescription == null ? null : detaileddescription.trim();
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname == null ? null : corpname.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }
}