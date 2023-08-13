/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.TelaProg_GUI;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class Verifica {
    
    
    public static void confereSenha(){
        
       String usu = View.Tela.txtUsuario.getText();
       int sen = Integer.parseInt(View.Tela.txtSenha.getText());
       
       if(usu.equals("Tiago") && sen == 12345){
          new TelaProg_GUI().setVisible(true); 
       }else{
           JOptionPane.showMessageDialog(null, "Senha ou Usuario Invalido\n Tente novamente");
       }
    }
    
}
