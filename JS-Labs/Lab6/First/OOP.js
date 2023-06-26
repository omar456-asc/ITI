class Shape {

    name;
    sides;
    sideLength;
  
    constructor(name, sides, sideLength) {
      this.name = name;
      this.sides = sides;
      this.sideLength = sideLength;
    }
  
    calcPerimeter() {
      console.log(`The ${ this.name }'s perimeter length is ${ this.sides * this.sideLength }.`);
    }
  
  }
class Square extends Shape {
    constructor(sideLength) {
            super("square", 4, sideLength);
        }

    calcArea() {
        return (this.sideLength * this.sideLength);
    }

    calcPerimeter() {
        return (this.sides * this.sideLength);
    }

}
  //const square = new Shape('square', 4, 5);
 const square = new Square(5);
 console.log(square.calcArea());
  console.log(square.calcPerimeter());
  
  const triangle = new Shape('triangle', 3, 3);
  triangle.calcPerimeter();