package co.edu.javeriana.logo.ast;

import java.util.List;

import co.edu.javeriana.logo.scope.Context;

public class Function_Call implements ASTNode {
	private String name;
	private List<ASTNode> params;
	
	public Function_Call(String name, List<ASTNode> params) {
		super();
		this.name = name;
		this.params = params;
	}

	@Override
	public Object execute(Context symbolTable) {
		Function_Def func = (Function_Def)symbolTable.get(name);
		Context local_context = new Context(func.getContext());
		
		List<String> arguments_list = func.getArguments();
		
		for(int i=0;i<arguments_list.size();++i) {
			local_context.put(arguments_list.get(i), params.get(i).execute(symbolTable));
		}
		
		for(ASTNode n:func.getBody()) {
			Object task = n.execute(local_context);
			if(task!=null) {
				return task;
			};
		}
		return null;
	}

}
