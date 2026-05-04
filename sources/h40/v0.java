package h40;

import h40.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes8.dex */
public final class v0<S extends u0<S>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Object f58278a;

    public /* synthetic */ v0(Object obj) {
        this.f58278a = obj;
    }

    public static final /* synthetic */ v0 a(Object obj) {
        return new v0(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof v0) && kotlin.jvm.internal.g0.g(obj, ((v0) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.g0.g(obj, obj2);
    }

    @m80.k
    public static final S f(Object obj) {
        if (obj == e.f58192b) {
            throw new IllegalStateException("Does not contain segment");
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == e.f58192b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f58278a, obj);
    }

    public int hashCode() {
        return g(this.f58278a);
    }

    public final /* synthetic */ Object j() {
        return this.f58278a;
    }

    public String toString() {
        return i(this.f58278a);
    }

    public static /* synthetic */ void e() {
    }

    @m80.k
    public static <S extends u0<S>> Object b(@m80.l Object obj) {
        return obj;
    }
}
