package com.example.ticketmarket_pet.mapper;

import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.UserInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserInfoMapper {
    UserInfoDto toDto(UserInfo userInfo);
}
