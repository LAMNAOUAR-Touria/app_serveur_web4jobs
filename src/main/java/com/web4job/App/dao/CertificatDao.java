package com.web4job.App.dao;

import com.web4job.App.model.Certificat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificatDao extends JpaRepository<Certificat, Long> {
}
