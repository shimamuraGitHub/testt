package com.example.demo.core.domain.record

import org.springframework.stereotype.Service
import java.util.Date
import org.springframework.beans.factory.annotation.Autowired
import javax.ws.rs.core.Response
import org.springframework.stereotype.Component
import javax.inject.Inject

@Component
class RecordServiceImpl :RecordService{

	@Inject	
	lateinit var repo:RecordRepository
	
	@Inject	
	lateinit var recordTypeRepo : RecordTypeRepository
	
	override fun findAll() = repo.findAll()
	
	override fun findAllRecordTypes() = recordTypeRepo.findAll()
	
	override fun register(record:Record) = repo.save(record)
	
	override fun registerRecordType(recordType:RecordType) : RecordType{
		val recordTypeList = recordTypeRepo.findAll()
		if(!(recordTypeList.any { it.name.equals(recordType.name) })){
			return recordTypeRepo.save(recordType)
		}
		return RecordType("miss","miss")
	}
}