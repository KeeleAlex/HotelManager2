/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagment;

import java.io.File;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.w3c.dom.*;

/**
 *
 * @author Alex
 */
public class Hotel {
    
    hotelFactory builder = new hotelFactory();
    public Hotel(){
        ObservableList hotel = FXCollections.observableArrayList();
        File f = new File("Hoteldata.xml");
        hotel = load();
        

        
    }
    //print's all the rooms and their information to the console
    public String print(ObservableList hotel){
        String x = "";
        for(Object room: hotel){
            Room y = (Room)room;
            x = x + y.toString();
        }
        return x;
    }
    
    public void save(){
        
    }
    
    public ObservableList load(){
        ObservableList HList;
        HList = builder.hotelFactory();
        return HList;
    }
}
