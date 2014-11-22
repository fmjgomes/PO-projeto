package poof.core;
import java.io.Serializable;

/**
 * Class abstracta que permite criar Ficheiros/directorios
 * 
 * 
 * @author Fabio Gomes- 177924 ,Antonio Freire- 177969 ,Joao Rodrigues- 177992
 * @version 0.1
 */


	


public abstract class Entries implements Serializable , Comparable< Entries>{


	/**
    * Nome do ficheiro/directorio
    */
	private String _name;

	/**
    * permissao do ficheiro/directorio
    */
	private boolean _permission;

    private String _owner;



    /**
    * tipo de entrie
    */

    private String _type;

	/**
    * Constructor.
    * 
    * @param name e o nome do ficheiro/directorio.
    * @param perm e a permissao do ficheiro/directorio.
    * 
    */
	public Entries(String name,String user ,String type,boolean perm)
	{
		_name=name;
		_permission=perm;
        _owner=user;
        _type=type;
	}

    /**
    * getName obtem-se o username do nome do ficheiro/directorio
    * 
    * @return _name e o nome do dono do ficheiro/directorio.
    * 
    */

    public String getName(){
        return _name;
    }

    /**
    * getPermission obtem-se a permission do ficheiro/directorio
    * 
    * @return _permission e a permission do ficheiro/directorio.
    * 
    */

    public boolean getPermission(){
        return _permission;
    }

     /**
    * setPermission obtem-se a permission do ficheiro/directorio
    * 
    * @param permission e a permission do ficheiro/directorio.
    * 
    */

    public void setPermission(boolean permission){
        _permission=permission;
    }

     /**
    * setName obtem-se a permission do ficheiro/directorio
    * 
    * @param permission e a permission do ficheiro/directorio.
    * 
    */

    public void setName(String name){
        _name=name;
    }


    /**
    *   compareTo utilizado para ordenar as entradas
    *   @return  inteiro
    */
    public int compareTo(Entries other)
    {
        return _name.compareTo(other._name);
    }  

    /**
    * getOwner vai retornar o nome do utilizador actual
    * 
    * @return String do utilizador actual
    * 
    */

    public String getOwner(){
        return _owner;
    }


     /**
    * getType vai retornar o tipo da entrie
    * 
    * @return String do tipo
    * 
    */

    public String getType(){
        return _type;
    }

    /**
    * setOwner vai mudar o utilizador actual
    * 
    * @param String user;
    * 
    */

    public void setOwner(String user){
        _owner=user;
    }


    
    

	
}