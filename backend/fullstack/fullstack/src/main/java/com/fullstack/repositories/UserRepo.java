package com.fullstack.repositories;

import com.fullstack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {


}
