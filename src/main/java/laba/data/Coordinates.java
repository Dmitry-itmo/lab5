package data;

import exceptions.IncorrectCommandException;

public class Coordinates {
    private long x;
    private float y; //Значение поля должно быть больше -192

     public Coordinates(long x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(long x) {
        this.x = x;
    }

    public void setY(float y) throws IncorrectCommandException {
        if (y > -192) {
            this.y = y;
        } else {
            throw new IncorrectCommandException();
        }
    }

   

    public long getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


}
