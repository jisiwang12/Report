package com.example.demospring.controller;

import com.example.demospring.dao.FormDao;
import com.example.demospring.domain.Form;
import com.example.demospring.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author diao 2021/2/9
 */
@RestController
public class FormController {
    @Autowired
    FormService formService;

    @RequestMapping("/findAll")
    public List<Form> findAll(@RequestParam(value = "startTime") String startTime,
                              @RequestParam(value = "endTime") String endTime,
                              @RequestParam(value = "orderNumber") String orderNumber,
                              @RequestParam(value = "lineNumber") String lineNumber) throws ParseException {
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = simpleDateFormat.parse(startTime);
        Date endtimeDate = simpleDateFormat.parse(endTime);
        String startDateString = simpleDateFormat1.format(startDate);
        String endTimeDateString = simpleDateFormat1.format(endtimeDate);*/

        List<Form> all = formService.findAll(startTime, endTime,orderNumber.toUpperCase(),lineNumber);

        return all;

    }
}
