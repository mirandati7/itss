package br.com.sp.itss.domain;

import java.io.Serializable;

public interface BaseEntity<S extends Serializable>{
	
	S getId();
	
}
