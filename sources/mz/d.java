package mz;

import io.ktor.utils.io.g;
import java.io.OutputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Writing.kt\nio/ktor/utils/io/jvm/javaio/WritingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", i = {0, 0, 0}, l = {18}, m = "copyTo", n = {"$this$copyTo", "out", "result"}, s = {"L$0", "L$1", "J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f73924a;

        /* renamed from: b, reason: collision with root package name */
        public Object f73925b;

        /* renamed from: c, reason: collision with root package name */
        public long f73926c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f73927d;

        /* renamed from: e, reason: collision with root package name */
        public int f73928e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f73927d = obj;
            this.f73928e |= Integer.MIN_VALUE;
            return d.a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:10:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:11:0x0077). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k io.ktor.utils.io.g r16, @m80.k java.io.OutputStream r17, long r18, @m80.k j00.c<? super java.lang.Long> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof mz.d.a
            if (r3 == 0) goto L17
            r3 = r2
            mz.d$a r3 = (mz.d.a) r3
            int r4 = r3.f73928e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f73928e = r4
            goto L1c
        L17:
            mz.d$a r3 = new mz.d$a
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f73927d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()
            int r5 = r3.f73928e
            r6 = 1
            if (r5 == 0) goto L3f
            if (r5 != r6) goto L37
            long r0 = r3.f73926c
            java.lang.Object r5 = r3.f73925b
            java.io.OutputStream r5 = (java.io.OutputStream) r5
            java.lang.Object r7 = r3.f73924a
            io.ktor.utils.io.g r7 = (io.ktor.utils.io.g) r7
            kotlin.e.n(r2)
            goto L71
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            kotlin.e.n(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L9b
            r0 = r16
            r1 = r17
        L4c:
            boolean r2 = r0.f()
            if (r2 != 0) goto L96
            y40.c0 r2 = r0.e()
            boolean r2 = r2.J()
            if (r2 == 0) goto L76
            r3.f73924a = r0
            r3.f73925b = r1
            r3.f73926c = r7
            r3.f73928e = r6
            r2 = 0
            r5 = 0
            java.lang.Object r2 = io.ktor.utils.io.g.b.a(r0, r2, r3, r6, r5)
            if (r2 != r4) goto L6d
            return r4
        L6d:
            r5 = r1
            r14 = r7
            r7 = r0
            r0 = r14
        L71:
            r14 = r0
            r0 = r7
            r7 = r14
            r9 = r5
            goto L77
        L76:
            r9 = r1
        L77:
            y40.c0 r1 = r0.e()
            y40.b r1 = r1.getBuffer()
            long r1 = r1.r()
            long r1 = r1 + r7
            y40.c0 r5 = r0.e()
            y40.b r8 = r5.getBuffer()
            r12 = 2
            r13 = 0
            r10 = 0
            y40.d.f(r8, r9, r10, r12, r13)
            r7 = r1
            r1 = r9
            goto L4c
        L96:
            java.lang.Long r0 = l00.a.g(r7)
            return r0
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Limit shouldn't be negative: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mz.d.a(io.ktor.utils.io.g, java.io.OutputStream, long, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object b(g gVar, OutputStream outputStream, long j11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return a(gVar, outputStream, j11, cVar);
    }
}
