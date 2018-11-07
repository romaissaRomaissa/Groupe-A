package org.mql.platform.web;

import org.mql.platform.business.projects.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mehdithe
 */
@Controller
public class HomeController {

  @GetMapping("/demo")
  public String get() {
    return "test";
  }
}
