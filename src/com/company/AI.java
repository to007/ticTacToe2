package com.company;


public class AI {
    public static boolean winningMove(String [][] x, String y){
            if(x[0][0].equals(x[1][0]) && x[0][0].equals(y) && x[2][0].equals(" ")){
                x[2][0] = y;
                return true;
            }else if(x[0][0].equals(x[2][0]) && x[0][0].equals(y) && x[1][0].equals(" ")){
                x[1][0] = y;
                return true;
            }else if(x[1][0].equals(x[2][0]) && x[1][0].equals(y) && x[0][0].equals(" ")){
                x[0][0] = y;
                return true;
            }else if(x[0][1].equals(x[1][1]) && x[0][1].equals(y) && x[2][1].equals(" ")){
                x[2][1] = y;
                return true;
            }else if(x[0][1].equals(x[2][1]) && x[0][1].equals(y) && x[1][1].equals(" ")){
                x[1][1] = y;
                return true;
            }else if(x[2][1].equals(x[1][1]) && x[2][1].equals(y) && x[0][1].equals(" ")){
                x[0][1] = y;
                return true;
            }else if(x[0][2].equals(x[1][2]) && x[0][2].equals(y) && x[2][2].equals(" ")){
                x[2][2] = y;
                return true;
            }else if(x[0][2].equals(x[2][2]) && x[0][2].equals(y) && x[1][2].equals(" ")){
                x[1][2] = y;
                return true;
            }else if(x[1][2].equals(x[2][2]) && x[1][2].equals(y) && x[0][2].equals(" ")){
                x[0][2] = y;
                return true;
            }else if(x[0][0].equals(x[0][1]) && x[0][0].equals(y) && x[0][2].equals(" ")){
                x[0][2] = y;
                return true;
            }else if(x[0][0].equals(x[0][2]) && x[0][0].equals(y) && x[0][1].equals(" ")){
                x[0][1] = y;
                return true;
            }else if(x[0][2].equals(x[0][1]) && x[0][1].equals(y) && x[0][0].equals(" ")){
                x[0][0] = y;
                return true;
            }else if(x[1][0].equals(x[1][1]) && x[1][0].equals(y) && x[1][2].equals(" ")){
                x[1][2] = y;
                return true;
            }else if(x[1][0].equals(x[1][2]) && x[1][0].equals(y) && x[1][1].equals(" ")){
                x[1][1] = y;
                return true;
            }else if(x[1][1].equals(x[1][2]) && x[1][1].equals(y) && x[1][0].equals(" ")){
                x[1][0] = y;
                return true;
            }else if(x[2][0].equals(x[2][1]) && x[2][0].equals(y) && x[2][2].equals(" ")){
                x[2][2] = y;
                return true;
            }else if(x[2][0].equals(x[2][2]) && x[2][0].equals(y) && x[2][1].equals(" ")){
                x[2][1] = y;
                return true;
            }else if(x[2][1].equals(x[2][2]) && x[2][1].equals(y) && x[2][0].equals(" ")){
                x[2][0] = y;
                return true;
            }else if(x[0][0].equals(x[1][1]) && x[0][0].equals(y) && x[2][2].equals(" ")){
                x[2][2] = y;
                return true;
            }else if(x[0][0].equals(x[2][2]) && x[0][0].equals(y) && x[1][1].equals(" ")){
                x[1][1] = y;
                return true;
            }else if(x[1][1].equals(x[2][2]) && x[1][1].equals(y) && x[0][0].equals(" ")){
                x[0][0] = y;
                return true;
            }else if(x[0][2].equals(x[1][1]) && x[0][2].equals(y) && x[2][0].equals(" ")){
                x[2][0] = y;
                return true;
            }else if(x[0][2].equals(x[2][0]) && x[0][2].equals(y) && x[1][1].equals(" ")){
                x[1][1] = y;
                return true;
            }else if(x[1][1].equals(x[2][0]) && x[1][1].equals(y) && x[0][2].equals(" ")){
                x[0][2] = y;
                return true;
            }else
                return false;
    }public static boolean blockWin(String [][] x, String y, String z) {
        if (x[0][0].equals(x[1][0]) && x[0][0].equals(z) && x[2][0].equals(" ")) {
            x[2][0] = y;
            return true;
        } else if (x[0][0].equals(x[2][0]) && x[0][0].equals(z) && x[1][0].equals(" ")) {
            x[1][0] = y;
            return true;
        } else if (x[1][0].equals(x[2][0]) && x[1][0].equals(z) && x[0][0].equals(" ")) {
            x[0][0] = y;
            return true;
        } else if (x[0][1].equals(x[1][1]) && x[0][1].equals(z) && x[2][1].equals(" ")) {
            x[2][1] = y;
            return true;
        } else if (x[0][1].equals(x[2][1]) && x[0][1].equals(z) && x[1][1].equals(" ")) {
            x[1][1] = y;
            return true;
        } else if (x[2][1].equals(x[1][1]) && x[2][1].equals(z) && x[0][1].equals(" ")) {
            x[0][1] = y;
            return true;
        } else if (x[0][2].equals(x[1][2]) && x[0][2].equals(z) && x[2][2].equals(" ")) {
            x[2][2] = y;
            return true;
        } else if (x[0][2].equals(x[2][2]) && x[0][2].equals(z) && x[1][2].equals(" ")) {
            x[1][2] = y;
            return true;
        } else if (x[1][2].equals(x[2][2]) && x[1][2].equals(z) && x[0][2].equals(" ")) {
            x[0][2] = y;
            return true;
        } else if (x[0][0].equals(x[0][1]) && x[0][0].equals(z) && x[0][2].equals(" ")) {
            x[0][2] = y;
            return true;
        } else if (x[0][0].equals(x[0][2]) && x[0][0].equals(z) && x[0][1].equals(" ")) {
            x[0][1] = y;
            return true;
        } else if (x[0][2].equals(x[0][1]) && x[0][1].equals(z) && x[0][0].equals(" ")) {
            x[0][0] = y;
            return true;
        } else if (x[1][0].equals(x[1][1]) && x[1][0].equals(z) && x[1][2].equals(" ")) {
            x[1][2] = y;
            return true;
        } else if (x[1][0].equals(x[1][2]) && x[1][0].equals(z) && x[1][1].equals(" ")) {
            x[1][1] = y;
            return true;
        } else if (x[1][1].equals(x[1][2]) && x[1][1].equals(z) && x[1][0].equals(" ")) {
            x[1][0] = y;
            return true;
        } else if (x[2][0].equals(x[2][1]) && x[2][0].equals(z) && x[2][2].equals(" ")) {
            x[2][2] = y;
            return true;
        } else if (x[2][0].equals(x[2][2]) && x[2][0].equals(z) && x[2][1].equals(" ")) {
            x[2][1] = y;
            return true;
        } else if (x[2][1].equals(x[2][2]) && x[2][1].equals(z) && x[2][0].equals(" ")) {
            x[2][0] = y;
            return true;
        } else if (x[0][0].equals(x[1][1]) && x[0][0].equals(z) && x[2][2].equals(" ")) {
            x[2][2] = y;
            return true;
        } else if (x[0][0].equals(x[2][2]) && x[0][0].equals(z) && x[1][1].equals(" ")) {
            x[1][1] = y;
            return true;
        } else if (x[1][1].equals(x[2][2]) && x[1][1].equals(z) && x[0][0].equals(" ")) {
            x[0][0] = y;
            return true;
        } else if (x[0][2].equals(x[1][1]) && x[0][2].equals(z) && x[2][0].equals(" ")) {
            x[2][0] = y;
            return true;
        } else if (x[0][2].equals(x[2][0]) && x[0][2].equals(z) && x[1][1].equals(" ")) {
            x[1][1] = y;
            return true;
        } else if (x[1][1].equals(x[2][0]) && x[1][1].equals(z) && x[0][2].equals(" ")) {
            x[0][2] = y;
            return true;
        } else
            return false;
    }
    public static boolean center(String [][] x, String y){
        if(x[1][1].equals(" ")){
            x[1][1] = y;
            return true;
        }else
            return false;
    }
    public static boolean oppoCorner(String [][] x, String y,String z){
        if(x[0][0].equals(z) && x[2][2].equals(" ")){
            x[2][2] = y;
            return true;
        }else if(x[2][2].equals(z) && x[0][0].equals(" ")){
            x[0][0] = y;
            return true;
        }else if(x[0][2].equals(z) && x[2][0].equals(" ")){
            x[2][0] = y;
            return true;
        }else if(x[2][0].equals(z) && x[0][2].equals(" ")){
            x[0][2] = y;
            return true;
        }else
            return false;
    }
    public static boolean empCorner(String [][] x, String y){
        if(x[0][0].equals(" ")){
            x[0][0] = y;
            return true;
        }else if(x[0][2].equals(" ")){
            x[0][2] = y;
            return true;
        }else if(x[2][2].equals(" ")){
            x[2][2] = y;
            return true;
        }else if(x[2][0].equals(" ")){
            x[2][0] = y;
            return true;
        }else
            return false;
    }
    public static boolean empSide(String [][] x, String y){
        if(x[0][1].equals(" ")){
            x[0][1] = y;
            return true;
        }else if(x[1][0].equals(" ")){
            x[1][0] = y;
            return true;
        }else if(x[1][2].equals(" ")){
            x[1][2] = y;
            return true;
        }else if(x[2][1].equals(" ")){
            x[2][1] = y;
            return true;
        }else
            return false;
    }
}
