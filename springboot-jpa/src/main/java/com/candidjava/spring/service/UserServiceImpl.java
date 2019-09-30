package com.candidjava.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.candidjava.spring.bean.User;
import com.candidjava.spring.exception.RecordNotFoundException;
import com.candidjava.spring.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	public void createUser(User user) {

		userRepository.save(user);

	}

	public List<User> getUser() throws RecordNotFoundException {

		List<User> employeeList = (List<User>) userRepository.findAll();

		if (employeeList.size() > 0) {
			return employeeList;
		} else {
			return new ArrayList<User>();
		}
	}

	public User getUserfindById(long id) throws RecordNotFoundException {

		Optional<User> user = userRepository.findById(id);

		if (user.isPresent()) {
			return user.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	public User update(User user, long l) throws RecordNotFoundException {

		Optional<User> employee = userRepository.findById(l);

		if (employee.isPresent()) {
			return userRepository.save(user);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}

	}

	public void deleteUserById(long id) throws RecordNotFoundException {

		Optional<User> employee = userRepository.findById(id);

		if (employee.isPresent()) {
			userRepository.delete(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	public User updatePartially(User user, long id) throws RecordNotFoundException {
		Optional<User> employee = userRepository.findById(id);

		if (employee.isPresent()) {
			user.setCountry(user.getCountry());
			return userRepository.save(user);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

}
