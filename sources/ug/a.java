package ug;

import kotlin.jvm.internal.v;
import m80.k;
import pn.j;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C1239a f92192b = new C1239a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f92193c = d(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f92194d = d(-1);

    /* renamed from: a, reason: collision with root package name */
    public final int f92195a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ug.a$a, reason: collision with other inner class name */
    public static final class C1239a {
        public /* synthetic */ C1239a(v vVar) {
            this();
        }

        public final int a() {
            return a.f92193c;
        }

        public final int b() {
            return a.f92194d;
        }

        public C1239a() {
        }
    }

    public /* synthetic */ a(int i11) {
        this.f92195a = i11;
    }

    public static final /* synthetic */ a c(int i11) {
        return new a(i11);
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof a) && i11 == ((a) obj).j();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return "Buildable(v=" + i11 + j.f81007d;
    }

    public boolean equals(Object obj) {
        return e(this.f92195a, obj);
    }

    public final int g() {
        return this.f92195a;
    }

    public int hashCode() {
        return h(this.f92195a);
    }

    public final /* synthetic */ int j() {
        return this.f92195a;
    }

    public String toString() {
        return i(this.f92195a);
    }

    public static int d(int i11) {
        return i11;
    }
}
