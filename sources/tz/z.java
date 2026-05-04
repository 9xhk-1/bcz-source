package tz;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f91427a = new HashMap();

    public z() {
        b();
    }

    @Override // tz.a0
    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) this.f91427a.get(str);
    }

    public final void b() {
        this.f91427a.put("cF", "opof");
        this.f91427a.put("aI", "ihse");
        this.f91427a.put("pbR", "jgkf");
        this.f91427a.put("pbH", "pwcf");
        this.f91427a.put("pbT", "aviw");
        this.f91427a.put("gR", "nosw");
        this.f91427a.put("Pk", "jpaw");
        this.f91427a.put("ul", "qpxs");
        this.f91427a.put("ts", "qmvzs");
        this.f91427a.put("iI", "f3ef");
        this.f91427a.put("mA", "dajg");
        this.f91427a.put("sN", "kfgf");
        this.f91427a.put("andI", "mthe");
        this.f91427a.put("md", "ntrh");
        this.f91427a.put("bI", "regh");
        this.f91427a.put("bd", "krtn");
        this.f91427a.put("buiD", "mrth");
        this.f91427a.put("ver", "kjfe");
        this.f91427a.put("verI", "hwef");
        this.f91427a.put("apV", "fefb");
        this.f91427a.put("im", "xefb");
        this.f91427a.put("oa", "effj");
        this.f91427a.put("ga", "feem");
        this.f91427a.put("loI", "fuqd");
        this.f91427a.put("im2", "bwfx");
        this.f91427a.put("si", "bnwp");
        this.f91427a.put("waU", "wpxk");
        this.f91427a.put("verS", "vsna");
    }

    @Override // tz.a0
    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArr = {-4, 110, 4, -38, -91, 80, -53, 111, ho.c.H, -30, -48, -69, -66, 0, 67, -63, -48, -79, 83, -104, 75, 58, -36, Byte.MAX_VALUE, -37, -82, -69, -22, -10, 70, 19, 83, 112, 43, 124, -73, 85, 79, -123, -87, -19, -26, -66, 101, -42, 64, 112, -60, 67, -25, -14, -63, -53, -62, ho.c.f59560y, -105, Byte.MIN_VALUE, -8, -62, com.baicizhan.main.vld.bonding.j.f25378c, 44, -69, ho.c.f59560y, -23};
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        for (int i11 = 0; i11 < bytes.length; i11++) {
            bytes[i11] = (byte) (bytes[i11] ^ bArr[i11 % 64]);
        }
        return g0.a().c().e(bytes);
    }
}
