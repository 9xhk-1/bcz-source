package gb;

import i9.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53548a = "key_fm_down_high";

    /* renamed from: b, reason: collision with root package name */
    public static final String f53549b = "key_fm_loop_num";

    /* renamed from: c, reason: collision with root package name */
    public static final String f53550c = "key_fm_plus_num";

    /* renamed from: d, reason: collision with root package name */
    public static final int f53551d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f53552e = 50;

    /* renamed from: f, reason: collision with root package name */
    public static final int f53553f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f53554g = 200;

    /* renamed from: h, reason: collision with root package name */
    public static final int f53555h = 10;

    public static int a() {
        int d11 = j.d(f53549b);
        if (d11 == 0) {
            return 1;
        }
        return d11;
    }

    public static int b() {
        int d11 = j.d(f53550c);
        if (d11 == 0) {
            return 50;
        }
        return d11;
    }

    public static boolean c() {
        return j.b(f53548a);
    }

    public static void d(boolean high) {
        j.n(f53548a, high);
    }

    public static void e(int num) {
        j.k(f53549b, num);
    }

    public static void f(int num) {
        j.k(f53550c, num);
    }
}
