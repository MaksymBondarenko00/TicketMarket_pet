//package com.example.ticketmarket_pet.mapper;
//
//import com.example.ticketmarket_pet.dto.CreateUserDto;
//import com.example.ticketmarket_pet.entity.User;
//import org.mapstruct.InjectionStrategy;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
//uses = {UserMapper.class, UserInfoMapper.class})
//public interface CreateUserMapper {
//
//    @Mapping(source = "user.userID", target = "userId")
//
//    CreateUserDto toDto(User user);
//}
