package com.backend.backend.Service;

import com.backend.backend.DataBaseaccessObject.D_Product;
import com.backend.backend.Model.Product;
import com.backend.backend.Systemtool.Exception.NotFoundException;
import com.backend.backend.Systemtool.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Product {
    @Autowired
    private D_Product DAOProduct;

    public Product createProduct(Product request) {
        return DAOProduct.save(request);
    }

    public Product getProduct(long id) {
        return DAOProduct.findById(id).orElseThrow(() -> new NotFoundException("Can't find product."));
    }

    public Product replaceProduct(Product request) {
        if( DAOProduct.findById(request.getP_ID()).orElse(null) == null){
            return null;
        }
        return DAOProduct.save(request);
    }

    public void deleteProduct(Long id) {
        DAOProduct.deleteById(id);
    }

    public List<Product> getProducts(QueryParameter param) {
        return DAOProduct.getProducts(param.getKeyword());
    }
}
