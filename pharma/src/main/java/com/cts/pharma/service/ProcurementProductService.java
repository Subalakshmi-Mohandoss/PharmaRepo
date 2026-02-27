package com.cts.pharma.service;

import java.util.List;
import com.cts.pharma.entity.ProcurementProduct;

public interface ProcurementProductService {

    ProcurementProduct addProduct(ProcurementProduct product);

    List<ProcurementProduct> getAllProducts();
}