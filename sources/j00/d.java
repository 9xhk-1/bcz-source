package j00;

import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    public static final class a<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f63101a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Result<? extends T>, g2> f63102b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d dVar, l<? super Result<? extends T>, g2> lVar) {
            this.f63101a = dVar;
            this.f63102b = lVar;
        }

        @Override // j00.c
        public kotlin.coroutines.d getContext() {
            return this.f63101a;
        }

        @Override // j00.c
        public void resumeWith(Object obj) {
            this.f63102b.invoke(Result.m6307boximpl(obj));
        }
    }

    @y0(version = "1.3")
    @o00.f
    public static final <T> c<T> a(kotlin.coroutines.d context, l<? super Result<? extends T>, g2> resumeWith) {
        g0.p(context, "context");
        g0.p(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    @y0(version = "1.3")
    @k
    public static final <T> c<g2> b(@k l<? super c<? super T>, ? extends Object> lVar, @k c<? super T> completion) {
        g0.p(lVar, "<this>");
        g0.p(completion, "completion");
        return new g(IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion)), kotlin.coroutines.intrinsics.b.l());
    }

    @y0(version = "1.3")
    @k
    public static final <R, T> c<g2> c(@k p<? super R, ? super c<? super T>, ? extends Object> pVar, R r11, @k c<? super T> completion) {
        g0.p(pVar, "<this>");
        g0.p(completion, "completion");
        return new g(IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r11, completion)), kotlin.coroutines.intrinsics.b.l());
    }

    public static final kotlin.coroutines.d d() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @y0(version = "1.3")
    @o00.f
    public static final <T> void f(c<? super T> cVar, T t11) {
        g0.p(cVar, "<this>");
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(t11));
    }

    @y0(version = "1.3")
    @o00.f
    public static final <T> void g(c<? super T> cVar, Throwable exception) {
        g0.p(cVar, "<this>");
        g0.p(exception, "exception");
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(exception)));
    }

    @y0(version = "1.3")
    public static final <T> void h(@k l<? super c<? super T>, ? extends Object> lVar, @k c<? super T> completion) {
        g0.p(lVar, "<this>");
        g0.p(completion, "completion");
        c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion));
        g2 g2Var = g2.f100423a;
        Result.a aVar = Result.Companion;
        e11.resumeWith(Result.m6308constructorimpl(g2Var));
    }

    @y0(version = "1.3")
    public static final <R, T> void i(@k p<? super R, ? super c<? super T>, ? extends Object> pVar, R r11, @k c<? super T> completion) {
        g0.p(pVar, "<this>");
        g0.p(completion, "completion");
        c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r11, completion));
        g2 g2Var = g2.f100423a;
        Result.a aVar = Result.Companion;
        e11.resumeWith(Result.m6308constructorimpl(g2Var));
    }

    @y0(version = "1.3")
    @o00.f
    public static final <T> Object j(l<? super c<? super T>, g2> lVar, c<? super T> cVar) {
        d0.e(0);
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        lVar.invoke(gVar);
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        d0.e(1);
        return b11;
    }

    @y0(version = "1.3")
    @o00.f
    public static /* synthetic */ void e() {
    }
}
