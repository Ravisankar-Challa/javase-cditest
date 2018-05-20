package cditest.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD,  ElementType.PARAMETER})
public @interface RestClient {
	@Nonbinding 
	boolean useProxy() default false;
	
	@Nonbinding 
	int readTimeout() default 30000;
	
	@Nonbinding 
	int connectTimeout() default 3000;
	
	@Nonbinding 
	int maxConnectionsPerRoute() default 200;
}
