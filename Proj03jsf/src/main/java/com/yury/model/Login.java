/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yury.model;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author harry
 */
public class Login {
    private String login = null;
    private String senha = null;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


 public String verifica(){
    boolean sucesso = true;
    FacesContext context = FacesContext.getCurrentInstance();
    if(!login.equalsIgnoreCase("will") || !senha.equalsIgnoreCase("123")){
//        String msg = "usuário inválido";
//        FacesMessage messages = new FacesMessage(msg);
//        context.addMessage("formulario", messages);
        sucesso = false;
    }else{
        sucesso = true;
    }
        return (sucesso ? "sucesso" : "falha");
    }
}
