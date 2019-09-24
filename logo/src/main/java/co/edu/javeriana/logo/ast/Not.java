package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class Not implements ASTNode {
	private ASTNode operand;
	
	public Not(ASTNode operand) {
		super();
		this.operand = operand;
	}

	@Override
	public Object execute(Context symbolTable) {
		return !(boolean)operand.execute(symbolTable);
	}

}
