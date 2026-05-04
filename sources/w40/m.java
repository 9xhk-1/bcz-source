package w40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f95273b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Object f95274a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final Object a(int i11, @m80.k x00.a<String> message) {
            g0.p(message, "message");
            return m.c(new l(i11, message));
        }

        @m80.k
        public final Object b(int i11) {
            return m.c(Integer.valueOf(i11));
        }

        public a() {
        }
    }

    public /* synthetic */ m(Object obj) {
        this.f95274a = obj;
    }

    public static final /* synthetic */ m b(Object obj) {
        return new m(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof m) && g0.g(obj, ((m) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return g0.g(obj, obj2);
    }

    public static int g(Object obj) {
        return obj.hashCode();
    }

    public static final <T> T h(Object obj, @m80.k x00.l<? super Integer, ? extends T> onSuccess, @m80.k x00.l<? super l, ? extends T> onFailure) {
        g0.p(onSuccess, "onSuccess");
        g0.p(onFailure, "onFailure");
        if (obj instanceof Integer) {
            return onSuccess.invoke(obj);
        }
        if (obj instanceof l) {
            return onFailure.invoke(obj);
        }
        throw new IllegalStateException(("Unexpected parse result: " + obj).toString());
    }

    public static String i(Object obj) {
        return "ParseResult(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f95274a, obj);
    }

    @m80.k
    public final Object f() {
        return this.f95274a;
    }

    public int hashCode() {
        return g(this.f95274a);
    }

    public final /* synthetic */ Object j() {
        return this.f95274a;
    }

    public String toString() {
        return i(this.f95274a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
