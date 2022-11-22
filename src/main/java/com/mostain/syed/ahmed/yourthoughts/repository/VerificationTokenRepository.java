package com.mostain.syed.ahmed.yourthoughts.repository;

import com.mostain.syed.ahmed.yourthoughts.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
