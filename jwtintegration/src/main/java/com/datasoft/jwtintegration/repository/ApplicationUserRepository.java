package com.datasoft.jwtintegration.repository;

import com.datasoft.jwtintegration.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by noman on 5/23/19.
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long>{
    ApplicationUser findByUsername(String username);
}