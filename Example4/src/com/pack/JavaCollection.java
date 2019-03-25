package com.pack;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List address_list;
	Set address_set;
	Map address_map;
	Properties address_prop;
	
	public List getAddress_list() {
		return address_list;
	}
	public void setAddress_list(List address_list) {
		this.address_list = address_list;
	}
	public Set getAddress_set() {
		return address_set;
	}
	public void setAddress_set(Set address_set) {
		this.address_set = address_set;
	}
	public Map getAddress_map() {
		return address_map;
	}
	public void setAddress_map(Map address_map) {
		this.address_map = address_map;
	}
	public Properties getAddress_prop() {
		return address_prop;
	}
	public void setAddress_prop(Properties address_prop) {
		this.address_prop = address_prop;
	}
}
