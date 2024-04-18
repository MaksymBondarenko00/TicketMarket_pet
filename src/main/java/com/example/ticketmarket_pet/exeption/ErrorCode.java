package com.example.ticketmarket_pet.exeption;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ErrorCode {
    public static final String USER_NOT_FOUND = "user_not_found";
    public static final String LIST_IS_EMPTY = "list_is_empty";
    public static final String VALIDATION_FAILED = "validation_failed";
    public static final String INVALID_PATH_VARIABLE = "invalid_path_variable";
    public static final String TICKET_ALREADY_PURCHASED = "ticket_already_purchased";

}
