package my.project.Stream;

import my.project.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrdersList {
    public static void main(String[] args) {
            List<Order> orders = new ArrayList<>();

            // Добавляем 30 заказов
            for (int i = 1; i <= 30; i++) {
                orders.add(new Order(i, "Customer " + i, (i * 150) + (i % 3 == 0 ? 800 : 0),
                        i % 2 == 0 ? "Completed" : "Pending", "2025-03-" + (i % 28 + 1)));
            }

            orders.forEach(System.out::println);

            // Найдите сумму заказов дороже 1000
            double total = orders.stream().
                    filter(order->order.getAmount()>1000)
                    .mapToDouble(Order::getAmount)
                .sum();

            System.out.println("Общая сумма заказов дороже 1000: " + total);
        }
    }

