package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class AdditiveInverse implements ASTNode{
	private ASTNode operand;
	
	public AdditiveInverse(ASTNode operand){
		super();
		this.operand = operand;
	}
	@Override
	public Object execute(Context symbolTable) {
		return (float)(operand.execute(symbolTable))*(-1);
	}
}
