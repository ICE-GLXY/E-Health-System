package za.ac.cput.util;

import org.apache.commons.lang3.StringUtils;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {
    public static boolean isEmptyOrNull(String str){
        return StringUtils.isEmpty(str);
    }

    public static String setEmptyIfNull(String str){
        if (isEmptyOrNull(str)) return StringUtils.EMPTY;
        return str;

    }

    public static void checkStringParam(String paramName, String paramValue){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", paramName));
    }


    public static boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static String checkId(String id) {
        if(isEmptyOrNull(id))
            throw new IllegalArgumentException("invalid details provided");
        return id;
    }

    public static void checkIfObjectNull(String objectName, Object object){
        if (object == null){
            throw new IllegalArgumentException(String.format("%s is null", objectName));
        }
    }
}
