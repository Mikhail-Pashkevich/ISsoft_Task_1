# ISsoft_Task_1

IT IS LOGGING

Сделать мультимодульный maven проект из 2 модулей. Настроить логирование в файл и на консоль. Первый из модулей содержит
метод main и зависимость на второй модуль. Второй модуль содержит утильный класс (можно со static методом) который
делает рекурсивный binary search за log(n) для сортированного массива int. Сделать debug логгирование хода алгоритма


NOTES#1

Комментарии по коду:
1) .gitignore - хорошо
2) README.md - хорошо
3) метод binarySearch лучше перегрузить, что бы избавить внешних пользователей от необходимости передавать много параметров
4) Иморт import logger.SLF4JLogger не используется - Intelij Idea подсажет что unused import
5) RollingFileAppender - хорошо
6) Класс SLF4JLogger лишней. Везде по коду нужно использовать org.slf4j.Logger на прямую
7) int middle = (low + high) / 2 - может привести у переполнению
8) По алгоритму binary search, на сколько я вижу, можно добавить улучшение: проверку key == array[middle]. Иначе алгоритм всегда будет работать до конца что не очень хорошо.


NOTES#2

Вычисление middle лучше делать
middle = low + (high - low)/2 