package com.get.user;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserService(UserRepository userRespository) {
		this.userRespository = userRespository;
	}

	private final UserRepository userRespository;


    public List<?> fetchAllUserBalanceSummary() {
        return userRespository.fetchAllUserBalanceSummary();
    }

}
