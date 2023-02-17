package com.mango.uam.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "UAM_ROLE")
public class UamRoleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRole;
	
	
	private String name;
	
	
	private String isDefault;
	
	
	private String status;
	
	
	private Date startDate;
	
	
	private Date endDate;
	
	
	private Long createdBy;
	
	
	private Date creationDate;
	
	
	private Long lastUpdateLogin;
	
	
	private Long lastUpdateBy;
	
	
	private Date lastUpdateDate;
	
	@ManyToMany(mappedBy  = "uamRoleEntity",cascade = CascadeType.ALL)
	private List<UamUserEntity> uamUserEntity;

}
