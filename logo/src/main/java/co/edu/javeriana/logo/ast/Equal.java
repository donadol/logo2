package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class Equal implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Equal(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Context symbolTable) {
		Object op1 = operand1.execute(symbolTable);
		Object op2 = operand2.execute(symbolTable);
		return op1.equals(op2);
	}

}
