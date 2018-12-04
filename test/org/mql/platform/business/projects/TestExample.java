package org.mql.platform.business.projects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author chermehdi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:WebContent/WEB-INF/config/test-root-context.xml",})
public class TestExample {

  @Test
  public void test() throws Exception {
    // perform your tests here
  }
}
