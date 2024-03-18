package com.example.ticketmarket_pet.apps;

import lombok.Getter;
import lombok.Setter;
import org.geonames.*;

@Getter
@Setter
public class CitySearchApp {

//    public static void main(String[] args) throws Exception {
//        // Получаем имя пользователя для подключения к GeoNames
//        String username = "m.bondarenko"; //"your_username" - ваше имя пользователя GeoNames
//
//        // Создаем клиент для работы с GeoNames API
//        WebService.setUserName(username);
//
//        // Создаем объект Scanner для считывания ввода пользователя
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter city name: ");
//        String cityName = scanner.nextLine();
//
//        // Используем GeoNames API для поиска городов по названию
//        ToponymSearchCriteria searchCriteria = new ToponymSearchCriteria();
//        searchCriteria.setName(cityName);
//        ToponymSearchResult searchResult = WebService.search(searchCriteria);
//
//        // Проверяем, найдены ли города
//        if (searchResult.getTotalResultsCount() > 0) {
//            // Отображаем список найденных городов
//            List<Toponym> cities = searchResult.getToponyms();
//            System.out.println("Founded cities:");
//            for (int i = 0; i < cities.size(); i++) {
//                System.out.println((i + 1) + ". " + cities.get(i).getName() + ", " + cities.get(i).getCountryName());
//            }
//        } else {
//            System.out.println("Not found.");
//        }
//
//        // Закрываем сканер
//        scanner.close();
//    }
}
