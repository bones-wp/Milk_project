import java.util.ArrayList;

public class Magazine {
    ArrayList<Products> goods = new ArrayList<Products>() ;

    public Magazine(){

        goods.add(0, new Milk("Ряженка", "Савушкин", "11.01.22", "Молоко топлёное, пальмовое масло, закваска"));
        goods.add(1, new Milk("Сметана", "Простоквашино", "12.12.21", "Сливки нормализованные, заквасочные микроорганизмы"));
        goods.add(2, new Meat("Колбаса", "Атяшево", "11.01.22", "Мясо куриное, соевый белок, красители"));
        goods.add(3, new Meat("Сосиски", "Йошкар-Ола", "12.12.21", "Мясо куриное, красители, консерванты"));
        goods.add(4, new Bread("Хлеб", "3ий хлебзавод", "11.01.22", "Мука пшеничная, глютен, вода"));
        goods.add(5, new Bread("Булка", "1ый хлебзавод", "12.12.21", "Мука пшеничная, вода, соль"));

    }

    public void print() {
        System.out.println('\n' + "Список продуктов в магазине: " + '\n');
        for (Products a : goods) {
            System.out.println(a);
        }
    }
    public void add (int i, Products p){
        goods.add(i, p);
    }
    public void set (int i, Products p){
        goods.set(i, p);
    }

    public void find(){
        System.out.println('\n' + "Продукты с нежелательными ингридиентами: " + '\n');
        for(Products s :goods){
            s.find(s);
        }
    }



}
