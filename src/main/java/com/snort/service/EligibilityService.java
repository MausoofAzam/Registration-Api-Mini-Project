package com.snort.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.snort.request.SearchRequest;
import com.snort.request.SearchResponse;

public interface EligibilityService {

	public List<String> getUniquePlanName();
	
	public List<String> getUniquePlanSyatus();
	
	public List<SearchResponse> search(SearchRequest request);
	
	public void generateExcel(HttpServletResponse response);

	public void generatePdf(HttpServletResponse response);
}