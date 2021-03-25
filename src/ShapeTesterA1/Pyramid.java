import java.lang.Math;

public class Pyramid{


// member variables
int l, w, h;
// constructor
public Pyramid(int l, int w, int h){
this.l = l;
this.w = w;
this.h = h;
}
// methods
int calcVol() {
int volume = 0;
volume = (l*w*h / 3);
return volume;
}

double calcSurf() {
double surface = 0;
surface = (l * w) + (l * Math.sqrt(Math.pow(w / 2.0, 2.0) + Math.pow(h, 2.0))) + (w * Math.sqrt(Math.pow(l / 2.0, 2.0) + Math.pow(h, 2.0)));
return surface;
}
}

//((l*w)+l)*(Math.sqrt(Math.pow((w/2), 2)+ (Math.pow(h, 2)+ w) * (Math.sqrt(Math.pow((l/2), 2)+ (Math.pow(h, 2))))));