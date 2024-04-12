package com.tg.healthcaremvcapp.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "Service_Id")
	private long serviceId;
	@Enumerated(EnumType.STRING)
	@Column(name= "Service_Offered", nullable = false)
	private ServicesOffered serviceName;
	@Column(name= "Service_Description",length = 50 , nullable = false)
	private String serviceDescription;
	@Column(name= "Service_Price", nullable = false)
	private long servicePrice;
	@Column(name= "Clinic_Status", nullable = false)
	private boolean isActive;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   	@JoinColumn(foreignKey = @ForeignKey(name = "Clinic_Service_Id"),
               name = "Clinic_ServiceId_FK")
       private Clinic clinic;
}
