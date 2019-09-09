package com.bank.web.services;

import java.util.List;

import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;

public interface MemberService {
	public void join(CustomerBean param);
	public void resister(EmployeeBean param);
	public CustomerBean findAllCustomers(CustomerBean param);
	public CustomerBean findAllEmployees(CustomerBean param);
	public MemberBean findByName(String name);
	public MemberBean findById(String id);
	public CustomerBean login(CustomerBean param);
	public int countMembers();
	public int countAdmins();
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public boolean deleteMember(MemberBean param);
}
