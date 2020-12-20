const music = ["rock", "pop", "hip-hop", "electronic"];

function myFavoriteMusic(music) {
  // write your code

  music.forEach(function (part, i, array) {
     console.log(`My favorite music is ${part} choosing from ${array}`);
  });
}
