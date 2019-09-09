package co.edu.javeriana.logo.ast;

public class Minus implements ASTNode {

	private ASTNode operand1;
	private ASTNode operand2;
	
	public Minus(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute() {
		return (float)operand1.execute() - (float)operand2.execute();
	}

}
