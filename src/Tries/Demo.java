package Tries;

import Classes.*;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * 
 * </p>
 */

public class Demo {
    
    
    public static void main(String[] args) {
        
        //Contactos
        Contact c1 = new Contact("João", "Sousa", "919191919");
        Contact c2 = new Contact("André", "Sousa", "919191914");
        Contact c3 = new Contact("Afonso", "Silva", "934250001");
        Contact c4 = new Contact("Leonor", "Andrade", "992220421");
        Contact c5 = new Contact("Matheus", "Costa", "963330587", "0032", "Filipinas");
        Contact c6 = new Contact("Matheus", "Costa", "963330588", "0032", "Filipinas");
        Contact c7 = new Contact("Diarra", "Avec", "963330582", "0033", "França");
        
        //Gestão de contactos
        ContactManagement cm1 = new ContactManagement();
        
        cm1.addContact(c1);
        cm1.addContact(c2);
        cm1.addContact(c3);
        cm1.addContact(c4);
        cm1.addContact(c5);
        cm1.addContact(c6);
        cm1.addContact(c7);
        
        cm1.removeContact("934250001");
        
        cm1.listInternationalContactsNamed("Matheus");
        //cm1.listall();
    }
    
}
