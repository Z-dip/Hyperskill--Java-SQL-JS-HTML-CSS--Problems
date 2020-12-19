

//write code of the Shelf class here
class Shelf<T /* extends Book throws error */> {
    T element;

    void setElement(T element) {
        this.element = element;
    }

    T getElement() {
        return element;
    }

}
