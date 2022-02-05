package com.techreturners;

public class Rover {
    public int x;
    public int y;
    String position;

    public Rover(int x, int y, String position) {
        this.x = x;
        this.y = y;
        this.position = position;
    }

    public String setDirection(String direction) {
        String errorMessage = "";
        if (!direction.isEmpty()) {
            for (int i = 0; i < direction.length(); i++) {
                if (direction.charAt(i) == 'L') {
                    turnLeft();
                } else if (direction.charAt(i) == 'R') {
                    turnRight();
                } else if (direction.charAt(i) == 'M') {
                    if (validatePosition(position)) {
                        errorMessage += "Out of bounds";
                        break;
                    }
                    move();
                } else {
                    errorMessage += "Please set proper directions";
                    break;
                }
            }
        }
        if (!errorMessage.isEmpty()) {
            return errorMessage;
        } else {
            return x + " " + y + " " + position;
        }
    }

    private void turnRight() {
        if (position.equals("N")) {
            position = "E";
        } else if (position.equals("S")) {
            position = "W";
        } else if (position.equals("E")) {
            position = "S";
        } else if (position.equals("W")) {
            position = "N";
        }
    }

    private void turnLeft() {
        if (position.equals("N")) {
            position = "W";
        } else if (position.equals("S")) {
            position = "E";
        } else if (position.equals("E")) {
            position = "N";
        } else if (position.equals("W")) {
            position = "S";
        }
    }

    private boolean validatePosition(String direction) {
        if ((y == 5 && direction.equals("N")) ||
                (y == 0 && direction.equals("S")) ||
                (x == 5 && direction.equals("E")) ||
                (x == 0 && direction.equals("W"))) {
            return true;
        }
        return false;
    }

    private void move() {
        if (position.equals("N")) {
            y++;
        } else if (position.equals("S")) {
            y--;
        } else if (position.equals("E")) {
            x++;
        } else if (position.equals("W")) {
            x--;
        }
    }
}
