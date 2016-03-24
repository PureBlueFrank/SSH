package com.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	List<Filter> fliters = new ArrayList<Filter>();
	public FilterChain addFilter(Filter f){
		fliters.add(f);
		return this;
	}
	public String dofilter(String str){
		String r = str;
		for(Filter f:fliters){
			r = f.doFilter(r);
		}
		return r;
	}
}
