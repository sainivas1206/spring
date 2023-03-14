package com.spring.threads;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {

	MyThreadLocal threadLocal = new MyThreadLocal();

	Map<String, Object> scope = null;

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {

		scope = (Map<String, Object>) threadLocal.get();
		Object obj = scope.get(name);

		if (obj == null) {
			obj = objectFactory.getObject();
			scope.put(name, obj);
		}
		return obj;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(String name) {
		return scope.remove(name);
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
