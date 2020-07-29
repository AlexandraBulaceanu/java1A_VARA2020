public class Punct{
    //TODO: sa faceti clasa punct imutabila -> fara setteri
    int x;
    int y;
    
    //punct este clasa superioara/parinte pentru clasa copil Cerc
    
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
}
//final la clasa-> nu poate fi mostenita