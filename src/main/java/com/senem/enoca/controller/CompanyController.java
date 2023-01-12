package com.senem.enoca.controller;

import com.senem.enoca.models.Company;
import com.senem.enoca.payload.request.CompanyRequest;
import com.senem.enoca.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllCompanies() {
        List<Company> companyList = companyService.getAllCompanies();
        return new ResponseEntity<>(companyList, HttpStatus.OK);
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<?> getCompanyById(@PathVariable Long companyId) {
        Company company = companyService.getCompanyById(companyId);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCompany(@RequestBody CompanyRequest companyRequest) throws Exception {
        companyService.addCompany(companyRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCompany(@RequestBody CompanyRequest companyRequest) {
        companyService.updateCompany(companyRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{companyId}")
    public ResponseEntity<?> deleteCompanyById(@PathVariable Long companyId) {
        companyService.deleteCompanyById(companyId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
