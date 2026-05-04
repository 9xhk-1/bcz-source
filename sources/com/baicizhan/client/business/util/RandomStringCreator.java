package com.baicizhan.client.business.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RandomStringCreator {
    private RandomStringCreator() {
    }

    public static String bornDomain() {
        return new String[]{"daka", ma.v.f73050u, "dk", "fx", "prize", "card", "kapian", "share", "xueba", "qq"}[(int) (Math.random() * 10)];
    }

    public static String bornNumCharString() {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z'};
        StringBuilder sb2 = new StringBuilder(System.currentTimeMillis() + "");
        for (int i11 = 0; i11 < 10; i11++) {
            sb2.append(cArr[(int) (Math.random() * 62.0d)]);
        }
        return sb2.toString();
    }
}
