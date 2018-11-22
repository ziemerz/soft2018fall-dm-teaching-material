package dk.cphbusiness.regular.automaton;

public interface State {
  int getIndex();
  // Depending on impl.
  boolean isFinal();
  }
