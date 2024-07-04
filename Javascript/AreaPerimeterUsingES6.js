const { Console } = require("console");
var fs = require("fs");
var input = fs.readFileSync("input.txt").toString().trim().split("\n");
// Define the Shape class
class Shape {
  constructor(name) {
    this.name = name;
  }

  calculatePerimeter() {
    return 0;
  }

  calculateArea() {
    return 0;
  }
}

// Define the Circle class extending Shape
class Circle extends Shape {
  constructor(name, radius) {
    super(name);
    this.radius = radius;
  }

  calculatePerimeter() {
    return 2 * Math.PI.toFixed(2) * this.radius;
  }

  calculateArea() {
    return Math.PI.toFixed(2) * Math.pow(this.radius, 2);
  }

  displayCircleMeasurements() {
    console.log(
      `Perimeter of a Circle: ${this.calculatePerimeter().toFixed(2)}`
    );
    console.log(`Area of a Circle: ${this.calculateArea().toFixed(2)}`);
  }
}

class Square extends Shape {
  constructor(name, side) {
    super(name);
    this.side = side;
  }

  calculatePerimeter() {
    return 4 * this.side;
  }

  calculateArea() {
    return Math.pow(this.side, 2);
  }

  displaySquareMeasurements() {
    console.log(`Perimeter of a Square: ${this.calculatePerimeter()}`);
    console.log(`Area of a Square: ${this.calculateArea()}`);
  }
}

class Triangle extends Shape {
  constructor(name, side1, side2, side3, base, height) {
    super(name);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.base = base;
    this.height = height;
  }

  calculatePerimeter() {
    return Number(this.side1) + Number(this.side2) + Number(this.side3);
  }

  calculateArea() {
    return 0.5 * this.base * this.height;
  }

  displayTriangleMeasurements() {
    console.log(`Perimeter of a Triangle: ${this.calculatePerimeter()}`);
    console.log(`Area of a Triangle: ${this.calculateArea()}`);
  }
}

circleDetails = input[0].split(",");
squareDetails = input[1].split(",");
triangleDetails = input[2].split(",");

const circle = new Circle(circleDetails[0], circleDetails[1]);
const square = new Square(squareDetails[0], squareDetails[1]);
const triangle = new Triangle(
  triangleDetails[0],
  triangleDetails[1],
  triangleDetails[2],
  triangleDetails[3],
  triangleDetails[4],
  triangleDetails[5]
);

circle.displayCircleMeasurements();
square.displaySquareMeasurements();
triangle.displayTriangleMeasurements();
