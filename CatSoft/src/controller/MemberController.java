package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	
	
	
}
