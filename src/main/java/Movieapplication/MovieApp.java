package Movieapplication;

import java.util.Scanner;


public class MovieApp {
    Scanner sc = new Scanner(System.in);
    Movie[] movies = new Movie[0];


    public void resizeMoviesArray(int additionalSize) {
        Movie[] newMovies = new Movie[movies.length + additionalSize];
        for (int i = 0; i < movies.length; i++) {
            newMovies[i] = movies[i];
        }
        movies = newMovies;
    }


    public void inputMoviesAndRatings() {
        System.out.println("Input 3 movies:");
        resizeMoviesArray(3);
        for (int i = movies.length - 3; i < movies.length; i++) {
            System.out.print((i + 1) + ". Movie Name: ");
            String name = sc.next();
            System.out.print("Rating: ");
            double rating = sc.nextDouble();
            movies[i] = new Movie(name, rating);
        }
    }


    public void inputMoreMoviesAndRatings() {
        System.out.println("How many movies do you want to add?");
        int count = sc.nextInt();
        resizeMoviesArray(count);

        for (int i = movies.length - count; i < movies.length; i++) {
            System.out.print((i + 1) + ". Movie Name: ");
            String name = sc.next();
            System.out.print("Rating: ");
            double rating = sc.nextDouble();
            movies[i] = new Movie(name, rating);
        }
    }


    public void displayMoviesAndRatings() {
        if (movies.length == 0) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("Movies and Ratings:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i].name + " - " + movies[i].rating);
        }
    }

    public void calculateAndDisplay() {
        double sum = 0.0;
        for (int i = 0; i < movies.length; i++) {
            sum += movies[i].rating;
        }
        //Average
        System.out.println("Average: " + sum / movies.length);
        int indexMax = 0, indexMin = 0;
        double max = movies[0].rating, min = movies[0].rating;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating > max) {
                max = movies[i].rating;
                indexMax = i;
            }
            if (movies[i].rating < min) {
                min = movies[i].rating;
                indexMin = i;
            }
        }

        System.out.println("Maximum: " + max + " Name: " + movies[indexMax].name + "\nMinimum: " + min + " Name: " + movies[indexMin].name);

    }

    public void searchMovies() {
        boolean found = false;
        System.out.println("Enter movie name:");
        String name = sc.next();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].name.equals(name)) {
                found = true;
                System.out.println("Movie Rating: " + movies[i].rating);
            }
        }
        if (!found) {
            System.out.println("Movie Not Found.");
        }
    }

    public void updateRatings() {
        System.out.println("Enter movie name:");
        String name = sc.next();
        boolean found = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].name.equals(name)) {
                movies[i].rating = sc.nextDouble();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Movie Not Found.");
        }
    }

    public void deleteMovies() {
        System.out.println("Enter movie name:");
        String name = sc.next();
        Movie[] newMovie = new Movie[movies.length - 1];
        int k = 0;
        for (int i = 0; i < movies.length; i++) {

            if (movies[i].name.equals(name)) {
                continue;
            } else {
                newMovie[k++] = movies[i];
            }
        }
        movies = newMovie;
    }

    public void sortMovies() {
        for (int i = 0; i < movies.length; i++) {
            for (int j = i + 1; j < movies.length; j++) {
                if (movies[i].rating > movies[j].rating) {
                    Movie temp = movies[i];
                    movies[i] = movies[j];
                    movies[j] = temp;
                }
            }
        }
        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i].name + " - " + movies[i].rating);
        }
    }

    //public void sortingname(){
    //     System.out.println("Enter movie name :");
    //     String namess = sc.nextLine();
    //     for (int i =0;i< movies.length;i++){
    //         if (movies[i].name == namess){
    //             System.out.println("Yes of cours this movie action");
    //         }
    //     }
    // }

    public static void main(String[] args) {
        MovieApp app = new MovieApp();
        int operand;

        do {
            System.out.println("""
                    Press 1 to input 3 new movies
                    Press 2 to display movies and ratings
                    Press 3 to input more movies
                    Press 4 to find statistics
                    Press 5 to search for a movie
                    Press 6 to update movie ratings
                    Press 7 to delete movie ratings
                    Press 8 to sort movies
                    Press 0 to exit""");
            operand = app.sc.nextInt();
            switch (operand) {
                case 1:
                    app.inputMoviesAndRatings();
                    break;
                case 2:
                    app.displayMoviesAndRatings();
                    break;
                case 3:
                    app.inputMoreMoviesAndRatings();
                    break;
                case 4:
                    app.calculateAndDisplay();
                    break;
                case 5:
                    app.searchMovies();
                    break;
                case 6:
                    app.updateRatings();
                    break;
                case 7:
                    app.deleteMovies();
                    break;
                case 8:
                    app.sortMovies();
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (operand != 0);
    }
}
