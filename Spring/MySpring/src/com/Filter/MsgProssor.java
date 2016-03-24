package com.Filter;

public class MsgProssor {
	private String Msg;

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}
	Filter[] filters = {new HtmlFilter(), new SensetiveFilter(), new Face()};
	public String process(){
		for(Filter f : filters){
			Msg = f.doFilter(Msg);
		}
		return Msg;
	}
}
