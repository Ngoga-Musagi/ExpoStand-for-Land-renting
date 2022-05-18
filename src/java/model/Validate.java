/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ExpoStandDao;

/**
 *
 * @author hp
 */
public class Validate {
    private String msg=""; 
    private String errormsg=""; 

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void saved(ExpoStands ex){
       
    try{
        ExpoStandDao da= new ExpoStandDao();
        da.Save(ex);
        msg="Saved Successfully";
    }catch(Exception x){
       errormsg=x.getMessage();
    msg="Not Saved";
    }
    
    }
    
    
}
