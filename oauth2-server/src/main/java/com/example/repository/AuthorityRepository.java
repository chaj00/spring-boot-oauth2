package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
