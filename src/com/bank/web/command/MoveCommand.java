package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request) throws Exception {
		setRequest(request);
		setDomain(domain);
		setAction((request.getParameter("action")==null)
				?"move":
					request.getParameter("action")); //action=move를 디폴트 처리한다.
		execute();									//왜냐하면 단순이동이 form태그 이동(데이터이동)보다 훨씬 많다.
	}
	
	@Override
	public void execute(){
		super.execute();
		request.setAttribute("page", request.getParameter("page"));
		System.out.println("무브커맨드에서의 페이지= "+page);
	}
}
