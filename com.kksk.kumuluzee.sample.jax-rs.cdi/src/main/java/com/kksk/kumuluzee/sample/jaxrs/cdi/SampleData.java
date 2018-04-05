package com.kksk.kumuluzee.sample.jaxrs.cdi;

import java.io.Serializable;

public class SampleData implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 4601418156103920059L;

	private String key;
	private String value;

	public SampleData() {
	}

	public SampleData(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
