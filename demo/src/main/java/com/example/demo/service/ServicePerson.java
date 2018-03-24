package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.demo.converter.UserDetailsConversion;
import com.example.demo.dao.DatabaseInterface;


@Service
public class ServicePerson implements DatabaseInterface {

	private DatabaseInterface database;
	private UserDetailsConversion userDetailConversion;
	 
	@Autowired
	public ServicePerson(@Lazy DatabaseInterface database, @Lazy UserDetailsConversion userDetailConversion) {
	this.database=database;
	this.userDetailConversion=userDetailConversion;
	}
	 
	
	@Override
	public long count() {
		ArrayList<USER_DETAILS> usersList=new ArrayList<>();
		database.findAll().forEach(usersList::add);
		return usersList.size();
	}

	@Override
	public void delete(USER_DETAILS arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends USER_DETAILS> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<USER_DETAILS> findAll() {
		ArrayList<USER_DETAILS> usersList=new ArrayList<>();
		database.findAll().forEach(usersList::add);
		return usersList;
	}

	@Override
	public Iterable<USER_DETAILS> findAllById(Iterable<Long> arg0) {
		
		return null;
	}

	@Override
	public Optional<USER_DETAILS> findById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends USER_DETAILS> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends USER_DETAILS> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
