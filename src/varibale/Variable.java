package varibale;

 public class Variable {
//    Biến tĩnh không được lưu ở trên vùng nhớ stack hay heap mà thay vào đó nó được lưu ở metaspace khi khai báo
//    một biến tĩnh tức là biến này thuộc về lớp và không cần tạo một đối tượng cụ thế cũng có thế gọi đến trực
//    tiếp biến đó.
    public  static int d;
    public static final String CONSTANT="Đây biến hằng số không thể thay đổi được";
//    biến CONSTANT được khai báo không thể thay đổi được và được lưu ở Metaspace
    private static int e;
//    Biến name có thể hiểu rằng đây là một biến thành viên biến này được lưu trữ ở đối tượng,nó là thuộc tính
//    Của môt đối tượng và nó chỉ có thể thay đối truy cập được thông qua đối tượng đó.
    private String name;
    public String fullName="Nguyen thanh tung";
    public int total(int a,int b){
//        Biến c trong trường hợp này được gọi là biến cục bộ, được lưu ở stack khi chương trình chạy xong
//        Chương trình sẽ tự thu gon,giải phóng biến c, biến này không truy cập được ngoài phương thức total
//        Biến a và b có thể hiểu rằng là hai biến tham số (paramenters) phạm vị hoạt động chỉ được trong phương
//        thức total

         int c =a+b;
         return c;
    }



}
