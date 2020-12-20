function find5(numbers) {
    // change it
    let arrayIndex = 0;
    for (let i = 0; i < numbers.length; i++ ) {
        if (numbers[i] === 5) {
            return arrayIndex;
        }
        arrayIndex += 1;
    }
    return -1;
}
