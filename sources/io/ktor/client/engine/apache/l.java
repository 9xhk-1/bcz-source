package io.ktor.client.engine.apache;

import cx.z;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import rw.f1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApacheHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApacheHttpRequest.kt\nio/ktor/client/engine/apache/ApacheHttpRequestKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,72:1\n3829#2:73\n4344#2,2:74\n1498#3:76\n1528#3,3:77\n1531#3,3:87\n381#4,7:80\n*S KotlinDebug\n*F\n+ 1 ApacheHttpRequest.kt\nio/ktor/client/engine/apache/ApacheHttpRequestKt\n*L\n45#1:73\n45#1:74,2\n47#1:76\n47#1:77,3\n47#1:87,3\n47#1:80,7\n*E\n"})
/* loaded from: classes8.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.apache.ApacheHttpRequestKt", f = "ApacheHttpRequest.kt", i = {0, 0, 0, 0, 0}, l = {37}, m = "sendRequest", n = {"callContext", "requestData", "requestTime", "consumer", "future"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60755a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60756b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60757c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60758d;

        /* renamed from: e, reason: collision with root package name */
        public Object f60759e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f60760f;

        /* renamed from: g, reason: collision with root package name */
        public int f60761g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60760f = obj;
            this.f60761g |= Integer.MIN_VALUE;
            return l.b(null, null, null, null, this);
        }
    }

    @m80.k
    public static final Exception a(@m80.k Exception exception, @m80.k z requestData) {
        g0.p(exception, "exception");
        g0.p(requestData, "requestData");
        return ((exception instanceof ConnectException) && u.a((ConnectException) exception)) ? f1.b(requestData, exception) : exception instanceof SocketTimeoutException ? f1.h(requestData, exception) : exception;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        if (r15 != null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6 A[Catch: Exception -> 0x00db, TRY_ENTER, TryCatch #3 {Exception -> 0x00db, blocks: (B:19:0x00c3, B:21:0x00cb, B:26:0x00e1, B:38:0x00f6, B:40:0x0107, B:41:0x010f, B:45:0x011b), top: B:18:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135 A[Catch: Exception -> 0x0147, TRY_LEAVE, TryCatch #4 {Exception -> 0x0147, blocks: (B:15:0x007e, B:35:0x00e7, B:36:0x00f0, B:49:0x011f, B:51:0x0135), top: B:14:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k d70.c r11, @m80.k io.ktor.client.engine.apache.p r12, @m80.k kotlin.coroutines.d r13, @m80.k cx.z r14, @m80.k j00.c<? super cx.f0> r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.apache.l.b(d70.c, io.ktor.client.engine.apache.p, kotlin.coroutines.d, cx.z, j00.c):java.lang.Object");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements u60.b<g2> {
        @Override // u60.b
        public void b(Exception exception) {
            g0.p(exception, "exception");
        }

        @Override // u60.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(g2 result) {
            g0.p(result, "result");
        }

        @Override // u60.b
        public void a() {
        }
    }
}
