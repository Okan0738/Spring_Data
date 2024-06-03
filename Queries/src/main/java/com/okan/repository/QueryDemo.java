package com.okan.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("find by country:" + regionRepository.findByCountry("Canada"));
        System.out.println("find by country:" + regionRepository.getByCountry("United States"));
        System.out.println("findByCountryOrderByRegionRegionDesc:" + regionRepository.findByCountryOrderByRegion("United States"));
        System.out.println("find by country:" + regionRepository.findTop2ByCountry("United States"));
        System.out.println("find by country:" + regionRepository.findTopByCountryContainingOrderByRegion("United States"));


        System.out.println("-----------DEPARTMENTS----------");
        System.out.println("findByDepartment:" + departmentRepository.findByDepartment("Furniture"));
        System.out.println("findByDivision:" + departmentRepository.findByDivision("Health"));
        System.out.println("findByDivisionEndsWith:" + departmentRepository.findByDivisionEndsWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains:" + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));


        System.out.println("-----------EMPLOYEES----------");



    }
}
