package uw;

import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.h1;
import c40.m0;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.dataset.provider.a;
import ix.t2;
import java.io.File;
import java.security.MessageDigest;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import u30.f0;
import xy.b0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,196:1\n168#2,3:197\n116#3,10:200\n12#4,14:210\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage\n*L\n83#1:197,3\n113#1:200,10\n118#1:210,14\n*E\n"})
/* loaded from: classes8.dex */
public final class h implements uw.b {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final File f92462b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m0 f92463c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final zy.d<String, n40.a> f92464d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {81}, m = "find", n = {"varyKeys"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92465a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92466b;

        /* renamed from: d, reason: collision with root package name */
        public int f92468d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92466b = obj;
            this.f92468d |= Integer.MIN_VALUE;
            return h.this.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {}, l = {77}, m = "findAll", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f92469a;

        /* renamed from: c, reason: collision with root package name */
        public int f92471c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92469a = obj;
            this.f92471c |= Integer.MIN_VALUE;
            return h.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {202, 120, 123, 125}, m = "readCache", n = {"this", "urlHex", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "closed$iv", "this", "$this$withLock_u24default$iv", "$this$use$iv", "channel", "caches", "closed$iv", "requestsCount", "i", "$this$withLock_u24default$iv", "$this$use$iv", "caches", "closed$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "I$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92472a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92473b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92474c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92475d;

        /* renamed from: e, reason: collision with root package name */
        public Object f92476e;

        /* renamed from: f, reason: collision with root package name */
        public Object f92477f;

        /* renamed from: g, reason: collision with root package name */
        public int f92478g;

        /* renamed from: h, reason: collision with root package name */
        public int f92479h;

        /* renamed from: i, reason: collision with root package name */
        public int f92480i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f92481j;

        /* renamed from: l, reason: collision with root package name */
        public int f92483l;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92481j = obj;
            this.f92483l |= Integer.MIN_VALUE;
            return h.this.n(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {159, 160, 160, 161, 162, 165, 166, 169, 170, 171, 172, 175, 176, 180, 182}, m = "readCache", n = {"channel", "channel", "url", "channel", "url", "channel", "url", "status", "channel", "url", "status", "version", "channel", "url", "status", "version", "headers", "headersCount", "j", "channel", "url", "status", "version", "headers", a.d.C0245a.f16161a, "headersCount", "j", "channel", "url", "status", "version", "headers", "channel", "url", "status", "version", "headers", "requestTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u245", "varyKeysCount", "j", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u245", a.d.C0245a.f16161a, "varyKeysCount", "j", "channel", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "url", "status", "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", TtmlNode.TAG_BODY}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92484a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92485b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92486c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92487d;

        /* renamed from: e, reason: collision with root package name */
        public Object f92488e;

        /* renamed from: f, reason: collision with root package name */
        public Object f92489f;

        /* renamed from: g, reason: collision with root package name */
        public Object f92490g;

        /* renamed from: h, reason: collision with root package name */
        public Object f92491h;

        /* renamed from: i, reason: collision with root package name */
        public Object f92492i;

        /* renamed from: j, reason: collision with root package name */
        public Object f92493j;

        /* renamed from: k, reason: collision with root package name */
        public Object f92494k;

        /* renamed from: l, reason: collision with root package name */
        public int f92495l;

        /* renamed from: m, reason: collision with root package name */
        public int f92496m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f92497n;

        /* renamed from: p, reason: collision with root package name */
        public int f92499p;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92497n = obj;
            this.f92499p |= Integer.MIN_VALUE;
            return h.this.m(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0}, l = {72, 73}, m = "invokeSuspend", n = {"urlHex"}, s = {"L$0"})
    @u0({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$store$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n827#2:197\n855#2,2:198\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$store$2\n*L\n72#1:197\n72#1:198,2\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f92500a;

        /* renamed from: b, reason: collision with root package name */
        public int f92501b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t2 f92503d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ uw.c f92504e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t2 t2Var, uw.c cVar, j00.c<? super e> cVar2) {
            super(2, cVar2);
            this.f92503d = t2Var;
            this.f92504e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return h.this.new e(this.f92503d, this.f92504e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        
            if (r3.q(r1, r9, r8) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
        
            if (r9 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f92501b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r9)
                goto L7a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f92500a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.e.n(r9)
                goto L3a
            L22:
                kotlin.e.n(r9)
                uw.h r9 = uw.h.this
                ix.t2 r1 = r8.f92503d
                java.lang.String r1 = uw.h.g(r9, r1)
                uw.h r9 = uw.h.this
                r8.f92500a = r1
                r8.f92501b = r3
                java.lang.Object r9 = uw.h.i(r9, r1, r8)
                if (r9 != r0) goto L3a
                goto L79
            L3a:
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                uw.c r3 = r8.f92504e
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r9 = r9.iterator()
            L47:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L66
                java.lang.Object r5 = r9.next()
                r6 = r5
                uw.c r6 = (uw.c) r6
                java.util.Map r6 = r6.i()
                java.util.Map r7 = r3.i()
                boolean r6 = kotlin.jvm.internal.g0.g(r6, r7)
                if (r6 != 0) goto L47
                r4.add(r5)
                goto L47
            L66:
                uw.c r9 = r8.f92504e
                java.util.List r9 = a00.r0.J4(r4, r9)
                uw.h r3 = uw.h.this
                r4 = 0
                r8.f92500a = r4
                r8.f92501b = r2
                java.lang.Object r9 = uw.h.k(r3, r1, r9, r8)
                if (r9 != r0) goto L7a
            L79:
                return r0
            L7a:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: uw.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 1}, l = {202, 103}, m = "invokeSuspend", n = {"$this$coroutineScope", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
    @u0({"SMAP\nFileCacheStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,196:1\n116#2,8:197\n125#2,2:219\n12#3,14:205\n*S KotlinDebug\n*F\n+ 1 FileCacheStorage.kt\nio/ktor/client/plugins/cache/storage/FileCacheStorage$writeCache$2\n*L\n92#1:197,8\n92#1:219,2\n95#1:205,14\n*E\n"})
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f92505a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92506b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92507c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92508d;

        /* renamed from: e, reason: collision with root package name */
        public int f92509e;

        /* renamed from: f, reason: collision with root package name */
        public int f92510f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f92511g;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f92513i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<uw.c> f92514j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", f = "FileCacheStorage.kt", i = {}, l = {97, 99}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f92515a;

            /* renamed from: b, reason: collision with root package name */
            public int f92516b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.b f92517c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<uw.c> f92518d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h f92519e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.b bVar, List<uw.c> list, h hVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f92517c = bVar;
                this.f92518d = list;
                this.f92519e = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f92517c, this.f92518d, this.f92519e, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
            
                if (io.ktor.utils.io.q.t(r6, r1, r5) == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f92516b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r1 = r5.f92515a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    kotlin.e.n(r6)
                    goto L3d
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    kotlin.e.n(r6)
                    goto L36
                L22:
                    kotlin.e.n(r6)
                    io.ktor.utils.io.b r6 = r5.f92517c
                    java.util.List<uw.c> r1 = r5.f92518d
                    int r1 = r1.size()
                    r5.f92516b = r3
                    java.lang.Object r6 = io.ktor.utils.io.q.t(r6, r1, r5)
                    if (r6 != r0) goto L36
                    goto L57
                L36:
                    java.util.List<uw.c> r6 = r5.f92518d
                    java.util.Iterator r6 = r6.iterator()
                    r1 = r6
                L3d:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L58
                    java.lang.Object r6 = r1.next()
                    uw.c r6 = (uw.c) r6
                    uw.h r3 = r5.f92519e
                    io.ktor.utils.io.b r4 = r5.f92517c
                    r5.f92515a = r1
                    r5.f92516b = r2
                    java.lang.Object r6 = uw.h.j(r3, r4, r6, r5)
                    if (r6 != r0) goto L3d
                L57:
                    return r0
                L58:
                    io.ktor.utils.io.b r6 = r5.f92517c
                    r6.close()
                    yz.g2 r6 = yz.g2.f100423a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: uw.h.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, List<uw.c> list, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f92513i = str;
            this.f92514j = list;
        }

        public static final n40.a j() {
            return n40.g.b(false, 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = h.this.new f(this.f92513i, this.f92514j, cVar);
            fVar.f92511g = obj;
            return fVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<Object> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
            	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
            	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
            	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
            	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
            	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
            	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: uw.h.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Object> cVar) {
            return invoke2(r0Var, (j00.c<Object>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {136, 137, 138, 139, 141, 143, 144, 146, 147, 148, 149, 151, 152, 154, 155}, m = "writeCache", n = {"channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "headers", "channel", "cache", "value", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "value", "channel", "cache", "channel", "cache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92520a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92521b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92522c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92523d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f92524e;

        /* renamed from: g, reason: collision with root package name */
        public int f92526g;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92524e = obj;
            this.f92526g |= Integer.MIN_VALUE;
            return h.this.p(null, null, this);
        }
    }

    public h(@m80.k File directory, @m80.k m0 dispatcher) {
        g0.p(directory, "directory");
        g0.p(dispatcher, "dispatcher");
        this.f92462b = directory;
        this.f92463c = dispatcher;
        this.f92464d = new zy.d<>(0, 1, null);
        directory.mkdirs();
    }

    public static final /* synthetic */ File e(h hVar) {
        return hVar.f92462b;
    }

    public static final /* synthetic */ zy.d f(h hVar) {
        return hVar.f92464d;
    }

    public static final n40.a o() {
        return n40.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // uw.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k ix.t2 r5, @m80.k j00.c<? super java.util.Set<uw.c>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof uw.h.b
            if (r0 == 0) goto L13
            r0 = r6
            uw.h$b r0 = (uw.h.b) r0
            int r1 = r0.f92471c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92471c = r1
            goto L18
        L13:
            uw.h$b r0 = new uw.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f92469a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92471c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            java.lang.String r5 = r4.l(r5)
            r0.f92471c = r3
            java.lang.Object r6 = r4.n(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r5 = a00.r0.f6(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.h.a(ix.t2, j00.c):java.lang.Object");
    }

    @Override // uw.b
    @m80.l
    public Object b(@m80.k t2 t2Var, @m80.k uw.c cVar, @m80.k j00.c<? super g2> cVar2) {
        Object h11 = c40.i.h(this.f92463c, new e(t2Var, cVar, null), cVar2);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // uw.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k ix.t2 r6, @m80.k java.util.Map<java.lang.String, java.lang.String> r7, @m80.k j00.c<? super uw.c> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof uw.h.a
            if (r0 == 0) goto L13
            r0 = r8
            uw.h$a r0 = (uw.h.a) r0
            int r1 = r0.f92468d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92468d = r1
            goto L18
        L13:
            uw.h$a r0 = new uw.h$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f92466b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92468d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f92465a
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            kotlin.e.n(r8)
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.e.n(r8)
            java.lang.String r6 = r5.l(r6)
            r0.f92465a = r7
            r0.f92468d = r3
            java.lang.Object r8 = r5.n(r6, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L50:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r6.next()
            r0 = r8
            uw.c r0 = (uw.c) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L64
            return r8
        L64:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r4 = r0.i()
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.g0.g(r3, r2)
            if (r2 != 0) goto L6c
            goto L50
        L93:
            return r8
        L94:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.h.c(ix.t2, java.util.Map, j00.c):java.lang.Object");
    }

    public final String l(t2 t2Var) {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(f0.X1(t2Var.toString()));
        g0.o(digest, "digest(...)");
        return b0.h(digest);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x03c8, code lost:
    
        if (r1 != r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x037e, code lost:
    
        if (r1 != r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02c8, code lost:
    
        if (r1 != r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0451 -> B:21:0x0460). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x032e -> B:46:0x0335). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(io.ktor.utils.io.g r28, j00.c<? super uw.c> r29) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.h.m(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0186 A[Catch: all -> 0x018a, Exception -> 0x018d, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x018d, all -> 0x018a, blocks: (B:17:0x0186, B:29:0x01ac), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ab A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #10 {all -> 0x01a9, blocks: (B:25:0x01ab, B:35:0x01a5, B:31:0x01a0), top: B:30:0x01a0, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164 A[Catch: all -> 0x0160, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:55:0x012f, B:47:0x0164), top: B:54:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #2 {all -> 0x00f1, blocks: (B:95:0x01ae, B:79:0x00dc, B:81:0x00e9, B:85:0x00f4), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4, types: [n40.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [n40.a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, n40.a] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x014a -> B:41:0x0151). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r20, j00.c<? super java.util.Set<uw.c>> r21) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.h.n(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0314, code lost:
    
        if (io.ktor.utils.io.q.s(r4, r5, 0, 0, r8, 6, null) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02fd, code lost:
    
        if (io.ktor.utils.io.q.t(r14, r15, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0275, code lost:
    
        if (io.ktor.utils.io.q.t(r14, r15, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x025d, code lost:
    
        if (io.ktor.utils.io.q.u(r14, r5, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0247, code lost:
    
        if (io.ktor.utils.io.q.u(r14, r5, r0) != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ab, code lost:
    
        if (io.ktor.utils.io.q.t(r2, r15, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018e, code lost:
    
        if (io.ktor.utils.io.q.A(r14, r15, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        if (io.ktor.utils.io.q.A(r14, r15, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        if (io.ktor.utils.io.q.A(r13, r15, r0) == r1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x02e6 -> B:20:0x0285). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0213 -> B:43:0x01b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(io.ktor.utils.io.b r13, uw.c r14, j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.h.p(io.ktor.utils.io.b, uw.c, j00.c):java.lang.Object");
    }

    public final Object q(String str, List<uw.c> list, j00.c<Object> cVar) {
        return s0.g(new f(str, list, null), cVar);
    }

    public /* synthetic */ h(File file, m0 m0Var, int i11, v vVar) {
        this(file, (i11 & 2) != 0 ? h1.c() : m0Var);
    }
}
