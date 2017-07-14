package com.phearun.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Lazy
@Scope("prototype")
@Service
public class ArticleService {
	
	public ArticleService() {
		System.out.println("-> ArticleService.class Created!");
	}
}
