package co.edu.javeriana.logo.ast;

import co.edu.javeriana.logo.scope.Context;

public class Return implements ASTNode {
	ASTNode value;
	
	public Return(ASTNode value) {
		super();
		this.value = value;
	}
	public Return() {
		super();
		this.value = null;
	}

	@Override
	public Object execute(Context symbolTable) {
		Object valor;
		if(this.value!=null)
			valor = value.execute(symbolTable);
		else 
			valor = null;
		return new Retornado(valor);
	}
}
