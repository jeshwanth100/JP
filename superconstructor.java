class Animal{
	Animal(){
	System.out.println("Animals are humble");
	}
}
class Lion extends Animal{
	Lion(){
	super();
	System.out.println("Lion is king of jungle");
	}
}
public class superconstructor{
	public static void main(String[] args){
		Lion x=new Lion();
	}
}