
public class FizzBizz {

	public static void main(String[] args) {
		
		FizzBizz fz = new FizzBizz();
		
		for(int count=1;count<=70;count++) {
			
			System.out.println(fz.getFizzBizz(count));
		}
		
	}
	
	String getFizzBizz(int count) {
			
			if(count%7 == 0 && count % 9 == 0) {
				
				return count + " FizzBuzz";
			}else if(count %3 ==0) {
				return count + " Fizz";
			}
			else if(count %5 == 0) {
				return count + " Bizz";
			}else
			{
				return count + "";
			}
		}


		
	}


