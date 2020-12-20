function sum(numbers) {
    // write your code here
    let sumOfArray = 0;
    for (let i = 0; i < numbers.length; i++) {
        if (numbers[i] !== 0) {
            sumOfArray += numbers[i];
        } else {
            return sumOfArray;
        }
    }
}
