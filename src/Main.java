import oop.Circle;
import oop.Geometry;
import oop.Rectangle;
import varibale.Variable;

public class Main {
    public static void main(String[] args) {
//        Variable variable=new Variable();
//        System.out.println(Variable.d=5);
//        String name= variable.fullName="ngieyn hanidang";
//        System.out.println( name );
//        int total=variable.total(4,5);
////        Đang phân vân  không biết là tạo bản sao ở đối số gắn cho tham số có đúng không hay là ngược lại
//        System.out.println(total);
//        System.out.println(Variable.CONSTANT);
//        String constant=Variable.CONSTANT;
//        ======================================================================================================

        Rectangle rectangle = new Rectangle(3, 4);
        double acreage = rectangle.acreage();
        System.out.println(acreage);

    }
}