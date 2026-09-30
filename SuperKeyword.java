class Forest{
	String x= "apple";
	void Tree(){
	System.out.println("Trees in Forest");
	}
}
class Mango extends Forest{
	String y="banana";
	void display(){
	System.out.println("Parent x="+super.x);
	System.out.println("child y="+y);
	super.Tree();
	Tree();}

void Tree(){
	System.out.println("Plants in forest");
	}
}
public class SuperKeyword{
	public static void main(String[] args){
		Mango m=new Mango();
		m.display();
	}
}