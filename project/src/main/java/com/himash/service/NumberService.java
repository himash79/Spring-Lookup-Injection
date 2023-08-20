package com.himash.service;

import com.himash.utils.NumberUtil;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public String fetchDetails() {
        return fetchUtils().getNumberDetails();
    }

    @Lookup
    public NumberUtil fetchUtils() {
        return null;
    }
}
