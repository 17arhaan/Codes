import java.util.ArrayList;

class TicketsNotAvailable extends Exception {
    public TicketsNotAvailable(String message) {
        super(message);
    }
}

class Movie {
    String title;
    int totalSeats;
    int availableSeats;

    public Movie(String title, int totalSeats) {
        this.title = title;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }
}

class TicketBooking implements Runnable {
    private INOXMultiplex multiplex;
    private int movieIndex;
    private int numTickets;

    public TicketBooking(INOXMultiplex multiplex, int movieIndex, int numTickets) {
        this.multiplex = multiplex;
        this.movieIndex = movieIndex;
        this.numTickets = numTickets;
    }

    @Override
    public void run() {
        try {
            multiplex.bookTicket(movieIndex, numTickets);
        } catch (TicketsNotAvailable e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class INOXMultiplex {
    private ArrayList<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void listMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.title + ": " + movie.availableSeats + " seats available");
        }
    }

    public synchronized void bookTicket(int movieIndex, int numTickets) throws TicketsNotAvailable {
        Movie movie = movies.get(movieIndex);

        if (movie.availableSeats >= numTickets) {
            movie.availableSeats -= numTickets;
            System.out.println("Booking " + numTickets + " tickets for " + movie.title);
        } else {
            throw new TicketsNotAvailable("Not enough tickets available for " + movie.title);
        }
    }

    public static void main(String[] args) {
        INOXMultiplex multiplex = new INOXMultiplex();

        Movie movie1 = new Movie("Movie 1", 10);
        Movie movie2 = new Movie("Movie 2", 15);
        Movie movie3 = new Movie("Movie 3", 20);
        Movie movie4 = new Movie("Movie 4", 8);

        multiplex.addMovie(movie1);
        multiplex.addMovie(movie2);
        multiplex.addMovie(movie3);
        multiplex.addMovie(movie4);

        Thread thread1 = new Thread(new TicketBooking(multiplex, 0, 3));
        Thread thread2 = new Thread(new TicketBooking(multiplex, 1, 5));
        Thread thread3 = new Thread(new TicketBooking(multiplex, 2, 7));
        Thread thread4 = new Thread(new TicketBooking(multiplex, 3, 10));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
