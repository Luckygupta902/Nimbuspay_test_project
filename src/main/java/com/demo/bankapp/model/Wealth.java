package com.demo.bankapp.model;

import java.math.BigDecimal;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Wealth {

	private @Id @GeneratedValue Long userId;

	@ElementCollection
	private Map<String, BigDecimal> wealthMap;

	private Wealth() {
	}

	public Wealth(Long userId, Map<String, BigDecimal> wealthMap) {
		this.userId = userId;
		this.wealthMap = wealthMap;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Map<String, BigDecimal> getWealthMap() {
		return wealthMap;
	}

	public void setWealthMap(Map<String, BigDecimal> wealthMap) {
		this.wealthMap = wealthMap;
	}
	

}
