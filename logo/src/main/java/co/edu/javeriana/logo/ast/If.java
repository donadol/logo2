package co.edu.javeriana.logo.ast;

import java.util.List;

import co.edu.javeriana.logo.scope.Context;

public class If implements ASTNode{

	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elsebody;
	
	public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elsebody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elsebody = elsebody;
	}

	@Override
	public Object execute(Context symbolTable) {
		Context local_context = new Context(symbolTable);
		if((boolean) condition.execute(symbolTable)){
			for(ASTNode n: body ){
				Object task = n.execute(local_context);
				if(task instanceof Retornado) {
					return task;
				}
			}
		}else{
			for(ASTNode n: elsebody ){
				Object task = n.execute(local_context);
				if(task instanceof Retornado) {
					return task;
				}
			}			
		}
		return null;
	}
	
	

}
