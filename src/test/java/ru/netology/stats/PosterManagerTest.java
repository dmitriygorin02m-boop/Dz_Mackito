package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    // Возврат переменных name и genre
    @Test
    public void shouldReturnMovieNameAndGenre() {
        Movie movie = new Movie("Бладшот", "боевик");

        Assertions.assertEquals("Бладшот", movie.getName());
        Assertions.assertEquals("боевик", movie.getGenre());
    }

    // Добавление фильма
    @Test
    public void shouldAddMovie() {
        PosterManager manager = new PosterManager();

        Movie movie = new Movie("Бладшот", "боевик");
        manager.add(movie);

        Movie[] expected = {movie};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Добавление нескольких фильмов по порядку
    @Test
    public void shouldAddSeveralMovies() {
        PosterManager manager = new PosterManager();

        Movie movie1 = new Movie("Бладшот", "боевик");
        Movie movie2 = new Movie("Вперёд", "мультфильм");
        Movie movie3 = new Movie("Джентельмены", "боевик");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        Movie[] expected = {movie1, movie2, movie3};
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Добавление фильмов больше лимита и их последовательность
    @Test
    public void shouldReturnFiveLastMovies() {
        PosterManager manager = new PosterManager();

        Movie movie1 = new Movie("Бладшот", "боевик");
        Movie movie2 = new Movie("Вперёд", "мультфильм");
        Movie movie3 = new Movie("Отель \"Белград\"", "комедия");
        Movie movie4 = new Movie("Джентельмены", "боевик");
        Movie movie5 = new Movie("Человек-невидимка", "ужасы");
        Movie movie6 = new Movie("Тролли. Мировой тур", "мультфильм");
        Movie movie7 = new Movie("Номер один", "комедия");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Добавление фильмов меньше лимита и их последовательность
    @Test
    public void shouldReturnAllMoviesWhenLessThanLimit() {
        PosterManager manager = new PosterManager();

        Movie movie1 = new Movie("Бладшот", "боевик");
        Movie movie2 = new Movie("Вперёд", "мультфильм");
        Movie movie3 = new Movie("Джентельмены", "боевик");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Выставляемый лимит  и порядок добавляения
    @Test
    public void shouldFindLast() {
        PosterManager manager = new PosterManager(3);

        Movie movie1 = new Movie("Бладшот", "боевик");
        Movie movie2 = new Movie("Вперёд", "мультфильм");
        Movie movie3 = new Movie("Отель \"Белград\"", "комедия");
        Movie movie4 = new Movie("Джентельмены", "боевик");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);

        Movie[] expected = {movie4, movie3, movie2};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
