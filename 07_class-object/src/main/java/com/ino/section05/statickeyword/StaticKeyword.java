package com.ino.section05.statickeyword;

public class StaticKeyword {
    private int nonStaticCount;

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }

    private static int staticCount;

    public static int getStaticCount() {
        return staticCount;
    }

    public static void setStaticCount(int staticCount) {
        StaticKeyword.staticCount = staticCount;
    }

    public String getInfo() {
        return "nonstatic : " + nonStaticCount + " static: " + staticCount;
    }
}
