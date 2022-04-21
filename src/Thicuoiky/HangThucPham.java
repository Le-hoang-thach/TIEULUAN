package Thicuoiky;

import java.util.Date;
import java.text.SimpleDateFormat;

public class HangThucPham extends HangHoa {
    // emplementation
    private Date ngaySX;
    private Date ngayHetHan;
    // interface
    public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTonKho, Date ngaySX,
    Date ngayHetHan) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
        
    }
        public HangThucPham() {

    }
    public Date getNgaySX() {
        return ngaySX;
    }
   
   
    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
           
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd-MM-yyyy");
        return "Hang thuc pham "+ super.toString()   + " ,Date of manufacture = "
        + ngayVietNam.format(ngaySX) +  " ,Expiration date = " + ngayVietNam.format(ngayHetHan) +" ,Tax = " + tinhTien() +" ( VND)" +"]" ;
    }
    public boolean tinhHSD(){
        boolean ngayHetHan = false;
        Date ngayHienTai = new Date();
        if(this.ngayHetHan.before(ngayHienTai)){
            ngayHetHan = false;
        }else{
            ngayHetHan = true;
        }
        return ngayHetHan;
    }

    
  
    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stub
        
        
        if(this.getSoLuongTonKho() > 0 && this.tinhHSD() == false ){
            System.out.println("Goods sell slowly!!!");
        }else{
            System.out.println("Hot selling goods!!!");
        }
    }
    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.05;
        return tien;
        
    }

   
    



    
    
}
