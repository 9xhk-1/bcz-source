package com.bun.miitmdid;

import android.content.Context;
import com.bun.miitmdid.interfaces.IIdProvider;

/* loaded from: classes6.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static p f28968a = new p();

    /* renamed from: b, reason: collision with root package name */
    public IIdProvider f28969b;

    /* renamed from: c, reason: collision with root package name */
    public c f28970c;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28971a;

        static {
            int[] iArr = new int[c.values().length];
            f28971a = iArr;
            try {
                iArr[c.ASUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28971a[c.FREEMEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28971a[c.HUAWEI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28971a[c.HONOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28971a[c.LENOVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28971a[c.MOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28971a[c.MEIZU.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28971a[c.CHUANGLIAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28971a[c.CHINATELECOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28971a[c.NUBIA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28971a[c.OPPO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28971a[c.ONEPLUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28971a[c.REALME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28971a[c.SAMSUNG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28971a[c.VIVO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28971a[c.XIAOMI.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28971a[c.BLACKSHARK.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28971a[c.ZTE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f28971a[c.PRIZE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28971a[c.COOLPAD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28971a[c.EEBBK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f28971a[c.OS360.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static native p a();

    public static native boolean d();

    public native c a(Context context);

    public native IIdProvider a(Context context, c cVar);

    public native boolean a(c cVar);

    public native IIdProvider b(Context context);

    public final native boolean b();

    public native boolean c();
}
