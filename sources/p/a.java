package p;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKmmResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KmmResult.kt\nat/asitplus/KmmResult\n+ 2 NonFatal.jvm.kt\nat/asitplus/NonFatal_jvmKt\n+ 3 NonFatalCatching.kt\nat/asitplus/NonFatalCatchingKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n6#2,4:268\n6#2,4:277\n68#3:272\n47#3,4:273\n1#4:281\n*S KotlinDebug\n*F\n+ 1 KmmResult.kt\nat/asitplus/KmmResult\n*L\n37#1:268,4\n145#1:277,4\n145#1:272\n145#1:273,4\n*E\n"})
/* loaded from: classes3.dex */
public final class a<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0965a f78545b = new C0965a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f78546a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: p.a$a, reason: collision with other inner class name */
    public static final class C0965a {
        public /* synthetic */ C0965a(v vVar) {
            this();
        }

        @o
        @k
        public final <T> a<T> a(@k Throwable error) {
            g0.p(error, "error");
            return new a<>(error);
        }

        @o
        @k
        public final <T> a<T> b(T t11) {
            return new a<>(t11);
        }

        @k
        public final <T> a<T> c(@k Object obj) {
            return new a<>(obj, false, null);
        }

        public C0965a() {
        }
    }

    public /* synthetic */ a(Object obj, boolean z11, v vVar) {
        this(obj, z11);
    }

    @o
    @k
    public static final <T> a<T> b(@k Throwable th2) {
        return f78545b.a(th2);
    }

    @o
    @k
    public static final <T> a<T> n(T t11) {
        return f78545b.b(t11);
    }

    @l
    public final Throwable a() {
        return Result.m6311exceptionOrNullimpl(this.f78546a);
    }

    public final <R> R c(@k x00.l<? super T, ? extends R> onSuccess, @k x00.l<? super Throwable, ? extends R> onFailure) {
        g0.p(onSuccess, "onSuccess");
        g0.p(onFailure, "onFailure");
        if (h()) {
            return onSuccess.invoke(f());
        }
        Throwable a11 = a();
        g0.m(a11);
        return onFailure.invoke(a11);
    }

    public final T d(@k x00.l<? super Throwable, ? extends T> onFailure) {
        g0.p(onFailure, "onFailure");
        if (h()) {
            return f();
        }
        Throwable a11 = a();
        g0.m(a11);
        return onFailure.invoke(a11);
    }

    @l
    public final T e() {
        T t11 = (T) this.f78546a;
        if (Result.m6314isFailureimpl(t11)) {
            return null;
        }
        return t11;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Result.m6310equalsimpl0(this.f78546a, ((a) obj).f78546a);
    }

    public final T f() {
        T t11 = (T) this.f78546a;
        e.n(t11);
        return t11;
    }

    public final boolean g() {
        return Result.m6314isFailureimpl(this.f78546a);
    }

    public final boolean h() {
        return Result.m6315isSuccessimpl(this.f78546a);
    }

    public int hashCode() {
        return Result.m6313hashCodeimpl(this.f78546a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final <R> a<R> i(@k x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        boolean h11 = h();
        if (h11) {
            return new a<>(block.invoke((Object) f()));
        }
        if (h11) {
            throw new NoWhenBranchMatchedException();
        }
        g0.n(this, "null cannot be cast to non-null type at.asitplus.KmmResult<R of at.asitplus.KmmResult.map>");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final <R> a<R> j(@k x00.l<? super T, ? extends R> block) {
        Object m6308constructorimpl;
        g0.p(block, "block");
        boolean h11 = h();
        if (!h11) {
            if (h11) {
                throw new NoWhenBranchMatchedException();
            }
            g0.n(this, "null cannot be cast to non-null type at.asitplus.KmmResult<R of at.asitplus.KmmResult.mapCatching>");
            return this;
        }
        C0965a c0965a = f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke((Object) f()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        return c0965a.c(m6308constructorimpl);
    }

    @k
    public final a<T> k(@k x00.l<? super Throwable, ? extends Throwable> block) {
        g0.p(block, "block");
        Throwable a11 = a();
        return a11 == null ? this : new a<>(block.invoke(a11));
    }

    @k
    public final <R> a<T> l(@k x00.l<? super Throwable, ? extends R> block) {
        g0.p(block, "block");
        Throwable a11 = a();
        if (a11 != null) {
            block.invoke(a11);
        }
        return this;
    }

    @k
    public final <R> a<T> m(@k x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        if (h()) {
            block.invoke(f());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final <R> a<R> o(@k x00.l<? super T, ? extends a<? extends R>> block) {
        g0.p(block, "block");
        boolean h11 = h();
        if (h11) {
            return block.invoke((Object) f());
        }
        if (h11) {
            throw new NoWhenBranchMatchedException();
        }
        g0.n(this, "null cannot be cast to non-null type at.asitplus.KmmResult<R of at.asitplus.KmmResult.transform>");
        return this;
    }

    @k
    public final Object p() {
        return this.f78546a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public String toString() {
        String str;
        String str2;
        String str3;
        Object m6308constructorimpl;
        String str4;
        String str5;
        boolean h11 = h();
        str = "";
        String str6 = j.f81007d;
        if (h11) {
            try {
                Result.a aVar = Result.Companion;
                Object obj = this.f78546a;
                e.n(obj);
                g0.m(obj);
                str2 = Result.m6308constructorimpl("<" + o0.d(obj.getClass()).C() + ">");
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                str2 = Result.m6308constructorimpl(e.a(th2));
            }
            str = Result.m6311exceptionOrNullimpl(str2) == null ? str2 : "";
            str3 = ".success" + ((Object) str) + j.f81006c + f() + j.f81007d;
        } else {
            Throwable a11 = a();
            if (a11 != null) {
                try {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(o0.d(a11.getClass()).C());
                } catch (Throwable th3) {
                    Result.a aVar4 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(e.a(th3));
                }
                if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                    m6308constructorimpl = null;
                }
                str4 = (String) m6308constructorimpl;
            } else {
                str4 = null;
            }
            if (str4 != null) {
                str5 = j.f81006c + str4;
            } else {
                str5 = null;
            }
            Throwable a12 = a();
            if (a12 != null) {
                String message = a12.getMessage();
                if (message != null) {
                    String str7 = j.f81006c + message + j.f81007d;
                    if (str7 != null) {
                        str = str7;
                    }
                }
            } else {
                str = null;
            }
            if (str4 == null) {
                str6 = null;
            }
            str3 = ".failure" + str5 + str + str6;
        }
        return "KmmResult" + str3;
    }

    public a(Object obj, boolean z11) {
        this.f78546a = obj;
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        if (m6311exceptionOrNullimpl != null) {
            if (m6311exceptionOrNullimpl instanceof VirtualMachineError) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof ThreadDeath) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof InterruptedException) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof LinkageError) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof CancellationException) {
                throw m6311exceptionOrNullimpl;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(T t11) {
        this(Result.m6308constructorimpl(t11), false);
        Result.a aVar = Result.Companion;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@k Throwable failure) {
        this(Result.m6308constructorimpl(e.a(failure)), false);
        g0.p(failure, "failure");
        Result.a aVar = Result.Companion;
    }
}
