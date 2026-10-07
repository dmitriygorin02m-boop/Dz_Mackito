package ru.netology.mockitoID;

public class PurchaseItem { // создаем класс
    //создаем поля класса

    private int id;                  // id записи покуппки
    private int productid;          // id товара
    private String productName;         // Название товара
    private int productPrice;       // цена
    private int count;              //количество

                //Создаем конструктор
                //Который автоматически вызывается когда пишем new

    public PurchaseItem(int id, int productid, String productName, int ProductPrice, int count) {
        this.id = id;
        this.productid = productid;
        this.productName = productName;
        this.productPrice = ProductPrice;
        this.count = count;
    }

    public int getId() {
        return id;
    }
}
