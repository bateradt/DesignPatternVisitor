package fib.pattern.visitor;

import fib.pattern.visitor.interfaces.IPeriferico;
import fib.pattern.visitor.interfaces.IPerifericoVisitor;

public class Impressora implements IPeriferico {
	@Override
	public void accept(IPerifericoVisitor visitor) {
		visitor.visitar(this);
	}

}
