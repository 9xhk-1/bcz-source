package e40;

import c40.g2;
import kotlin.jvm.internal.u0;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@u0({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/channels/ChannelResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1485:1\n1#2:1486\n*E\n"})
/* loaded from: classes8.dex */
public final class s<T> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f49161b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f49162c = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Object f49163a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        @w00.g
        public final Throwable f49164a;

        public a(@m80.l Throwable th2) {
            this.f49164a = th2;
        }

        public boolean equals(@m80.l Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f49164a, ((a) obj).f49164a);
        }

        public int hashCode() {
            Throwable th2 = this.f49164a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // e40.s.c
        @m80.k
        public String toString() {
            return "Closed(" + this.f49164a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @g2
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @g2
        @m80.k
        public final <E> Object a(@m80.l Throwable th2) {
            return s.c(new a(th2));
        }

        @g2
        @m80.k
        public final <E> Object b() {
            return s.c(s.f49162c);
        }

        @g2
        @m80.k
        public final <E> Object c(E e11) {
            return s.c(e11);
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {
        @m80.k
        public String toString() {
            return "Failed";
        }
    }

    @v0
    public /* synthetic */ s(Object obj) {
        this.f49163a = obj;
    }

    public static final /* synthetic */ s b(Object obj) {
        return new s(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof s) && kotlin.jvm.internal.g0.g(obj, ((s) obj2).o());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.g0.g(obj, obj2);
    }

    @m80.l
    public static final Throwable f(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f49164a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        if (!(obj instanceof a)) {
            throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
        }
        Throwable th2 = ((a) obj).f49164a;
        if (th2 != null) {
            throw th2;
        }
        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @m80.k
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f49163a, obj);
    }

    public int hashCode() {
        return j(this.f49163a);
    }

    public final /* synthetic */ Object o() {
        return this.f49163a;
    }

    @m80.k
    public String toString() {
        return n(this.f49163a);
    }

    @v0
    public static /* synthetic */ void g() {
    }

    @v0
    @m80.k
    public static <T> Object c(@m80.l Object obj) {
        return obj;
    }
}
