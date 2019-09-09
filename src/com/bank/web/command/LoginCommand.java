package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;
import com.bank.web.domains.CustomerBean;
import com.bank.web.pool.Constants;
import com.bank.web.serviceimpl.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class LoginCommand extends MoveCommand {
	public LoginCommand(HttpServletRequest request) throws Exception {
		super(request);
	}
 
	@Override
	public void execute() {
		super.execute();
		CustomerBean param = new CustomerBean();
		MemberService service = new MemberServiceImpl();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		CustomerBean cust = service.login(param);
		String domain = "customer";
		String page = "login";
		if (id.equals(service.login(cust).getId())&&
				pw.equals(service.login(cust).getPw())) {
			Receiver.cmd.setPage("mypage");
			System.out.println("로그인 커맨드 성공= "+ page);
		} else {
			Receiver.cmd.setPage("login");
			Receiver.cmd.setView(String.format(Constants.VIEW_PATH,domain,page));
			System.out.println("로그인 커맨드 실패= "+ page);
		}
		System.out.println("이프엘스 후 페이지"+Receiver.cmd.getPage());
		request.setAttribute("customer", param);
		System.out.println("로그인 후 갈 페이지"+Receiver.cmd.getView());
	}
}
