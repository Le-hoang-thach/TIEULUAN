package Thicuoiky;

public class DanhSachHangHoaTestDriver {
    static NhapThongTin nhapThongTin = new NhapThongTin(); 
    public static void main(String[] args)   {
        
        int choose;
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
        
        danhSachHangHoa.duLieuCoSan();

        do{
            System.out.println("      MENU         ");
            System.out.println("------------------");
            System.out.println("1.Enter information");
            System.out.println("2.Print the list   ");
            System.out.println("3.Find goods       ");
            System.out.println("4.Delete row       ");
            System.out.println("5.Edit goods information");
            System.out.println("6.Statistical      ");
            System.out.println("7.Sorting goods    ");
            System.out.println("8.Read file        ");
            System.out.println("9.Save file        ");
            System.out.println("10.Merchandise Reviews");
            System.out.println("0.Exit             ");
            System.out.println("Please choose:");
            
            choose = danhSachHangHoa.input.nextInt();
            switch(choose){
                
                case 1: 
                
                    danhSachHangHoa.input();
                    
                
               
               break;
                case 2:
                System.out.println(); danhSachHangHoa.printList();
                break;
                case 3 : 
                danhSachHangHoa.search();
                break;
                case 4: 
                danhSachHangHoa.delete();
                break;
                case 5: danhSachHangHoa.suaHangHoaTheoMa();
                
                break;
                
                 
                case 6: danhSachHangHoa.statistical();break;
                case 7 : danhSachHangHoa.arrangeGoods();danhSachHangHoa.printList();; ;break;
                case 8 : danhSachHangHoa.docFile(); break;
                case 9 : danhSachHangHoa.ghiFile();break;
                case 10: danhSachHangHoa.merchandiseReviews();
                case 0:  System.out.println("Goodbye");break;
                
                default: System.out.println("Error please re-enter!!!");break;
            }
        }while(choose != 0);
    
       
      
       
        
      
       
    }

        
    
}
