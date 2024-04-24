package com.example.ticketmarket_pet.mapper;


import com.example.ticketmarket_pet.dto.UserDto;
import com.example.ticketmarket_pet.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
//    @Mapping(target = "user.firstName", source = "firstName")
//    @Mapping(target = "lastName", source = "lastName")
//    @Mapping(target = "createdAt", source = "java(new Timestamp(System.currentTimeMillis()).toString())")
//    @Mapping(target = "isBlocked", ignore = true)
//    @Mapping(target = "userInfo", source = "userBeforeCreationDto")
//    @Mapping(target = "userInfo.username", ignore = true)
//    @Mapping(target = "userInfo.password", ignore = true)
//    @Mapping(target = "userInfoId", ignore = true)
//    User toEntity(UserBeforeCreationDto userBeforeCreationDto);

//    @AfterMapping
//    default void generateUserInfo(@MappingTarget User user, UserBeforeCreationDto userBeforeCreationDto) {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername(generateUsername(user));
//        userInfo.setPassword(generatePassword());
//        userInfo.setEmail(userBeforeCreationDto.getEmail());
//        userInfo.setCountry("london");
//        userInfo.setPhoneNumber(UserDataGenerator.genPhoneNumber());
//        userInfo.setCardNumber(CardGenerator.generateCreditCardDetails());
//        user.setUserInfo(userInfo);
//    }

//    private static String generatePassword(){
//        return UUID.randomUUID().toString().substring(1,9);
//    }
//    private static String generateUsername(User user){
//        return (user.getFirstName() + "_" + user.getLastName()).toLowerCase();
//    }

//    @Mapping(target = "username", source = "userInfo.username")
//    @Mapping(target = "password", source = "userInfo.password")
//    @Mapping(target = "creationDate", expression = "java(DateFormatter.formatDate(user.getCreatedAt(), user.getCountry().name()))")
    @Mapping(target = "userInfo", source = "user.userInfo")
    @Mapping(target = "userTickets", source = "user.userTickets")
    @Mapping(target = "orders", ignore = true)
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
