package my.project.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkList{
    private List<String> phrase=new LinkedList<>();
    private String hello="ку-ку";

    public LinkList(){
        phrase.add( "Stay");
        phrase.add( "Dont stop");
        phrase.add( "What happened");
        phrase.add( "How me found the work");
        phrase.add(hello);
        printSize();
    }
    public void printSize(){
        int scale=phrase.size();
        if (phrase.isEmpty()) {
            System.out.println("zero");
        } else {
            System.out.println("Розмір списку: " + scale);
        }
    }
    public void addPhrase(String newPhrase) {
        phrase.add(newPhrase);
        System.out.println(newPhrase + " додано до списку.");
    }
    // Метод для видалення імені зі списку
    public void removePhrase(String phraseToRemove) {
        if (phrase.remove(phraseToRemove)) {
            System.out.println(phraseToRemove + " видалено зі списку.");
        } else {
            System.out.println(phraseToRemove + " не знайдено.");
        }
    }
    // Метод для перевірки, чи є ім'я у списку
    public boolean containsPhrase(String searchPhrase) {
        return phrase.contains(searchPhrase);
    }
    // Метод для очищення списку
    public void clearPhrase() {
        phrase.clear();
        System.out.println("Список імен очищено.");
    }
    public String getPhraseByIndex(int index) {
        if (index < 0 || index >= phrase.size()) {
            return "Неправильний індекс!";
        }
        return phrase.get(index);
    }
    public void updatePhrase(int index, String newPhrase) {
        if (index < 0 || index >= phrase.size()) {
            System.out.println("Неправильний індекс!");
            return;
        }
        phrase.set(index, newPhrase);
        System.out.println("Фраза оновлена.");
    }

    public List<String> getPhrase() {
        return phrase;
    }

    public void setPhrase(List<String>phrase) {
        this.phrase = phrase;
    }
}
