Car car1 = new Car(300, 200, 12, 15);
Car car2 = new Car(350, 120, 14, 15);
Car car3 = new Car (20, 50, 14, 15);
Car car4 = new Car (50, 300, 14, 15);
boolean intersects(Car car) {
      if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
      {
             return true;
      }
      else 
      {
             return false;
      }
}
void setup(){
  size(400, 400);
}
int x = 200;
int y = 400;
int hop = 10;
void draw(){
  
  background(80, 80, 80);
  fill(1,255,1);
  ellipse(x,y, 25,25);
  car1.display();
  car2.display();
  car3.display();
  car4.display();
  car1.left();
  car2.left();
  car3.right();
  car4.right();
  if(intersects(car1)){
    x= 200;
    y=400;
  }
  if(intersects(car2)){
    x=200;
    y=400;
  }
  if(intersects(car3)){
    x=200;
    y=400;
  }
  if(intersects(car4)){
    x=200;
    y=400;
  }
  
}
class Car{
  int carX;
  int carY;
  int carSpeed;
  int carSize;
  
  Car(int carX, int carY, int carSpeed, int carSize){
    this.carX = carX;
    this.carY = carY;
    this.carSpeed = carSpeed;
    this.carSize = carSize;
}
void display() 
{
      fill(0,255,0);
      rect(carX , carY, carSize, 50);
}
void left(){
  carX-=carSpeed;
  if(carX<=0){
  carX=400;
  }
}
  void right(){
   carX+=carSpeed; 
   if(carX>=400){
    carX=0; 
   }
  }
  int getX(){
    return carX;
  }
  int getY(){
   return carY; 
  }
  int getSize(){
   return carSize; 
  }

}  //end car class
void keyPressed()
{
 if(x>=400){
  x-=20; 
 }
 if(x<=0){
  x+=20; 
 }
 if ( y>=400){
  y-=20; 
 }
 if ( y<=0){
  y+=20; 
 }
      if(key == CODED){
            if(keyCode == UP)
            {y-=20;
                  //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {y+=20;
                  //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {x+=20;
                  //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {x-=20;
                  //Frog X position goes left
            }
      }
}
