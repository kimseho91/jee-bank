package com.bank.web.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import com.bank.web.domains.AccountBean;
import com.bank.web.services.AccountService;

public class AccountServiceImpl implements AccountService{
	private List<AccountBean> accounts;
	
	public AccountServiceImpl() {
		accounts = new ArrayList<>();
	}
	
	@Override
	public void createAccount(String money) {
		AccountBean a = new AccountBean();
		a.setAccountNum(createAccountNum());
		a.setMoney(money + "");
		a.setRegDate(findDate());
		accounts.add(a);
	}

	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random ran = new Random();
		for (int i = 0; i < 9; i++) {
			accountNum += (i == 4) ? "-" : ran.nextInt(10);
		}
		return accountNum;
	}

	@Override
	public List<AccountBean> findAll() {
		return accounts;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean ac = new AccountBean();
		for (AccountBean account : accounts) {
			if (accountNum.equals(account.getAccountNum())) {
				ac = account ;
				break;
			}
		}
		return ac;
	}

	@Override
	public int countAccounts() {
		return accounts.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		AccountBean account = findByAccountNum(accountNum);
		return accounts.contains(account);
	}

	@Override
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		AccountBean account = findByAccountNum(param.getAccountNum());
		String newMoney = String.valueOf((Integer.parseInt(account.getMoney()))
				+Integer.parseInt(param.getMoney()));
		account.setMoney(newMoney);
		account.setRegDate(findDate());	
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		AccountBean account = findByAccountNum(param.getAccountNum());
		String newMoney = String.valueOf((Integer.parseInt(account.getMoney()))
				-Integer.parseInt(param.getMoney()));
		account.setMoney(newMoney);
		account.setRegDate(findDate());	
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		AccountBean account = findByAccountNum(accountNum);
		if(accounts.contains(account)) {
			accounts.remove(account);
		}
	}

}
