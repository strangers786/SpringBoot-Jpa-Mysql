package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.User;
import com.candidjava.spring.exception.RecordNotFoundException;

public interface UserService {

	public void createUser(User user);

	public List<User> getUser() throws RecordNotFoundException;

	public User getUserfindById(long id) throws RecordNotFoundException;

	public User update(User user, long l) throws RecordNotFoundException;

	public void deleteUserById(long id) throws RecordNotFoundException;

	public User updatePartially(User user, long id) throws RecordNotFoundException;
}
