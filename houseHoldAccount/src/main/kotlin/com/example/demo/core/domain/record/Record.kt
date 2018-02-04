package com.example.demo.core.domain.record

import java.util.Date
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue

@Entity
class Record(
	@Id
	@GeneratedValue
	var id : Int? = null,
	var date:Date? = null,
	var typeCode:String? = null,
	var money:Int? = null
)
