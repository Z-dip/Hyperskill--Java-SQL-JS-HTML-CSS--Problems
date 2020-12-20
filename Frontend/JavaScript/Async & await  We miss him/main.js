async function rockBand(string) {
  if (string === "Linkin Park") {
    return Promise.resolve("Chester, we miss you!");
  } else {
    return Promise.resolve("No matter the band we miss him anyway!");
  }
}
