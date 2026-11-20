public class Demo{

public static void main(String[] args) throws Exception{
	
	System.out.println("Hello There .....");
	//Thread.sleep(Long.MAX_VALUE);
	Adder adder= new Adder();
	IO.println(adder.add(3,4));
}

}