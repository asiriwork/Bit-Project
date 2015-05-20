/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.product.dto.ProductDto;
import TIMS.product.model.ProductModel;

/**
 *
 * @author Damith
 */
public class SaveProductController extends BaseController {

    protected ProductModel productModel = null;

    public ProductModel getProductModel() {
        if (this.productModel == null) {
            this.productModel = new ProductModel();
        }
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public void saveProduct(ProductDto productDto) {
        this.getProductModel().saveProduct(productDto);
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
