package com.example.services;

import com.example.utils.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private TableMapper tableMapper;

    public String getPersonTableNameByCategory(String category) {
        return "table name for this category is: " + tableMapper.getCategoryToTableMapping().get(category);
    }
}
