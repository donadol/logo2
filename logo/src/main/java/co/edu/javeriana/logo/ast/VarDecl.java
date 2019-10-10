package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class VarDecl implements ASTNode {
	private String name;
	private ASTNode expression;
	
	public VarDecl(String name) {
		super();
		this.name = name;
	}
	
	public VarDecl(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}

	@Override
	public Object execute(Context symbolTable) {
		symbolTable.put(name, new Object());
		if(expression!=null)
			symbolTable.replace(name, expression.execute(symbolTable));
		return null;
	}
}
