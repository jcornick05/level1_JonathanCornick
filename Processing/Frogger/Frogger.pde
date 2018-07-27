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
}
void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
                  //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                  //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                  //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                  //Frog X position goes left
            }
      }
}