package com.example.erfan_adine_ptest.controller;

import com.example.erfan_adine_ptest.dto.in.product.MainOrderInDto;
import com.example.erfan_adine_ptest.dto.in.user.UserInDto;
import com.example.erfan_adine_ptest.dto.in.user.WorkerInDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static com.example.erfan_adine_ptest.controller.UserControllerTest.asJsonString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@ActiveProfiles("test")
//@SpringJUnitConfig(.class)
// extends RestControllerTest
//    @Autowired
//    protected MockMvc mvc;



@WebMvcTest(controllers = WorkerController.class)
@ActiveProfiles("test")
class WorkerControllerTest extends RestControllerTest {

    @Test
    void shoudCreateMockMvc() {
        Assertions.assertNotNull(mvc);
    }


    @Autowired
    private WorkerController controller;

    @Test
    void contextLoads() throws Exception {

        WorkerInDto workerInDto = new WorkerInDto();
        workerInDto.setPassword("123Aa");
        workerInDto.setEmail("erfan@gmail.com");


        mvc.perform(MockMvcRequestBuilders
                        .post("/workers/create")
                        .content(asJsonString(workerInDto))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());


//
////        assertThat(controller).isNotNull();
//        WorkerInDto workerInDto = new WorkerInDto();
//        workerInDto.setPassword("123Aa");
//        workerInDto.setEmail("erfan@gmail.com");
//
//        Assertions.assertNotNull(workerInDto.getId());
//        mvc.perform(post("/workers/create").contentType(MediaType.APPLICATION_JSON).content(toJson(workerInDto)))
//                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//              .andExpect(status().isCreated());


    }

//
//    @Test
//    public HashMap<String, String> handleRequest() throws Exception {
//
//
//    }
////        HashMap<String, String> model = new HashMap<String, String>();
////        String name = "Hello World";
////        model.put("firstName", "erfan");
////        model.put("lastName", "adine");
////        model.put("email", "erfan@gmail.com");
////        model.put("password", "123Aa");
////
////
////        mvc.perform(get("/workers/create").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith("application/json"))
////                .andExpect(jsonPath("$.id").isNotEmpty());
////        return model;
//


    @Test
    void create() throws Exception {


        UserInDto userInDto = new UserInDto();
//        userInDto.setId(1L);
        userInDto.setEmail("erfan@gmail.com");
        userInDto.setPassword("123Aa");
        userInDto.setFirstName("erfan");
        userInDto.setLastName("adine");


        mvc.perform(MockMvcRequestBuilders
                        .post("/workers/create")
                        .content(asJsonString(userInDto))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

//        MainOrder mainOrder = new MainOrder();
//        mainOrder.setStatus(OrderStatus.WAITING_FOR_SUGGESTION);
//        mainOrder.setAddres("ldhlshfls fjoshfolfhohofhhlsfhslflsh");
//
//        WorkerInDto workerInDto = new WorkerInDto();
//        workerInDto.setEmail("erfan@gmail.com");
//        workerInDto.setPassword("123Aa");
//        workerInDto.setOrder(mainOrder);
//        mvc.perform(post("/workers/create").contentType(MediaType.APPLICATION_JSON).content(toJson(workerInDto)))
//                .andExpect(status().isCreated())
//                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").isNotEmpty())
//                .andExpect(jsonPath("$.code").value(201))
//                .andExpect(jsonPath("$.errors").isEmpty());
//********************************************************************************

//    @Test
//    void create() throws Exception {
//
//
//        WorkerInDto workerInDto = new WorkerInDto();
//        workerInDto.setEmail("erfan@gmail.com");
//        workerInDto.setPassword("123Aa");
//
//        mvc.perform(post("/workers/create").contentType(MediaType.APPLICATION_JSON).content(toJson(workerInDto)))
//                .andExpect(status().isCreated())
//                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.id").isNotEmpty());
////                .andExpect(jsonPath("$.code").value(201))
////                .andExpect(jsonPath("$.errors").isEmpty());
//    }

//
//    @Test
//    void create() throws Exception {
//        String endpoint ="/workers/create";
//        WorkerInDto worker = new WorkerInDto();
//        var response  = given().when().get(endpoint).body()
//    }


    @Test
    void findAllByFNameAndLNameAndEmailAndPassword() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                        .post("/users/loadAmount")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void findAllByFNameAndLName() {
    }

    @Test
    void findSuggestionForMainOrder() throws Exception {
        MainOrderInDto mainOrderInDto= new MainOrderInDto();
        mainOrderInDto.setAddress("slfsl fljslfjlsj");
//        mainOrderInDto.set

        mvc.perform(MockMvcRequestBuilders
                        .post("/workers/findSuggestionForMainOrder")
                        .content(asJsonString(mainOrderInDto))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void sendSuggestionForMainOrder() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                        .post("/users/loadAmount/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void loadCommentsByOrderId() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                        .post("/users/loadAmount/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void findAllOrder() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                        .post("/users/loadAmount/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


    //************************

}