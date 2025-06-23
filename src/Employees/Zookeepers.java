/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Animal.Animal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dylan
 */
public class Zookeepers extends Employee{
    
    private String Specialty;
    private List<ZookeepersActivities> activityHistory; // Lista de actividades de este cuidador

    public String getSpecialty() {
        return Specialty;
    }

    public List<ZookeepersActivities> getActivityHistory() {
        return activityHistory;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public Zookeepers(String Specialty, int id, String name, LocalDate birth, String phone, String salary) {
        super(id, name, birth, phone, salary);
        this.Specialty = Specialty;
        this.activityHistory = new ArrayList<>();   
    }
    
    public void feedAnimal(Animal animal, String amount, String typeoffood) {
        String details = amount + " of " + typeoffood;
        ZookeepersActivities activities = new ZookeepersActivities("Feeding", animal, details);
        this.activityHistory.add(activities);
        System.out.println(this.name + " has fed " + animal.getName() + " with " + details + ".");
    }

    public void healthCheck(Animal animal, String status) {
        String details = "Status: " + status;
        ZookeepersActivities activities = new ZookeepersActivities("Health check", animal, details);
        this.activityHistory.add(activities);
        System.out.println(this.name + " has checked the health status of " + animal.getName() + ". " + details + ".");
    }
    
    public void showActivityHistory() {
        if (activityHistory.isEmpty()) {
            System.out.println(this.name + " has not done an activity.");
        } else {
            System.out.println("Activitiews history of: " + this.name + ".");
            for (ZookeepersActivities ac : activityHistory) {
                System.out.println(ac); // Usa el toString de ActividadCuidador
            }
        }  
}

    @Override
    public String toString() {
        return "Zookeepers{" + "Specialty=" + Specialty + ", activityHistory=" + activityHistory + '}';
    }
}