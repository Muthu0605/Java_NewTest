public class test
{
	//  void can be used, if you dont have to return any values
	// static is used in a method to denote that the method is associated with the class not with the object
	// public is used when a method is associated with the class
static void Mymethod(String name){
System.out.println("Value of name is " + name);

}
// If you want to return a value ,you can use int, char instead of void...
static int intMethod(int x){
return x + 10;	

}
public static void main (String [] args)
{
Mymethod("Muthu");
System.out.println("value of x is" + intMethod(5));
}
}
