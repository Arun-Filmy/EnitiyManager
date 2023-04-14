package com.EM.EntityManager.repo;

import com.EM.EntityManager.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {
}
