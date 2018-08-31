PImage pictureOfRecord; 
void setup() {
  size(600,600);
  pictureOfRecord= loadImage("Recprd.png");
}
void draw(){
  image(pictureOfRecord, 100, 100);
}
