/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camp;
//Java Beans
import java.io.Serializable;

/**
 *
 * @author tomoyoasai
 */
public class User implements Serializable {
        private String name; //ユーザー名
        private String pass; //password
        
        public User(){}
        public User (String name, String pass) {
            this.name = name;
            this.pass = pass;
            
    }
    public String getName() { return name; }
    public String getPass() { return pass; }
    
}
