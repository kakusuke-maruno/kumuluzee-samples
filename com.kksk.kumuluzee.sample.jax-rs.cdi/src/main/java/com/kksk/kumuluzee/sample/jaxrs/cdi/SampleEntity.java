package com.kksk.kumuluzee.sample.jaxrs.cdi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleEntity {
	private ConcurrentMap<String, SampleData> map = new ConcurrentHashMap<>();
	private String ts;

	public SampleEntity() {
		ts = "" + System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			map.put("key_" + ts + "-" + i, new SampleData("key_" + ts + "-" + i, "value_" + ts + "-" + i));
		}
	}

	public SampleData get(String key) {
		return map.get(key);
	}

	public List<SampleData> getAll() {
		return new ArrayList<>(map.values());
	}
}
