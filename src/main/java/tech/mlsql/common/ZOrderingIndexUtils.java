package tech.mlsql.common;

/**
 * 26/11/2019 WilliamZhu(allwefantasy@gmail.com)
 */
public class ZOrderingIndexUtils {

//    private static int splitBy3(int a) {
//        int x = a & 0x1fffff;  //we only look at the first 21 bits
//        x = (x | x << 32) & 0x1f00000000ffff; // shift left 32 bits, OR with self, and 00011111000000000000000000000000000000001111111111111111
//        x = (x | x << 16) & 0x1f0000ff0000ff; // shift left 32 bits, OR with self, and 00011111000000000000000011111111000000000000000011111111
//        x = (x | x << 8) & 0x100f00f00f00f00f; // shift left 32 bits, OR with self, and 0001000000001111000000001111000000001111000000001111000000000000
//        x = (x | x << 4) & 0x10c30c30c30c30c3; // shift left 32 bits, OR with self, and 0001000011000011000011000011000011000011000011000011000100000000
//        x = (x | x << 2) & 0x1249249249249249;
//        return x;
//    }
//
//    public static void encode2Address(int a,int b){
//
//    }
}
