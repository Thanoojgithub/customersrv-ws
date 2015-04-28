package com.cutomersrv.dao.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.customersrv.beans.vo.User;

public interface CustomerRepository extends Repository<User, Long> {

	void delete(Long id);

	List<User> findAll();

	User findOne(Long id);

	void save(User persisted);
}
