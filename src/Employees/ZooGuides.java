/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dylan
 */
public class ZooGuides extends Employee{
   
private List <String> Languages;
private List <ZooTour> toursMade;


    public List <String> getLanguages() {
        return Languages;
    }

    public List<ZooTour> gettoursMade() {
        return toursMade;
    }
    

    public void setLanguages(List <String> Languages) { 
        this.Languages = Languages;
    } //Guardamos los idiomas//

    public ZooGuides(List <String> Languages, int id, String name, LocalDate birth, String phone, String salary) {
        super(id, name, birth, phone, salary);
        this.Languages = Languages;
        this.Languages = new ArrayList<>(); // Inicializa la lista de idiomas
        this.toursMade = new ArrayList<>();
    }

    public void addLanguage(String newLanguage) { //AGREGAR IDIOMAS//
    if (!Languages.contains(newLanguage)){
        Languages.add(newLanguage);
        System.out.println("The guide "+this.name+" has learned "+newLanguage+".");
    }else{
        System.out.println("The guide "+this.name+" already knows "+newLanguage+".");      
        }
}
  
        public void showLanguages() {
        System.out.println("The guide " + this.name + "knows: " + Languages);
    }
    
        
    public ZooTour getZooTour(String idTour, LocalDate date) {
        ZooTour newTour = new ZooTour(idTour, date, this); // 'this' se refiere a este mismo objeto Guia
        this.toursMade.add(newTour); // Registra el recorrido en la lista del guía
        System.out.println(this.name + " has started a new tour: " + idTour + " on " + date);
        return newTour; // Devuelve el recorrido por si se necesita manipularlo
    }
    
    public void toursHistory() {
        if (toursMade.isEmpty()) {
            System.out.println(this.name + " have not made a tour.");
        } else {
            System.out.println("The tour history of " + this.name + " is: ");
            for (ZooTour r : toursMade) {
                System.out.println(r); // Usa el toString de Recorrido
            }
        }
    
    
    
}

    @Override
    public String toString() {
        return "ZooGuides{" + "Languages=" + Languages + ", toursMade=" + toursMade + '}';
    }
    
}
