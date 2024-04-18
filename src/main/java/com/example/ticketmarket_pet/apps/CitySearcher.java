//package com.example.ticketmarket_pet.apps;
//
//
//import io.ipinfo.api.IPinfo;
//import io.ipinfo.api.errors.RateLimitedException;
//import io.ipinfo.api.model.IPResponse;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class CitySearcher {
//    public static String getCountry(HttpServletRequest request) {
//        try {
//            String ipAddress = request.getHeader("X-Forwarded-For");
//            if (ipAddress == null || ipAddress.isEmpty()) {
//                ipAddress = request.getRemoteAddr();
//            }
//
//            IPinfo ipinfo = new IPinfo.Builder()
//                    .setToken(extractToken(request))
//                    .build();
//
//
//            IPResponse ipResponse = ipinfo.lookupIP(ipAddress);
//
//            return ipResponse.getCountryName();
//        } catch (Exception e) {
//            return new RateLimitedException().getMessage();
//        }
//    }
//
//    public static String extractToken(HttpServletRequest request) {
//        // Получение значения заголовка Authorization из запроса
//        String authorizationHeader = request.getHeader("Authorization");
//
//        // Проверка наличия заголовка и формата токена (обычно токен передается в формате "Bearer <token>")
//        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//            // Извлечение токена из строки заголовка
//            return authorizationHeader.substring(7);
//        } else {
//            // Если заголовок отсутствует или имеет неверный формат, возвращаем null или выбрасываем исключение
//            return null;
//        }
//    }
//}
//
