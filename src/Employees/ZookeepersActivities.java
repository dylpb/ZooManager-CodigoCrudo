/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;
import java.time.LocalDate;
import Animal.Animal;

/**
 *
 * @author Dylan
 */
public class ZookeepersActivities {
    
    private String activity;
    private Animal animalInvolved;
    private LocalDate datetime;
    private String details;

    public String getActivity() {
        return activity;
    }

    public Animal getAnimalInvolved() {
        return animalInvolved;
    }

    public LocalDate getDatetime() {
        return datetime;
    }

    public String getDetails() {
        return details;
    }

    public ZookeepersActivities(String activity, Animal animalInvolved, String details) {
        this.activity = activity;
        this.animalInvolved = animalInvolved;
        this.datetime = LocalDate.now();
        this.details = details;
    }

    @Override
    public String toString() {
        return "ZookeepersActivities{" + "activity=" + activity + ", animalInvolved=" + animalInvolved + ", datetime=" + datetime + ", details=" + details + '}';
    }
    
    
    
    
    
}
