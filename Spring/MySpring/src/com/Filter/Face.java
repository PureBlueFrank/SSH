package com.Filter;

public class Face implements Filter {

	@Override
	public String doFilter(String r) {
		String str = r.replace(":)", "^_^");
		return str;
	}

}
