package Arrayylist;

	
	import java.util.*;
	import java.io.*;
	  
	public class StudentGPA {

	  
	   	        private int gpa;
	        private String firstname;
	        private String lastname;
	  
	        public StudentGPA(int gpa, String name, String lastname)
	        {
	            this.gpa = gpa;
	            this.firstname = name;
	            this.lastname = lastname;
	        }
	        
	        public String getname()
	        {
	            return this.firstname + this.lastname;
	        }
	        
	        public String getLastname()
	        {
	            return this.lastname;
	        }
	        
	        public String getFirstname() {
				return firstname;
			}

			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}

			public int getGpa()
	        {
	            return this.gpa;
	        }
	  
	        public void setname(String name)
	        {
	            this.firstname = name;
	        }
	  
	        public void setmarks(int gpa)
	        {
	            this.gpa = gpa;
	        }
	        public void setlastname(String name)
	        {
	            this.lastname = name;
	        }
	        
	        
	        
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
				result = prime * result + gpa;
				result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
				return result;
			}
	        
	        
	        
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				StudentGPA other = (StudentGPA) obj;
				if (firstname == null) {
					if (other.firstname != null)
						return false;
				} else if (!firstname.equals(other.firstname))
					return false;
				if (gpa != other.gpa)
					return false;
				if (lastname == null) {
					if (other.lastname != null)
						return false;
				} else if (!lastname.equals(other.lastname))
					return false;
				return true;
			}
	
	
	    
	    
	 // main method
	    public static void main(String[] args)
	        throws NumberFormatException,
	               IOException
	    {
	        HashMap<StudentGPA, String> map = new HashMap<>();
	  
	        StudentGPA one = new StudentGPA(1, "first","xyz"); // key1
	  
	        StudentGPA two = new StudentGPA(2, "second","zxc"); // key2
	  
	        map.put(one, one.getname()); // 50 - hashcode
	        map.put(two, two.getname()); // 60 - hashcode
	  
	        one.setname("Not first");  // 90 - 
	        two.setname("Not second");  // 100 
	        
	        map.put(one, one.getname()); // 90 - Hitchhiked
	        map.put(two, two.getname()); // 100 - 
	        
	        System.out.println(map.get(one));
	  
	        System.out.println(map.get(two));
	  
	        StudentGPA three = new StudentGPA(1, "third","uio");
	  
	        System.out.println(map.get(three));
	    }
	  

}
	
	
