package co.edu.javeriana.logo.ast;


import java.util.List;

import co.edu.javeriana.logo.scope.Context;

public class Function_Def implements ASTNode {
	private String name;
	private List<String> arguments;
	private List<ASTNode> body;
	private Context context;
	
	public Function_Def(String name, List<String> arguments, List<ASTNode> body) {
		super();
		this.name = name;
		this.arguments = arguments;
		this.body = body;
	}
	
	public Context getContext() {
		return context;
	}
	
	public void setContext(Context context) {
		this.context = context;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getArguments() {
		return arguments;
	}

	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}

	public List<ASTNode> getBody() {
		return body;
	}

	public void setBody(List<ASTNode> body) {
		this.body = body;
	}

	@Override
	public Object execute(Context symbolTable) {
		this.context = symbolTable;
		symbolTable.put(name, this);
		return null;
	}

}
