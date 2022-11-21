package com.mostain.syed.ahmed.yourthoughts.repository;

import com.mostain.syed.ahmed.yourthoughts.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
