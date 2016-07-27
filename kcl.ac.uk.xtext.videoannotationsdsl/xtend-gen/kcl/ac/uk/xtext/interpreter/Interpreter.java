package kcl.ac.uk.xtext.interpreter;

import kcl.ac.uk.xtext.videoAnnotationsDSL.AnnotatedVideo;

@SuppressWarnings("all")
public class Interpreter {
  /**
   * Takes an annotated video and produces a set of stores
   * representing the state of the dialogue participants and
   * the argument framework constructed by the end of the dialogue.
   * 
   * Stores etc. are represented as an instance of a separate meta-model defined in a separate Xtext project.
   */
  public Object interpret(final AnnotatedVideo video) {
    return null;
  }
}