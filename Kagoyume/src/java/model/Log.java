/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;



/**
 *
 * @author tomoyoasai
 */
public class Log {
    
    public static Log getInstance() {
        return new Log();
    }
    
    public void logtxt(String log) {
        File filepath = null;
        FileWriter fw = null;
        Date date = new Date();
        try{
            filepath = new File("/Users/tomoyoasai/NetBeansProjects/Kagoyume/web/WEB-INF/log");
            //ログファイルに追加書き足し
            fw = new FileWriter(filepath, true);
            fw.write(log+ "(" +date+ ")--" );
            fw.flush();
        }catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
        
}
