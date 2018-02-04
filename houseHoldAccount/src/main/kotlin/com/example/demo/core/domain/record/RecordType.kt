package com.example.demo.core.domain.record

import javax.persistence.Id
import javax.persistence.Entity

@Entity
class RecordType (
	@Id
	val code:String? = null,
	val name:String? = null
)