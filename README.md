# Задача №3 - "Цикломатическая сложность кода"
1. Настроила JaCoCo на подсчёт метрики для `Radio.java` в [pom.xml](https://github.com/viktoria-sap/smart-house1/blob/master/pom.xml).
1. По скринам ниже видно, что тесты покрыли 100% кода.
1. Сборка не падает.
1. Все еще не совсем понятно, как действовать с этими пунктами:
- *Формула вычисления количества unit-тестов на основании значений, генерируемых JaCoCo*.
**Согласно формуле** *количество юнит-тестов = количество бранчей/2*.
**Получается, что 6 = 6/2 (исходя из кода). Вероятно, нужно взять за основу данные из таблицы, но я не понимаю, какие.**

- *Рекомендуемый порог цикломатической сложности кода*

![1](https://github.com/viktoria-sap/smart-house1/blob/master/1.png)

![2](https://github.com/viktoria-sap/smart-house1/blob/master/2.png)
