# DirectoryScanner
Работа приложение заключается в следующем:
 - Приложение рекурсивно сканирует каталог и вложенные в них подкаталоги
 - Происходит поиск текстовых файлов, сортировка их путей и конкатенация контента файлов в один отдельный файл
 
На вход приложение принимает 2 аргумента
- Первый аргумент принимает путь к каталогу, куда будет сохраняться файл с именем "content.txt" с записанным итоговым контентом
- Второй аргумент принимет путь к каталогу начала сканирования. Именно указанный каталог станет корнем для сканирования и в нем будет стартовать рекурсионный поиск.
