package comparableFigureOut;

//import java.util.Arrays;
import java.util.ArrayList;
public class Person implements Comparable<Person> {
	String name;
	Integer age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person other){
		int ageComps =name.compareTo(other.name);
				
		if (ageComps==0){
			return age.compareTo(other.age);
		}
		return ageComps;
	}
	public String toString(){
		return "name:"+this.name+", age:"+this.age;
		//this. is what orders the arraylist or array
	}

}
class NameComparision {
	public static void main(String[] args) {
		Person bob = new Person("Bob", 15);
		Person other_bob = new Person("Bob", 16);
		Person elise = new Person("Elise", 15);
		Person tammie = new Person("Tammie", 15);
		Person daniel = new Person("Daniel",17);
		Person katie = new Person("Katie", 18);
		Person other_elise = new Person("Elise", 18);
		ArrayList <Person> bp = new ArrayList<Person>(); 
		bp.add(bob);
		bp.add(other_bob);
		bp.add(elise);
		bp.add(tammie);
		bp.add(daniel);
		bp.add(katie);
		bp.add(other_elise);
		//Person [] bp = {other_bob,bob, elise, tammie, daniel, katie, other_elise};
		//for comparable to work we need to get all  objects having the same names as the element 
		// either put them in a array with name of element or  an array list with with element 
		//System.out.println(bob.compareTo(other_bob));
		//Arrays.sort(bp);
		for (int i = 0; i < bp.size(); i++) {
			System.out.println(bp.get(i).toString());
		}
	}
}

