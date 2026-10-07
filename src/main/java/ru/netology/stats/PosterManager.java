package ru.netology.stats;

public class PosterManager {
    private Movie[] movies = new Movie[0]; //Тут хранятся фильмы, создали массив, = 0 потому что после создания
    //Менеджера фильмов пока нет
    private int limit;  // Ограничение фильмов которые возвращает findlast , если 5 то вернуть 5 последних фильмов

    public PosterManager() { // Первый конструктор
        this.limit = 5;
    }
    // Если написать PosterManager manager = new PosterManager(); то автоматически будет 5

    public PosterManager(int limit) { // Конструктор для изменения лимита
        this.limit = limit;             // PosterManager manager = new PosterManager(3);
    }

    public void add(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1]; //Создаем новый массив такой же как старый но с добавлением

        for (int i = 0; i < movies.length; i++) { // коппируем значения
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] =  movie; // добавляем новый фильм в последнюю ячейку
        // tmp[movies.length] положить после всех элементов старого массива
        // movies.length сейчас равен 3. tmp[3] = movie;

        movies = tmp;
    }

    public Movie[] findAll() {          // Возвращение фильмов в том порядке в котором добавлялись
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;       //movies.length = 7 , limit = 5, resultLength = 5

        //Нельзя создать массив из 5 фильмов, потому что у нас всего 3 фильма.
        //Поэтому нужно вернуть только: 3 фильма

        if (movies.length < limit) { //кол-во фильмов меньше лемита, то...
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        // Создаём результирующий массив ////////////////////////////////
        //Мы не можем вернуть 5 фильмов, если у нас их всего 3.
        //Поэтому сначала определяем правильный размер.

        Movie[] result = new Movie[resultLength];

        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];  // ///////////////////////
        }

        return result;
    }
}
