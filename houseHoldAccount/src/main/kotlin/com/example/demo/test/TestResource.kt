package com.example.demo.test

import javax.ws.rs.Path
import javax.validation.Valid
import javax.ws.rs.PUT
import javax.inject.Inject
import org.springframework.beans.factory.annotation.Autowired
import javax.ws.rs.core.MediaType
import javax.ws.rs.Consumes
import javax.ws.rs.Produces
import javax.ws.rs.GET

@Path("/test")
class TestResource {
	
	@Autowired
	lateinit var repo:TestRepository
	
//	@GET
//	fun test():String{
//		return "success!"
//	}
	
	@PUT
	@Consumes("application/json")
	@Produces("application/json")
	fun put(@Valid test:TestReq):List<TestEntity>{
		val testEntity = TestEntity()
		testEntity.age = test.age
		repo.save(testEntity)
		
		return repo.findAll()
	}
}