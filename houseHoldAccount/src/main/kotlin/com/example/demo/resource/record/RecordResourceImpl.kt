package com.example.demo.resource.record

import javax.ws.rs.Path
import javax.ws.rs.GET
import javax.ws.rs.Produces
import com.example.demo.resource.record.response.RecordRes
import java.util.Date
import org.springframework.beans.factory.annotation.Autowired
import com.example.demo.core.domain.record.RecordServiceImpl
import com.example.demo.resource.record.factory.RecordFactory
import javax.ws.rs.PUT
import javax.ws.rs.Consumes
import com.example.demo.resource.record.request.RecordReq
import javax.validation.Valid
import com.example.demo.core.domain.record.RecordType
import com.example.demo.resource.record.response.RecordTypeRes
import com.example.demo.resource.record.request.RecordTypeReq
import com.example.demo.resource.record.factory.RecordTypeFactory
import javax.ws.rs.core.Response
import javax.inject.Inject

@Path("/record")
class RecordResourceImpl :RecordResource{
	
	@Inject	
	lateinit var service:RecordServiceImpl
	
	@Inject	
	lateinit var factory:RecordFactory
	
	@Inject	
	lateinit var recordTypeFactory:RecordTypeFactory
	
	override fun selectAll() : Response{
		val result = service.findAll()
		val response = factory.createResList(result)
		return Response.ok().entity(response).build()
	}
	
	override fun getRecordTypes():Response{
		val result = service.findAllRecordTypes()
		val response = recordTypeFactory.createResList(result)
		return Response.ok().entity(response).build()
	}
	
	override fun registerRecordType(@Valid request:RecordTypeReq):Response{
		val recordType = recordTypeFactory.create(request)
		val result = service.registerRecordType(recordType)
		val response = recordTypeFactory.createRes(result)
		return Response.ok().entity(response).build()
	}
	
	override fun register(@Valid request:RecordReq) : Response{
		val record = factory.createRecord(request)
		val result = service.register(record)
		val response = factory.createRes(result)
		return Response.ok().entity(response).build()
	}
}
