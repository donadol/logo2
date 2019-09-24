package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.scope.Context;

public class Minus implements ASTNode {

	private ASTNode operand1;
	private ASTNode operand2;
	
	public Minus(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Context symbolTable) {
		return (float)operand1.execute(symbolTable) - (float)operand2.execute(symbolTable);
	}

}
