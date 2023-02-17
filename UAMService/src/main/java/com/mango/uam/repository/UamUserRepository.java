package com.mango.uam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mango.uam.entity.UamUserEntity;

@Repository
public interface UamUserRepository extends JpaRepository<UamUserEntity, Long> {

}
