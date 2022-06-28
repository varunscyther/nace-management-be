package com.varun.scyther.io.nace.controller;

import com.varun.scyther.io.nace.model.NaceDetails;
import com.varun.scyther.io.nace.service.NaceDataServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(NaceManagementController.class)
public class NaceMangementControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private NaceDataServiceImpl service;

    @Test
    @Disabled
    public void testPostNaceDetails() throws Exception {
        String result = performPost(readFromResourceFile("testPutNaceDetailsReq.json")).getResponse()
                .getContentAsString(StandardCharsets.UTF_8);
        Assert.assertNotNull(result);

    }

    private MvcResult performPost(String jsonAsString) throws Exception {
        return mvc.perform(post("/nace/api/nacedetails").content(jsonAsString)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andReturn();

    }

    private static String readFromResourceFile(String resourcePath) throws IOException {
        InputStream inputStream = Objects.requireNonNull(NaceDetails.class.getClassLoader().getResourceAsStream(resourcePath));
        StringWriter writer = new StringWriter();
        IOUtils.copy(inputStream, writer, StandardCharsets.UTF_8.name());
        return writer.toString();
    }
}
