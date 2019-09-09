package com.bank.web.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.bank.web.command.Receiver;
import com.bank.web.daos.MemberDAO;
import com.bank.web.daosimpls.MemberDAOImpl;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.enums.Action;
import com.bank.web.services.MemberService;

public class MemberServiceImpl implements MemberService {
//	private List<CustomerBean> customers;
//	private List<EmployeeBean> employees;
	private CustomerBean cust;
	private MemberDAO dao;
	
	public MemberServiceImpl() {
//		customers = new ArrayList<>();
//		employees = new ArrayList<>();
		cust = new CustomerBean();
		dao = new MemberDAOImpl();
	}

	@Override
	public void join(CustomerBean param) {
		dao.insertCustomer(param);
	}

	@Override
	public void resister(EmployeeBean param) {
//		employees.add(param);
	}

	@Override
	public CustomerBean findAllCustomers(CustomerBean param) {
		return cust;
	}

	@Override
	public CustomerBean findAllEmployees(CustomerBean param) {
		return cust;
	}

	@Override
	public MemberBean findByName(String name) {
//		List<MemberBean members = new ArrayList<>();
		int count = 0;
//		for(CustomerBean c : customers) {
//			if(name.equals(c.getName())) {
//				count++;
//			}
//		}
//		for(EmployeeBean e : employees) {
//			if(name.equals(e.getName())) {
//				count++;
//			}
//		}
//		int j = 0;
//		for(CustomerBean c : customers) {
//			if(name.equals(c.getName())) {
//				members.add(c);
//				j++;
//				if(j==count) {
//					return members;
//				}
//			}
//		}
//		for(EmployeeBean e : employees) {
//			if(name.equals(e.getName())) {
//				members.add(e);
//				j++;
//			}if(j==count) {
//				break;
//			}
//		}
		return cust;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean m = new MemberBean();
//		for(CustomerBean c : customers) {
//			if(id.equals(c.getId())) {
//				m = c ;
//				return m;
//			}
//		}
//		for(EmployeeBean e : employees) {
//			if(id.equals(e.getId())) {
//				m = e ;
//				break;
//			}
//		}
		return m;
	}

	@Override
	public CustomerBean login(CustomerBean param) {
		return dao.login(param);
	}

	@Override
	public int countMembers() {
//		return customers.size();
		return 0;
	}

	@Override
	public int countAdmins() {
		return 0;
//		return employees.size();
	}

	@Override
	public boolean existId(String id) {
		MemberBean m = findById(id);
		return true;//employees.contains(m) || customers.contains(m);
	}

	@Override
	public void updatePass(MemberBean param) {
//		String id = param.getId();
//		String oldPw = param.getPw().split(",")[0];
//		String newPw = param.getPw().split(",")[1];
//		MemberBean m = findById(id);
//		if(m.getPw().equals(oldPw)) {
//			int idx =(employees.contains(m)) 
//					? employees.indexOf(m) 
//							: customers.indexOf(m);
//			if(employees.contains(m)) {
//				employees.get(idx).setPw(newPw);
//			}else {
//				customers.get(idx).setPw(newPw);
//			}
//		}
	}

	@Override
	public boolean deleteMember(MemberBean param) {
		MemberBean m = findById(param.getId());
//		return (employees.contains(m)) 
//				? employees.remove(m) 
//						: customers.remove(m);
	return true;
	}
	
}
