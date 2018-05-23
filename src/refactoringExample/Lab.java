/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringExample;

/**
 *
 * @author 1795516
 */
public class Lab {
    String idClass;
    Integer capacity;
    Integer nbComputers;
    
    public String getIdClass(){
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getNbComputers() {
        return nbComputers;
    }

    public void setNbComputers(Integer nbComputers) {
        this.nbComputers = nbComputers;
    }
    
}
