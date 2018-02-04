package com.example.demo.resource.record.request

import javax.validation.constraints.NotNull

class RecordTypeReq {
	@NotNull
	var code:String? = null
	
	@NotNull
	var name:String? = null
}