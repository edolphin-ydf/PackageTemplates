---
title: Создание Шаблона
lang: ru
order: 2
---

![new_package_template_dialog]({{ site.baseurl }}/images/tutorial/new_package_template_dialog.png){: .image}

1. Зарегистрировать как *Action*. Позволяет привязать *shortcut*.
2. Пропускать диалог перед использованием. Будут использованы имена файлов и папок по умолчанию(указанные при создании\редактировании).
3. Не создавать корневую директорию. Для случаев, когда нужны только файлы.
4. Глобальные переменные. [Подробнее][1].
5. Структура шаблона. Добавлять\удалять элементы можно с помощью ПКМ. Флажок вначале элемента отвечает за его создание. Флажок можно менять в [диалоге преднастроек][3] при использовании шаблона<br><br>
![add_element]({{ site.baseurl }}/images/tutorial/add_element.png){: .imageFragment}

При добавлении файла появится диалог со списком File Templates, которые создаются в стандартных настройках. Флажки сверху - это фильтры.

![select_file_template]({{ site.baseurl }}/images/tutorial/select_file_template.png){: .imageFragment}


### Пример шаблона
Чтобы лучше понять содержимое примера следует ознакомиться с [Глобальными переменными][1] и [Groovy scripts][2].

![new_package_template_dialog_full]({{ site.baseurl }}/images/tutorial/new_package_template_dialog_full.png){: .image}

### Диалог перед созданием
После выбора шаблона из списка появится диалог с настройками(этот диалог можно отключить флажком **Skip Defining Names**). Окно похоже на **Редактирование шаблона** только доступно меньше опций:

* Вкл\выкл элементов флажком слева.
* Пропуск корневой директории.
* Редактирование имен элементов.
* Редактирование глобальных переменных.

![package_template_usage_dialog]({{ site.baseurl }}/images/tutorial/package_template_usage_dialog.png){: .image}

[1]: {{ site.baseurl}}{{ site.data.links.tutorial_global_variables_ru }}
[2]: {{ site.baseurl}}{{ site.data.links.tutorial_groovy_script_ru }}
[2]: {{ site.baseurl}}{{ site.data.links.tutorial_presettings_ru }}