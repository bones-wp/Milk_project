import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Products {
    String type;
    String manufacture;
    String date;
    String composition;

    public Products (String type, String manufacture, String date, String composition) {
        this.type = type;
        this.manufacture = manufacture;
        this.date = date;
        this.composition = composition;
    }
    static Products[] products = new Products[6];

    public Products() {
        products[0] = new Milk("Ряженка", "Савушкин", "11.01.22", "Молоко топлёное, пальмовое масло, закваска") ;
        products[1] = new Milk("Сметана", "Простоквашино", "12.12.21", "Сливки нормализованные, заквасочные микроорганизмы") ;
        products[2] = new Meat("Колбаса", "Атяшево", "11.01.22", "Мясо куриное, соевый белок, красители") ;
        products[3] = new Meat("Сосиски", "Йошкар-Ола", "12.12.21", "Мясо куриное, красители, консерванты") ;
        products[4] = new Bread("Хлеб", "3ий хлебзавод", "11.01.22", "Мука пшеничная, глютен, вода") ;
        products[5] = new Bread("Булка", "1ый хлебзавод", "12.12.21", "Мука пшеничная, вода, соль") ;
    }

    public void find(Products s) {

    }

    public void print(){
        for(Products s :products){
            s.find(s);
        }
    }

}
