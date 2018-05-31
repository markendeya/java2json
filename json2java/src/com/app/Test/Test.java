package com.app.Test;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.Address.Address;
import com.app.Employee.Employee;

public class Test {

	public static void main(String[] args) {
		
		Address ad=new Address();
		ad.setAddrid(11);
		ad.setLoc("hyd");
		
		Employee emp=new Employee();
	emp.setEmpid(122);
	emp.setEmpname("nmk");
	emp.setEmpsal(233.3);
	emp.setAddr(ad);
	try
	{
		ObjectMapper om=new ObjectMapper();
		String json=om.writeValueAsString(emp);
		System.out.println(json);
	}
		catch(Exception ex)
	{
			ex.printStackTrace();
	}

	}

}
