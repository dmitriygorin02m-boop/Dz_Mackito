package ru.netology.mockitoID;

public class PruductRepository {

    private PurchaseItem[] items =  new PurchaseItem[0];



    // Добавление покупки. Создаем метод
    public void save(PurchaseItem item) {
        //Создаем новый массив копируем в него значения и добавляем новое значение
        PurchaseItem[] tmp = new PurchaseItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

// Удаление покупки по ее id
    public  void removeById (int id){
        PurchaseItem[] tmp = new PurchaseItem[items.length - 1];
        int copyToIndex = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id){
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public PurchaseItem[] getItems(){
        return items;
    }

}
