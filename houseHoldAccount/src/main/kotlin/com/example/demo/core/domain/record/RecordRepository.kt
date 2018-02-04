package com.example.demo.core.domain.record

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Component

@Component
interface RecordRepository :JpaRepository<Record, Int>{
}