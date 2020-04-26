package codingbat.strings;

public class WithoutString {



//
//    Given two strings, base and remove, return a version of the base string where all instances of
//    the remove string have been removed (not case sensitive). You may assume that the remove string is length 1
//    or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//
//
//    withoutString("Hello there", "llo") → "He there"
//    withoutString("Hello there", "e") → "Hllo thr"
//    withoutString("Hello there", "x") → "Hello there"



    public String withoutString(String base, String remove) {




        boolean check = false;
        String newStr ="";
        if (remove.length()==1) {
            for (int i = 0; i < base.length(); i++) {    //llo
                if (String.valueOf(base.charAt(i)).equalsIgnoreCase(remove)){
                    base= base.replace(base.charAt(i)+"","");
                }
            }


        }else {

            if (base.contains(remove)){
                base= base.replace(remove,"");
            }else {

                for (int i = 0; i < remove.length(); i++) {

                    for (int j = 0; j < base.length(); j++) {

                        if (String.valueOf(base.charAt(j)).equalsIgnoreCase(remove.charAt(i) + "")) {
                            base = base.replace(base.charAt(j) + "", "");
                        }


                    }

                }
            }



        }
        return base;

    }




}
