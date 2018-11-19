package com.company;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 60) {
            throw new IllegalArgumentException("minutes can`t be more than 60");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        this.hours = this.hours + timeSpan.hours;
        this.minutes = this.minutes + timeSpan.minutes;
        if (this.minutes >= 60) {
            this.hours = this.hours + this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }

    public void sub(TimeSpan timeSpan) {
        if (this.hours < timeSpan.hours) {
            throw new IllegalArgumentException("you cant sub more hours from less");
        }
        if (this.hours * 60 + this.minutes < timeSpan.hours * 60 + timeSpan.minutes) {
            throw new IllegalArgumentException("you cant sub more hours from less");
        }
        this.hours = this.hours - timeSpan.hours;
        this.minutes = this.minutes - timeSpan.minutes;
        if (this.minutes < 0) {
            this.hours--;
            this.minutes = this.minutes + 60;
        }

    }

    public void mult(double times) {
        double time = this.hours * 60 + this.minutes;
        time = time * times;
        this.hours = (int) time / 60;
        this.minutes = (int) time % 60;

    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
