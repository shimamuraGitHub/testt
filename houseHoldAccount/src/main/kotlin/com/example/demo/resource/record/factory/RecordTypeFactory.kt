package com.example.demo.resource.record.factory

import com.example.demo.resource.record.response.RecordTypeRes
import com.example.demo.core.domain.record.RecordType
import org.springframework.stereotype.Component
import com.example.demo.resource.record.request.RecordTypeReq

@Component
class RecordTypeFactory {
	
	fun createRes(recordType:RecordType):RecordTypeRes = RecordTypeRes(recordType.code!!,recordType.name!!)
	
	fun create(recordTypeReq:RecordTypeReq):RecordType = RecordType(recordTypeReq.code!!,recordTypeReq.name!!)
	
	fun createResList(recordTypeList:List<RecordType>):List<RecordTypeRes> = recordTypeList.map { createRes(it) }
}