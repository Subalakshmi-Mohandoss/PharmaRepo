package com.cts.pharma.service;

import java.util.List;
import com.cts.pharma.entity.ProcurementProduct;
import com.cts.pharma.entity.Supplier;

public interface SupplierService {

    List<ProcurementProduct> getApprovedProducts();

    Supplier submitSupplierDetails(Supplier supplier);
}