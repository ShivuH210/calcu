class calculator extends extracal{
    public int addition(int a,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        calculator o=new calculator();
        System.out.println(o.addition(0, 0));
        System.out.println(o.sub(10, 5));
        
    }
    
}