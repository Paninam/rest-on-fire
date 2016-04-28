package org.restonfire;

/**
 * A {@link FirebaseRestNamespace} is a base representation of a Firebase namespace. It
 * manages all resources for the {@link FirebaseRestReference} implementations as well as
 * handles authentication for that namespace.
 */
public interface FirebaseRestNamespace {

  /**
   * Returns a {@link FirebaseRestReference} object representing the provided location of the namespace.
   * With this reference object, the consumer can read or modify the data at this location, or travers
   * further down or up the tree.
   *
   * @param path The location of the namespace to create a reference for.
   * @return The {@link FirebaseRestReference} for the given path.
   */
  FirebaseRestReference getReference(String path);

  // TODO: Add FirebaseSecurityRulesReference getSecurityRules();
  // TODO: Add FirebaseEventStream getEventStream(String path);
}