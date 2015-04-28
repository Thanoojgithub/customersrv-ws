package com.cutomersrv.blogic.service;

/**
 * to do CRUD operations on User document/table - entity in general. 
 */
import java.util.List;

import org.springframework.stereotype.Component;

import com.customersrv.beans.vo.SavedUser;
import com.customersrv.beans.vo.User;

@Component
public interface CustomerService {

	/**
	 * sayHello is a test resource path - to just know whether service is up or
	 * not
	 * 
	 * @param name
	 * @return
	 */
	public String sayHello(String name);
	
	/**
	 * to get cache details, TO-DO : need to work more on it.
	 * 
	 * @return
	 */
	public String getCacheStatistics();
	
	/**------------------------------------------------------------------------------------------------------------------------------------------
	 ** CRUD operations using MongoDB
	 **------------------------------------------------------------------------------------------------------------------------------------------
	 */

	public User getUser(Long id);

	public List<User> getUsers();

	public void deleteUser(Long id);

	public SavedUser upsertUser(Long id, String firstName, String lastName, String location);

	

}