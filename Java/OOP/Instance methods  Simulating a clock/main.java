// implement me
class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.hours == 12 && this.minutes == 59) {
            this.hours = 1;
            this.minutes = 0;
        } else if (this.minutes != 59) {
            this.minutes = this.minutes + 1;
        } else if (this.minutes == 59) {
            this.hours = this.hours + 1;
            this.minutes = 0;
        }
        
        
    }
}
