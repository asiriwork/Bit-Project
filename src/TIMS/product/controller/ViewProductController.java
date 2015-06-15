/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.product.controller;

import TIMS.app.core.controller.BaseController;
import TIMS.product.view.ProductDetails;
import TIMS.product.view.ProductForm;
import javax.swing.BoxLayout;

/**
 *
 * @author Sithara Gunawardana
 */
public class ViewProductController extends BaseController {

    @Override
    public void execute() {
         try{
            this.setViewProductScreen();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }

    private void setViewProductScreen() {
        try{
            ProductDetails productDetails = new ProductDetails();
            this.getMainPanel().removeAll();
            this.getMainPanel().setLayout(new BoxLayout(this.getMainPanel(), BoxLayout.PAGE_AXIS));
            this.getMainPanel().add(productDetails);
            this.getTemplate().pack();
            this.getTemplate().render();
        }catch(Exception ex){
            System.out.print("Errors--->"+ex);
        }
    }
    
}
