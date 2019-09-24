package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.scope.Context;

public class VarDecl implements ASTNode {

	private String name;
	
	
	public VarDecl(String name) {
		super();
		this.name = name;
	}


	@Override
	public Object execute(Context symbolTable) {
		symbolTable.put(name, new Object());
		return null;
	}

}
