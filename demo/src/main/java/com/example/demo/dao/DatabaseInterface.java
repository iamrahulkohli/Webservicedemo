package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.service.USER_DETAILS;

public interface DatabaseInterface extends CrudRepository<USER_DETAILS, Long> {

}
