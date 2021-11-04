var inputWidth;
var inputHeight;

inputWidth = prompt("Enter the Width");
inputHeight = prompt("Enter the Height");

var Width = parseInt(inputWidth);
var Height = parseInt(inputHeight);

var area = Width * Height;
document.write("Enter the Width : <br>" + Width);
document.write("<br/>");
document.write("Enter the Height : <br/>" + Height);
document.write("<br/>");
document.write("The area is: " + area);