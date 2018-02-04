package com.example.demo.resource.record.request

import javax.xml.bind.annotation.XmlRootElement
import javax.validation.constraints.NotNull

@XmlRootElement
class RecordReq {
	@NotNull
	val date:String? = null
	
	@NotNull
	val typeCode:String? = null
	
	@NotNull
	val money:Int? = null
}