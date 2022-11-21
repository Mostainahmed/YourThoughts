package com.mostain.syed.ahmed.yourthoughts.repository;

import com.mostain.syed.ahmed.yourthoughts.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
