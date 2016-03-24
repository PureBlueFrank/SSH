package com.Filter;

public class SensetiveFilter implements Filter {

	@Override
	public String doFilter(String r) {
		String result = r.replace("敏感", "")
				        .replace("被就业", "就业");
		return result;
	}

}
