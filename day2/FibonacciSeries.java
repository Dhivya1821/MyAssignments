package week1.day2;

public class FibonacciSeries {
	  public static void main(String[] args) {

		    int n = 10, firstno = 0, secondno = 1;
		    System.out.println("Fibonacci Series of " + n );

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstno + ", ");
		      int nextno = firstno + secondno;
		      firstno = secondno;
		      secondno = nextno;
		    }
		  }
		}

