package com.example.demo.test

import javax.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
class TestReq {
	@NotNull
	@Length(max=10)
	var name: String? = null
	
	var age: Int = 0
}