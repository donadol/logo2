package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class Addition implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Addition(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Context symbolTable) {
		return (float)((float)operand1.execute(symbolTable) + (float)operand2.execute(symbolTable));
	}
}
