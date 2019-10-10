package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class VarAssign implements ASTNode {
	private String name;
	private ASTNode expression;
	
	public VarAssign(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}

	@Override
	public Object execute(Context symbolTable) {
		symbolTable.replace(name, expression.execute(symbolTable));
		return null;
	}

}
