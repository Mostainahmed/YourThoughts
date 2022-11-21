package com.mostain.syed.ahmed.yourthoughts.repository;

import com.mostain.syed.ahmed.yourthoughts.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
