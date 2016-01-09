package ua.com.coderlibrary.view;

/**
 * Класс кнопок для главного меню. Дополнительно содержит флаг активного состояния кнопки.
 */
public class MenuButton extends Button {
    private boolean active;

    public MenuButton(String name, String url) {
        super(name, url);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive() {
        this.active = true;
    }
}
