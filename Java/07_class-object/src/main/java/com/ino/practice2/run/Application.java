package com.ino.practice2.run;

import com.ino.practice2.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO[] bArr = {new BookDTO("자바의 정석", 20000, 0.2, "윤상섭"), new BookDTO("자바의 활용", 40000, 0.3, "문인호")};
//        BookDTO book1 = new BookDTO("자바의 정석", 20000, 0.2, "윤상섭");
//        BookDTO book2 = new BookDTO("자바의 활용", 40000, 0.3, "문인호");

        System.out.println(bArr[0].getInformation());
        System.out.println(bArr[1].getInformation());

        bArr[0].setPrice(60000);
        System.out.println(bArr[0].getInformation());
        System.out.println(bArr[1].getPrice() - (bArr[1].getPrice() * bArr[1].getDiscountRate()));

    }
}
