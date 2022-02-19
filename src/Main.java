public class Main {

    public static void main(String[] args) {

        Magazine magazine = new Magazine();

        magazine.print();
        magazine.find();

        magazine.set(0,new Milk("Кефир", "Кубанская бурёнка", "15.02.22", "Молоко, закваска"));
        magazine.set(2, new Meat("Колбаса", "Фабрика качества", "18.02.22", "Мясо куриное, мясо свинное, красители"));
        magazine.goods.remove(4);

        magazine.find();
        magazine.print();

        magazine.add(5, new Vegetables("Огурцы", "Совхоз Майский"));
        magazine.print();

        magazine.vegan();

    }

}
