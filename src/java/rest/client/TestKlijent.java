/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.client;

/**
 *
 * @author PC
 */
public class TestKlijent {

    
    public static void main(String[] args) {
        System.out.println("\nKorisnik");
        JavaKlijent_Korisnik korisnik = new JavaKlijent_Korisnik();
        String response = korisnik.find_JSON(String.class, "8");
        System.out.println(response);
        korisnik.close();
    }

}
