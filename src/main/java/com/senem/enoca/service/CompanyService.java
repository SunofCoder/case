package com.senem.enoca.service;

import com.senem.enoca.Exception.NotFound;
import com.senem.enoca.models.Company;
import com.senem.enoca.payload.request.CompanyRequest;
import com.senem.enoca.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService (CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long companyId) {

        return companyRepository.findById(companyId)
                .orElseThrow(()-> new NotFound("Company Not Found"));
    }

    public void addCompany(CompanyRequest companyRequest) throws Exception {
        Company company = new Company();
        company.setAddress(companyRequest.getAddress());
        company.setName(companyRequest.getName());
        company.setMail(companyRequest.getMail());
        company.setEmployee(companyRequest.getEmployee());
        companyRepository.save(company);
    }

    public void updateCompany(CompanyRequest companyRequest) {
        Company company = new Company();
        company.setId(companyRequest.getId());
        company.setAddress(companyRequest.getAddress());
        company.setName(companyRequest.getName());
        company.setMail(companyRequest.getMail());
        company.setEmployee(companyRequest.getEmployee());
        companyRepository.save(company);
    }

    public void deleteCompanyById(Long companyId) {
        companyRepository.deleteById(companyId);
    }
}
