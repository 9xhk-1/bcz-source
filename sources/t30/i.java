package t30;

import kotlin.KotlinNothingValueException;
import t30.i;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface i {
    void a(@m80.l String str, boolean z11);

    void b(@m80.l String str, @m80.l Object obj, @m80.l Object obj2);

    void c(@m80.l String str, @m80.l Object obj);

    @y0(version = "1.4")
    @m80.k
    Void d(@m80.l String str, @m80.l Throwable th2);

    void e(@m80.l String str, @m80.l Object obj);

    @m80.k
    Void f(@m80.l String str);

    void g(@m80.l String str, @m80.l Object obj, @m80.l Object obj2);

    void h(@m80.l String str, @m80.l Object obj, @m80.l Object obj2);

    void i(@m80.k x00.a<String> aVar, boolean z11);

    void j(@m80.l String str, @m80.l Object obj, @m80.l Object obj2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static void h(@m80.k i iVar, @m80.l final String str, @m80.l final Object obj, @m80.l final Object obj2) {
            iVar.i(new x00.a() { // from class: t30.d
                @Override // x00.a
                public final Object invoke() {
                    String i11;
                    i11 = i.a.i(str, obj, obj2);
                    return i11;
                }
            }, kotlin.jvm.internal.g0.g(obj2, obj));
        }

        public static String i(String str, Object obj, Object obj2) {
            return i0.j(str) + "Expected <" + obj + ">, actual <" + obj2 + ">.";
        }

        public static void j(@m80.k i iVar, @m80.l final String str, @m80.l Object obj, @m80.l final Object obj2) {
            iVar.i(new x00.a() { // from class: t30.b
                @Override // x00.a
                public final Object invoke() {
                    String k11;
                    k11 = i.a.k(str, obj2);
                    return k11;
                }
            }, !kotlin.jvm.internal.g0.g(obj2, obj));
        }

        public static String k(String str, Object obj) {
            return i0.j(str) + "Illegal value: <" + obj + ">.";
        }

        public static void l(@m80.k i iVar, @m80.l final String str, @m80.l Object obj) {
            iVar.i(new x00.a() { // from class: t30.e
                @Override // x00.a
                public final Object invoke() {
                    String m11;
                    m11 = i.a.m(str);
                    return m11;
                }
            }, obj != null);
        }

        public static String m(String str) {
            return i0.j(str) + "Expected value to be not null.";
        }

        public static void n(@m80.k i iVar, @m80.l final String str, @m80.l Object obj, @m80.l final Object obj2) {
            iVar.i(new x00.a() { // from class: t30.g
                @Override // x00.a
                public final Object invoke() {
                    String o11;
                    o11 = i.a.o(str, obj2);
                    return o11;
                }
            }, obj2 != obj);
        }

        public static String o(String str, Object obj) {
            return i0.j(str) + "Expected not same as <" + obj + ">.";
        }

        public static void p(@m80.k i iVar, @m80.l final String str, @m80.l final Object obj) {
            iVar.i(new x00.a() { // from class: t30.f
                @Override // x00.a
                public final Object invoke() {
                    String q11;
                    q11 = i.a.q(str, obj);
                    return q11;
                }
            }, obj == null);
        }

        public static String q(String str, Object obj) {
            return i0.j(str) + "Expected value to be null, but was: <" + obj + ">.";
        }

        public static void r(@m80.k i iVar, @m80.l final String str, @m80.l final Object obj, @m80.l final Object obj2) {
            iVar.i(new x00.a() { // from class: t30.h
                @Override // x00.a
                public final Object invoke() {
                    String s11;
                    s11 = i.a.s(str, obj, obj2);
                    return s11;
                }
            }, obj2 == obj);
        }

        public static String s(String str, Object obj, Object obj2) {
            return i0.j(str) + "Expected <" + obj + ">, actual <" + obj2 + "> is not same.";
        }

        public static void t(@m80.k i iVar, @m80.l final String str, boolean z11) {
            iVar.i(new x00.a() { // from class: t30.c
                @Override // x00.a
                public final Object invoke() {
                    String v11;
                    v11 = i.a.v(str);
                    return v11;
                }
            }, z11);
        }

        public static void u(@m80.k i iVar, @m80.k x00.a<String> lazyMessage, boolean z11) {
            kotlin.jvm.internal.g0.p(lazyMessage, "lazyMessage");
            if (z11) {
                return;
            }
            iVar.f(lazyMessage.invoke());
            throw new KotlinNothingValueException();
        }

        public static String v(String str) {
            return str;
        }
    }
}
