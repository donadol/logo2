package co.edu.javeriana.logo.ast;

import java.util.Map;

import co.edu.javeriana.logo.scope.Context;

public interface ASTNode {
	public Object execute(Context symbolTable);

	
}
