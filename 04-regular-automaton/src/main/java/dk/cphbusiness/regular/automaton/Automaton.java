package dk.cphbusiness.regular.automaton;

import java.util.Set;

public interface Automaton {
  Alphabet getAlphabet();
  Set<State> getStates();
  Set getInitialState();
  Set<State> getFinalStates();
  State nextState(State state, char symbol);
  }
