/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TK;
import java.sql.Connection;
import data.DatabaseHelper;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class TaiKhoanDAO {
    Connection conn= null;
    PreparedStatement stmt=null;
    public int Add(TaiKhoan tk){
        try{
            String sSQL="INSERT INTO TaiKhoan VALUES (?,?,?)";
            conn=DatabaseHelper.getDBConnect();
            stmt = conn.prepareStatement(sSQL);
            stmt.setString(1,tk.getTenTK());
            stmt.setString(2,tk.getMatKhau());
            stmt.setString(3,tk.getQuyenKS());
            
            if(stmt.executeUpdate()>0){
                System.out.println("Insert thanh cong");
                return 1;
            }
        }catch(Exception e){
            System.out.println("Eror"+e.toString());
        }
        return -1;
    }
    public int Update(TaiKhoan tk){
        try{
            String sSQL="UPDATE TaiKhoan set TenTK=?,MatKhau=?,QuyenKS=?";
            conn=DatabaseHelper.getDBConnect();
            stmt.setString(1,tk.getTenTK());
            stmt.setString(2,tk.getMatKhau());
            stmt.setString(3,tk.getQuyenKS());
            if(stmt.executeUpdate()>0){
                System.out.println("Update thanh cong");
                return 1;
            }
        }catch(Exception e){
            System.out.println("Eror"+e.toString());
        }
        return -1;
    }
    public int Delete(TaiKhoan kh)
    {
        try{
            String sSQL="DELETE TaiKhoan WHERE TenTK=?";
            conn=DatabaseHelper.getDBConnect();
            stmt = conn.prepareStatement(sSQL);
            stmt.setString(1,tk.getTenTK());
            if(stmt.executeUpdate()>0){
                System.out.println("Delete thanh cong");
                return 1;
            }
        }catch(Exception e){
            System.out.println("Eror"+e.toString());
        }
        return -1;
    }
    public List<TaiKhoan> getAll(){
        List<TaiKhoan> ls= new ArrayList<>();
        ResultSet rs=null;
        Statement stmt=null;
        
        try{
            String sSQL = "SELECT * FROM TaiKhoan";
            conn = DatabaseHelper.getDBConnect();
            stmt= conn.createStatement();
            rs= stmt.executeQuery(sSQL);
            while(rs.next())
            {
                TaiKhoan kh= new TaiKhoan();
                tk.setTenTK(rs.getString(1));
                tk.setMatKhau(rs.getString(2));
                tk.setQuyenKS(rs.getString(3));
                
                ls.add(kh);
            }
        }
        catch(Exception e){
            System.out.println("Loi"+e.toString());
        }
        finally{
            try{
                rs.close(); stmt.close(); conn.close();
            }
            catch(Exception e){
                
            }
        }
    return ls;
    }
    
}
