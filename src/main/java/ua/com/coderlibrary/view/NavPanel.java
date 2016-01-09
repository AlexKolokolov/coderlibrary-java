package ua.com.coderlibrary.view;

/**
 * Класс содержит поля, необходимые для формирования навигационной панели
 * при постраничном выводе данных.
 */
public class NavPanel {
    private Button previousButton;
    private Button nextButton;
    private String currentPage;

    public NavPanel(int pageNum, int page, String urlPattern) {
        createNavPanel(pageNum, page, urlPattern);
    }

    /**
     * Метод формирует навигационные кнопки и отображение номера страницы для навигационной панели
     */
    public void createNavPanel(int pageNum, int page, String urlPattern) {

        currentPage = "Страница " + page + " из " + pageNum;

        if (page != 1) {
            previousButton = new Button("Предыдущая", urlPattern + "?page=" + (page - 1));
        }
        if (page != pageNum) {
            nextButton = new Button("Следующая", urlPattern + "?page=" + (page + 1));
        }
    }

    public Button getPreviousButton() {
        return previousButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public String getCurrentPage() {
        return currentPage;
    }
}
