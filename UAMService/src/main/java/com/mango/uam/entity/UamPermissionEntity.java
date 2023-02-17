package com.mango.uam.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UAM_PERMISSION")
public class UamPermissionEntity {
	
	@Id
	
	private long id;
	
	
	private String code;
	
	
	private String status;
	
	
	private Date startDate;
	
	
	private Date endDate;
	
	
	private long createdBy;
	
	
	private Date creationDate;
	
	
	private long lastUpdateLogin;
	
	
	private long lastUpdatedBy;
	
	
	private Date lastUpdatedDate;
	
	
	private String isDefault;
	
	
	private String discription;
}