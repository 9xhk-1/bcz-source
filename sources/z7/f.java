package z7;

import androidx.core.app.NotificationCompat;
import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import rw.d1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nThriftHttpTransporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftHttpTransporter.kt\ncom/baicizhan/app/net/thrift/KtorTransporter\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 6 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n*L\n1#1,51:1\n74#2:52\n34#2:53\n75#2,2:54\n77#2:88\n19#2:89\n216#3,2:56\n16#4,4:58\n21#4,10:78\n58#5,16:62\n58#5,16:91\n142#6:90\n*S KotlinDebug\n*F\n+ 1 ThriftHttpTransporter.kt\ncom/baicizhan/app/net/thrift/KtorTransporter\n*L\n26#1:52\n26#1:53\n26#1:54,2\n26#1:88\n26#1:89\n27#1:56,2\n35#1:58,4\n35#1:78,10\n35#1:62,16\n40#1:91,16\n40#1:90\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final lw.c f101069a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.net.thrift.KtorTransporter", f = "ThriftHttpTransporter.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {89, 90}, m = NotificationCompat.CATEGORY_TRANSPORT, n = {"url", AssistPushConsts.MSG_TYPE_PAYLOAD, "requestHeaders", "$this$transport_u24lambda_u240", "$this$request$iv", "url$iv", "$completion$iv", "$this$request$iv$iv", "$this$request$iv$iv$iv", "builder$iv$iv$iv", "connectionTimeout", "sockedTimeOut", "$i$a$-runCatching-KtorTransporter$transport$2", "$i$f$request", "$i$f$request", "$i$f$request", "url", AssistPushConsts.MSG_TYPE_PAYLOAD, "requestHeaders", "$this$transport_u24lambda_u240", "it", "$this$body$iv", "$completion$iv", "connectionTimeout", "sockedTimeOut", "$i$a$-runCatching-KtorTransporter$transport$2", "$i$a$-let-KtorTransporter$transport$2$2", "$i$f$body"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "J$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "I$0", "I$1", "I$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f101070a;

        /* renamed from: b, reason: collision with root package name */
        public Object f101071b;

        /* renamed from: c, reason: collision with root package name */
        public Object f101072c;

        /* renamed from: d, reason: collision with root package name */
        public Object f101073d;

        /* renamed from: e, reason: collision with root package name */
        public Object f101074e;

        /* renamed from: f, reason: collision with root package name */
        public Object f101075f;

        /* renamed from: g, reason: collision with root package name */
        public Object f101076g;

        /* renamed from: h, reason: collision with root package name */
        public Object f101077h;

        /* renamed from: i, reason: collision with root package name */
        public Object f101078i;

        /* renamed from: j, reason: collision with root package name */
        public Object f101079j;

        /* renamed from: k, reason: collision with root package name */
        public long f101080k;

        /* renamed from: l, reason: collision with root package name */
        public long f101081l;

        /* renamed from: m, reason: collision with root package name */
        public int f101082m;

        /* renamed from: n, reason: collision with root package name */
        public int f101083n;

        /* renamed from: o, reason: collision with root package name */
        public int f101084o;

        /* renamed from: p, reason: collision with root package name */
        public int f101085p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f101086q;

        /* renamed from: s, reason: collision with root package name */
        public int f101088s;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f101086q = obj;
            this.f101088s |= Integer.MIN_VALUE;
            return f.this.a(null, 0L, 0L, null, null, this);
        }
    }

    public f(@k lw.c httpClient) {
        g0.p(httpClient, "httpClient");
        this.f101069a = httpClient;
    }

    public static final g2 c(long j11, long j12, d1 timeout) {
        g0.p(timeout, "$this$timeout");
        timeout.f(Long.valueOf(j11));
        timeout.h(Long.valueOf(j12));
        return g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|(5:14|15|(3:20|21|(1:23)(2:24|25))|17|18)(2:29|30))(2:31|32))(2:33|34))(9:48|49|(2:52|50)|53|54|55|(4:57|58|59|60)(2:67|(1:69)(4:70|71|72|73))|61|(2:63|43)(1:64))|35|(5:37|38|39|40|41)(2:46|47)))|78|6|7|(0)(0)|35|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f2, code lost:
    
        if (r0 == r8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0227, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0199 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x004f, B:14:0x01f7, B:29:0x01fe, B:30:0x0205, B:34:0x008d, B:35:0x0187, B:37:0x0199, B:41:0x01aa, B:46:0x0206, B:47:0x0226, B:49:0x0095, B:50:0x00ad, B:52:0x00b3, B:54:0x00d0, B:57:0x00ed, B:60:0x00fc, B:61:0x0126, B:67:0x0105, B:69:0x0109, B:70:0x0111, B:73:0x011e), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0206 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x004f, B:14:0x01f7, B:29:0x01fe, B:30:0x0205, B:34:0x008d, B:35:0x0187, B:37:0x0199, B:41:0x01aa, B:46:0x0206, B:47:0x0226, B:49:0x0095, B:50:0x00ad, B:52:0x00b3, B:54:0x00d0, B:57:0x00ed, B:60:0x00fc, B:61:0x0126, B:67:0x0105, B:69:0x0109, B:70:0x0111, B:73:0x011e), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // z7.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k java.lang.String r19, final long r20, final long r22, @m80.k byte[] r24, @m80.k java.util.Map<java.lang.String, java.lang.String> r25, @m80.k j00.c<? super byte[]> r26) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.a(java.lang.String, long, long, byte[], java.util.Map, j00.c):java.lang.Object");
    }
}
