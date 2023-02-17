//package com.fluex404.omnierpapp.moduleauth;
//
//import com.fluex404.omnierpauth.dto.UserAuthenticationResponseDTO;
//import com.fluex404.omnierpauth.dto.UserLoginRequestDTO;
//import com.fluex404.omnierpauth.repository.PrivilageRepository;
//import com.fluex404.omnierpauth.repository.RoleRepository;
//import com.fluex404.omnierpauth.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class OmnierpAppApplicationTests {
//
//    @Autowired
//    private PrivilageRepository privilageRepository;
//    @Autowired
//    private RoleRepository roleRepository;
//    @Autowired
//    private UserService userService;
//
//    @Test
//    void contextLoads() {
//        System.out.println("TEST UNIT TESTING");
//    }
//
//    @Test
//    void buatPrivilageRole(){
////        var privilage = new Privilage();
////        privilage.setAuthority("user-api:create");
////        privilage.setDescription("permission for create user");
////
////        var privilage2 = new Privilage();
////        privilage2.setAuthority("user-api:edit");
////        privilage2.setDescription("permission for edit user");
////
////        var privilage3 = new Privilage();
////        privilage3.setAuthority("user-api:delete");
////        privilage3.setDescription("permission for delete user");
////
////        privilage = privilageRepository.save(privilage);
////        privilage2 = privilageRepository.save(privilage2);
////        privilage3 = privilageRepository.save(privilage3);
////
////        Role role1 = new Role();
////        Role role2 = new Role();
////
////        role1.setName("ROLE1");
////        role1.setPrivilages(Arrays.asList(privilage, privilage2));
////
////        role2.setName("ROLE2");
////        role2.setPrivilages(Arrays.asList(privilage3));
////
////        roleRepository.saveAll(Arrays.asList(role1, role2));
//    }
//
//    @Test
//    void registerUser(){
////        var regisDTO = new UserRegistrationRequestDTO();
////        regisDTO.setEmail("test.test@gmail.com");
////        regisDTO.setFirstname("test");
////        regisDTO.setLastname("test");
////        regisDTO.setPassword("password");
////        regisDTO.setRoles(Arrays.asList("ROLE2"));
////        UserAuthenticationResponseDTO response = userService.register(regisDTO);
////        System.out.println(response);
//    }
//
//    @Test
//    void loginUser(){
//        var loginDTO = new UserLoginRequestDTO();
//        loginDTO.setEmail("isa.subani@gmail.com");
//        loginDTO.setPassword("password");
//        UserAuthenticationResponseDTO repsonse = userService.login(loginDTO);
//        System.out.println(repsonse);
//    }
//
//
//}
