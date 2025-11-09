/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp.Show.Movies;

import java.io.*;
import java.util.List; 

public class SerializMovies {

    public static void SerializMoviesList(List <Movie> Movies) {
       
       try{
           FileOutputStream myfile=  new FileOutputStream("Movies.ser");
           ObjectOutputStream oos= new ObjectOutputStream(myfile);
           
           oos.writeObject(Movies);
           
           oos.flush();// force the writing on the file before closing the stream
           oos.close();
           
           
       }catch(java.io.IOException e){
           e.printStackTrace();
       }
    }
    
    public static void DeserializeMoviesList() {    
        try{
            FileInputStream myFile = new FileInputStream("Movies.ser");
            ObjectInputStream ois= new ObjectInputStream(myFile);
            
            final List<Movie> Movies = (List<Movie>) ois.readObject();
            
            System.out.println(Movies);
            ois.close();
            
        }catch(java.io.IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}