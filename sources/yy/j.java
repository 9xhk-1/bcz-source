package yy;

import io.ktor.utils.io.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", i = {}, l = {17}, m = "toByteArray", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f100406a;

        /* renamed from: b, reason: collision with root package name */
        public int f100407b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100406a = obj;
            this.f100407b |= Integer.MIN_VALUE;
            return j.a(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k io.ktor.utils.io.g r4, int r5, @m80.k j00.c<? super byte[]> r6) {
        /*
            boolean r0 = r6 instanceof yy.j.a
            if (r0 == 0) goto L13
            r0 = r6
            yy.j$a r0 = (yy.j.a) r0
            int r1 = r0.f100407b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100407b = r1
            goto L18
        L13:
            yy.j$a r0 = new yy.j$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f100406a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100407b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            long r5 = (long) r5
            r0.f100407b = r3
            java.lang.Object r6 = io.ktor.utils.io.j.F(r4, r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            y40.c0 r6 = (y40.c0) r6
            byte[] r4 = y40.g0.c(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.j.a(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object b(io.ktor.utils.io.g gVar, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(gVar, i11, cVar);
    }

    public static final void c(@k m mVar, @k x00.l<? super m, g2> block) {
        g0.p(mVar, "<this>");
        g0.p(block, "block");
        try {
            block.invoke(mVar);
        } finally {
        }
    }
}
