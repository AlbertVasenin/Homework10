package sky.pro.java;

public class Main {

  public static void main(String[] args) {
    //Task №1:
        /* Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
        и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников. Напишите четыре строки:
        первая с именем firstName — для хранения имени;
        вторая с именем middleName — для хранения отчества;
        третья с именем lastName — для хранения фамилии;
        четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: “ФИО сотрудника — ….”
        В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.*/
    System.out.println("Task №1");
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;
    System.out.printf("ФИО сотрудника - %s\n", fullName);

    //Task №2:
        /* Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников, полностью
        написанные заглавными буквами (верхним регистром). Напишите программу, которая изменит написание Ф. И. О.
        сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы. В качестве строки с исходными данными
        используйте строку fullName. Результат программы выведите в консоль в формате:
        "Данные ФИО сотрудника для заполнения отчета — … " */
    System.out.println("Task №2");
    fullName = to_upper_Case();
    System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", fullName);

    //Task №3:
        /* Система, в которой мы работаем, не принимает символ “ё”. Поэтому нам нужно написать программу, которая
        заменяет символ “ё” на символ “е”. В качестве исходных данных используйте строку fullName и данные в
        ней “Иванов Семён Семёнович”. Выведите результат программы в консоль в формате:
        "Данные ФИО сотрудника — ..." */
    System.out.println("Task №3");
    fullName = "Иванов Семён Семёнович";
    fullName = replace_name();
    System.out.printf("Данные ФИО сотрудника — %s\n", fullName);

    //Task №4:
        /* К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку
        с Ф. И. О. на три — на фамилию, имя и отчество. В качестве исходных данных используйте:
        Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
        Решите задание с помощью метода substring().Результат программы выведите в формате:
        “Имя сотрудника — …”
        “Фамилия сотрудника — …”
        “Отчество сотрудника — ...”
         Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
         Их должен вычислить компьютер */
    System.out.println("Task №4");
    break_a_string();

    //Task №5:
        /*Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
        в правильный формат. В качестве исходных данных используйте строку fullName c данными "ivanov ivan ivanovich",
        которые нужно преобразовать в “Ivanov Ivan Ivanovich”. Выведите результат программы в консоль в формате:
         “Верное написание Ф. И. О. сотрудника с заглавных букв — …”*/
    System.out.println("Task №5");
    fullName = fix_the_line();
    System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв - " + fullName);

    //Task №6:
        /* Имеется две строки. Первая: "135" Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456". Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….” */
    System.out.println("Task №6");
    oneOfTwoLine();

    //Task №7:
    /* Дана строка из букв английского алфавита "aabccddefgghiijjkk". Нужно найти и напечатать
    буквы, которые дублируются в строке. Обратите внимание, что строка отсортирована, т. е. дубли
    идут друг за другом. В итоге в консоль должен быть выведен результат программы: "acdgijk".
    Критерии оценки
    – Данные в строке отсортированы корректно.
    – При изменении содержания строки результат программы выполняется.
    – Результат программы выведен в консоль согласно условиям задачи. */
    System.out.println("Task №7");
    findDuplicates();


  }

  //Task №2:
  public static String to_upper_Case() {
    String fullName = "Ivanov Ivan Ivanovich";
    return fullName.toUpperCase();
  }

  //Task №3:
  public static String replace_name() {
    String fullName = "Иванов Семён Семёнович";
    return fullName.replace("ё", "e");
  }

  //Task №4:
  public static void break_a_string() {
    String fullName = "Ivanov Ivan Ivanovich";
    fullName.trim(); //Метод trim() в Java позволяет удалить пробелы в начале и конце строки
    String lastName = fullName.substring(0, fullName.indexOf(" "));
    String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
    String middleName = fullName.substring(fullName.lastIndexOf(" "));
    System.out.printf("Имя сотрудника - %s\nФамилия сотрудника - %s\nОтчество сотрудника - %s\n",
        firstName, lastName, middleName);
  }

  //Task №5:
  public static String fix_the_line() {
    String fullName = "ivanov ivan ivanovich";
    fullName.trim();
    String lastName = fullName.substring(0, fullName.indexOf(" "));
    String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
    String middleName = fullName.substring(fullName.lastIndexOf(" "));
    char[] LastName = lastName.toCharArray();
    LastName[0] = Character.toUpperCase(LastName[0]);
    lastName = String.valueOf(LastName); //Преобразовать данные массива char в строку
    char[] FirstName = firstName.toCharArray();
    FirstName[1] = Character.toUpperCase(FirstName[1]);
    firstName = String.valueOf(FirstName);
    char[] MiddleName = middleName.toCharArray();
    MiddleName[1] = Character.toUpperCase(MiddleName[1]);
    middleName = String.valueOf(MiddleName);
    fullName = lastName + firstName + middleName;
    return fullName;
  }

  //Task №6:
  public static void oneOfTwoLine() {
    String firstLine = "135";
    String twoLine = "246";
    StringBuilder fullLine = new StringBuilder();
    for (int i = 0; i < firstLine.length() + twoLine.length(); i++) {
      if (i % 2 == 0) {
        fullLine.append(firstLine.charAt(i / 2));
      } else {
        fullLine.append(twoLine.charAt(i / 2));
      }
    }
    System.out.println(fullLine);
  }

  //Task №7:
  public static void findDuplicates() {
    String letters = "aabccddefgghiijjkk";
    char[] setOfLetters = letters.toCharArray();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < setOfLetters.length; i++) {
      for (int j = i + 1; j < setOfLetters.length; j++) {
        if (setOfLetters[i] == setOfLetters[j]) {
          stringBuilder.append(setOfLetters[j]);
        }
      }
    }
    System.out.println(stringBuilder);
  }
}
