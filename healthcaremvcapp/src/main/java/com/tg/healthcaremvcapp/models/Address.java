package com.tg.healthcaremvcapp.models;

import org.hibernate.annotations.ManyToAny;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Address_Id")
	private long addressId;
	@Column(name= "Door_Number", length = 15, nullable = false)
	private String doorNo;
	@Column(name= "Street_Name", length = 15, nullable = false)
	private String streetName;
	@Column(name= "City",length = 15, nullable = false)
	private String city;
	@Column(name= "State",length = 15, nullable = false)
	private String state;
	@Column(name= "Country",length = 15, nullable = false)
	private String country;
	@Column(name= "Postal_Code", nullable = false)
	private long postalCode;
	@Column(name= "Longitude", nullable = false)
	private String longitude;
	@Column(name= "Latitude", nullable = false)
	private String latitude;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(foreignKey = @ForeignKey(name = "Clinic_Id"),
            name = "Clinic_Id_FK")
    private Clinic clinic;
}
