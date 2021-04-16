class dentaku3{
  public static void main(String args[]){
    int val1 = 0; // 最初の数字
    int val2 = 0; // 次の数字
    String ope;   // 演算子
    int argnum = 3;

    String msg1 = "Usage : java dentaku 数値 演算子 数値";
    String msg2 = "   ※演算子は kake waru tasu hiku のいずれかです。";

    if(args.length != argnum){
       System.out.println( msg1 );
       System.out.println( msg2 );
       System.exit(0);
    }

    try{
       val1 = Integer.parseInt(args[0]);
       val2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
       System.out.println( msg1 );
       System.out.println( "数値でない値が入力されています。" );
       System.exit(0);
    }

    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;

    ope = args[1];

    for(int i = 0; i < 4; i++){
      if(ope.equals(opeStr[i])){
         errFlag = false;
      }
    }

    if(errFlag == true){
       System.out.println( msg1 );
       System.out.println( msg2 + ".." );
       System.exit(0);
    }
     
    System.out.println("入力された式は、" + val1 + " " + ope + " " + val2 + " でした。演算します.... \n\n");

    switch(ope){
    case "kake":
      System.out.println( val1 * val2 );
      break;
    case "hiku":
      System.out.println( val1 - val2 );
      break;
    case "waru":
      if(val2 == 0){
         System.out.println("割り算は 0では割れません。常識です！！");
         break;
      }
      System.out.println( val1 / val2 );
      break;
    default:
      System.out.println("tasu か waru は工事中です。");
    }


  }
}