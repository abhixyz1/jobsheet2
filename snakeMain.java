public class snakeMain {
    public static void main(String[] args) {
        snake snake1 = new snake();

        snake1.x = 10;
        snake1.y = 10;
        snake1.width = 100;
        snake1.height = 100;

        snake1.moveLeft(10);
        snake1.moveRight(10);
        snake1.moveUp(10);
        snake1.moveDown(10);
        snake1.printPosition();
        snake1.detectCollision(20, 20);
    }
}