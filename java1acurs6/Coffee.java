public enum Coffee{
    SMALL, MEDIUM(100), BIG;
    
    private int qty;
    Coffee(){}
    Coffee(int qty){
        this.qty = qty;
    }
    
    public void afisareQty(){
        System.out.println(qty);
    }
}