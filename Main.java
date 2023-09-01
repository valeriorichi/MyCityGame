import java.util.ArrayList;
import java.util.Scanner;

class Main {
  private static ArrayList<String> cities = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    fillCities();
    gameLoop();
  }

  private static void gameLoop() {
    while(true) {
      String input = scanner.nextLine();

      if (input.equals("exit")) {
        System.out.println("Дякую за гру");
        System.exit(0);
      }

      char lastChar = input.charAt(input.length() - 1);

      for(String city: cities) {
        char firstChar = city.charAt(0);

        if(Character.toLowerCase(lastChar) == Character.toLowerCase(firstChar)) {
          System.out.println("Моє місто: " + city);
          break;
        }
      }      
    }
  }
  
    private static void fillCities() {
    // Обласні центри України
    cities.add("Київ");
    cities.add("Вінниця");
    cities.add("Дніпро");
    cities.add("Донецьк");
    cities.add("Житомир");
    cities.add("Запоріжжя");
    cities.add("Івано-Франківськ");
    cities.add("Кропивницький");
    cities.add("Луганськ");
    cities.add("Луцьк");
    cities.add("Львів");
    cities.add("Миколаїв");
    cities.add("Одеса");
    cities.add("Полтава");
    cities.add("Рівне");
    cities.add("Симферополь");
    cities.add("Суми");
    cities.add("Тернопіль");
    cities.add("Ужгород");
    cities.add("Харків");
    cities.add("Херсон");
    cities.add("Хмельницький");
    cities.add("Черкаси");
    cities.add("Чернівці");
    cities.add("Чернігів");

    // Районні центри України
    cities.add("Алчевськ"); 
    cities.add("Біла Церква");
    cities.add("Бердянськ");
    cities.add("Бровари");
    cities.add("Кам'янське");
    cities.add("Кременчук");
    cities.add("Кривий Ріг");
    cities.add("Мелітополь");
    cities.add("Мукачеве");
    cities.add("Нікополь");
    cities.add("Севастополь");
    cities.add("Стрий");
    cities.add("Тернопіль");
    cities.add("Умань");
    cities.add("Херсон");
    cities.add("Черкаси");
    cities.add("Чернігів");
    cities.add("Ялта");
    cities.add("Яремче");

    // Столиці інших держав
    cities.add("Варшава");
    cities.add("Будапешт");
    cities.add("Берлін");
    cities.add("Москва");
    cities.add("Мінськ");
    cities.add("Прага");
    cities.add("Бухарест");
    cities.add("Софія");
    cities.add("Брюссель");
    cities.add("Лондон");
    cities.add("Париж");
    cities.add("Мадрид");
    cities.add("Рим");
    cities.add("Афіни");
    cities.add("Стамбул");
    cities.add("Токіо");
    cities.add("Пекін");
    cities.add("Делі");
    cities.add("Вашингтон");
    cities.add("Оттава");  
  }
}