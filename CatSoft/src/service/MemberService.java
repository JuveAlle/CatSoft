package service;

import domain.Member;

public interface MemberService {

	int createMember(Member member);
	Member findMember(String id);
	
}
