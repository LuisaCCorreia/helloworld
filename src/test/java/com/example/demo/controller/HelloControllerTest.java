package com.example.demo.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloControllerTest {

  @Test
  void TestHello() throws Exception {
    HelloController controller = new HelloController();
    String result = controller.hello();
    Assertions.assertThat(result).isEqualTo("Hello");
  }
}
