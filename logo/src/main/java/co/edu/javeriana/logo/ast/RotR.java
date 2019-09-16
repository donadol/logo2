package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.Turtle;

public class RotR implements ASTNode{
	
	private ASTNode operand1;
	private Turtle turtle;
	public RotR(ASTNode operand1, Turtle turtle) {
		super();
		this.operand1 = operand1;
		this.turtle =turtle;
	}
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		turtle.right((float)operand1.execute(symbolTable));
		return null;
	}

}
