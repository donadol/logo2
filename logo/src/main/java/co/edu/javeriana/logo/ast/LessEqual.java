package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class LessEqual implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	
	
	public LessEqual(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}


	@Override
	public Object execute(Context symbolTable) {
		// TODO Auto-generated method stub
		return (Float)operand1.execute(symbolTable) <= (Float)operand2.execute(symbolTable);
	}

}
