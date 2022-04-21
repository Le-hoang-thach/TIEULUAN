package Thicuoiky;


public class HangDienMay extends HangHoa {
    //imoplementation
    private int thoiGianBaoHanhTheoThang;
    private double congSuat;
    
    //interface
    

    
    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTonKho, int thoiGianBaoHanhTheoThang,
            double congSuat) {
        super(maHang, tenHang, donGia, soLuongTonKho);
        this.thoiGianBaoHanhTheoThang = thoiGianBaoHanhTheoThang;
        this.congSuat = congSuat;
    }



    public HangDienMay(int thoiGianBaoHanhTheoThang, double congSuat) {
        this.thoiGianBaoHanhTheoThang = thoiGianBaoHanhTheoThang;
        this.congSuat = congSuat;
    }



    public HangDienMay() {
    }
    
    

    public int getThoiGianBaoHanhTheoThang() {
        return thoiGianBaoHanhTheoThang;
    }

    public void setThoiGianBaoHanhTheoThang(int thoiGianBaoHanhTheoThang) {
        if(thoiGianBaoHanhTheoThang >= 0){
            this.thoiGianBaoHanhTheoThang = thoiGianBaoHanhTheoThang;
        }else{
            System.out.println("The warranty period must be greater than 0!!!");
        }
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        if(congSuat > 0){
            this.congSuat = congSuat;
        }else{
            System.out.println("Power must be greater than 0!!!");
        }
    }

    @Override
    public double tinhTien() {
        // TODO Auto-generated method stub
        double tien = 0;
        tien = this.getDonGia() * 0.1;
        return tien;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Hang dien may " + super.toString() + " ,Warranty period: " +thoiGianBaoHanhTheoThang+ " (month)" +" ,Wattage: " + congSuat + " ,Tax: " + tinhTien()  + " (VND)" + " ]";
    }

    @Override
    public void kiemTraHSD() {
        // TODO Auto-generated method stub
        
        if(this.getSoLuongTonKho() < 3){
            System.out.println("Hot selling goods!!!");
        }else{
            System.out.println("Goods sell slowly !!!");
        }
    }



   
    
    
    
    
}
