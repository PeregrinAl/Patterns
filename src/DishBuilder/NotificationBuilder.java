package DishBuilder;

public class NotificationBuilder implements IDishBuilder {
    public int count;
    public Notification notification;
    public DishList dishList = new DishList();
    @Override
    public IDishBuilder createOrder(String order) {
        count += 1;
        System.out.println("Зал: заказ " + order + " " + count);
        notification = new Notification(count, order, DishList.map.get(order));
        return this;
    }

    @Override
    public IDishBuilder startCooking() {
        System.out.println();
        return this;
    }

    @Override
    public void cookingTimer() {
        long start = System.currentTimeMillis();
        long end = (long) (start + (60 * 1000) * notification.time);
        while (System.currentTimeMillis() < end) {
            System.out.println("Заказ готовится уже " + ((System.currentTimeMillis() - start) / 1000) + " секунд" +
                    "\nОсталось " + ((end - System.currentTimeMillis()) / 1000));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Notification ready() {
        notification.callNotification();
        return notification;
    }
}
