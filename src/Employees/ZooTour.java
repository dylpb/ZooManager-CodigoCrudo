/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Animal.Animal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Dylan
 */
public class ZooTour{
    
private List <String> ZooTour; 
private String idTour;
private LocalDate date; 
private ZooGuides guideTouring;
private List <Animal> animalsFound; 

    public List<String> getZooTour() {
        return ZooTour;
    }

    public String getIdTour() {
        return idTour;
    }

    public LocalDate getDate() {
        return date;
    }

    public ZooGuides getGuideTouring() {
        return guideTouring;
    }

    public List<Animal> getAnimalsFound() {
        return animalsFound;
    }

    public ZooTour(String idTour, LocalDate date, ZooGuides guideTouring) {
        this.ZooTour = ZooTour;
        this.idTour = idTour;
        this.date = date;
        this.guideTouring = guideTouring;
        this.animalsFound = new ArrayList(animalsFound);
    }
    
     public void addAnimalFound(Animal animal) {
        if (animal != null) {
            this.animalsFound.add(animal);
            System.out.println("The animal " + animal.getName() + " has been added to the tour " + idTour);
        }
    }
     
     public void AnimalFoundInfo() {
        if (animalsFound.isEmpty()) {
            System.out.println("In the tour " + idTour + " We didn´t see animals.");
        } else {
            System.out.println("Information about the animals found " + idTour + " (" + date + ") por " + guideTouring.getName() + ".");
            for (Animal animal : animalsFound) {
                System.out.println("Animal; " + animal.getName() + " (Specie: " + animal.getSpecies() + ")");
                // Info sobre los animales
            }
        }
    }

    @Override
    public String toString() {
        return "ZooTour{" + "ZooTour=" + ZooTour + ", idTour=" + idTour + ", date=" + date + ", guideTouring=" + guideTouring + ", animalsFound=" + animalsFound + '}';
    }
   
     
     
     
     
}