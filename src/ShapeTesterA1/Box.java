public class Box{
// member variables
int l, w, h;
// constructor
public Box(int l, int w, int h){
this.l = l;
this.w = w;
this.h = h;
}
// methods
int calcVol() {
int volume = 0;
volume = l*w*h;
return volume;
}
int calcSurf() {
int surface = 0;
surface = (l*w + h*l + w*h)*2;
return surface;
}
}