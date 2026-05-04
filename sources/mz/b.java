package mz;

import c40.a0;
import c40.l2;
import c40.n2;
import c40.q0;
import c40.r0;
import io.ktor.utils.io.b0;
import io.ktor.utils.io.g;
import io.ktor.utils.io.t;
import java.io.EOFException;
import java.io.IOException;
import jz.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import y40.c0;
import y40.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f73910b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final kotlin.coroutines.d f73911c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public t f73912d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final y40.b f73913e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a0 f73914f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final kotlin.coroutines.d f73915g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", i = {0, 0}, l = {62}, m = "awaitContent", n = {"this", "min"}, s = {"L$0", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f73916a;

        /* renamed from: b, reason: collision with root package name */
        public int f73917b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f73918c;

        /* renamed from: e, reason: collision with root package name */
        public int f73920e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f73918c = obj;
            this.f73920e |= Integer.MIN_VALUE;
            return b.this.d(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: mz.b$b, reason: collision with other inner class name */
    public static final class C0895b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73921a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f73923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0895b(int i11, j00.c<? super C0895b> cVar) {
            super(2, cVar);
            this.f73923c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new C0895b(this.f73923c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C0895b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f73921a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            long j11 = 0;
            while (j.j(b.this.f73913e) < this.f73923c && j11 >= 0) {
                try {
                    j11 = b.this.f73910b.r2(b.this.f73913e, Long.MAX_VALUE);
                } catch (EOFException unused) {
                    j11 = -1;
                }
            }
            if (j11 == -1) {
                b.this.f73910b.close();
                b.this.j().complete();
                b.this.f73912d = new t(null);
            }
            return g2.f100423a;
        }
    }

    public b(@k p source, @k kotlin.coroutines.d parent) {
        g0.p(source, "source");
        g0.p(parent, "parent");
        this.f73910b = source;
        this.f73911c = parent;
        this.f73913e = new y40.b();
        a0 a11 = n2.a((l2) parent.get(l2.f7886e0));
        this.f73914f = a11;
        this.f73915g = parent.plus(a11).plus(new q0("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    public void a(@l Throwable th2) {
        String str;
        String message;
        if (this.f73912d != null) {
            return;
        }
        a0 a0Var = this.f73914f;
        String str2 = "Channel was cancelled";
        if (th2 == null || (str = th2.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        n2.e(a0Var, str, th2);
        this.f73910b.close();
        if (th2 != null && (message = th2.getMessage()) != null) {
            str2 = message;
        }
        this.f73912d = new t(new IOException(str2, th2));
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    @l
    public Throwable b() {
        t tVar = this.f73912d;
        if (tVar != null) {
            return tVar.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(int r6, @m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mz.b.a
            if (r0 == 0) goto L13
            r0 = r7
            mz.b$a r0 = (mz.b.a) r0
            int r1 = r0.f73920e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73920e = r1
            goto L18
        L13:
            mz.b$a r0 = new mz.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73918c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f73920e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r6 = r0.f73917b
            java.lang.Object r0 = r0.f73916a
            mz.b r0 = (mz.b) r0
            kotlin.e.n(r7)
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.e.n(r7)
            io.ktor.utils.io.t r7 = r5.f73912d
            if (r7 == 0) goto L43
            java.lang.Boolean r6 = l00.a.a(r3)
            return r6
        L43:
            kotlin.coroutines.d r7 = r5.f73915g
            mz.b$b r2 = new mz.b$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f73916a = r5
            r0.f73917b = r6
            r0.f73920e = r3
            java.lang.Object r7 = c40.i.h(r7, r2, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r0 = r5
        L59:
            y40.b r7 = r0.f73913e
            long r0 = jz.j.j(r7)
            long r6 = (long) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L65
            goto L66
        L65:
            r3 = 0
        L66:
            java.lang.Boolean r6 = l00.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mz.b.d(int, j00.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.g
    @k
    public c0 e() {
        return this.f73913e;
    }

    @Override // io.ktor.utils.io.g
    public boolean f() {
        return this.f73912d != null && this.f73913e.J();
    }

    @k
    public final kotlin.coroutines.d i() {
        return this.f73915g;
    }

    @k
    public final a0 j() {
        return this.f73914f;
    }

    @b0
    public static /* synthetic */ void k() {
    }
}
