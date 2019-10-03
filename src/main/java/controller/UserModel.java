/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.UsersImpl;
import dao.interfa.IUsers;
import domain.Users;
import domain.Utype;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import main.HashPass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author root
 */
@ManagedBean(name = "usmodel")
@SessionScoped
public class UserModel {

 private static final Logger LOGGER =
      LoggerFactory.getLogger(Users.class);

  public static final String HOME_PAGE_REDIRECT =
      "/index?faces-redirect=true";
  public static final String LOGOUT_PAGE_REDIRECT =
      "/logout.xhtml?faces-redirect=true";

    
    private Users usr=new Users();
    private String pass;
    private int id;
    private String uname;
    private String email;
    private boolean rememberMe;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public IUsers getUsimp() {
        return usimp;
    }

    public void setUsimp(IUsers usimp) {
        this.usimp = usimp;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users getUsr() {
        return usr;
    }

    public void setUsr(Users usr) {
        this.usr = usr;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
    
    
    
    public Map<String, Object> getAttributes(){
        Map<String, Object> attributes = new HashMap<String, Object>();
        attributes.put("type", "email");
        attributes.put("placeholder", "Enter email");
        
        return attributes;
    }
    
    
    IUsers usimp=new UsersImpl();
    
    public String createUsers(Users usr){
        System.out.println("Hello");
        String m="";
        try{
            List<Users> lu=usimp.FindAll(Users.class);
             for (Users users : lu) {
                Users us=users;
            
            if(usr.getUsername().equals(us.getUsername())){
                 FacesMessage mess=new FacesMessage("Users already exist");
                  FacesContext.getCurrentInstance().addMessage(null, mess);
                  m="other-signup.xhtml";
            }
            
            }
            
                if(usr.getPassword().equals(pass)){
                String password=HashPass.SecurePassword(usr.getPassword());
                usr.setPassword(password);
                
                usr.setUsertype(Utype.User);
                usimp.Create(usr);
                FacesMessage mess=new FacesMessage("User created");
                  FacesContext.getCurrentInstance().addMessage(null, mess);
                  m= "other-login.xhtml";
                }
                else{
                     FacesMessage mess=new FacesMessage("Password don't match");
                  FacesContext.getCurrentInstance().addMessage(null, mess);
                  m="other-login.xhtml";
                }
        
        }catch(Exception e){
            FacesMessage mess=new FacesMessage("failure in creation "+e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, mess);
            m="other-signup.xhtml";
            
        }
        return m;
    }
    
    public String login(Users user){
        String m="";
        try{
        List<Users> lu=usimp.FindAll(Users.class);
             for (Users users : lu) {
                Users us=users;
                String password=HashPass.SecurePassword(user.getPassword());
                if(user.getUsername().equals(us.getUsername())&&password.equals(us.getPassword())){
//                 if(rememberMe){
//                     
//                 }   
                    LOGGER.info("login successful for '{}'", user.getUsername());
                    FacesMessage mess=new FacesMessage("login successful ");
                         FacesContext.getCurrentInstance().addMessage(null, mess);
                          FacesContext facesContext = FacesContext.getCurrentInstance();
                    ExternalContext ec = facesContext.getExternalContext();
                    ec.redirect("../index.xhtml");
                   // m="/index.xhtml";
                }
                else{
                    LOGGER.info("login failed for '{}'", user.getUsername());
                    FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, "Login failed",
                   "Invalid username/password."));
                    FacesContext facesContext = FacesContext.getCurrentInstance();
                    ExternalContext ec = facesContext.getExternalContext();
                    ec.redirect("/index.xhtml");

                    // m=HOME_PAGE_REDIRECT;
                }
             }
             

    }catch(Exception ex){
         FacesMessage mess=new FacesMessage("failure in login "+ex.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, mess);
    }
    return m;
    }
    
    public String logout(Users user){
        LOGGER.debug("invalidating session for '{}'", user.getUsername());
    FacesContext.getCurrentInstance().getExternalContext()
        .invalidateSession();

    LOGGER.info("logout successful for '{}'", user.getUsername());
            return LOGOUT_PAGE_REDIRECT;
            }
}
