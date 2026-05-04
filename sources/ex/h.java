package ex;

import io.ktor.utils.io.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {15}, m = "readBytes", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50221a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50222b;

        /* renamed from: c, reason: collision with root package name */
        public int f50223c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50222b = obj;
            this.f50223c |= Integer.MIN_VALUE;
            return h.b(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {45}, m = "readBytes", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50224a;

        /* renamed from: b, reason: collision with root package name */
        public int f50225b;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50224a = obj;
            this.f50225b |= Integer.MIN_VALUE;
            return h.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", i = {}, l = {30}, m = "readRawBytes", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50226a;

        /* renamed from: b, reason: collision with root package name */
        public int f50227b;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50226a = obj;
            this.f50227b |= Integer.MIN_VALUE;
            return h.d(null, this);
        }
    }

    @l
    public static final Object a(@k ex.c cVar, @k j00.c<? super g2> cVar2) {
        Object j11 = j.j(cVar.b(), 0L, cVar2, 1, null);
        return j11 == kotlin.coroutines.intrinsics.b.l() ? j11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k ex.c r8, int r9, @m80.k j00.c<? super byte[]> r10) {
        /*
            boolean r0 = r10 instanceof ex.h.a
            if (r0 == 0) goto L14
            r0 = r10
            ex.h$a r0 = (ex.h.a) r0
            int r1 = r0.f50223c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f50223c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            ex.h$a r0 = new ex.h$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f50222b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r5.f50223c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r5.f50221a
            byte[] r8 = (byte[]) r8
            kotlin.e.n(r10)
            return r8
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.e.n(r10)
            byte[] r9 = new byte[r9]
            io.ktor.utils.io.g r1 = r8.b()
            r5.f50221a = r9
            r5.f50223c = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            java.lang.Object r8 = io.ktor.utils.io.j.B(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.h.b(ex.c, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    @yz.n(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @yz.w0(expression = "readRawBytes()", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k ex.c r4, @m80.k j00.c<? super byte[]> r5) {
        /*
            boolean r0 = r5 instanceof ex.h.b
            if (r0 == 0) goto L13
            r0 = r5
            ex.h$b r0 = (ex.h.b) r0
            int r1 = r0.f50225b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50225b = r1
            goto L18
        L13:
            ex.h$b r0 = new ex.h$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f50224a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50225b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r5)
            io.ktor.utils.io.g r4 = r4.b()
            r0.f50225b = r3
            java.lang.Object r5 = io.ktor.utils.io.j.G(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            y40.c0 r5 = (y40.c0) r5
            byte[] r4 = y40.g0.c(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.h.c(ex.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k ex.c r4, @m80.k j00.c<? super byte[]> r5) {
        /*
            boolean r0 = r5 instanceof ex.h.c
            if (r0 == 0) goto L13
            r0 = r5
            ex.h$c r0 = (ex.h.c) r0
            int r1 = r0.f50227b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50227b = r1
            goto L18
        L13:
            ex.h$c r0 = new ex.h$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f50226a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50227b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r5)
            io.ktor.utils.io.g r4 = r4.b()
            r0.f50227b = r3
            java.lang.Object r5 = io.ktor.utils.io.j.G(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            y40.c0 r5 = (y40.c0) r5
            byte[] r4 = y40.g0.c(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.h.d(ex.c, j00.c):java.lang.Object");
    }
}
