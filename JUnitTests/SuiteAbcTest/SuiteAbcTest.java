package SuiteAbcTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/* In JUnit, you can run multiple test cases with @RunWith and @Suite annotation.*/

@RunWith(Suite.class)
@Suite.SuiteClasses({
		JUnitExample.TestJunit.class, //test case 1
        JUnitExampleSorting.TestJunit.class     //test case 2
})
public class SuiteAbcTest {
	  // the class remains empty,
	  // used only as a holder for the above annotations
}
