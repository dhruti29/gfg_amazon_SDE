class GfG {
    int convertfive(int num) {
        // Your code here
       // String n = String.valueOf(num);
    //    n = n.replaceAll("0","5");
      //  return Integer.parseInt(n);
        int p=5;
        int temp = num;
        while(num!=0){
            int f = num%10;
            if (f==0){
                temp = temp + p;
            
            }
            p=p*10;
            num=num/10;
        }
        return temp;
    }
}
