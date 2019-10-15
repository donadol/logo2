package co.edu.javeriana.logo.ast;

import java.util.Scanner;

import co.edu.javeriana.logo.scope.Context;

public class Read implements ASTNode {
	private String name;
	
	public Read(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Context symbolTable) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		symbolTable.replace(this.name, s);
		sc.close();
		return null;
	}

}
