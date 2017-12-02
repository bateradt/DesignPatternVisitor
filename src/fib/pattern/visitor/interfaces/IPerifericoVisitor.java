package fib.pattern.visitor.interfaces;

import fib.pattern.visitor.Computador;
import fib.pattern.visitor.Impressora;
import fib.pattern.visitor.Monitor;
import fib.pattern.visitor.Mouse;
import fib.pattern.visitor.Teclado;

/**
 * Definição da interface que deve ser implementada por cada ação. Todas as
 * ações devem implementar seu código na mesma classe para cada componente.
 * Essa ação será visitada pelos componentes conforme demandado.
 */
public interface IPerifericoVisitor {
	void visitar(Computador computador);

	void visitar(Mouse mouse);

	void visitar(Teclado teclado);

	void visitar(Monitor monitor);

	void visitar(Impressora impressora);
}
