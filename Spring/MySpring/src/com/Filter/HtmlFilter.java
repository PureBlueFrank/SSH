package com.Filter;

public class HtmlFilter implements Filter {

	@Override
	public String doFilter(String r) {
		String result = r.replace("<", "[")
						.replace(">", "]");
		return result;
	}

}
