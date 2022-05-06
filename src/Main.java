public class Main {

    public static void main(String[] args) {

        Magazine magazine = new Magazine();

        magazine.print();
        magazine.find();

        magazine.set(0,new Milk("15.02.22", "Молоко, закваска", "Кубанская бурёнка", "Кефир"));
        magazine.set(2, new Meat("18.02.22", "Мясо куриное, мясо свинное, красители", "Фабрика качества", "Колбаса"));
        magazine.goods.remove(4);

        magazine.find();
        magazine.print();

        magazine.add(5, new Vegetables("11.02.22", "Огурцы", "Майский", "Огурцы"));
        magazine.print();

        magazine.vegan();

    }

}
