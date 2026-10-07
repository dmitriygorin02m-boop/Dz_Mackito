package ru.netology.mockito;

public  class Main {

    public static void main(String[] args) { //Есть массив

        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya"
        };
        String newName = "Slava"; // Нужно добавить переменную в массив

        //Временный массив, в котором лежит новый массив, его длина равна длине изноч. массива + 1
        String[] tmp = new String[names.length + 1];
        // Надо скопировать значени из старого в новый

        for (int i = 0; i < names.length; i++) { // Перебираем значения старого массива
            tmp[i] = names[i]; //значение ячейки name, в ячейку tmp
        }
        // После копирования у нас останется одна незаполненная ячейка 4 - 5

        // лучше не писать tpm[4], а вычислить
        // Указываем последнюю ячейку, это длина нашего массива - 1 и кладем значение
        tmp[tmp.length - 1] =  newName;

        names = tmp; // копируем адрес массива
    }
}