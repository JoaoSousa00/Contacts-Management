package Classes;

import Exceptions.AddingContactExecption;
import Exceptions.PhoneNumberException;
import Exceptions.RemovingContactExecption;
import Interfaces.ContactManagementContract;

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
 * Class that represents 
 * </p>
 */

public class ContactManagement implements ContactManagementContract {

    /**
     * List of contacts
     */
    private Contact[] contacts;

    /**
     * Unparameterized Constructor of ContactManagement.
     */
    public ContactManagement() {
        this.contacts = new Contact[0];
    }
    
    /**
     * Counts the number of contacts on the list. (Não usado)
     * 
     * @return the number of contacts on the list
     */
    private int countContacts(){
        int i=0;
        while( i<contacts.length && contacts[i] != null ){
            i++;
        }
        return i;
    }
    
    private int findContact(String phoneNumber){
        int i=0, res=-1;
        boolean found = false;
        try{
            if(contacts.length == 0)
                throw new PhoneNumberException("|Erro: Sem contactos.");
            while( i<contacts.length && !found ){
                if( phoneNumber.equals(contacts[i].getPhoneNumber()) ){
                    res=i;
                    found=true;
                }
                i++;
            }
        } catch( PhoneNumberException ex ){}
        return res;
    }

    @Override
    public boolean addContact(Contact contact) {
        boolean done = false;
        try{
            if(contact == null)
                throw new AddingContactExecption("|Erro: Contacto nulo.");
            
            for(Contact c: contacts){
                if(c.getPhoneNumber().equals(contact.getPhoneNumber()))
                    throw new AddingContactExecption("|Erro: Número de telemovel já existente!");
            }
            
            
            Contact[] tmp = new Contact[ contacts.length+1 ];
            System.arraycopy(this.contacts, 0, tmp, 0, contacts.length);
            tmp[ tmp.length-1 ] = contact;
            this.contacts = tmp;
            done = true;
            System.out.println("|Contacto Adicionado.");
            
        } catch( AddingContactExecption ex ){}
        
        return done;
    }

    @Override
    public boolean removeContact(String phoneNumber) {
        boolean done = false;
        int i=0;
        try{            
            for( i = findContact(phoneNumber) +1 ; i<contacts.length ; i++){
                contacts[i-1] = contacts[i];
            }
            if( i == 0)
                throw new RemovingContactExecption("|Erro: Contacto não encontrado.");
            Contact[] tmp = new Contact[ contacts.length -1 ];
            System.arraycopy(this.contacts, 0, tmp, 0, contacts.length-1);
            this.contacts = tmp;
            done = true;
            System.out.println("|Contacto Removido.");
            
        } catch( RemovingContactExecption ex ){}
        
        return done;
    }

    @Override
    public Contact getContact(String phoneNumber) {
        return ( contacts[findContact(phoneNumber)] );
    }

    @Override
    public void listInternationalContactsNamed(String Name) {
        try{
            if(contacts.length == 0)
                throw new PhoneNumberException("|Erro: Sem contactos.");
            for(Contact c: contacts){
                if ( c.isInternational() )
                    if( Name.equals(c.getName()) ){
                        System.out.println( c.toString() + "\nCountry: " + c.getCountryName() );
                    }
            }
        } catch( PhoneNumberException ex ){}
    }
    
    /**
     * For tests
     */
    public void listall(){
        for(Contact c: contacts){
            System.out.println( c.toString());
            }
    }
}
