package Arrayylist;


	
	import java.util.Arrays;

	import java.util.Comparator;

	public class Sortlist {
		
		
		private Person[] persons = { new Person("firstname1","lastname1",4.1d),
									 new Person("firstname2","lastname2",3.2d),
									 new Person("firstname3","lastname3",2.2d),
								 	 new Person("firstname4","lastname4",2.4d),
								 	 new Person("firstname5","lastname5",1.2d),
								 	 new Person("firstname6","lastname6",4.4d),
								 	 new Person("firstname7","lastname7",4.5d),
								 	 new Person("firstname8","lastname8",3.7d)
								  };
		
		public static void main(String[] args) {
			
			
			
			Sortlist  saoo = new Sortlist();
			Arrays.sort(saoo.persons, new PersonComparatorByGpa());
			
			for(int count =0; count<saoo.persons.length;count++) {
				
				System.out.println(saoo.persons[count]);
			}		
		}
	}


	class PersonComparatorByGpa implements Comparator<Person> {
		
		
		
		
		public int compare(Person o1, Person o2) {		
			
			
			return o1.getGpa().compareTo(o2.getGpa());
		}
	}


	class Person {
		
		private String firstName;
		
		private String lastName;
		
		private Double gpa;

		public Person(String firstName, String lastName, Double gpa) {
			
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gpa = gpa;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Double getGpa() {
			return gpa;
		}

		public void setGpa(Double gpa) {
			this.gpa = gpa;
		}

		
		
		public String toString() {
			
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
		}
		
		
		

}
