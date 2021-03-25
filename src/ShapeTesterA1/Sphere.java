public class Sphere{
// member variables
int r;
// constructor
public Sphere(int r){
this.r = r;
}
// methods
//System.out.println("this is radius for sphere" + r);
double calcVol() {
double volume = 0;
volume = (4.0/3) * Math.PI * (Math.pow(r, 3));
return volume;
}
double calcSurf() {
double surface = 0;
surface = 4.0 * Math.PI * (Math.pow(r, 2));
return surface;
}
}