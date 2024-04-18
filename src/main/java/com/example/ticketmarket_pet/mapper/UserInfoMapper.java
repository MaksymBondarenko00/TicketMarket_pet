package com.example.ticketmarket_pet.mapper;

import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserInfoMapper {
    @Mapping(target = "userInfoId", source = "userInfo.userInfoId")
    UserInfoDto toDto(UserInfo userInfo);
}
