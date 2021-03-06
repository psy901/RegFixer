package edu.wisc.regfixer.parser;

public class AnchorNode implements RegexNode {
  private RegexNode child;
  private boolean start;
  private boolean end;

  public AnchorNode (RegexNode child, boolean start, boolean end) {
    this.child = child;
    this.start = start;
    this.end = end;
  }

  public int descendants () {
    return 1 + this.child.descendants();
  }

  public String toString () {
    return (
      ((this.start) ? "^" : "") +
      this.child.toString() +
      ((this.end) ? "$" : "")
    );
  }
}
