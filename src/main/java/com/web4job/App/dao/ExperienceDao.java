package com.web4job.App.dao;

import com.web4job.App.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceDao extends JpaRepository<Experience, Long> {
}
