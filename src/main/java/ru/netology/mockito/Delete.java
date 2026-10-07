package ru.netology.mockito;

public class Delete {
    public static void main(String[] args) {
        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya",
                "Slava"
        };
        String delete = "Olya"; //Создаем переменную которую хотим удалить
// Создаем временный массив
        String[] tmp = new String[names.length - 1];

// Так как размер массивов разный индексы разойдутся !! поэтому
        int copyToIndex = 0;    // Создаем переменную где указывается номер ячейки
        for (String name : names) { // Перекладываем значения в новый массив
            if (!name.equals(delete)) { //Если имя !не равно то копируй
// name = "Petya"       tmp[0] = "Petya"
//copyToIndex = 0
                tmp[copyToIndex] = name;
            copyToIndex++;
            }
        }
        names = tmp;
    }
}
