package Interfaces;

import Classes.Contact;

/**
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Interface that represents the management of a list of contacts
 * </p>
 */
public interface ContactManagementContract {

    /**
     * Adds a contact to the list.
     * 
     * @param contact Contact to be added
     * @return true, in case of sucefull method, or false
     */
    public boolean addContact(Contact contact);
    
    /**
     * Removes the contact from the list.
     * 
     * @param phoneNumber phone number of the Contact to be removed
     * @return true, in case of sucefull method, or false
     */
    public boolean removeContact(String phoneNumber);
    
    /**
     * Gets the contact with the given phone number.
     * 
     * @param phoneNumber phone number of the Contact to be searched
     * @return the contact in case of sucefull method
     */
    public Contact getContact(String phoneNumber);
    
    /** 
     * List all International Contacts with the name given.
     * 
     * @param Name that will be seached
     */
    public void listInternationalContactsNamed(String Name);
}
