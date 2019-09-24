package co.edu.javeriana.logo.ast;

import java.util.Map;

public class Condition implements ASTNode{

	private ASTNode operand1;
	private ASTNode operand2; 
	private ASTNode operand3;

	
	
	
	public Condition(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		if(operand2 )
		return null;
	}

}
