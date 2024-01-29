/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_09_1_exercise;

/**
 *
 * @author pierr
 */


//  1. Encapsulate this class.  Change access modifiers so that fields can
//  be read or changed on through public methods.  
//  The ssn field should be READ ONLY.

public class Customer {

    private String name;
    private String ssn;

    // Encapsulate this class.  Make ssn read only.

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

   
}