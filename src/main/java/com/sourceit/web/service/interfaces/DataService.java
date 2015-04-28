package com.sourceit.web.service.interfaces;

import com.sourceit.web.exceptions.CommonException;
import com.sourceit.web.exceptions.InvalidDataException;
import com.sourceit.web.model.Account;
import com.sourceit.web.model.Role;

import java.util.List;


public interface DataService extends AutoCloseable {
	
	Account login(String username, String password, Integer role) throws InvalidDataException;
	List<Role> listRoles() throws CommonException;
}
