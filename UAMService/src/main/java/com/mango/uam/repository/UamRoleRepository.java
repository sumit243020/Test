package com.mango.uam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mango.uam.entity.UamRoleEntity;

@Repository
public interface UamRoleRepository extends JpaRepository<UamRoleEntity, Long> {

}
