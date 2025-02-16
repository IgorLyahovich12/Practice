package my.project.exercise;
//Реалізуйте структуру даних,
//яка зберігає історію відвіданих веб-сторінок та дозволяє переміщуватися вперед і назад, як у браузері.

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory(String initialPage) {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = initialPage;
    }

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear(); // Очистити стек "вперед", оскільки ми пішли на нову сторінку
        System.out.println("Відвідування: " + url);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Назад до: " + currentPage);
        } else {
            System.out.println("Назад не можна!");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Вперед до: " + currentPage);
        } else {
            System.out.println("Вперед не можна!");
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("google.com");

        browser.visit("youtube.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");

        browser.back();  // Повертаємося до github.com
        browser.back();  // Повертаємося до youtube.com
        browser.forward();  // Переходимо знову до github.com
        browser.visit("reddit.com");  // Відвідуємо новий сайт (очищується forwardStack)
        browser.back();  // Повертаємося до github.com
    }
}
