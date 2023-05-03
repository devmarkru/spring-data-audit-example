package ru.devmark.example.audit.repository

import org.springframework.data.repository.CrudRepository
import ru.devmark.example.audit.entity.CompanyEntity

interface CompanyRepository : CrudRepository<CompanyEntity, Int>
