package co.edu.javeriana.logo.ast;

import java.util.List;

import co.edu.javeriana.logo.scope.Context;

import co.edu.javeriana.logo.scope.Context;

public class Cicle implements ASTNode{

	private ASTNode condition;
	private List<ASTNode> body;

	
	public Cicle(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;

	}

	@Override
	public Object execute(Context symbolTable) {
		
		Context local_context = new Context(symbolTable);
		while((boolean) condition.execute(symbolTable)){
			
			for(ASTNode n: body ){
				n.execute(local_context);
				if(!(boolean) condition.execute(local_context))
					return null;
			}
		}
		return null;
	}
	
	

}
