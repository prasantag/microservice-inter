package com.get.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.user.Users;
import com.get.user.UserService;

@RestController
@RequestMapping("/api/v2/allusers/balance")
public class UserBalanceController {

	public UserBalanceController(UserService userService) {
		this.userService = userService;
	}
	
	private final UserService userService;

	@GetMapping
    public ResponseEntity<List<?>> fetchAllUserBalanceSummary() {
        return ResponseEntity.ok(userService.fetchAllUserBalanceSummary());
    }
}