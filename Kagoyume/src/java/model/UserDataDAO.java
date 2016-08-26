/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author tomoyoasai
 */
public class UserDataDAO {
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    /**
     * ユーザデータの検索処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    
    public UserDataDTO  findByLogin(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        
        try{
            con = DBManager.getConnection();
            String sql = "SELECT * FROM user_t WHERE name like ? AND password like ?";
            st = con.prepareStatement(sql);
            st.setString(1, ud.getName());
            st.setString(2, ud.getPassword());
            
            ResultSet rs = st.executeQuery();
            
            //一致したユーザーが存在する場合
            rs.next();
            UserDataDTO resultUd = new UserDataDTO();
            resultUd.setUserID(rs.getInt(1));
            resultUd.setName(rs.getString(2));
            resultUd.setPassword(rs.getString(3));
            resultUd.setMail(rs.getString(4));
            resultUd.setAddress(rs.getString(5));
            resultUd.setTotal(rs.getInt(6));
            resultUd.setNewDate(rs.getTimestamp(7));
            resultUd.setDeleteFlg(rs.getInt(8));
            
            System.out.println("login search complete");    
            return resultUd;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }
    }
    
    /**
     * 新規登録データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    
    public void insert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            //DriverManager(データベースへの接続準備)のgetConnectionメソッド
            con = DBManager.getConnection();
            st = con.prepareStatement("INSERT INTO user_t (name,password,mail,address,newDate) VALUES(?,?,?,?,?)");
            //SQL文の?に実際のパラメータ値をセット
            st.setString(1, ud.getName());
            st.setString(2, ud.getPassword());
            st.setString(3, ud.getMail());
            st.setString(4, ud.getAddress());                   
            st.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            
            st.executeUpdate();
            
            System.out.println("insert completed!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{//データベース切断
            if(con != null){
                con.close();
            }
        } 
    }
    
    public void update(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            String sql = "UPDATE user_t SET name=?, password=?, mail=?, address=?, newDate=? WHERE userID= ?" ;
            st =  con.prepareStatement(sql);
            st.setString(1, ud.getName());
            st.setString(2, ud.getPassword());
            st.setString(3, ud.getMail());
            st.setString(4, ud.getAddress());
            st.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            st.setInt(6,ud.getUserID());
            st.executeUpdate();
            
            System.out.println("update completed");

        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        } 
    }
    

    public void delete(UserDataDTO ud) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        try{
            //DriverManager(データベースへの接続準備)のgetConnectionメソッド
            con = DBManager.getConnection();
            st = con.prepareStatement("DELETE FROM user_t WHERE userID = ?");
            //SQL文の?に実際のパラメータ値をセット
            st.setInt(1, ud.getUserID());
            st.executeUpdate();
            System.out.println("delete completed");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}