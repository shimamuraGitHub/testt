package com.example.demo.resource.record

import javax.ws.rs.Path
import javax.ws.rs.GET
import javax.ws.rs.Produces
import com.example.demo.resource.record.response.RecordRes
import javax.ws.rs.PUT
import javax.ws.rs.Consumes
import javax.validation.Valid
import com.example.demo.resource.record.request.RecordReq
import com.example.demo.core.domain.record.RecordType
import com.example.demo.resource.record.response.RecordTypeRes
import com.example.demo.resource.record.request.RecordTypeReq
import javax.ws.rs.core.Response

/**
 * 家計簿レコードrecource.
 */
interface RecordResource {

	@GET
	@Produces("application/json")
	fun selectAll() : Response
	
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	fun register(@Valid request:RecordReq) : Response
	
	@GET
	@Path("/types")
	@Produces("application/json")
	fun getRecordTypes() : Response
	
	@PUT
	@Path("/types")
	@Consumes("application/json")
	@Produces("application/json")
	fun registerRecordType(@Valid request:RecordTypeReq):Response

}