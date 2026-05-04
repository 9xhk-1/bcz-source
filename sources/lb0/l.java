package lb0;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import retrofit2.HttpException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "KotlinExtensions")
/* loaded from: classes9.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lb0.b f70891a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lb0.b bVar) {
            super(1);
            this.f70891a = bVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            invoke2(th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.l Throwable th2) {
            this.f70891a.cancel();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lb0.b f70892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lb0.b bVar) {
            super(1);
            this.f70892a = bVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            invoke2(th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.l Throwable th2) {
            this.f70892a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements lb0.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n f70893a;

        public c(c40.n nVar) {
            this.f70893a = nVar;
        }

        @Override // lb0.d
        public void a(@m80.k lb0.b<T> call, @m80.k y<T> response) {
            g0.q(call, "call");
            g0.q(response, "response");
            if (!response.g()) {
                c40.n nVar = this.f70893a;
                HttpException httpException = new HttpException(response);
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(httpException)));
                return;
            }
            T a11 = response.a();
            if (a11 != null) {
                c40.n nVar2 = this.f70893a;
                Result.a aVar2 = Result.Companion;
                nVar2.resumeWith(Result.m6308constructorimpl(a11));
                return;
            }
            Object p11 = call.request().p(k.class);
            if (p11 == null) {
                g0.L();
            }
            g0.h(p11, "call.request().tag(Invocation::class.java)!!");
            Method method = ((k) p11).b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Response from ");
            g0.h(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            g0.h(declaringClass, "method.declaringClass");
            sb2.append(declaringClass.getName());
            sb2.append('.');
            sb2.append(method.getName());
            sb2.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
            c40.n nVar3 = this.f70893a;
            Result.a aVar3 = Result.Companion;
            nVar3.resumeWith(Result.m6308constructorimpl(kotlin.e.a(kotlinNullPointerException)));
        }

        @Override // lb0.d
        public void b(@m80.k lb0.b<T> call, @m80.k Throwable t11) {
            g0.q(call, "call");
            g0.q(t11, "t");
            c40.n nVar = this.f70893a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(t11)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements lb0.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n f70894a;

        public d(c40.n nVar) {
            this.f70894a = nVar;
        }

        @Override // lb0.d
        public void a(@m80.k lb0.b<T> call, @m80.k y<T> response) {
            g0.q(call, "call");
            g0.q(response, "response");
            if (response.g()) {
                c40.n nVar = this.f70894a;
                T a11 = response.a();
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(a11));
                return;
            }
            c40.n nVar2 = this.f70894a;
            HttpException httpException = new HttpException(response);
            Result.a aVar2 = Result.Companion;
            nVar2.resumeWith(Result.m6308constructorimpl(kotlin.e.a(httpException)));
        }

        @Override // lb0.d
        public void b(@m80.k lb0.b<T> call, @m80.k Throwable t11) {
            g0.q(call, "call");
            g0.q(t11, "t");
            c40.n nVar = this.f70894a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(t11)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lb0.b f70895a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lb0.b bVar) {
            super(1);
            this.f70895a = bVar;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            invoke2(th2);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.l Throwable th2) {
            this.f70895a.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> implements lb0.d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n f70896a;

        public f(c40.n nVar) {
            this.f70896a = nVar;
        }

        @Override // lb0.d
        public void a(@m80.k lb0.b<T> call, @m80.k y<T> response) {
            g0.q(call, "call");
            g0.q(response, "response");
            c40.n nVar = this.f70896a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(response));
        }

        @Override // lb0.d
        public void b(@m80.k lb0.b<T> call, @m80.k Throwable t11) {
            g0.q(call, "call");
            g0.q(t11, "t");
            c40.n nVar = this.f70896a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(t11)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c f70897a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Exception f70898b;

        public g(j00.c cVar, Exception exc) {
            this.f70897a = cVar;
            this.f70898b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j00.c e11 = IntrinsicsKt__IntrinsicsJvmKt.e(this.f70897a);
            Exception exc = this.f70898b;
            Result.a aVar = Result.Companion;
            e11.resumeWith(Result.m6308constructorimpl(kotlin.e.a(exc)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f70899a;

        /* renamed from: b, reason: collision with root package name */
        public int f70900b;

        /* renamed from: c, reason: collision with root package name */
        public Object f70901c;

        public h(j00.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70899a = obj;
            this.f70900b |= Integer.MIN_VALUE;
            return l.e(null, this);
        }
    }

    @m80.l
    public static final <T> Object a(@m80.k lb0.b<T> bVar, @m80.k j00.c<? super T> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.p(new a(bVar));
        bVar.K0(new c(pVar));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @m80.l
    @w00.j(name = "awaitNullable")
    public static final <T> Object b(@m80.k lb0.b<T> bVar, @m80.k j00.c<? super T> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.p(new b(bVar));
        bVar.K0(new d(pVar));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @m80.l
    public static final <T> Object c(@m80.k lb0.b<T> bVar, @m80.k j00.c<? super y<T>> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.p(new e(bVar));
        bVar.K0(new f(pVar));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public static final /* synthetic */ <T> T d(@m80.k z create) {
        g0.q(create, "$this$create");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) create.g(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@m80.k java.lang.Exception r4, @m80.k j00.c<?> r5) {
        /*
            boolean r0 = r5 instanceof lb0.l.h
            if (r0 == 0) goto L13
            r0 = r5
            lb0.l$h r0 = (lb0.l.h) r0
            int r1 = r0.f70900b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70900b = r1
            goto L18
        L13:
            lb0.l$h r0 = new lb0.l$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f70899a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f70900b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f70901c
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.e.n(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            r0.f70901c = r4
            r0.f70900b = r3
            c40.m0 r5 = c40.h1.a()
            kotlin.coroutines.d r2 = r0.getContext()
            lb0.l$g r3 = new lb0.l$g
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.l()
            if (r4 != r5) goto L59
            l00.f.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lb0.l.e(java.lang.Exception, j00.c):java.lang.Object");
    }
}
