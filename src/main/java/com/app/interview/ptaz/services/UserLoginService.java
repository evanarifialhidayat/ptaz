package com.app.interview.ptaz.services;

import java.util.List;

import com.app.interview.ptaz.model.UserLogin;
public interface UserLoginService {
    List findAllData();
    UserLogin saveData(UserLogin gate);
    UserLogin updateData(UserLogin gate);
    UserLogin updateDataApi(UserLogin gate);
    UserLogin deleteData(UserLogin gate);
    Boolean deleteDataApi(UserLogin gate)
;}
