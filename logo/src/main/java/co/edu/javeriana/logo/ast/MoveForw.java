package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.Turtle;

public class MoveForw implements ASTNode{
	
	private ASTNode operand1;
	private Turtle turtle;
	public MoveForw(ASTNode operand1, Turtle turtle) {
		super();
		this.operand1 = operand1;
		this.turtle =turtle;
	}
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		turtle.forward((float)operand1.execute(symbolTable));
		return null;
	}

}
