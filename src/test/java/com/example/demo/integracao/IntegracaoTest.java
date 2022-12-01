package com.example.demo.integracao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class IntegracaoTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void TestIntegracao() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/hello"))
        .andExpect(MockMvcResultMatchers.content().string("Hello"))
        .andExpect(MockMvcResultMatchers.status().isOk());
  }
}
