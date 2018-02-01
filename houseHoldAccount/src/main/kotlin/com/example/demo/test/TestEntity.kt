package com.example.demo.test

import javax.persistence.GeneratedValue
import javax.xml.bind.annotation.XmlElement
import javax.persistence.Entity
import javax.persistence.Id
import java.util.Date

@Entity
class TestEntity {
	@Id
	@GeneratedValue
	var id : Int? = null
	
	var age : Int? = null
}