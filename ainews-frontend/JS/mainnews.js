var slideIndex = 1;
showSlides(slideIndex);

function plusSlides1(n) {
  showSlides((slideIndex += n));
}
function plusSlides2(m) {
  showSlides((slideIndex += m));
}
function showSlides(n) {
  var i;
  var j;
  var slides1 = document.getElementsByClassName("mySlides-1");
  var slides2 = document.getElementsByClassName("mySlides-2");
  if (n > slides1.length) {
    slideIndex = 1;
  }
  if (n < 1) {
    slideIndex = slides1.length;
  }
  for (i = 0; i < slides1.length; i++) {
    slides1[i].style.display = "none";
  }
  slides1[slideIndex - 1].style.display = "block";

  if (m > slides2.length) {
    slideIndex = 1;
  }
  if (m < 1) {
    slideIndex = slides2.length;
  }
  for (j = 0; j < slides2.length; j++) {
    slides2[j].style.display = "none";
  }
  slides2[slideIndex - 1].style.display = "block";
}

/* =========================== */
