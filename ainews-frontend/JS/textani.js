var $ = function (id) {
  return document.getElementById(id);
};
var inc = 0;
var out = 0;
var str = "what news do you want...?";
var chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@$%&";
var t;

var anim = function () {
  inc++;
  if (inc % 7 === 0 && out < str.length) {
    $("anim").appendChild(document.createTextNode(str[out]));
    out++;
  } else if (out >= str.length) {
    $("shuffle").innerHTML = "";
    removeInterval(t);
  }
  $("shuffle").innerHTML = chars[Math.floor(Math.random() * chars.length)];
};
t = setInterval(anim, 50);
$("anim").innerHTML = "";

// 3초 후에 내용을 표시하고 로딩 화면을 숨깁니다.
setTimeout(function () {
  document.getElementById("loading-screen").style.display = "none";
  document.getElementById("content").style.display = "block";
}, 10000);
