void setup(){
 size (600, 600);
 
}

int x = 300;
int y = 10;
int randomNumber = (int) random(width);
int score = 0;
void draw(){
  background(134,200,100);
  fill(1,1,255);
  stroke(255,255,255);
  ellipse(x, y, 15, 20);
  rect(mouseX - 30, 550, 60, 50);
  y+=10;
 
   
  if (x>=mouseX && x<= mouseX+50 && y>=550){
    score++;
   println("Your Score is "+score);
   y=10;
    randomNumber = (int) random(width);
  x=randomNumber;
  } else if (score>0 && y>=600){
    score--;
    println("your score is " + score);
    y=10;
    randomNumber = (int) random(width);
  x=randomNumber;
  }
 
  fill(0,0,0);
  textSize(18);
  text("Score: " + score, 20 , 20);
  
  
}