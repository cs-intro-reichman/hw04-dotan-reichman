public class Primes {
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        int count=0;
        boolean[] isPrime=new boolean[N];
        System.out.println("Prime numbers up to "+N+":");
        for(int i=2;i< N;i++){
            for(int j=2;j<N;j++){
                if(i%j==0 && i!=j){
                    isPrime[i]=false;
                    break;
                }
                else{
                    isPrime[i]=true;
                }
            }
            if(isPrime[i]){
                System.out.println(i);
                count++;
            }
        }
        int perce= (count*100)/N;
        System.out.println("There are "+ count +" primes between 2 and "+N+" ("+perce+"% are primes)");
    }
}