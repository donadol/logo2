package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.scope.Context;

public class Constant implements ASTNode{

	private Object value;
	
	
	public Constant(Object value) {
		super();
		this.value = value;
	}

	@Override
	public Object execute(Context symbolTable) {
		// TODO Auto-generated method stub
		return value;
	}
	
	
}
