public class snake {
    int x, y, width, height;

    void moveLeft(int dx) {
        x = x - dx;
    }

    void moveRight(int dx) {
        x = x + dx;
    }

    void moveUp(int dy) {
        y = y - dy;
    }

    void moveDown(int dy) {
        y = y + dy;
    }

    void printPosition() {
        System.out.println("Posisi x \t= " + x);
        System.out.println("Posisi y \t= " + y);
    }

    void detectCollision(int targetX, int targetY) {
        if (targetX >= x && targetX <= x + width && targetY >= y && targetY <= y + height) {
            System.out.println("Collision detected");
        } else {
            System.out.println("Game over");
        }
    }
}
