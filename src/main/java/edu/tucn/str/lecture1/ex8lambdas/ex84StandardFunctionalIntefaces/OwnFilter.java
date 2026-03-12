package edu.tucn.str.lecture1.ex8lambdas.ex84StandardFunctionalIntefaces;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */
@FunctionalInterface
public interface OwnFilter {

    boolean doFilter(Computer computer);
}
