/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import NetflixApp.PaymentMethod.paymentMethod;
import NetflixApp.Requests.Request;
import NetflixApp.Show.Genres;
import NetflixApp.Show.MaturityLevel;
import NetflixApp.Show.Movies.Movie;
import static NetflixApp.Show.Movies.SerializMovies.SerializMoviesList;
import NetflixApp.Show.Serie;
import NetflixApp.Show.Viewing;
import NetflixApp.User.Account;
import NetflixApp.User.AccountNotFound;
import NetflixApp.User.User;
import NetflixApp.User.Profile.language;
import NetflixApp.User.Profile.profil;
import NetflixApp.User.Sub.Plan;
import NetflixApp.User.Sub.Subscription;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import NetflixApp.User.AccountSearch;

public class NetflixApp implements java.io.Serializable {

    public static void main(String[] args) throws AccountNotFound {
        List<Account> Accounts = new ArrayList<Account>();
        String name = null;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Log in.\n2-Sign in.\n");
        int C = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter your Email\n");
        String username = scanner.nextLine();
        
        System.out.println("enter your password\n");
        String password = scanner.nextLine();
        Account account = new Account(username, password);
        Accounts = account.loadAccountsFromFile();
        
        if(C == 1){
        try {
            AccountSearch a = new AccountSearch(username, password);
            int i = a.search(Accounts, account);
            if (i == 1) {
                System.out.println("welcom " + account.getEmail()+"!\n");
            }
            } catch(AccountNotFound e){
                System.out.println("account does not exist!! create a new account.\n");
                System.out.println("enter your username: ");
                name = scanner.nextLine();
                account.SaveAccounts(account);
            }
        } else if(C == 2){
            System.out.println("enter your username: ");
            name = scanner.nextLine();
            account.SaveAccounts(account);
        } else {
            System.out.println("Invalid Choice\n");
        }
        System.out.println("welcome to Netflix!");

        language l = language.ARABIC;

        Plan p = new Plan(99.99, 4, 5, "FHD");

        GregorianCalendar subTime = new GregorianCalendar(2023, 10, 11);
        GregorianCalendar expiration1 = new GregorianCalendar(2023, 11, 11);

        Subscription Status = new Subscription(subTime.getTime(), p, expiration1.getTime(), "Expired");
        profil profile = new profil(name, 18, username, l);

        Account request = new Account("jake@gmail.com", "123456");

        GregorianCalendar requestTime = new GregorianCalendar(2023, 11, 10);
        GregorianCalendar expiration2 = new GregorianCalendar(2030, 11, 11);

        paymentMethod payment = new paymentMethod(name, expiration2.getTime(), "VISA", 2302020);

        Request newRequest = new Request(request.getEmail(), requestTime.getTime(), "NONE");

        User user = new User("06.66.66.66.66", profile, newRequest, payment);
        System.out.println(user.toString()+ "\n" + Status.toString() +"\n");

        Genres g1 = new Genres("Drama");
        Genres g2 = new Genres("Drama");

        List<Genres> G = new ArrayList<Genres>();
        G.add(g1);
        G.add(g2);

        MaturityLevel m13 = new MaturityLevel(16, "Violence, Drugs, criminal activities");
        MaturityLevel m21 = new MaturityLevel(16, "violence, language");
        List<MaturityLevel> M = new ArrayList<MaturityLevel>();
        M.add(m13);
        M.add(m21);

        GregorianCalendar c1 = new GregorianCalendar(2008, 1, 20);
        GregorianCalendar c2 = new GregorianCalendar(2008, 1, 20);

        Movie movie1 = new Movie("The Devile", c1.getTime(), "FHD", G, "English", 10000000, 9.8, M, 180);
        Movie movie2 = new Movie("The Luck", c2.getTime(), "HD", G, "English", 20000000, 9.9, M, 165);

        Serie serie1 = new Serie("Friends", 2, 15, c1.getTime(), "HD", G, "English", 200000000, 10, M);
        Serie serie2 = new Serie("Modern Familly", 6, 5, c2.getTime(), "FHD", G, "English", 25000000, 10, M);

        System.out.println("movies  and series availble\n");
        System.out.println(movie1.toString() + "\n");
        System.out.println(movie2.toString() + "\n");

        System.out.println(serie1.toString() + "\n");
        System.out.println(serie2.toString() + "\n");
        System.out.println("5.log out.\n");
        
            System.out.println("movie or series to watch: \n");
            int choice = scanner.nextInt();
        
        while (choice != 5) {
            System.out.println("enter the number you want to watch:\n");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1: {
                    System.out.println("enjoy watching" + movie1.getTitle() + "!\n");
                    GregorianCalendar date1 = new GregorianCalendar(2023, 11, 10);
                    Viewing watched1 = new Viewing(date1.getTime(), movie1, 10);
                    System.out.println(watched1.toString());
                    break;
                }
                case 2: {
                    System.out.println("enjoy watching" + movie2.getTitle() + "!\n");
                    GregorianCalendar date2 = new GregorianCalendar(2020, 6, 22);
                    Viewing watched2 = new Viewing(date2.getTime(), movie2, 9);
                    System.out.println(watched2.toString());
                    break;
                }
                case 3: {
                    System.out.println("enjoy watching" + serie1.getTitle() + "!\n");
                    GregorianCalendar date1 = new GregorianCalendar(1999, 1, 10);
                    Viewing watched1 = new Viewing(date1.getTime(), serie1, 10);
                    System.out.println(watched1.toString());
                    break;
                }
                case 4: {
                    System.out.println("enjoy watching" + serie2.getTitle() + "!\n");
                    GregorianCalendar date1 = new GregorianCalendar(2016, 8, 1);
                    Viewing watched2 = new Viewing(date1.getTime(), serie1, 10);
                    System.out.println(watched2.toString());
                    break;
                }
                case 5: {
                    System.out.println("Logging Out!\n");
                    break;
                }
                default: {
                    System.out.println("Invalid Choice\n");
                    break;
                }
            }
            List<Movie> movieList = new ArrayList<Movie>();

            movieList.add(movie1);
            movieList.add(movie2);

            SerializMoviesList(movieList);
        }
    }
}