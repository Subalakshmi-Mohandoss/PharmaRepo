package com.cts.pharma.service;

import com.cts.pharma.entity.ProcurementProduct;

public interface AdminService {

    ProcurementProduct updateAdminStatus(Integer productId, boolean status);
}