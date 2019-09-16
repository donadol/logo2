package co.edu.javeriana.logo.ast;

import java.util.Map;

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
	public Object execute(Map<String, Object> symbolTable) {
		// TODO Auto-generated method stub
		return value;
	}
	
	
}
