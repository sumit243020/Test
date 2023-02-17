package com.mango.uam.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mango.uam.entity.UamRoleEntity;
import com.mango.uam.repository.UamRoleRepository;

@Service
public class UamRoleServiceImpl implements UamRoleService {
	
	@Autowired
	UamRoleRepository UamRoleRepository;
	
	@Override
	public List<UamRoleEntity> getAllRoles() {
		
		return UamRoleRepository.findAll() ;
	}

}
