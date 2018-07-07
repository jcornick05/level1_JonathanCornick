
void setup(){
 size(800,800); 
 
}
 int x = 400;
 int y = 400;
int speed = 8;
int yspeed = 9;
void draw(){
background(255,1,1);
  fill(1,1,255);
  stroke(255,255,255);
  ellipse(x,y,20,20);
x+=speed;
y+=yspeed;
  if(x>=799){
   speed = -speed;
  }
  if(x<=1){
   speed =  -speed;
 }
    
    if(y<=1){
     yspeed=-yspeed; 
    }
    if(y>=799){
     yspeed=-yspeed; 
    }

}