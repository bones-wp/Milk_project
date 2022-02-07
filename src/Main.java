public class Main {
    static Milk[] products = new Milk[3];

    public static void main(String[] args) {

        products[0] = new Milk("Ряженка", "Савушкин", "11.01.22", "Молоко топлёное, пальмовое масло, закваска") ;
        products[1] = new Milk("Сметана", "Простоквашино", "12.12.21", "Сливки нормализованные, заквасочные микроорганизмы") ;
        products[2] = new Milk("Масло сливочное", "Главпродукт", "11.01.22", "Пальмовое масло, эмульгаторы") ;

        Milk.palm();

    }
}
