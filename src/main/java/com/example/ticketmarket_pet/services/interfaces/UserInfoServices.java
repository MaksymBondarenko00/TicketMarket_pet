package com.example.ticketmarket_pet.services.interfaces;

import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.entity.UserInfo;

public interface UserInfoServices {
    UserInfo getInfoByUsername(String username);

}
