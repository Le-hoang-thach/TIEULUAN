package Thicuoiky;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NhapThongTin {
    
  
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public Scanner input = new Scanner(System.in);
    private String goodsName;
    private String commodityCodes;
    private int quantityInStock ;
    private Double price;
    private  int thoiGianBaoHanhTheoThang;
    private double congSuat;
    private String nhaSX;
    public HangHoa inputHangHoa(List<HangHoa> hangHoas)  {
        
        int choose;
        HangHoa hangHoa = null;
        System.out.println("Please select the goods to import");
        System.out.println("-------------------------------------");
        System.out.println("1.Crockery goods ");
        System.out.println("2.Electrical goods");
        System.out.println("3.Food goods");
        System.out.println("4.Exit");
        System.out.println("Please choose:");
        choose = input.nextInt();
        switch(choose){
            case 1:
            input.nextLine();
            System.out.println("Enter item code:");
            commodityCodes = input.nextLine();
            for (HangHoa hangHoa2 : hangHoas) {
                if(hangHoa2.getMaHang().equalsIgnoreCase(commodityCodes)){
                    System.out.println("Item code already exists");
                     
                    return null;
                }
            }
            System.out.println("Enter item name:");
            goodsName = input.nextLine();
           try {
            System.out.println("Enter the price:");
            price = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Enter error");
                System.out.println("Please enter the number");
           }
            
            try {
                System.out.println("Enter inventory quantity:");
                quantityInStock = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            
            System.out.println("Enter the warehouse date in the format dd-MM-yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.println("Enter manufacturer:");
                nhaSX = input.nextLine();
                hangHoa = new HangSanhSu(commodityCodes, goodsName, price, quantityInStock, dateFormat.parse(date), nhaSX);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            break;
            case 2: 
            input.nextLine();
            System.out.println("Enter item code:");
            commodityCodes = input.nextLine();
            for (HangHoa hangHoa2 : hangHoas) {
                if(hangHoa2.getMaHang().equalsIgnoreCase(commodityCodes)){
                    System.out.println("Item code already exists");
                    return null;
                }
            }
            System.out.println("Enter item name:");
            goodsName = input.nextLine();
           try {
            System.out.println("Enter the price:");
            price = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Enter error");
                System.out.println("Please enter the number");
           }
            
            try {
                System.out.println("Enter inventory quantity:");
                quantityInStock = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            try {
                System.out.println("Enter the number of months of warranty:");
                thoiGianBaoHanhTheoThang = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            try {
                System.out.println("Enter capacity:");
                congSuat = input.nextDouble();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
           
            hangHoa = new HangDienMay(commodityCodes, goodsName, price, quantityInStock, thoiGianBaoHanhTheoThang, congSuat);
            
            break;
            case 3:
            input.nextLine();
            System.out.println("Enter item code:");
            commodityCodes = input.nextLine();
            for (HangHoa hangHoa2 : hangHoas) {
                if(hangHoa2.getMaHang().equalsIgnoreCase(commodityCodes)){
                    System.out.println("Item code already exists");
                    return null;
                }
            }
            System.out.println("Enter item name:");
            goodsName = input.nextLine();
           try {
            System.out.println("Enter the price:");
            price = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Enter error");
                System.out.println("Please enter the number");
           }
            
            try {
                System.out.println("Enter inventory quantity:");
                quantityInStock = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            System.out.println("Enter production date according to dd-MM-yyyy: ");
            String ngaySX = input.nextLine();
            Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Enter the expiration date by dd-MM-yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            try {
                hangHoa = new HangThucPham(commodityCodes, goodsName, price, quantityInStock, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            } catch (Exception e) {
                //TODO: handle exception
            }
          
            break;
            case 4: System.out.println("See you!!!"); break;
            default: System.out.println("You made the wrong choice, try again!!!");
        }

    
          return hangHoa;
            
       
    }
    public HangHoa suaHang(HangHoa hangHoa){
        commodityCodes = hangHoa.getMaHang();
        int choose;

        System.out.println("Please select the goods to import");
        System.out.println("-------------------------------------");
        System.out.println("1.Crockery goods        ");
        System.out.println("2.Electrical goods      ");
        System.out.println("3.Food goods            ");
        System.out.println("4.Exit");
        System.out.println("Please choose:");
        choose = input.nextInt();
        switch(choose){
            case 1:
            input.nextLine();
            System.out.println("Enter item name:");
            goodsName = input.nextLine();
           try {
            System.out.println("Enter the price:");
            price = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Enter error");
                System.out.println("Please enter the number");
           }
            
            try {
                System.out.println("Enter inventory quantity:");
                quantityInStock = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            
            System.out.println("Enter the warehouse date in the format dd-MM-yyyy: ");
            
            String date = input.next();
           
            Date date2 = null;
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                input.nextLine();
                System.out.println("Enter manufacturer:");
                nhaSX = input.nextLine();
                hangHoa = new HangSanhSu(commodityCodes, goodsName, price, quantityInStock, dateFormat.parse(date), nhaSX);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            break;
            case 2: 
           input.nextLine();
            System.out.println("Enter item name:");
            goodsName = input.nextLine();
           try {
            System.out.println("Enter the price:");
            price = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Enter error");
                System.out.println("Please enter the number");
           }
            
            try {
                System.out.println("Enter inventory quantity:");
                quantityInStock = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            try {
                System.out.println("Enter the number of months of warranty:");
                thoiGianBaoHanhTheoThang = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            try {
                System.out.println("Enter capacity:");
                congSuat = input.nextDouble();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
           
            hangHoa = new HangDienMay(commodityCodes, goodsName, price, quantityInStock, thoiGianBaoHanhTheoThang, congSuat);
            
            break;
            case 3:
            input.nextLine();
            
            System.out.println("Enter item name:");
            goodsName = input.nextLine();
           try {
            System.out.println("Enter the price:");
            price = input.nextDouble();
           } catch (Exception e) {
               //TODO: handle exception
               System.out.println("Enter error");
                System.out.println("Please enter the number");
           }
            
            try {
                System.out.println("Enter inventory quantity:");
                quantityInStock = input.nextInt();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Enter error");
                System.out.println("Please enter the number");
            }
            System.out.println("Enter production date according to dd-MM-yyyy: ");
            String ngaySX = input.nextLine();
            Date date3 = null;
            try {
                //Parsing the String
                date3 = dateFormat.parse(ngaySX);
               } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Enter the expiration date by dd-MM-yyyy: ");
            String ngayHetHan = input.nextLine();
            try {
                date2 = dateFormat.parse(ngayHetHan);
               
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            try {
                hangHoa = new HangThucPham(commodityCodes, goodsName, price, quantityInStock, dateFormat.parse(ngaySX), dateFormat.parse(ngayHetHan));
            } catch (Exception e) {
                //TODO: handle exception
            }
          
            break;
            case 4: System.out.println("See you!!!"); break;
            default: System.out.println("You made the wrong choice, try again!!!");
        }

    
            return hangHoa;
    }
    
    
}
