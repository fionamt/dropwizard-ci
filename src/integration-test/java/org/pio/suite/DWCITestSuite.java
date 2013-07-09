package org.pio.suite;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.pio.dropwizard.resource.ByeResourceIT;
import org.pio.dropwizard.resource.ByeResourceTest;
import org.pio.dropwizard.resource.HelloResourceIT;
import org.pio.dropwizard.resource.HelloResourceTest;
import org.pio.test.TestContext;

/**
 * User: pwyrwins
 * Date: 2/16/13
 * Time: 5:27 PM
 */
@RunWith(Suite.class)
//@Suite.SuiteClasses({ ByeResourceIT.class, ByeResourceTest.class, HelloResourceIT.class, HelloResourceTest.class})
@Suite.SuiteClasses({ ByeResourceIT.class, HelloResourceIT.class})
public class DWCITestSuite {

    @ClassRule
    public static TestContext testContext = new TestContext(true);

}
