/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utile;

/**
 *
 * @author cault
 */
public class aMessage extends Message{
    String message;

    
    aMessage(){
        message = "null";
    }
    
    public String getMessage() {
        return message;
    }

   
    private void setMessage(String message) {
        this.message = message;
    }
    @Override
    public void MENU(){
    message = "MENU";
    }
    @Override
    public void RULES(){
    message = "RULES";
    }
    @Override
    public void GRID(){
    message = "GRID";
    }
}