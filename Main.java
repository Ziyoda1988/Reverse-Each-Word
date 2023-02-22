class Main {
  public static void main(String[] args) {
        //Run Unit Tests to check your method correctness
        System.out.println(reverseEachWord("Hi how are you"));// -> iH woh era uoy
        System.out.println(reverseEachWord("Java is fun"));// -> avaJ si nuf
        System.out.println(reverseEachWord("Javaisfun"));// -> nufsiavaJ
        System.out.println(reverseEachWord("Java"));// -> avaJ
        System.out.println(reverseEachWord("There are two ways to write error-free programs; only the third one works"));// -> erehT era owt syaw ot etirw eerf-rorre ;smargorp ylno eht driht eno skrow
        System.out.println(reverseEachWord("Don’t worry if it doesn’t work right. If everything did, you’d be out of a job"));// -> t’noD yrrow fi ti t’nseod krow .thgir fI gnihtyreve ,did d’uoy eb tuo fo a boj
        System.out.println(reverseEachWord("Sometimes it's better to leave something alone, to pause, and that's very true of programming"));// -> semitemoS s'ti retteb ot evael gnihtemos ,enola ot ,esuap dna s'taht yrev eurt fo gnimmargorp
        System.out.println(reverseEachWord("Good code is short, simple, and symmetrical - the challenge is figuring out how to get there"));// -> dooG edoc si ,trohs ,elpmis dna lacirtemmys - eht egnellahc si gnirugif tuo woh ot teg ereht
          
    //My output without first letters
    }
    public static String reverseEachWord(String str) {

        String[] words = str.split("  ");
        String revString ="";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWords = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                revString = revString + word.charAt(j);
            }
                revString = revString + revWords + "";
            }
         return revString.substring(0,revString.length()-1);
    }}  
