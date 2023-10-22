package com.bank.accountbank.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 19, unique = true, nullable = false)
	private String number;
	@Column(name = "available_limit", precision = 13, scale = 2, nullable = false)//9999999999999(precision), 99(scale)
	private BigDecimal limit;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

}
