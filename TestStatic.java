
public class TestStatic {
   static void Sum(int a,int b)
   {
	   int c=a+b;
	   System.out.println("sum of two number:-"+c);
   }
   class test extends TestStatic{
	   static void sum(int a, int b) {
		   System.out.println("sum of integer:"+(a+b)+" in test class");
	   }
	   
   }
	public static void main(String[] args) {
		TestStatic s=new TestStatic();
		TestStatic.Sum(45,56);
	}

}
