package co.edu.javeriana.logo.ast;

public class Constant implements ASTNode{

	private Object value;
	
	
	public Constant(Object value) {
		super();
		this.value = value;
	}
	
	public Object getValue(){
		return value;
	}


	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return value;
	}
	
	
}
