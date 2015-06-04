/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.app.lib.hbm.TimsProduct;
import TIMS.product.dto.ProductDto;
import TIMS.product.model.ProductModel;

/**
 *
 * @author Sithara Gunawaradana
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
        TimsProduct saveProduct = this.getProductModel().saveProduct(productDto);
         System.out.println("error 2----->");
        ProductDto dto = new ProductDto();        
         System.out.println("error 3----->");
        dto.setCode(saveProduct.getCode());
         System.out.println("error 4----->");
        dto.setDescription(saveProduct.getDescription());
         System.out.println("error 5----->");
        dto.setName(saveProduct.getName());
         System.out.println("error 6----->");
       // dto.setProductTypeCode(saveProduct.getTimsProductType());
        dto.setSize(saveProduct.getSize());
      System.out.println(dto +" >> "+saveProduct.getCode()+" - "+ saveProduct.getDescription() +" - "+saveProduct.getName()+" - "+saveProduct.getSize());
    try    
    {    AddProductController addProductController = new AddProductController(dto);
         addProductController.execute();
    }catch(Exception e){
        System.out.println("error 2----->"+e);
    }
    }

    @Override
    public void execute() {
    }
}
