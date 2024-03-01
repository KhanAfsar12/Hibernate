package com.spring;

public class Afsar {
private int id;
private String name;
private String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Afsar(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
}
public Afsar() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Afsar [id=" + id + ", name=" + name + ", Address=" + Address + "]";
}
int a =-1;



}
