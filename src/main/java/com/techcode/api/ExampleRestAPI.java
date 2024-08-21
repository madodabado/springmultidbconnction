package com.techcode.api;


import com.techcode.entity.account.Account;
import com.techcode.entity.customer.Customer;
import com.techcode.service.MyService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/multidb")
public class ExampleRestAPI {


    private final MyService myService;


    //Constructo Injection
    @Autowired
    public ExampleRestAPI(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(value ="/getCustomers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>>  getCustomers() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        List<Customer> customers = myService.getAllCustomer();
        Map<String, Object> response = new HashMap<>();
        response.put("customers", customers);
        return new ResponseEntity<>(response, headers, HttpStatus.OK);


    }

    @GetMapping(value ="/getAccount",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>>  getAccounts() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        List<Account> accounts = myService.getAllAccounts();
        Map<String, Object> response = new HashMap<>();
        response.put("account", accounts);
        return new ResponseEntity<>(response, headers, HttpStatus.OK);


    }


}
