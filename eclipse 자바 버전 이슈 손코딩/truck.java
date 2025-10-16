pakage sec01.exam01;
public calss Truck extedns Car{
int speed;
int load;

Truck(int speed, int load){
super(speed);
//this.speed = speed;
this.load = load;
}
void ShowSpeed(int speed){
sysout("truck speed:" +speed;);
}
void ShowLoad(){sysout("Load: "+load;);
}