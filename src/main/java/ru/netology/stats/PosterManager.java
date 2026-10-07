package ru.netology.stats;

public class PosterManager {

    private Movie[] movies = new Movie[0];
    private int limit;

    public PosterManager() { // Первый конструктор
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {          // Возвращение фильмов в том порядке в котором добавлялись
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;       //movies.length = 7 , limit = 5, resultLength = 5

        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
