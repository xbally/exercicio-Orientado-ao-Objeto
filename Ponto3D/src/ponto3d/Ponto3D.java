package ponto3d;
public class Ponto3D {
         private double x;
         private double y;
         private double z;
            public Ponto3D(double x, double y, double z){
                this.x=x;
                this.y=y;
                this.x=z;        
            }
       
        public double getx(){
            return x;
        }
         public double gety(){
            return y;
        }
        public double getz(){
            return z;
        }
        public void setx(double x){
            this.x =x;
        }
        public void sety(double y){
            this.y=y;
        }
        
        public Ponto3D(){
            x=0; y=0; z=0;
        }
   
        public double distancia(double px, double py, double pz){
        return distancia(new Ponto3D(px,py,pz));
        } 
        public
        double distancia (Ponto3D p){
        return Math.sqrt(Math.pow(this.getx() - p.getx(), 2) + Math.pow(this.gety() - p.gety(), 2) + Math.pow(this.getz() - p.getz(), 2));
    }

}  