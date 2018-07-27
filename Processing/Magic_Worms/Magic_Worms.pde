void setup(){
  size(500, 500);
  background(255,50,50);
}
int x;
int y;
int a;
void draw(){
  
 x = (int) random(255);
 y = (int) random(255);
 a = (int) random(255);
  fill(x, y , a);
  stroke(0,0,0);
  ellipse(getWormX(10000), getWormY(10000) , 20, 20);
  ellipse(getWormX(800), getWormY(800) , 20, 20);
   ellipse(getWormX(10), getWormY(10) , 20, 20);
   ellipse(getWormX(1000), getWormY(1000) , 20, 20);
   ellipse(getWormX(2), getWormY(2) , 20, 20);
  ellipse(getWormX(1), getWormY(100) , 20, 20);


  makeMagical();
  
  
}
float frequency = .012;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}