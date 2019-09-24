package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.scope.Context;

public class VarRef implements ASTNode {

	private String name;
	
	public VarRef(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Context symbolTable) {
		
		return symbolTable.get(name);
	}

}
