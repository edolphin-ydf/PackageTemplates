---
title: Сочетания клавиш
lang: ru
order: 7
---

Сочетания клавиш хорошо описаны в документации от **jetbrains:**<br>

* [Keymap; Actions][2]
* [Shortcuts; Searching for actions][1]

Плагин использует **Action** для запуска **Основного диалога**. Для каждого из шаблонов создается Action.(При условии, что отмечен соответствующий флажок, подробнее [здесь][4]).

В настройках пользуйтесь поиском по имени. Action **Основного диалога** зарегистрирован под именем **"{{ site.data.const.main_action_name }}"**. Actions шаблонов используют их имена.

**Примечание:** Actions шаблонов регистрируются при запуске IDE. Если вы изменяли **флажок регистрации Action** в настройках шаблона или создали шаблон с нуля, то не забудьте перезапустить IDE.


[1]: {{ site.data.links.shortcuts }}
[2]: {{ site.data.links.shortcuts_actions }}
[3]: {{ site.data.links.jetbrains }}
[4]: {{ site.baseurl}}{{ site.data.links.tutorial_create_template[page.lang] }}