package com.get.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



public interface UserRepository extends JpaRepository<Users, Long> {
	
	@Query(value = "select u.id AS userId, SUM(ac.balance) AS totalBalance\n" + 
			"from demodb.users u JOIN demodb.users_user_accounts mdl \n" + 
			"JOIN demodb.user_accounts ac ON u.id=mdl.users_id \n" + 
			"and mdl.user_accounts_id = ac.id GROUP BY u.id",nativeQuery = true)
    List<?> fetchAllUserBalanceSummary();

	/*public String fetchAllUserBalanceSummary() {
		
	}*/
}
