package com.program;

public class IntersectionString {
	public static void main(String[] args) {
	String[] str=	new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
		System.out.println(FindIntersection(str));
	}
public static String FindIntersection(String[] strArr){
	String[] arr1 = strArr[0].split(",");
    String[] arr2 = strArr[1].split(",");
    String result = "";
    for(int i=0; i<arr1.length; i++){
      for(int j=0; j<arr2.length; j++){
        if(arr1[i].equals(arr2[j])){
          result = result+","+arr1[i].trim();
          break;
        }
      }
    }

    if(result==""){
      strArr[0] = "false"; 
    } else{
    	result = result.substring(1, result.length());
       strArr[0] = result ;
    }
    return strArr[0];
	}
	

	}

