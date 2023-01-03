package com.vicky.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Integer customerId;
	
	@Size(min = 3,max = 25)
	@Schema(description = "name should have atleast more than 3 characters")
	private String name;
	
	@Email
	@Schema(description = "email should be valid..example abc@abc.com")
	private String email;
	
	@NotEmpty(message = "Mobile number should not empty")
	@Schema(description = "Mobile number is must",required = true)
	private String mobileNumber;
	
	private LocalDate createDt;
}