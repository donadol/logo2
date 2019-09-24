package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class Different implements ASTNode{
	private ASTNode operand1;
	private ASTNode operand2;
	
	public Different(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Context symbolTable) {
		Object op1 = operand1.execute(symbolTable);
		Object op2 = operand2.execute(symbolTable);
		if(op1 instanceof String && op2 instanceof String){
			String s = (String) op1;
			return s.compareTo((String) op2) != 0;
		} else if(op1 instanceof Float && op2 instanceof Float) {
			Float d = (Float)operand1.execute(symbolTable);
			return !d.equals((Float)operand2.execute(symbolTable));
		} else {
			return (Boolean)operand1.execute(symbolTable) != (Boolean)operand2.execute(symbolTable);
		}
	}
	
}
