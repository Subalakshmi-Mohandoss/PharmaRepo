package com.cts.pharma.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pharma.entity.ProcurementProduct;
import com.cts.pharma.repository.ProcurementProductRepository;
import com.cts.pharma.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private ProcurementProductRepository repository;

    @Override
    public ProcurementProduct updateAdminStatus(Integer productId, boolean status) {

        ProcurementProduct product = repository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));

        // Only updating admin status
        product.setAdminStatus(status);

        return repository.save(product);
    }
}