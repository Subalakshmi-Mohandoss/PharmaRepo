package com.cts.pharma.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pharma.entity.ProcurementProduct;
import com.cts.pharma.repository.ProcurementProductRepository;
import com.cts.pharma.service.ProcurementProductService;

@Service
public class ProcurementProductServiceImpl implements ProcurementProductService {

    @Autowired
    private ProcurementProductRepository repository;

    // Add Product
    @Override
    public ProcurementProduct addProduct(ProcurementProduct product) {

        // Set default status values
        product.setAdminStatus(false);
        product.setSupplierStatus(false);

        return repository.save(product);
    }

    // Get All Products
    @Override
    public List<ProcurementProduct> getAllProducts() {
        return repository.findAll();
    }
}