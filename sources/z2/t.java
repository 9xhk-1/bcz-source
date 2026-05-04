package z2;

import com.badlogic.gdx.utils.Os;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f100743a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f100744b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f100745c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f100746d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f100747e;

    static {
        f100743a = com.badlogic.gdx.utils.r.f13437b == Os.Android;
        f100744b = com.badlogic.gdx.utils.r.f13437b == Os.MacOsX;
        f100745c = com.badlogic.gdx.utils.r.f13437b == Os.Windows;
        f100746d = com.badlogic.gdx.utils.r.f13437b == Os.Linux;
        f100747e = com.badlogic.gdx.utils.r.f13437b == Os.IOS;
    }

    public static boolean a() {
        return q1.g.f81381d.c(57) || q1.g.f81381d.c(58);
    }

    public static boolean b(int i11) {
        return i11 == 57 || i11 == 58;
    }

    public static boolean c() {
        return f100744b ? q1.g.f81381d.c(63) : q1.g.f81381d.c(129) || q1.g.f81381d.c(130);
    }

    public static boolean d(int i11) {
        return f100744b ? i11 == 63 : i11 == 129 || i11 == 130;
    }

    public static boolean e() {
        return q1.g.f81381d.E(0);
    }

    public static boolean f(int i11) {
        return i11 == 0;
    }

    public static boolean g() {
        return q1.g.f81381d.E(2);
    }

    public static boolean h(int i11) {
        return i11 == 2;
    }

    public static boolean i() {
        return q1.g.f81381d.E(1);
    }

    public static boolean j(int i11) {
        return i11 == 1;
    }

    public static boolean k() {
        return q1.g.f81381d.c(59) || q1.g.f81381d.c(60);
    }

    public static boolean l(int i11) {
        return i11 == 59 || i11 == 60;
    }
}
