package com.example.demo.core.domain.record

interface RecordService {
	fun findAll() : List<Record>

	fun findAllRecordTypes():List<RecordType>
	
	fun register(record:Record) : Record

	fun registerRecordType(recordType:RecordType) : RecordType

}