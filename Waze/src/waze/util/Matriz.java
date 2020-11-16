/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waze.util;

/**
 *
 * @author Jeffry
 */
public class Matriz {
    private final int noCamino = 9999999;
    private int[][] m;
    
    public Matriz(){
        m = new int[91][91];
        inicializar();
    }
    
    public int getPeso(int a, int b){
        if(m[a][b] != noCamino){
            return m[a][b];
        }else{
            System.out.println("Estos vertices no estan conectados");
            return 0;
        }
            
    }
    
    public void setPeso(int a, int b, int valor){
        m[a][b] = valor;
    }
    
    public void inicializar(){
        for(int i=0; i<91; i++){
            for(int j=0; j<91; j++){
                m[i][j] = noCamino;
            }
        }
        m[0][2] = 2; m[0][3] = 2; m[1][2] = 1; m[1][11] = 6; m[2][0] = 2; m[2][1] = 1; m[3][0] = 2; m[3][4] = 3; m[3][6] = 4; m[4][3] = 3; 
        m[4][5] = 2; m[5][4] = 2; m[5][6] = 4; m[5][7] = 2; m[6][3] = 4; m[6][5] = 4; m[6][10] = 3; m[7][5] = 2; m[7][8] = 2; m[7][9] = 2;
        m[8][7] = 2; m[8][32] = 5; m[9][7] = 2; m[9][10] = 3; m[9][31] = 4; m[10][6] = 3; m[10][9] = 3; m[10][12] = 3; m[10][11] = 3; m[11][1] = 6;
        m[11][13] = 4; m[11][10] = 3; m[12][10] = 3; m[12][29] = 3; m[13][11] = 3; m[13][29] = 4; m[13][14] = 4; m[14][13] = 4; m[14][16] = 1;
        m[14][15] = 3; m[15][14] = 3; m[15][23] = 2; m[15][37] = 6; m[16][29] = 4; m[16][14] = 1; m[16][17] = 1; m[17][16] = 1; m[17][18] = 1; 
        m[18][17] = 1; m[18][19] = 1; m[18][20] = 1; m[18][28] = 3; m[19][18] = 1; m[19][22] = 1; m[19][21] = 1; m[20][18] = 1; m[20][21] = 1;
        m[20][23] = 1; m[21][19] = 1; m[21][20] = 1; m[22][19] = 1; m[22][27] = 3; m[22][25] = 3; m[22][24] = 3; m[23][15] = 2; m[23][20] = 1;
        m[23][24] = 3; m[24][23] = 3; m[24][22] = 3; m[24][41] = 3; m[24][36] = 3; m[25][26] = 1; m[25][22] = 3; m[25][41] = 3; m[26][25] = 1;
        m[26][42] = 1; m[26][51] = 3; m[26][25] = 1; m[27][35] = 2; m[27][28] = 3; m[27][22] = 3; m[27][42] = 3; m[28][29] = 3; m[28][18] = 3; 
        m[28][27] = 3; m[28][30] = 2; m[29][12] = 3; m[29][13] = 4; m[29][16] = 4; m[29][28] = 3; m[30][31] = 2; m[30][35] = 3; m[30][28] = 2;
        m[31][9] = 4; m[31][30] = 2; m[31][34] = 3; m[32][8] = 5; m[32][33] = 3; m[32][45] = 2; m[33][32] = 3; m[33][34] = 3; m[33][44] = 2;
        m[34][31] = 3; m[34][35] = 1; m[34][43] = 3; m[34][33] = 3; m[35][34] = 1; m[35][30] = 3; m[35][27] = 2; m[36][24] = 3; m[36][37] = 3; 
        m[36][40] = 3; m[37][15] = 6; m[37][36] = 3; m[37][38] = 1; m[38][37] = 1; m[38][39] = 2; m[39][38] = 2; m[39][40] = 3; m[39][55] = 3;
        m[40][36] = 3; m[40][39] = 3; m[40][54] = 3; m[40][41] = 3; m[41][24] = 3; m[41][40] = 3; m[41][53] = 3; m[41][25] = 3; m[42][27] = 3; 
        m[42][26] = 1; m[42][50] = m[42][43] = 3; m[43][34] = 3; m[43][42] = 3; m[43][49] = 3; m[43][44] = 3; m[44][33] = 2; m[44][43] = 3;
        m[44][47] = 3; m[44][45] = 3; m[45][32] = 2; m[45][44] = 3; m[45][46] = 3; m[46][45] = 3; m[46][47] = 4; m[46][64] = 3; m[47][46] = 4;
        m[47][44] = 3; m[47][48] = 1; m[48][47] = 1; m[48][49] = 2; m[48][62] = 4; m[49][43] = 3; m[49][50] = 3; m[49][61] = 4; m[49][48] = 2;
        m[50][42] = 3; m[50][51] = 1; m[50][60] = 4; m[50][49] = 3; m[51][50] = 1; m[51][26] = 3; m[51][52] = 1; m[52][51] = 1; m[52][59] = 4;
        m[52][53] = 4; m[52][59] = 4; m[53][41] = 3; m[53][54] = 3; m[53][58] = 3; m[53][52] = 4; m[54][40] = 3; m[54][55] = 3; m[54][57] = 3;
        m[54][53] = 3; m[55][39] = 3; m[55][56] = 3; m[55][54] = 3; m[56][55] = 3; m[56][74] = 4; m[57][54] = 3; m[57][58] = 3; m[57][76] = 3;
        m[58][53] = 3; m[58][57] = 3; m[58][77] = 3; m[58][59] = 4; m[59][52] = 4; m[59][58] = 4; m[59][72] = 1; m[60][50] = 4; m[60][81] = 3; 
        m[60][61] = 3; m[61][49] = 4; m[61][60] = 3; m[61][70] = 2; m[61][62] = 2; m[62][48] = 4; m[62][61] = 2; m[62][68] = 4; m[62][63] = 3; 
        m[63][64] = 3; m[63][62] = 3; m[63][67] = 2; m[64][46] = 3; m[64][65] = 3; m[64][63] = 3; m[65][64] = 3; m[65][66] = 2; m[65][90] = 5;
        m[66][65] = 2; m[67][63] = 2; m[68][62] = 4; m[69][70] = 1; m[70][69] = 1; m[70][61] = 2; m[70][84] = 3; m[71][72] = 1; m[71][80] = 1; 
        m[72][71] = 1; m[72][79] = 1; m[73][78] = 1; m[74][56] = 4; m[74][75] = 3; m[74][86] = 5; m[75][76] = 1; m[75][74] = 3; m[75][87] = 5; 
        m[76][77] = 2; m[76][57] = 3; m[76][75] = 1; m[77][58] = 3; m[77][76] = 2; m[77][88] = 6; m[77][78] = 1; m[78][73] = 1; m[78][77] = 1; 
        m[78][79] = 2; m[79][78] = 2; m[79][85] = 3; m[79][80] = 1; m[79][72] = 1; m[80][81] = 1; m[80][71] = 1; m[80][79] = 1; m[81][60] = 3; 
        m[81][80] = 1; m[81][82] = 2; m[82][81] = 2; m[83][84] = 6; m[84][83] = 6; m[84][70] = 3; m[84][85] = 6; m[85][79] = 3; m[85][84] = 6; 
        m[85][89] = 3; m[86][74] = 5; m[86][87] = 1; m[87][88] = 4; m[87][75] = 5; m[88][89] = 3; m[88][77] = 6; m[88][87] = 4; m[89][90] = 10; 
        m[89][85] = 3; m[89][88] = 3; m[90][65] = 5; m[90][89] = 10;
    }
    
    public int[][] getMatriz(){
        return m;
    }
    public int getNoCamino(){
        return noCamino;
    }
    
}
