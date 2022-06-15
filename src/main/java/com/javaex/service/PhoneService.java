package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Service
public class PhoneService {
	
	//필드
	@Autowired
	private PhoneDao phoneDao;
	
	//생성자
	
	
	//메소드 gs
	
	
	//메소드 일반
	//전화번호 리스트
	public List<PersonVo> getPersonList(){
		
		List<PersonVo> personList = phoneDao.getPersonList();
		
		return personList;
	}
	
	//전화번호 등록
	public int personInsert(PersonVo personVo) {
		
		int count = phoneDao.personInsert(personVo);
		
		return count;
	}
	//전화번호 삭제
	public int personDelete(int no) {
		
		int count = phoneDao.personDelete(no);
		
		return count;
	}
	//전화번호 수정폼(정보 가져오기)
	public PersonVo getPerson(int no) {
		
		PersonVo personVo = phoneDao.getPerson(no);
		
		return personVo;
	}
	//전화번호 수정
	public int personUpdate(PersonVo personVo) {
	
		int count = phoneDao.personUpdate(personVo);
		
		return count;
	}
	
}
