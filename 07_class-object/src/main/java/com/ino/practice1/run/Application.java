package com.ino.practice1.run;

import com.ino.practice1.dto.ProductDTO;

public class Application {
    public static void main(String[] args) {
        ProductDTO[] prodArr = {
                new ProductDTO("ssgnote9" , "갤럭시노트9" ,"경기도 수원" ,960000,10.0),
                new ProductDTO("lgxnote5","LG스마트폰5", "경기도 평택",780000,0.7),
                new ProductDTO("ktsnote3","KT스마트폰3", "서울시 강남", 250000,0.3) };
        System.out.println(prodArr[0].getInformation());
        System.out.println(prodArr[0].getPrice() * (100 + prodArr[0].getTax()) / 100);
    }
}
