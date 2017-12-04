int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
       if(headA.data!=headB.data)return 0;
    //int[]al=new int[5];
      int[]arrayA=new int[5];
      int ai=0;
      int bi=0;
      int[]arrayB=new int[5];
      while(headA!=null){
          arrayA[ai++]=headA.data;
          headA=headA.next;
      }
    
     while(headB!=null){
          arrayB[bi++]=headB.data;
         headB=headB.next;
      }
       //System.out.println(Arrays.toString(arrayA));
        //System.out.println(Arrays.toString(arrayB));
     if(Arrays.equals(arrayA,arrayB)){
         return 1;
     }
    else {
        return 0;
    }
}
