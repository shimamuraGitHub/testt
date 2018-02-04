package com.example.demo.resource.record.response

import java.util.Date
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
class RecordRes(
	val date:String,
	val type:String,
	val money:Int
)