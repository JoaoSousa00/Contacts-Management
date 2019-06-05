package Classes;

import Exceptions.*;

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
 * Class that represents a contact on a phone
 * </p>
 */

public class Contact {

    /**
     * Nome do contacto.
     */
    private String name;
    
    /**
     * Apelido do contacto.
     */
    private String apelido;
    
    /**
     * Número de telemóvel.
     */
    private String phoneNumber;
    
    /**
     * Indicativo que representa um número internacional.
     */
    private boolean international;
    
    /**
     * Indicativo do país.
     */
    private String countryIdentifier;
    
    /**
     * País do contacto.
     */
    private String countryName;

    /**
     * Parameterized Constructor of a National Contact.
     * 
     * @param name
     * @param apelido
     * @param phoneNumber 
     */
    public Contact(String name, String apelido, String phoneNumber) {
        this.setName(name);
        this.setApelido(apelido);
        this.setPhoneNumber(phoneNumber);
        this.international = false;
    }
    
    /**
     * Parameterized Constructor of a International Contact.
     * 
     * @param name
     * @param apelido
     * @param phoneNumber
     * @param international
     * @param countryIdentifier
     * @param countryName 
     */
    public Contact(String name, String apelido, String phoneNumber, String countryIdentifier, String countryName) {
        this.setName(name);
        this.setApelido(apelido);
        this.setPhoneNumber(phoneNumber);
        this.international = true;
        this.setCountryIdentifier(countryIdentifier);
        this.setCountryName(countryName);
    }
    
    /**
     * Uma única palavra que representa o nome com letra maiúscula no primeiro
     *  caracter.
     * 
     * @param name the name to set.
     * @return true/false if the method was sucefull/not sucefull.
     */
    public boolean setName(String name) {
        boolean done = false;
        try{
            if( name.isEmpty() || name.charAt(0)<65 || name.charAt(0)>90 )
                throw new InvalidNameException("|Erro: Nome inváildo.");
            
            for(int i=1; i<name.length()-1; i++){
                if(name.charAt(i)>=65 || name.charAt(i)<=90 || name.charAt(i) == 32)
                    throw new InvalidNameException("|Erro: Nome inváildo na posição " + i+1 + ".");
            }
            
            this.name = name;
            done = true;
            
        } catch( InvalidNameException ex){}
        
        return done;
    }

    /**
     * Uma única palavra que representa o apelido com letra maiúscula no
     *  primeiro caracter.
     * 
     * @param apelido the apelido to set
     * @return true/false if the method was sucefull/not sucefull. 
     */
    public boolean setApelido(String apelido) {
        boolean done = false;
        try{
            if( apelido.isEmpty() || apelido.charAt(0)<65 || apelido.charAt(0)>90 )
                throw new InvalidNameException("|Erro: Apelido inváildo.");
            
            for(int i=1; i<apelido.length()-1; i++){
                if(apelido.charAt(i)>=65 || apelido.charAt(i)<=90 || apelido.charAt(i) == 32)
                    throw new InvalidNameException("|Erro: Apelido inváildo na posição " + i+1 + ".");
            }
            
            this.apelido = apelido;
            done = true;
            
        } catch( InvalidNameException ex){}
        
        return done;
    }

    /**
     * Número de telemóvel caracterizado por uma string com exatamente 9
     *  dígitos.
     * 
     * @param phoneNumber the phoneNumber to set
     * @return true/false if the method was sucefull/not sucefull. 
     */
    public boolean setPhoneNumber(String phoneNumber) {
        boolean done = false;
        try{
            if( phoneNumber.length()!=9 )
                throw new PhoneNumberException("|Erro: Número de digitos incorreto.");
            
            for(int i=0; i<phoneNumber.length()-1; i++ ){
                if( phoneNumber.charAt(i) > 57 || phoneNumber.charAt(i) < 48 )
                    throw new PhoneNumberException("|Erro: Introduza apenas digitos.");
            }
            
            this.phoneNumber = phoneNumber;
            done = true;
            
        } catch( PhoneNumberException ex){}
        
        return done;
    }

    /**
     * Indicativo do país, caracterizado por uma string de dígitos que começa
     *  pelo “00".
     * 
     * @param countryIdentifier the countryIdentifier to set
     * @return true/false if the method was sucefull/not sucefull. 
     */
    public boolean setCountryIdentifier(String countryIdentifier) {
        boolean done = false;
        try{
            if( countryIdentifier.isEmpty() || countryIdentifier.charAt(0)!= 0 || countryIdentifier.charAt(1)!= 0 )
                throw new ContactCountryException("|Erro: Indicativo do país inváildo.");
            
            for(int i=0; i<countryIdentifier.length()-1; i++ ){
                if( countryIdentifier.charAt(i) > 57 || countryIdentifier.charAt(i) < 48 )
                    throw new ContactCountryException("|Erro: Introduza apenas digitos.");
            }
            
            this.countryIdentifier = countryIdentifier;
            done = true;
            
        } catch( ContactCountryException ex){}
        
        return done;
    }

    /**
     * País do contacto, caracterizado por uma palavra com letra
     *  maiúscula no primeiro caracter.
     * 
     * @param countryName the countryName to set
     * @return true/false if the method was sucefull/not sucefull. 
     */
    public boolean setCountryName(String countryName) {
        boolean done = false;
        try{
            if( countryName.isEmpty() || countryName.charAt(0)<65 || countryName.charAt(0)>90 )
                throw new ContactCountryException("|Erro: Nome do país inváildo.");
            
            for(int i=0; i<countryName.length()-1 ; i++ ){
                if( countryName.charAt(i) > 57 || countryName.charAt(i) < 48 || countryName.charAt(i) == 32 )
                    throw new ContactCountryException("|Erro: Não introduza maiusculas nem espaços no meio da palavra.");
            }
            
            this.countryName = countryName;
            done = true;
            
        } catch( ContactCountryException ex){}
        
        return done;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the international
     */
    public boolean isInternational() {
        return international;
    }

    /**
     * @return the countryIdentifier
     */
    public String getCountryIdentifier() {
        return countryIdentifier;
    }

    /**
     * @return the countryName
     */
    public String getCountryName() {
        return countryName;
    }
    
    
    
    
}