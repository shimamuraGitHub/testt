package com.example.demo.core.domain.record

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RecordTypeRepository :JpaRepository<RecordType, Int> {
}