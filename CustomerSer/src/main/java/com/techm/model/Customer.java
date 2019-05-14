package com.techm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column
	private String cname;
	private double cbal;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCbal() {
		return cbal;
	}
	public void setCbal(double cbal) {
		this.cbal = cbal;
	}
	
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, double cbal) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cbal = cbal;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cbal=" + cbal + "]";
	}
	

}
