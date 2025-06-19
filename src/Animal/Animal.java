/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

import java.time.LocalDate;

/**
 *
 * @author Dylan
 */
public class Animal {
    
    private String id;
    private String name;
    private String species;
    private LocalDate birth;
    private LocationAnimal location;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public LocationAnimal getLocation() {
        return location;
    }

    public void setLocation(LocationAnimal location) {
        this.location = location;
    }

    
    public Animal(String id, String name, String species, LocalDate birth) {
        if (id.matches("^[\\w]-[0-9]{4}$"))
            this.id = id;
        this.name = name;
        this.species = species;
        if (!birth.isAfter(LocalDate.now()))
            this.birth = birth;
        this.location = LocationAnimal.CONSERVATIONandRESCUE;
    }

    
    @Override
    public String toString() {
        return "animal{" + "id=" + id + ", name=" + name + ", species=" + species + ", birth=" + birth + ", location=" + location + '}';
    }
  
    
    
    
    
    
    
    
}
