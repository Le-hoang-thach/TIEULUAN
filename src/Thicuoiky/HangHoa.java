package Thicuoiky;

public abstract class HangHoa  {
    //attribute
    //emplementtation
    
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuongTonKho;
    
    //interface
    //method
    public abstract double tinhTien();
    public abstract void kiemTraHSD();
 
    
   

    
    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTonKho) {
        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setSoLuongTonKho(soLuongTonKho);
        
    }


    public HangHoa() {
        //contrustor mặc định
    }
    @Override
    public String toString() {
        return " [ commodity codes = " + maHang + " ,Inventory number = " + soLuongTonKho + " ,Goods name = " + tenHang + " ,Price = " + donGia  + " (VND)";
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        if(maHang != null  ){
            this.maHang = maHang;
        }else{
            System.out.println("The commodity code cannot be empty !!!!");
        }
    }
    
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        if(tenHang != null || tenHang == " "){
            this.tenHang = tenHang;
        }else{
            System.out.println("The product name cannot be blank!!!!");
        }
        
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        if(soLuongTonKho >= 0){
            this.soLuongTonKho = soLuongTonKho;
        }else{
            System.out.println("The number of goods in stock must not be negative!!!");
        }
           
    }
   

    public double getDonGia() {
        return donGia;
    }


    public void setDonGia(double donGia) {
        if(donGia >0){
            this.donGia = donGia;
        }else{
            System.out.println("Price should not be less than 0!!!");
        }
    }
    
    
    

    
   
    

    
    
}

