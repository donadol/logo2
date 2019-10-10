package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.Turtle;
import co.edu.javeriana.logo.scope.Context;

public class MoveForw implements ASTNode{
	
	private ASTNode operand1;
	private Turtle turtle;
	public MoveForw(ASTNode operand1, Turtle turtle) {
		super();
		this.operand1 = operand1;
		this.turtle =turtle;
	}
	@Override
	public Object execute(Context symbolTable) {
		turtle.forward((float)operand1.execute(symbolTable));
		return null;
	}

}
