package com.ahacool.designpattern.prototype.test;

import com.ahacool.designpattern.prototype.Person;
import com.ahacool.designpattern.prototype.PersonCloneObject;
import com.ahacool.designpattern.prototype.Score;

/**
 * @ClassName ProtoTypeTest
 * @Description Test the codes.
 * @author Moto
 * @date 2014 2014-9-9
 * 
 */
public class PrototypeTest {

	public static void main(String[] args) {

		// Shallow Copy
		Score score = new Score();
		Person person = new Person(score);
		person.printValue("person");

		Person person2 = (Person) person.clone();
		person2.printValue("person2");
		Person person3 = person;
		person3.printValue("person3");

		System.out.println("--------");

		// Deep Copy
		PersonCloneObject personCloneObject = new PersonCloneObject(score);
		personCloneObject.printValue("personCloneObject");
		PersonCloneObject personCloneObject2 = (PersonCloneObject) personCloneObject.clone();
		personCloneObject2.printValue("personCloneObject2");
	}

}
