package fx;

import c40.b2;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {22, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1", "L$5", "L$6", "J$0", "I$0", "L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1"})
    @u0({"SMAP\nByteChannelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannelUtils.kt\nio/ktor/client/utils/ByteChannelUtilsKt$observable$1\n+ 2 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,35:1\n156#2,5:36\n*S KotlinDebug\n*F\n+ 1 ByteChannelUtils.kt\nio/ktor/client/utils/ByteChannelUtilsKt$observable$1\n*L\n19#1:36,5\n*E\n"})
    /* renamed from: fx.a$a, reason: collision with other inner class name */
    public static final class C0619a extends SuspendLambda implements p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f52378a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52379b;

        /* renamed from: c, reason: collision with root package name */
        public Object f52380c;

        /* renamed from: d, reason: collision with root package name */
        public Object f52381d;

        /* renamed from: e, reason: collision with root package name */
        public Object f52382e;

        /* renamed from: f, reason: collision with root package name */
        public Object f52383f;

        /* renamed from: g, reason: collision with root package name */
        public long f52384g;

        /* renamed from: h, reason: collision with root package name */
        public int f52385h;

        /* renamed from: i, reason: collision with root package name */
        public int f52386i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f52387j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f52388k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ nw.d f52389l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Long f52390m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0619a(io.ktor.utils.io.g gVar, nw.d dVar, Long l11, j00.c<? super C0619a> cVar) {
            super(2, cVar);
            this.f52388k = gVar;
            this.f52389l = dVar;
            this.f52390m = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C0619a c0619a = new C0619a(this.f52388k, this.f52389l, this.f52390m, cVar);
            c0619a.f52387j = obj;
            return c0619a;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((C0619a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x01b3, code lost:
        
            if (r15.a(r13, r20, r24) == r7) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[Catch: all -> 0x017d, TryCatch #4 {all -> 0x017d, blocks: (B:27:0x00e8, B:29:0x00ee, B:34:0x011c, B:36:0x0124, B:48:0x018b, B:52:0x019c), top: B:26:0x00e8 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0124 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #4 {all -> 0x017d, blocks: (B:27:0x00e8, B:29:0x00ee, B:34:0x011c, B:36:0x0124, B:48:0x018b, B:52:0x019c), top: B:26:0x00e8 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016f -> B:24:0x0057). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0181 -> B:26:0x00e8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fx.a.C0619a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m80.k
    public static final io.ktor.utils.io.g a(@m80.k io.ktor.utils.io.g gVar, @m80.k kotlin.coroutines.d context, @m80.l Long l11, @m80.k nw.d listener) {
        g0.p(gVar, "<this>");
        g0.p(context, "context");
        g0.p(listener, "listener");
        return q.C(b2.f7824a, context, true, new C0619a(gVar, listener, l11, null)).b();
    }
}
