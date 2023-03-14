package com.spring.threads;

import java.util.HashMap;
import java.util.Map;

public class MyThreadLocal extends ThreadLocal<Map<String,Object>> {
	
	@Override
	protected Map<String, Object> initialValue() {
		return new HashMap<>();
	}

}
