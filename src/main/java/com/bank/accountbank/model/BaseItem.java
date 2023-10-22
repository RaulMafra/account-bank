package com.bank.accountbank.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50)
	private String icon;
	@Column(length = 100)
	private String description;

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
