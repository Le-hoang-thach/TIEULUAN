package Thicuoiky;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public  class DanhSachHangHoa  {
    
    
    static public Scanner input = new Scanner(System.in);
    public List<HangHoa> danhSach = new ArrayList<>();
    static NhapThongTin nhapThongTin = new NhapThongTin();
    static FileService fileService = new FileService();
    
    public void duLieuCoSan(){
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String ngayNhapKho = "17-03-2021";
            String ngaySX = "20-03-2020";
            String ngayHetHan = "17-03-2012";
        
            HangHoa hangHoa0 = new HangSanhSu("2002", "chen su", 20_000, 51,dateFormat.parse(ngayNhapKho) , "Le Huynh Phuoc");
            HangHoa hangHoa1 = new HangDienMay("2001", "bong den",20-000, 2, 12, 34);
            HangHoa hangHoa2 = new HangThucPham("2005","xuc xich", 30_000, 3, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa3 = new HangSanhSu("2004", "to su", 40_000, 4,dateFormat.parse(ngayNhapKho), "Le Huynh Phuoc");
            HangHoa hangHoa4 = new HangDienMay("2003", "den pin mini", 50_000, 5, 12, 34);
            HangHoa hangHoa5 = new HangThucPham("2006", "thit heo 456gam", 60_000,6, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa6 = new HangSanhSu("2007", "dia su",20_000, 7, dateFormat.parse(ngayNhapKho),"Le Huynh Phuoc");
            HangHoa hangHoa7 = new HangDienMay("2008", "but thu dien", 20_000, 8,12, 34);
            HangHoa hangHoa8 = new HangThucPham("2009", "thit heo 1kg",90_000,9,dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            HangHoa hangHoa9 = new HangSanhSu("2010", "binh su", 100_000, 10, dateFormat.parse(ngayNhapKho), "Le Huynh Phuoc");
            HangHoa hangHoa10 = new HangDienMay("2011", "may quat",110_000, 11, 12, 34);
            danhSach.add(hangHoa0);
            danhSach.add(hangHoa1);
            danhSach.add(hangHoa2);
            danhSach.add(hangHoa3);
            danhSach.add(hangHoa4);
            danhSach.add(hangHoa5);
            danhSach.add(hangHoa6);
            danhSach.add(hangHoa7);
            danhSach.add(hangHoa8);
            danhSach.add(hangHoa9);
            danhSach.add(hangHoa10);

       
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
    }
    public void input(){
       
            danhSach.add(nhapThongTin.inputHangHoa(danhSach));
           
        
    }
    public void printList() {
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
            

        }
    }
    public void merchandiseReviews(){
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
            System.out.println("Merchandise Reviews: ");
            hangHoa.kiemTraHSD();
        }
    }
    
    public void delete(){
        System.out.println("Please choose the delete method:");
        System.out.println("1.By code       2. By name           ");
        System.out.println("Please choose: ");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
            input.nextLine();
            System.out.println("Enter the item code to delete:");
            String deleteCode = input.nextLine();
            HangHoa hangHoa1 = null;
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa.getMaHang().equalsIgnoreCase(deleteCode)){
                    hangHoa1 =  hangHoa;
                    break;
                }
            }
            if(hangHoa1 != null){
                danhSach.remove(hangHoa1);
                System.out.println("Item has been deleted");
            }else{
                System.out.println("The item code to be deleted is not found in the list ");
            }
                break;
            case 2:
            input.nextLine();
            System.out.println("Enter the name of the item to be deleted:");
            String name = input.nextLine();
            HangHoa hangHoa5 = null;
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa.getTenHang().equalsIgnoreCase(name)){
                    hangHoa5 =  hangHoa;
                    break;
                }
            }
            if(hangHoa5 != null){
                danhSach.remove(hangHoa5);
                System.out.println("Item has been deleted");
            }else{
                System.out.println("The item code to be deleted is not found in the list ");
            } break;
            default:System.out.println("Error please try again !!!");
                break;
        }
        
    }
    public void search(){
        
       System.out.println("Please choose a search method:");
       System.out.println("1.By item code     2. By item name    3 .According to commodity price");
       System.out.println("Please choose:");
        int  choose = input.nextInt();
        switch (choose) {
            case 1:
            input.nextLine();
            System.out.println("Enter the code to search:");
            String maTim = input.nextLine();
            HangHoa hangHoa3HangHoa = null;
            for (HangHoa hangHoa : danhSach) {
           
                if(hangHoa.getMaHang().equalsIgnoreCase(maTim)){
                    hangHoa3HangHoa =  hangHoa;
                    break;
                }
            } if(hangHoa3HangHoa != null){
                
                System.out.println(hangHoa3HangHoa);
            }else{
                System.out.println("Commodity code not in the list !!!");
            }
            break;
            case 2:
            input.nextLine();
            System.out.println("Enter the name you are looking for:");
            String tenTim = input.nextLine();
            HangHoa hangHoa2HangHoa = null;
            for (HangHoa hangHoa : danhSach) {
           
                if(hangHoa.getTenHang().equalsIgnoreCase(tenTim)){
                    hangHoa2HangHoa = hangHoa;
                }
            }
            if(hangHoa2HangHoa != null){
                
                System.out.println(hangHoa2HangHoa);
            }else{
                System.out.println("Commodity name not in the list !!! ");
            }
                break;
            case 3: 
            input.nextLine();
            System.out.println("Enter the price of the goods you are looking for:");
            double gia = input.nextDouble();
           
            HangHoa hoa = null;
                for (HangHoa hangHoa : danhSach) {
                    if(hangHoa.getDonGia() == gia){
                        hoa = hangHoa;
                    }
                }
            if(hoa != null){
                System.out.println(hoa);
            }else{
                System.out.println("The price you are looking for is not available!!!");
            }
           
           break;
           
           
            default: System.out.println("Error! please try again");break;
                
        }
        
        
    }
    public int timViTri(String maHH) {
        int viTri = -1;
        for (HangHoa hh : danhSach) {
            viTri++;
            if (hh.getMaHang().equalsIgnoreCase(maHH)) {
                return viTri;
            }
        }
        return viTri;
    }
    public HangHoa timHangHoaTheoMa(String maHH) {
        HangHoa hangHoa = null;
        for (HangHoa hh : danhSach) {
            if (hh.getMaHang().equalsIgnoreCase(maHH)) {
                hangHoa = hh;
            }
        }
        if (hangHoa == null) {
           
        }
        return hangHoa;
    }
    public void suaHangHoaTheoMa(){
        HangHoa hangHoa = null; 
        input.nextLine();
        System.out.println("Enter the item code to be corrected : ");
        String ma = input.nextLine();

        hangHoa = timHangHoaTheoMa(ma);
        int viTri = timViTri(ma);

        if (hangHoa != null) {
            hangHoa = danhSach.set(viTri, nhapThongTin.suaHang(hangHoa));
            System.out.println("Goods have been repaired");
        } else {
            System.out.println("Commodity code not in the list!!!!");
        }
        
    }
    public void statistical(){
        int soLuong = 0;
        double donGia = 0;
        int soLuong1 = 0;
        double donGia1 = 0;
        int soLuong2 = 0;
        double donGia2 = 0;
        for (HangHoa hangHoa : danhSach) {
            if(hangHoa instanceof HangSanhSu){
                soLuong = soLuong + hangHoa.getSoLuongTonKho();
                donGia = donGia + hangHoa.getDonGia()*hangHoa.getSoLuongTonKho();
            }else if(hangHoa instanceof HangDienMay){
                soLuong1 = soLuong1 + hangHoa.getSoLuongTonKho();
                donGia1 = donGia1 + hangHoa.getDonGia()*hangHoa.getSoLuongTonKho();
            }else if(hangHoa instanceof HangThucPham){
                soLuong2 = soLuong2 + hangHoa.getSoLuongTonKho();
                donGia2 = donGia2 + hangHoa.getDonGia()*hangHoa.getSoLuongTonKho();
            }
        }
        System.out.println("        THIS IS THE STATISTICS OF STOCK FACES             ");
        System.out.println("------------------------------------------------------");
        System.out.println("The total quantity of crockery in stock : " + soLuong );
        System.out.println("Total money amount of electrical goods in stock : " + donGia + "( VND)");
        System.out.println("The total amount of food goods in stock : " + soLuong1 );
        System.out.println("Total money amount of electrical goods in inventory is: " + donGia1 + "( VND)");
        System.out.println("The total amount of electrical goods in stock : " + soLuong2 );
        System.out.println("The total money amount of food in the warehouse is: " + donGia2 +"( VND)");
      
       
    }
         public void arrangeGoods(){
           
            Collections.sort(danhSach, ((o1, o2) -> o1.getMaHang().compareTo(o2.getMaHang())));
           
            System.out.println("You have successfully arranged !!!");
        }
    public void ghiFile(){
        fileService.writeToFile(danhSach);
    }
    public void docFile(){
        fileService.readFile(danhSach);
    }
   
}
