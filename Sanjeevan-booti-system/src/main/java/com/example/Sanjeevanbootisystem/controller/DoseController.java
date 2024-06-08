package com.example.Sanjeevanbootisystem.controller;

import com.example.Sanjeevanbootisystem.Model.Dose;
import com.example.Sanjeevanbootisystem.dto.RequestDto.BookDose1RequestDto;

import com.example.Sanjeevanbootisystem.dto.RequestDto.BookDose2RequestDto;
import com.example.Sanjeevanbootisystem.service.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dose")
public class DoseController {

    @Autowired
    DoseService doseService;

//    @PostMapping("/get_dose_1")
//    public ResponseEntity getDose1(@RequestParam("id") int personId, @RequestParam("doseType")DoseType doseType){
//
//        try{
//          Dose doseTake = doseService.getDose1(personId, doseType);
//          return new ResponseEntity(doseTake,HttpStatus.CREATED);
//        }
//        catch (Exception e){
//            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
//        }
//    }

    @PostMapping("/get_dose_1")
    public ResponseEntity getDose1(@RequestBody BookDose1RequestDto bookDose1RequestDto){

        try{
            Dose doseTake = doseService.getDose1(bookDose1RequestDto);
            return new ResponseEntity(doseTake,HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }



    // get Dose 2
    @PostMapping("/get_dose_2")
    public ResponseEntity getDose2(@RequestBody BookDose2RequestDto bookDose2RequestDto){

        try{
            Dose doseTake = doseService.getDose2(bookDose2RequestDto);
            return new ResponseEntity(doseTake,HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
