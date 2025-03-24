package com.ino.practice8.mvc.view;

import com.ino.practice8.mvc.controller.MemberController;
import com.ino.practice8.mvc.dto.Member;

import java.util.Scanner;

public class MemberMenu {
    MemberController mc = new MemberController();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while(true) {
            System.out.println("====== 회원 관리 메뉴 ======\n" +
                    "1. 신규 회원 등록\n2. 회원 정보 검색\n3. 회원 정보 수정\n + " +
                    "4. 회원 정보 삭제\n5. 회원 정보 출력\n0. 프로그램 종료");
            int num = sc.nextInt();
            switch (num) {
                case 0: break;
                case 1: insertMember(); break;
                case 2: searchMember(); break;
                case 3: updateMember(); break;
                case 4: deleteMember(); break;
                case 5: printAllMember(); break;
            }
        }
    }
    public void insertMember() {
        if (mc.getMemberCount() >= 10) {
            return;
        }

        System.out.println("input id : ");
        String id = sc.nextLine();
        if (mc.checkId(id) != null) {
            System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
        }
        else {
            System.out.print("Enter User ID: ");
            String userId = sc.nextLine();
            System.out.print("Enter User Password: ");
            String userPwd = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Gender (M/F): ");
            char gender = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            Member m = new Member(userId, userPwd, name, age, gender, email);

            mc.insertMember(m);
            System.out.println("성공적으로 회원 등록이 되었습니다.");
        }
    }
    public void searchMember() {
        while(true) {
            System.out.println("====== 회원 정보 검색 ======\n1. 아이디로 검색하기\n2. 이름으로 검색하기\n3. 이메일로 검색하기\n" +
                    "0.  이전 메뉴로");
            System.out.print(" 메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.print("검색 내용 : ");
            String target = sc.nextLine();
            Member m = mc.searchMember(menu, target);
            if (m != null) {
                m.getInfo();
            }
            else {
                System.out.println("검색된 결과가 없습니다.");
            }
        }
    }
    public void updateMember() {
        System.out.println("====== 회원 정보 수정 ======\n1. 비밀번호 수정\n2. 이름 수정\n3. 이메일 수정\n0.  이전 메뉴로");
        System.out.print(" 메뉴 선택 : ");
        int menu = sc.nextInt();
        sc.nextLine();
        System.out.print("변경할 회원 아이디 : ");
        String target = sc.nextLine();

        Member m = mc.checkId(target);

        if (m == null) {
            System.out.println("변경할 회원이 존재하지 않습니다");
        }
        else {
            System.out.print("변경내용 : ");
            String update = sc.nextLine();
            mc.updateMember(m, menu, update);
            System.out.println("회원의 정보가 변경되었습니다.");
        }
    }
    public void deleteMember() {
        System.out.print("삭제할 회원 아이디 : ");
        String userId = sc.nextLine();
        Member m = mc.checkId(userId);
        if ( m == null) {
            System.out.println("삭제할 회원이 존재하지 않습니다.");
        }
        else {
            System.out.print("정말 삭제하시겠습니까? (y/n) : ");
            char c =  sc.nextLine().charAt(0);
            char upperCase = Character.toUpperCase(c);
            if (upperCase == 'Y') {
                mc.deleteMember(userId);
                System.out.println("회원의 정보가 삭제되었습니다.");
            }
        }
    }
    public void printAllMember() {
        Member[] mem = mc.getMem();
        for (int i = 0; i < mem.length; i++) {
            System.out.println(mem[i].getInfo());
        }
    }
}
