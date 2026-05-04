package yy;

import io.ktor.utils.io.b0;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReadersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadersJvm.kt\nio/ktor/util/cio/ReadersJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.cio.ReadersJvmKt", f = "ReadersJvm.kt", i = {0, 0, 0}, l = {17}, m = "pass", n = {"$this$pass", "buffer", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f100401a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100402b;

        /* renamed from: c, reason: collision with root package name */
        public Object f100403c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f100404d;

        /* renamed from: e, reason: collision with root package name */
        public int f100405e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100404d = obj;
            this.f100405e |= Integer.MIN_VALUE;
            return i.a(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0058 -> B:10:0x005b). Please report as a decompilation issue!!! */
    @m80.l
    @io.ktor.utils.io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k io.ktor.utils.io.g r5, @m80.k java.nio.ByteBuffer r6, @m80.k x00.l<? super java.nio.ByteBuffer, yz.g2> r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof yy.i.a
            if (r0 == 0) goto L13
            r0 = r8
            yy.i$a r0 = (yy.i.a) r0
            int r1 = r0.f100405e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100405e = r1
            goto L18
        L13:
            yy.i$a r0 = new yy.i$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f100404d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100405e
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.f100403c
            x00.l r5 = (x00.l) r5
            java.lang.Object r6 = r0.f100402b
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.f100401a
            io.ktor.utils.io.g r7 = (io.ktor.utils.io.g) r7
            kotlin.e.n(r8)
            r4 = r7
            r7 = r5
            r5 = r4
            goto L5b
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.e.n(r8)
        L43:
            boolean r8 = r5.f()
            if (r8 != 0) goto L62
            r6.clear()
            r0.f100401a = r5
            r0.f100402b = r6
            r0.f100403c = r7
            r0.f100405e = r3
            java.lang.Object r8 = io.ktor.utils.io.l.k(r5, r6, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r6.flip()
            r7.invoke(r6)
            goto L43
        L62:
            java.lang.Throwable r5 = r5.b()
            if (r5 != 0) goto L6b
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L6b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.i.a(io.ktor.utils.io.g, java.nio.ByteBuffer, x00.l, j00.c):java.lang.Object");
    }

    @b0
    public static final Object b(io.ktor.utils.io.g gVar, ByteBuffer byteBuffer, x00.l<? super ByteBuffer, g2> lVar, j00.c<? super g2> cVar) {
        while (!gVar.f()) {
            byteBuffer.clear();
            d0.e(0);
            io.ktor.utils.io.l.k(gVar, byteBuffer, cVar);
            d0.e(1);
            byteBuffer.flip();
            lVar.invoke(byteBuffer);
        }
        Throwable b11 = gVar.b();
        if (b11 == null) {
            return g2.f100423a;
        }
        throw b11;
    }
}
