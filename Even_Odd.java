public class Even_Odd {
void even_Odd(){ //Method
    int num=7;
    if(num%2==0){
        System.out.println("EvenNumber");
    }
    else{
        System.out.println("Odd Number");
    }
}    
public static void main(String[] args) {
    Even_Odd n = new Even_Odd();  
    n.even_Odd();
}
}
