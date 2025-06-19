/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animal;

/**
 *
 * @author Dylan
 */
public enum LocationAnimal {
    
CONSERVATIONandRESCUE("CONSERVATION and RESCUE"),
FARM("FARM"),
CONTACT("CONTACT"),
FEEDING("FEEDING"),
NIGHT_TUNNEL("NIGHT_TUNNEL"),
LOCAL_BIODIVERSITY("LOCAL_BIODIVERSITY");
    


private final String location;

private LocationAnimal(String location) {
        this.location = location;
}

public String getLocation() {
        return location;
}

@Override
    public String toString() {
        return location;
}






}
