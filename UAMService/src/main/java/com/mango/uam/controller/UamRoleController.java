package com.mango.uam.controller;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.mango.uam.Service.UamRoleService;
import com.mango.uam.entity.UamRoleEntity;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/role")
public class UamRoleController {
	
	@Autowired
	UamRoleService uamRoleService;
		
	@GetMapping("/getAllRole")
	public ResponseEntity<?>  getAllRoleDetails() {
		
		Map<String , Object> map = new HashMap<String ,Object>();
		
		List<UamRoleEntity> uamRoleEntity = uamRoleService.getAllRoles();
		
		if(!uamRoleEntity.isEmpty()) {
			
			map.put("status", 1);
			
			map.put("data", uamRoleEntity);
			
			 return new ResponseEntity<>(map,HttpStatus.OK);
		} else {
			map.clear();
			map.put("status",0);
			
			map.put("Message","Data is not found");
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	}
		

	
