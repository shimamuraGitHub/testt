package com.example.demo.test

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepository :JpaRepository<TestEntity, Integer>{
}
