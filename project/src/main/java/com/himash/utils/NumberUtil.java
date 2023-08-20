package com.himash.utils;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class NumberUtil {

    public String getNumberDetails() {
        LocalDate date = LocalDate.now();
        int ranNum = new Random().nextInt(60);
        return "Date : ".concat(String.valueOf(date)).concat(" | Number : ").concat(String.valueOf(ranNum));
    }

}
