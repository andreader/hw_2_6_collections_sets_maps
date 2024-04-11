# 2.6. Коллекции: сеты и мапы

> Привет!
На связи домашнее задание урока 2.6 Коллекции: сеты и мапы.

Выполненное задание пришлите на платформу в формате ссылки на новый проект на GitHub.
>

## Задание 1

Напишите код, с помощью которого можно напечатать только нечетные числа в консоль. Код должен работать с любой последовательностью и объемом списка чисел.

В качестве отладочной информации можете использовать список чисел:

```java
List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
```

- Критерии проверки
    - В консоль выводятся только нечетные числа,
    - Код работает с любой последовательностью и объемом списка чисел.

## Задание 2

Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания. Код должен работать с любой последовательностью и объемом списка чисел.

В качестве отладочной информации можете использовать список чисел:

```java
List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
```

- Критерии проверки
    - В консоль выводятся только четные числа
    - Все выведенные числа следуют в порядке возрастания
    - Ни одно число не повторяется
    - Код работает с любой последовательностью и объемом списка чисел

## Задание 3

Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли. Код должен работать с любой последовательностью и объемом списка слов.

В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.

- Критерии проверки
    - В консоль выводятся только уникальные слова из списка слов
    - Код работает с любой последовательностью и объемом списка слов

## Задание 4

Напишите код, который выводит в консоль количество дублей для каждого уникального слова. Код должен работать с любой последовательностью и объемом списка слов.

В качестве отладочной информации используйте:

```java
List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
```

- Критерии проверки
    - В консоль выводится число повторений одного слова
    - Если в одном тексте разные слова повторяются, то в консоль нужно вывести несколько чисел
    - Порядок числовых значений в консоли значения не имеет
    - Код работает с любой последовательностью и объемом списка слов.

Если вы используете предложенный нами пример, то в консоли должно в произвольном порядке распечататься:

```java
1
2
3
```

🐝 FAQ

Вопросы, которые уже задавали ученики после этого урока.

Возможно, вы найдёте ответ на свой вопрос.

- Смотреть
    1. ***Подскажите, при добавлении в коллекцию элементов из другой коллекции у нас создается третья коллекция, с которой мы работаем, или элементы из коллекции, которая указана в скобках (в примере nums2) добавляются в коллекцию, у которой вызываем метод addAll (в примере nums), и работаем уже с пополненной коллекцией nums?***

  **Ответ**:  Мы просто добавляем элементы из первой коллекции во вторую. При этом важно понимать, что коллекции хранят лишь ссылки на элементы, поэтому в изначальной коллекции элементы останутся.

    1. ***В домашке удаление и поиск сотрудника должен проводиться по ключу?***

  **Ответ**: Да. Ключом должно быть то, что мы будем использовать для поиска, например, имя + фамилия или то, что можно собрать из входящих данных. Ключи – внутренний механизм, с ним работает только сервис.