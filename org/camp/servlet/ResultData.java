/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/*サーブレットクラスとJSPの連携(p.5)
リクエストスコープ:
(p.191〜

①インターフェース(java.io.Serializable;)を実装する
    クラス→バイト 変換

*/
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tomoyoasai
 */
//①
//
public class ResultData implements Serializable {

    //③フィールドはカプセル化する。
    private Date d;
    private String luck;
    
    //②Publicで引数のないコンストラクタを持つ。
    
    public ResultData() {}
    
    /*命名規則に沿ったgetter/setterを持つ。
    getter:フィールドへの情報を設定/setter:フィールドの情報を引き出す
    
    @return the d
    */
    public Date getD() {
        return d;
    }
    
    //@param d the d to set
    
    public void setD(Date d) {
        this.d = d;
    }
    
    //return the luck
    
    public String getLuck() {
        return luck;
    }
    
    public void setLuck(String luck) {
        this.luck = luck;
    }
    
}
