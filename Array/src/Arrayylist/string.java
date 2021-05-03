package Arrayylist;

public class string {

   

	    public static void main(String[] args) {
	        String str = "23 45.67 123f test";
	        String str1 = "25.06";
	        System.out.println(isNumeric(str));
	        System.out.println(isNumeric(str1));
	    }

	    private static boolean isNumeric(String str){
	        return str != null && str.matches("[0-9.]+");
	    }
	}
	

