package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.Turtle;
import co.edu.javeriana.logo.scope.Context;

public class RotR implements ASTNode{
	
	private ASTNode operand1;
	private Turtle turtle;
	public RotR(ASTNode operand1, Turtle turtle) {
		super();
		this.operand1 = operand1;
		this.turtle =turtle;
	}
	@Override
	public Object execute(Context symbolTable) {
		turtle.right((float)operand1.execute(symbolTable));
		return null;
	}

}
