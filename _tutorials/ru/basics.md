---
title: Основы
lang: ru
order: 1
---

Чтобы открыть **PackageTemplates** воспользуйтесь разделом **new** контекстного меню. Так же можно настроить shortcut в разделе **keymap** стандартных настроек.

![context_menu]({{ site.baseurl }}/images/tutorial/context_menu.png){: .imageFragment}

Шаблоны можно создавать, удалять и редактировать.

![select_package_template]({{ site.baseurl }}/images/tutorial/select_package_template.png){: .image}

Чтобы воспользоваться шаблоном выбрерите его из списка и нажмите **OK**

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

[1]: {{site.baseurl}}{{ site.data.links.tutorial_global_variables_ru }}
[2]: {{site.baseurl}}{{ site.data.links.tutorial_groovy_script_ru }}