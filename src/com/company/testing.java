class hi{
    int i=10;
    static int j;

}








class testing{
    int i=30;
    static int j=40;
    public  static void main(String[] args){
        hi t=new hi();
        hi h= new hi();
        h.j=10;
        t.j=110;

        System.out.println(h.j);
        
        }

    }
