package com.github.redis;

import redis.clients.jedis.Jedis;

public class App 
{
	Jedis jedis = new Jedis("192.168.40.115");
	
	public void setKeyValue(String key, String value) {
		System.out.println("Set key["+key+"] and value["+value+"]");
		jedis.set(key, value);
		System.out.println("Set done");
	}
	
    public String getValue(String key)
    {
    	System.out.println("Get value of key["+key+"]");
        String value = null;
    	value = jedis.get(key);
    	System.out.println("Value of key["+key+"] is["+value+"]");
    	return value;
    }
}
