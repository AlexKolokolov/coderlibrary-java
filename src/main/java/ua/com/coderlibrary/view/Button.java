package ua.com.coderlibrary.view;

/**
 * Кнопка. Содержит название для отображения на ней и URL, для перехода при нажатии на нее.
 */
public class Button {
    private String name;
    private String url;

    public Button(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
