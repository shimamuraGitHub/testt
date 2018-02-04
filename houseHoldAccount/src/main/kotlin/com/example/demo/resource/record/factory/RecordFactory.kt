package com.example.demo.resource.record.factory

import org.springframework.stereotype.Component
import com.example.demo.resource.record.response.RecordRes
import com.example.demo.core.domain.record.Record
import java.util.Date
import java.text.SimpleDateFormat
import com.example.demo.resource.record.request.RecordReq

@Component
class RecordFactory {
	
	fun createResList(recordList:List<Record>):List<RecordRes> = recordList.map {createRes(it)}
	
	fun createRes(record:Record):RecordRes = RecordRes(
			dateConvertToString(record.date!!),
			record.typeCode!!,
			record.money!!
	)
	
	fun createRecord(recordReq:RecordReq):Record = Record(
			date=StringConvertToDate(recordReq.date!!),
			typeCode=recordReq.typeCode,
			money=recordReq.money
	)
}

fun dateConvertToString(date:Date):String{
	return SimpleDateFormat("yyyy-MM-dd").format(date)
}

fun StringConvertToDate(date:String):Date{
	return SimpleDateFormat("yyyy-MM-dd").parse(date)
}