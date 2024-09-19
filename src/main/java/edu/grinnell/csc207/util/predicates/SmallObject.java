package edu.grinnell.csc207.util.predicates;
import edu.grinnell.csc207.util.Predicate;

public class SmallObject implements Predicate<Object> {
      // +-----------+---------------------------------------------------
  // | Constants |
  // +-----------+

  /**
   * One copy of this predicate, following the singleton pattern.
   */
  public static final SmallObject PRED = new SmallObject();

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new predicate. Made private to prevent clients from
   * creating new objects (part of the singleton pattern).
   */
  private SmallObject() {
  } // SmallObject()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Determine if val is a small object.
   *
   * @param val
   *   The object we evaluate.
   *
   * @return
   *   true if val is odd and false if val is even.
   */
  public boolean holds(Object val) {
    String newval = val.toString();
    return (newval.length() < 5);
  } // holds

} // class SmallObject


