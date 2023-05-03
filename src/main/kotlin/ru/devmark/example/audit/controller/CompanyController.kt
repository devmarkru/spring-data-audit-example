package ru.devmark.example.audit.controller

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.devmark.example.audit.dto.CompanyDto
import ru.devmark.example.audit.entity.CompanyEntity
import ru.devmark.example.audit.repository.CompanyRepository

@RestController
@RequestMapping("/companies")
class CompanyController(
    private val companyRepository: CompanyRepository,
) {

    @PostMapping
    fun createCompany(@RequestBody dto: CompanyDto) {
        val entity = CompanyEntity(
            name = dto.name,
        )
        companyRepository.save(entity)
    }

    @PutMapping("/{id}")
    fun updateCompany(@PathVariable id: Int, @RequestBody dto: CompanyDto) {
        val entity = companyRepository.findByIdOrNull(id)
            ?: throw RuntimeException("Company not found")
        entity.name = dto.name
        companyRepository.save(entity)
    }
}
