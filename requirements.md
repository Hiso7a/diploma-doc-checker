# Требования к веб-приложению "Format Checker"

## Цель
Разработка веб-приложения для проверки правильности оформления научных статей и дипломных работ по установленным требованиям (ГОСТ, университетские положения).

---

## Функциональные требования

- [ ] Загрузка документа в формате `.docx` или `.pdf`
- [ ] Проверка:
  - [ ] Шрифт (Times New Roman)
  - [ ] Размер шрифта (14 pt)
  - [ ] Межстрочный интервал (1.5)
  - [ ] Отступы (верх, низ, левый, правый — 2.5 см)
  - [ ] Наличие титульного листа
  - [ ] Наличие таблицы содержания
- [ ] Формирование отчета о проверке

---

## Нефункциональные требования

- Приложение написано на **Spring Boot**
- REST API для загрузки и проверки документа
- Возможность развертывания на локальном сервере (Tomcat)
- Безопасность: ограничение размера файла, защита от вредоносных вложений
- Возможность расширения (модульная архитектура)

---

## Технологии

- Java 17
- Spring Boot 3.x
- Maven
- Git + GitHub
- Возможное расширение:
  - Apache POI (для чтения .docx)
  - iText / PDFBox (для .pdf)
  - Postgres или H2 (для логирования проверок)

---

## Пользовательские роли (будущее)

- **Пользователь** — загружает документ
- **Админ** — настраивает шаблоны требований и просматривает отчёты

---

## Будущие доработки

- Интерфейс на React / Thymeleaf
- Авторизация и роли
- Проверка на плагиат (интеграция с внешним сервисом)
