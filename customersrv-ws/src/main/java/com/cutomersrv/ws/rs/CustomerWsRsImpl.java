package com.cutomersrv.ws.rs;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customersrv.beans.vo.User;
import com.cutomersrv.blogic.service.CustomerServiceImpl;

@Component
public class CustomerWsRsImpl implements CustomerWsRs {

	final static Logger logger = LoggerFactory.getLogger(CustomerWsRsImpl.class);

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@Override
	public String sayHello(String name) {
		return customerServiceImpl.sayHello(name);
	}

	@Override
	public String getCacheStatistics() {
		return customerServiceImpl.getCacheStatistics();
	}

	@Override
	public User getUser(Long id) {
		return customerServiceImpl.getUser(id);
	}

	@Override
	public List<User> getUsers() {
		return customerServiceImpl.getUsers();
	}

	@Override
	public void deleteUser(Long id) {
		customerServiceImpl.deleteUser(id);
	}

	@Override
	public void upsertUser(Long id, String firstName, String lastName, String location) {
		customerServiceImpl.upsertUser(id, firstName, lastName, location);
	}

}