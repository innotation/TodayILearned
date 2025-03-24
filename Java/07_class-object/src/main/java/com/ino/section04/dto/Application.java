package com.ino.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO("user01", "1234");
        CosmeticDTO cosmetic1 = new CosmeticDTO();
        cosmetic1.setBrand("아벤느");
        cosmetic1.setName("젠틀토닝로션");
        cosmetic1.setPrice(23000);
        cosmetic1.setCategory("스킨케어");
        cosmetic1.setDC(false);

        CosmeticDTO cosmetic2 = new CosmeticDTO("펜라이너", 15000, "클리오", "아이메이크업", true);
        BreadDTO br1 = new BreadDTO();
        br1.setName("saltbread");
        br1.setPrice(2000);
        BakeryDTO bk1 = new BakeryDTO();
//        bk1.setBread(br1);
        bk1.setAddress("seoul");
        bk1.setName("ino");
        System.out.println(br1.getInfo());
        System.out.println(bk1.getInfo());

        BakeryDTO bk2 = new BakeryDTO();
        bk2.setBread(br1);
        bk2.setAddress("seoul");
        bk2.setName("ino");
        System.out.println(bk2.getInfo());

        BreadDTO br2 = new BreadDTO();
        br2.setPrice(2500);
        br2.setName("튀김소보로");
        BakeryDTO bk3 = new BakeryDTO();
        bk3.setBread(br2);
        bk3.setAddress("대전");
        bk3.setName("성심당");

    }
}
