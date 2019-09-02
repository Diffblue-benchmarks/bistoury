package qunar.tc.decompiler.struct.attr;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import qunar.tc.decompiler.struct.attr.StructExceptionsAttribute;

public class StructExceptionsAttributeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getThrowsExceptionsOutputNull() {

    // Arrange
    final StructExceptionsAttribute structExceptionsAttribute = new StructExceptionsAttribute();

    // Act and Assert result
    Assert.assertNull(structExceptionsAttribute.getThrowsExceptions());
  }
}
