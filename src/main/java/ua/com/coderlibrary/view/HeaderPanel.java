package ua.com.coderlibrary.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс содержит поля, необходимые для формирования верхней панели
 * каждой из страниц сайта, с титулом страницы и главным меню.
 */
public class HeaderPanel {
    private String title;
    private List<MenuButton> menuButtons = new ArrayList<>();

    public HeaderPanel(String title, int pageId) {
        this.title = title;
        createMainMenu();
        setActiveButton(pageId);
    }

    public List<MenuButton> getMenuButtons() {
        return menuButtons;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Создает набор кнопок для главного меню.
     */
    private void createMainMenu() {
        menuButtons.add(new MenuButton("Главная", "/main"));
        menuButtons.add(new MenuButton("Книги", "/books"));
        menuButtons.add(new MenuButton("Видеокурсы", "/courses"));
        menuButtons.add(new MenuButton("Сайты", "/sites"));
        menuButtons.add(new MenuButton("О проекте", "/about"));
        menuButtons.add(new MenuButton("Обратная связь", "/feedback"));
    }

    /**
     * Помечает кнопку, соотвествующую текущей станице, для отображения ее, отличной от остальных.
     * (Атрибут active кнопки принимает состояние true)
     */
    private void setActiveButton(int pageId) {
        menuButtons.get(pageId).setActive();
    }
}
