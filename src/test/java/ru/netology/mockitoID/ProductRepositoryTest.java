package ru.netology.mockitoID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductRepositoryTest {
    PurchaseItem item1 = new PurchaseItem(11,1, "Хлеб",
            40, 3);
    PurchaseItem item2 = new PurchaseItem(222,22, "Булка",
            30, 1);
    PurchaseItem item3 = new PurchaseItem(3,30, "Картошка",
            20, 7);

    @Test
    public void test(){
        PruductRepository repo = new PruductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item1.getId());

        PurchaseItem[] expected = {item2,item3};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

}

