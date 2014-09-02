/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control.ResytorException;

/**
 *
 * @author Ruan
 */
public class TFijException  extends Exception{
    String msg;

    public TFijException () {
        this.msg = "Valor Pago maior que Valor Total.";
    }

    public TFijException (String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
    
}
