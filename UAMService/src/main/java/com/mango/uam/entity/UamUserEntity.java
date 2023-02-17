package com.mango.uam.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="UAM_USER")
public class UamUserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;
	
	
	private Long employeeId;
	
	
	private String userName;
	
	
	private String password;
	

	private String status;
	
	
	private Date startDate;
	
	
	private Date endDate;
	
	
	private Long createdBy;
	
	
	private Date creationDate;
	
	
	private Long lastUpdateLogin;
	
	
	private Long lastUpdateBy;
	
	
	private Date lastUpdateDate;
	
	
	private Date lastUpdatePasswordDate;
	
	
	private String name;
	
	
	private String userType;
	
	
	private String email;
	
	@ManyToMany
	@JoinTable(name = "UAM_USER_ROLE")
	private List <UamRoleEntity> uamRoleEntity;

}
