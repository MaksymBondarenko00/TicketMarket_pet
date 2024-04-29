package com.example.ticketmarket_pet.controller;

import com.example.ticketmarket_pet.dto.UserDto;
import com.example.ticketmarket_pet.dto.UserInfoDto;
import com.example.ticketmarket_pet.entity.User;
import com.example.ticketmarket_pet.services.interfaces.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Validated
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;

    @GetMapping("/showUser/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Request user by UUID", description = "Getting user by UUID", tags = "USERS")
    @ApiResponse(
            responseCode = "200",
            description = "Successfully returned user",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDto.class))
            })
    public UserDto showUserById(@PathVariable(name = "id") String id) {
        return userServices.getUserById(id);
    }

    @GetMapping("/showUser/{firstName}/{lastName}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Request user by name", description = "Getting user by name")
    @ApiResponse(
            responseCode = "200",
            description = "Successfully returned user",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDto.class))
            })
    public UserDto showUserByName(@PathVariable(name = "firstName") String firstName,
                                  @PathVariable(name = "lastName") String lastName) {
        return userServices.getUserByName(firstName, lastName);
    }

    @GetMapping("/showUserInfo/{username}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Request user by username", description = "Getting user by username")
    @ApiResponse(
            responseCode = "200",
            description = "Successfully returned user",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDto.class))
            })
    public UserInfoDto showInfoByUsername(@PathVariable(name = "username") String username) {
        return userServices.getInfoByUsername(username);
    }

    @PutMapping("/{userId}/buyTicket/{ticketId}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Buy ticket", description = "Adding ticket to user")
    @ApiResponse(
            responseCode = "200",
            description = "Successfully purchased",
            content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = UserDto.class))
            })
    public UserDto buyTicket(@PathVariable(name = "ticketId") UUID ticketId, @PathVariable(name = "userId") UUID userId) {
        return userServices.buyTicket(ticketId, userId);
    }

//        @PostMapping("/create")
//    public User createNewUser(@RequestBody User user){
//        return userServices.createUser(user);
//    }
}
