package org.junit.jupiter.api;

import androidx.exifinterface.media.ExifInterface;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import kotlin.jvm.internal.Lambda;
import org.apiguardian.api.API;
import org.junit.jupiter.api.AssertionsKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
@kotlin.jvm.internal.u0({"SMAP\nAssertions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assertions.kt\norg/junit/jupiter/api/AssertionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,361:1\n151#1,4:366\n150#1,15:370\n219#1,6:385\n213#1,12:391\n212#1,4:403\n219#1,6:407\n1549#2:362\n1620#2,3:363\n*S KotlinDebug\n*F\n+ 1 Assertions.kt\norg/junit/jupiter/api/AssertionsKt\n*L\n134#1:366,4\n134#1:370,15\n179#1:385,6\n195#1:391,12\n195#1:403,4\n213#1:407,6\n68#1:362\n68#1:363,3\n*E\n"})
/* loaded from: classes9.dex */
public final class AssertionsKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAssertions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assertions.kt\norg/junit/jupiter/api/AssertionsKt$assertThrows$1\n*L\n1#1,361:1\n*E\n"})
    public static final class a implements r80.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f77920a;

        public a(Throwable th2) {
            this.f77920a = th2;
        }

        @Override // r80.a
        public final void execute() {
            Throwable th2 = this.f77920a;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAssertions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assertions.kt\norg/junit/jupiter/api/AssertionsKt$assertThrows$3\n*L\n1#1,361:1\n*E\n"})
    public static final class b implements r80.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f77921a;

        public b(Throwable th2) {
            this.f77921a = th2;
        }

        @Override // r80.a
        public final void execute() {
            Throwable th2 = this.f77921a;
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.l<x00.a<? extends yz.g2>, r80.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f77922a = new c();

        public c() {
            super(1);
        }

        public static final void invoke$lambda$0(x00.a tmp0) {
            kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
            tmp0.invoke();
        }

        @Override // x00.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r80.a invoke(final x00.a<yz.g2> it) {
            kotlin.jvm.internal.g0.o(it, "it");
            return new r80.a() { // from class: org.junit.jupiter.api.y0
                @Override // r80.a
                public final void execute() {
                    AssertionsKt.c.invoke$lambda$0(x00.a.this);
                }
            };
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAssertions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assertions.kt\norg/junit/jupiter/api/AssertionsKt$evaluateAndWrap$1\n*L\n1#1,361:1\n*E\n"})
    public static final class d<T> implements r80.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ R f77923a;

        public d(R r11) {
            this.f77923a = r11;
        }

        @Override // r80.c
        public final R get() {
            return this.f77923a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nAssertions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assertions.kt\norg/junit/jupiter/api/AssertionsKt$evaluateAndWrap$2\n*L\n1#1,361:1\n*E\n"})
    public static final class e<T> implements r80.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f77924a;

        public e(Throwable th2) {
            this.f77924a = th2;
        }

        @Override // r80.c
        public final R get() {
            throw this.f77924a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements Supplier {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a f77925a;

        public f(x00.a function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f77925a = function;
        }

        @Override // java.util.function.Supplier
        public final /* synthetic */ Object get() {
            return this.f77925a.invoke();
        }
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R A(@m80.k Duration timeout, @m80.k String message, @m80.k final x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        return (R) m0.i4(timeout, new r80.c() { // from class: org.junit.jupiter.api.o0
            @Override // r80.c
            public final Object get() {
                Object E;
                E = AssertionsKt.E(x00.a.this);
                return E;
            }
        }, message);
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R B(@m80.k Duration timeout, @m80.k final x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        kotlin.jvm.internal.g0.p(executable, "executable");
        return (R) m0.h4(timeout, new r80.c() { // from class: org.junit.jupiter.api.q0
            @Override // r80.c
            public final Object get() {
                Object D;
                D = AssertionsKt.D(x00.a.this);
                return D;
            }
        });
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R C(@m80.k Duration timeout, @m80.k final x00.a<String> message, @m80.k final x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        return (R) m0.j4(timeout, new r80.c() { // from class: org.junit.jupiter.api.r0
            @Override // r80.c
            public final Object get() {
                Object F;
                F = AssertionsKt.F(x00.a.this);
                return F;
            }
        }, new Supplier() { // from class: org.junit.jupiter.api.s0
            @Override // java.util.function.Supplier
            public final Object get() {
                String G;
                G = AssertionsKt.G(x00.a.this);
                return G;
            }
        });
    }

    public static final Object D(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    public static final Object E(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    public static final Object F(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    public static final String G(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R H(@m80.k Duration timeout, @m80.k String message, @m80.k final x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        return (R) m0.o4(timeout, new r80.c() { // from class: org.junit.jupiter.api.u0
            @Override // r80.c
            public final Object get() {
                Object N;
                N = AssertionsKt.N(x00.a.this);
                return N;
            }
        }, message);
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R I(@m80.k Duration timeout, @m80.k final x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        kotlin.jvm.internal.g0.p(executable, "executable");
        return (R) m0.n4(timeout, new r80.c() { // from class: org.junit.jupiter.api.t0
            @Override // r80.c
            public final Object get() {
                Object M;
                M = AssertionsKt.M(x00.a.this);
                return M;
            }
        });
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R J(@m80.k Duration timeout, @m80.k final x00.a<String> message, @m80.k final x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(timeout, "timeout");
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        return (R) m0.p4(timeout, new r80.c() { // from class: org.junit.jupiter.api.v0
            @Override // r80.c
            public final Object get() {
                Object K;
                K = AssertionsKt.K(x00.a.this);
                return K;
            }
        }, new Supplier() { // from class: org.junit.jupiter.api.w0
            @Override // java.util.function.Supplier
            public final Object get() {
                String L;
                L = AssertionsKt.L(x00.a.this);
                return L;
            }
        });
    }

    public static final Object K(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    public static final String L(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public static final Object M(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    public static final Object N(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return tmp0.invoke();
    }

    public static final List<r80.a> O(Collection<? extends x00.a<yz.g2>> collection) {
        Collection<? extends x00.a<yz.g2>> collection2 = collection;
        ArrayList arrayList = new ArrayList(a00.i0.d0(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            final x00.a aVar = (x00.a) it.next();
            arrayList.add(new r80.a() { // from class: org.junit.jupiter.api.n0
                @Override // r80.a
                public final void execute() {
                    AssertionsKt.R(x00.a.this);
                }
            });
        }
        return arrayList;
    }

    public static final Stream<r80.a> P(Stream<x00.a<yz.g2>> stream) {
        final c cVar = c.f77922a;
        return stream.map(new Function() { // from class: org.junit.jupiter.api.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                r80.a Q;
                Q = AssertionsKt.Q(x00.l.this, obj);
                return Q;
            }
        });
    }

    public static final r80.a Q(x00.l tmp0, Object obj) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        return (r80.a) tmp0.invoke(obj);
    }

    public static final void R(x00.a tmp0) {
        kotlin.jvm.internal.g0.p(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @yz.v0
    @m80.k
    public static final <R> r80.c<R> S(@m80.k x00.a<? extends R> executable) {
        kotlin.jvm.internal.g0.p(executable, "executable");
        try {
            return new d(executable.invoke());
        } catch (Throwable th2) {
            return new e(th2);
        }
    }

    @m80.k
    public static final Void T(@m80.l String str, @m80.l Throwable th2) {
        Object C4 = m0.C4(str, th2);
        kotlin.jvm.internal.g0.o(C4, "fail<Nothing>(message, throwable)");
        return (Void) C4;
    }

    @m80.k
    public static final Void U(@m80.l Throwable th2) {
        Object D4 = m0.D4(th2);
        kotlin.jvm.internal.g0.o(D4, "fail<Nothing>(throwable)");
        return (Void) D4;
    }

    @m80.k
    public static final Void V(@m80.l final x00.a<String> aVar) {
        Object E4 = m0.E4(aVar != null ? new Supplier() { // from class: org.junit.jupiter.api.x0
            @Override // java.util.function.Supplier
            public final Object get() {
                String X;
                X = AssertionsKt.X(x00.a.this);
                return X;
            }
        } : null);
        kotlin.jvm.internal.g0.o(E4, "fail<Nothing>(message)");
        return (Void) E4;
    }

    public static /* synthetic */ Void W(String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        return T(str, th2);
    }

    public static final String X(x00.a aVar) {
        return (String) aVar.invoke();
    }

    public static final void l(@m80.l String str, @m80.k Collection<? extends x00.a<yz.g2>> executables) {
        kotlin.jvm.internal.g0.p(executables, "executables");
        m0.a(str, O(executables));
    }

    public static final void m(@m80.l String str, @m80.k Stream<x00.a<yz.g2>> executables) {
        kotlin.jvm.internal.g0.p(executables, "executables");
        m0.b(str, P(executables));
    }

    public static final void n(@m80.l String str, @m80.k x00.a<yz.g2>... executables) {
        kotlin.jvm.internal.g0.p(executables, "executables");
        Stream stream = a00.a0.dz(executables).stream();
        kotlin.jvm.internal.g0.o(stream, "executables.toList().stream()");
        m(str, stream);
    }

    public static final void o(@m80.k Collection<? extends x00.a<yz.g2>> executables) {
        kotlin.jvm.internal.g0.p(executables, "executables");
        m0.d(O(executables));
    }

    public static final void p(@m80.k Stream<x00.a<yz.g2>> executables) {
        kotlin.jvm.internal.g0.p(executables, "executables");
        m0.e(P(executables));
    }

    public static final void q(@m80.k x00.a<yz.g2>... executables) {
        kotlin.jvm.internal.g0.p(executables, "executables");
        Stream stream = a00.a0.dz(executables).stream();
        kotlin.jvm.internal.g0.o(stream, "executables.toList().stream()");
        p(stream);
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R r(@m80.k final String message, @m80.k x00.a<? extends R> executable) {
        r80.c eVar;
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        x00.a<String> aVar = new x00.a<String>() { // from class: org.junit.jupiter.api.AssertionsKt$assertDoesNotThrow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            @m80.k
            public final String invoke() {
                return message;
            }
        };
        try {
            eVar = new d(executable.invoke());
        } catch (Throwable th2) {
            eVar = new e(th2);
        }
        return (R) m0.P(eVar, new f(aVar));
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R s(@m80.k x00.a<? extends R> executable) {
        r80.c eVar;
        kotlin.jvm.internal.g0.p(executable, "executable");
        try {
            eVar = new d(executable.invoke());
        } catch (Throwable th2) {
            eVar = new e(th2);
        }
        return (R) m0.N(eVar);
    }

    @API(since = "5.11", status = API.Status.STABLE)
    public static final <R> R t(@m80.k x00.a<String> message, @m80.k x00.a<? extends R> executable) {
        r80.c eVar;
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        try {
            eVar = new d(executable.invoke());
        } catch (Throwable th2) {
            eVar = new e(th2);
        }
        return (R) m0.P(eVar, new f(message));
    }

    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static final /* synthetic */ <T> T u(Object obj, String str) {
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) m0.P1(Object.class, obj, str);
        kotlin.jvm.internal.g0.o(t11, "assertInstanceOf(T::clas…va, actualValue, message)");
        return t11;
    }

    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static final /* synthetic */ <T> T v(Object obj, x00.a<String> message) {
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) m0.Q1(Object.class, obj, new f(message));
        kotlin.jvm.internal.g0.o(t11, "assertInstanceOf(T::clas…va, actualValue, message)");
        return t11;
    }

    public static /* synthetic */ Object w(Object obj, String str, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object P1 = m0.P1(Object.class, obj, str);
        kotlin.jvm.internal.g0.o(P1, "assertInstanceOf(T::clas…va, actualValue, message)");
        return P1;
    }

    public static final /* synthetic */ <T extends Throwable> T x(final String message, x00.a<yz.g2> executable) {
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        x00.a<String> aVar = new x00.a<String>() { // from class: org.junit.jupiter.api.AssertionsKt$assertThrows$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            @m80.k
            public final String invoke() {
                return message;
            }
        };
        try {
            executable.invoke();
            th = yz.g2.f100423a;
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable th3 = th instanceof Throwable ? (Throwable) th : null;
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) m0.d4(Throwable.class, new b(th3), new f(aVar));
        kotlin.jvm.internal.g0.o(t11, "throwable: Throwable? =\n…  Supplier(message)\n    )");
        return t11;
    }

    public static final /* synthetic */ <T extends Throwable> T y(x00.a<yz.g2> executable) {
        kotlin.jvm.internal.g0.p(executable, "executable");
        try {
            executable.invoke();
            th = yz.g2.f100423a;
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable th3 = th instanceof Throwable ? (Throwable) th : null;
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) m0.b4(Throwable.class, new a(th3));
        kotlin.jvm.internal.g0.o(t11, "throwable: Throwable? =\n…throwable\n        }\n    }");
        return t11;
    }

    public static final /* synthetic */ <T extends Throwable> T z(x00.a<String> message, x00.a<yz.g2> executable) {
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(executable, "executable");
        try {
            executable.invoke();
            th = yz.g2.f100423a;
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable th3 = th instanceof Throwable ? (Throwable) th : null;
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) m0.d4(Throwable.class, new b(th3), new f(message));
        kotlin.jvm.internal.g0.o(t11, "throwable: Throwable? =\n…  Supplier(message)\n    )");
        return t11;
    }
}
