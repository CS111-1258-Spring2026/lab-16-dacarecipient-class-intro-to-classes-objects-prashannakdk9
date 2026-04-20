/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(String surname) : void
+ setGivenName(String givenName) : void
+ setUscisNumber(String uscisNumber) : void
+ setCountryOfOrigin(String countryOfOrigin) : void
+ setBirthday(int birthday) : void
+ setValidFromDate(int validFromDate) : void
+ setExpirationDate(int expirationDate) : void
+ setSex(char sex) : void
+ setAll(String surname, String givenName, String uscisNumber,
         String countryOfOrigin, int birthday, int validFromDate,
         int expirationDate, char sex) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday;
	private int validFromDate;
	private int expirationDate;
	private char sex;

	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	
	public String getSurname()
	{
		return surname;
	}

	public String getGivenName()
	{
		return givenName;
	}

	public String getUscisNumber()
	{
		return uscisNumber;
	}

	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	public int getBirthday()
	{
		return birthday;
	}

	public int getValidFromDate()
	{
		return validFromDate;
	} 

	public int getExpirationDate()
	{
		return expirationDate;
	}

	public char getSex()
	{
		return sex;
	}

	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}

	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}

	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}

	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}

	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}

	public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}

	public void setSex(char sex)
	{
		this.sex = sex;
	}

	//TODO: Write the setAll method. Remember to include documentation.
	public void setAll(String surname, String givenName, String uscisNumber,
	                   String countryOfOrigin, int birthday, int validFromDate,
	                   int expirationDate, char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
}