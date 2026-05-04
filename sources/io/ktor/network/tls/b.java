package io.ktor.network.tls;

import a00.a0;
import a00.q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.q0;
import c40.r0;
import e40.k0;
import e40.l0;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import io.ktor.utils.io.m;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.apache.http.u;
import ux.c0;
import ux.f0;
import ux.i0;
import ux.j0;
import ux.o;
import wx.i;
import x00.p;
import y40.x;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTLSClientHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSClientHandshake.kt\nio/ktor/network/tls/TLSClientHandshake\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,552:1\n12#2,14:553\n1#3:567\n774#4:568\n865#4,2:569\n1755#4,3:571\n808#4,11:574\n295#4:587\n1755#4,3:588\n296#4:591\n1755#4,3:610\n37#5,2:585\n15#6,3:592\n15#6,3:595\n15#6,3:598\n15#6,3:601\n15#6,3:615\n15#6,3:618\n15#6,3:621\n18817#7,2:604\n11165#7:606\n11500#7,3:607\n1310#7,2:613\n*S KotlinDebug\n*F\n+ 1 TLSClientHandshake.kt\nio/ktor/network/tls/TLSClientHandshake\n*L\n162#1:553,14\n176#1:568\n176#1:569,2\n187#1:571,3\n232#1:574,11\n238#1:587\n239#1:588,3\n238#1:591\n393#1:610,3\n236#1:585,2\n260#1:592,3\n270#1:595,3\n360#1:598,3\n364#1:601,3\n427#1:615,3\n469#1:618,3\n471#1:621,3\n385#1:604,2\n392#1:606\n392#1:607,3\n405#1:613,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0 f61044a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f61045b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x f61046c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final byte[] f61047d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61048e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61049f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final k0<i0> f61050g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final l0<i0> f61051h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final k0<f0> f61052i;
    private volatile SecretKeySpec masterSecret;
    private volatile j0 serverHello;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61053a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f61054b;

        static {
            int[] iArr = new int[SecretExchangeType.values().length];
            try {
                iArr[SecretExchangeType.ECDHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecretExchangeType.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61053a = iArr;
            int[] iArr2 = new int[TLSHandshakeType.values().length];
            try {
                iArr2[TLSHandshakeType.Certificate.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TLSHandshakeType.CertificateRequest.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TLSHandshakeType.ServerKeyExchange.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TLSHandshakeType.ServerDone.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f61054b = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 0, 0, 0}, l = {226, 293}, m = "handleCertificatesAndKeys", n = {"this", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: io.ktor.network.tls.b$b, reason: collision with other inner class name */
    public static final class C0705b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61055a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61056b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61057c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61058d;

        /* renamed from: e, reason: collision with root package name */
        public Object f61059e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f61060f;

        /* renamed from: h, reason: collision with root package name */
        public int f61062h;

        public C0705b(j00.c<? super C0705b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61060f = obj;
            this.f61062h |= Integer.MIN_VALUE;
            return b.this.O(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 3}, l = {313, TypedValues.AttributesType.TYPE_EASING, 331, 333, 334}, m = "handleServerDone", n = {"this", "exchangeType", "serverCertificate", "certificateInfo", "encryptionInfo", "this", "certificateInfo", "chain", "preSecret", "this", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61063a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61064b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61065c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61066d;

        /* renamed from: e, reason: collision with root package name */
        public Object f61067e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f61068f;

        /* renamed from: h, reason: collision with root package name */
        public int f61070h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61068f = obj;
            this.f61070h |= Integer.MIN_VALUE;
            return b.this.P(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake$handshakes$1", f = "TLSClientHandshake.kt", i = {0, 1, 1, 1}, l = {136, 151}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "packet", "handshake"}, s = {"L$0", "L$0", "L$1", "L$2"})
    public static final class d extends SuspendLambda implements p<e40.i0<? super f0>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f61071a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61072b;

        /* renamed from: c, reason: collision with root package name */
        public int f61073c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61074d;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = b.this.new d(cVar);
            dVar.f61074d = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(e40.i0<? super f0> i0Var, j00.c<? super g2> cVar) {
            return ((d) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        
            if (r8.b() == io.ktor.network.tls.TLSHandshakeType.Finished) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        
            ux.l0.b(r7.f61075e.f61046c, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        
            r5 = r1.getChannel();
            r7.f61074d = r1;
            r7.f61071a = r4;
            r7.f61072b = r8;
            r7.f61073c = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        
            if (r5.b(r8, r7) != r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            r5 = r1;
            r1 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        
            if (r8 == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:12:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:6:0x0094). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f61073c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f61072b
                ux.f0 r1 = (ux.f0) r1
                java.lang.Object r4 = r7.f61071a
                y40.c0 r4 = (y40.c0) r4
                java.lang.Object r5 = r7.f61074d
                e40.i0 r5 = (e40.i0) r5
                kotlin.e.n(r8)
                goto L94
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                java.lang.Object r1 = r7.f61074d
                e40.i0 r1 = (e40.i0) r1
                kotlin.e.n(r8)
                goto L4d
            L2f:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f61074d
                e40.i0 r8 = (e40.i0) r8
                r1 = r8
            L37:
                io.ktor.network.tls.b r8 = io.ktor.network.tls.b.this
                e40.k0 r8 = r8.H()
                r7.f61074d = r1
                r4 = 0
                r7.f61071a = r4
                r7.f61072b = r4
                r7.f61073c = r3
                java.lang.Object r8 = r8.H(r7)
                if (r8 != r0) goto L4d
                goto L91
            L4d:
                ux.i0 r8 = (ux.i0) r8
                io.ktor.network.tls.TLSRecordType r4 = r8.b()
                io.ktor.network.tls.TLSRecordType r5 = io.ktor.network.tls.TLSRecordType.Handshake
                if (r4 != r5) goto La4
                y40.c0 r8 = r8.a()
                r4 = r8
            L5c:
                boolean r8 = r4.J()
                if (r8 != 0) goto L37
                ux.f0 r8 = io.ktor.network.tls.a.f(r4)
                io.ktor.network.tls.TLSHandshakeType r5 = r8.b()
                io.ktor.network.tls.TLSHandshakeType r6 = io.ktor.network.tls.TLSHandshakeType.HelloRequest
                if (r5 == r6) goto L5c
                io.ktor.network.tls.TLSHandshakeType r5 = r8.b()
                io.ktor.network.tls.TLSHandshakeType r6 = io.ktor.network.tls.TLSHandshakeType.Finished
                if (r5 == r6) goto L7f
                io.ktor.network.tls.b r5 = io.ktor.network.tls.b.this
                y40.x r5 = io.ktor.network.tls.b.o(r5)
                ux.l0.b(r5, r8)
            L7f:
                e40.l0 r5 = r1.getChannel()
                r7.f61074d = r1
                r7.f61071a = r4
                r7.f61072b = r8
                r7.f61073c = r2
                java.lang.Object r5 = r5.b(r8, r7)
                if (r5 != r0) goto L92
            L91:
                return r0
            L92:
                r5 = r1
                r1 = r8
            L94:
                io.ktor.network.tls.TLSHandshakeType r8 = r1.b()
                io.ktor.network.tls.TLSHandshakeType r1 = io.ktor.network.tls.TLSHandshakeType.Finished
                if (r8 != r1) goto La2
                r4.close()
                yz.g2 r8 = yz.g2.f100423a
                return r8
            La2:
                r1 = r5
                goto L5c
            La4:
                y40.c0 r0 = r8.a()
                r0.close()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "TLS handshake expected, got "
                r1.append(r2)
                io.ktor.network.tls.TLSRecordType r8 = r8.b()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake$input$1", f = "TLSClientHandshake.kt", i = {0, 0, 1, 1}, l = {61, 91}, m = "invokeSuspend", n = {"$this$produce", "useCipher", "$this$produce", "useCipher"}, s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class e extends SuspendLambda implements p<e40.i0<? super i0>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61076a;

        /* renamed from: b, reason: collision with root package name */
        public int f61077b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61078c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f61079d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f61080e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61081a;

            static {
                int[] iArr = new int[TLSRecordType.values().length];
                try {
                    iArr[TLSRecordType.Alert.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TLSRecordType.ChangeCipherSpec.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f61081a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.ktor.utils.io.g gVar, b bVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f61079d = gVar;
            this.f61080e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = new e(this.f61079d, this.f61080e, cVar);
            eVar.f61078c = obj;
            return eVar;
        }

        @Override // x00.p
        public final Object invoke(e40.i0<? super i0> i0Var, j00.c<? super g2> cVar) {
            return ((e) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            if (r12.b(r6, r13) == r0) goto L28;
         */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0100: INVOKE (r0 I:e40.l0) = (r5 I:e40.i0) INTERFACE call: e40.i0.getChannel():e40.l0 A[Catch: all -> 0x0111, MD:():e40.l0<E> (m), TRY_ENTER] (LINE:257), block:B:50:0x0100 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0114: INVOKE (r14 I:e40.l0) = (r5 I:e40.i0) INTERFACE call: e40.i0.getChannel():e40.l0 A[Catch: all -> 0x0111, MD:():e40.l0<E> (m), TRY_ENTER] (LINE:277), block:B:44:0x0114 */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x0019, ClosedReceiveChannelException -> 0x0114, TryCatch #1 {ClosedReceiveChannelException -> 0x0114, blocks: (B:7:0x0015, B:8:0x0038, B:13:0x0047, B:15:0x004b, B:16:0x0055, B:19:0x0069, B:22:0x0088, B:25:0x0090, B:26:0x00ab, B:27:0x00ac, B:28:0x00b3, B:29:0x00b4, B:31:0x00cc, B:34:0x00d8, B:38:0x002b), top: B:2:0x0009, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[Catch: all -> 0x0019, ClosedReceiveChannelException -> 0x0114, TryCatch #1 {ClosedReceiveChannelException -> 0x0114, blocks: (B:7:0x0015, B:8:0x0038, B:13:0x0047, B:15:0x004b, B:16:0x0055, B:19:0x0069, B:22:0x0088, B:25:0x0090, B:26:0x00ab, B:27:0x00ac, B:28:0x00b3, B:29:0x00b4, B:31:0x00cc, B:34:0x00d8, B:38:0x002b), top: B:2:0x0009, outer: #0 }] */
        /* JADX WARN: Type inference failed for: r5v0, types: [e40.i0] */
        /* JADX WARN: Type inference failed for: r5v1, types: [e40.i0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0083 -> B:8:0x0038). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008e -> B:8:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3}, l = {163, 164, 167, 168}, m = "negotiate", n = {"this", "$this$use$iv", "closed$iv", "this", "$this$use$iv", "closed$iv", "this", "$this$use$iv", "closed$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "I$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61082a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61083b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61084c;

        /* renamed from: d, reason: collision with root package name */
        public int f61085d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f61086e;

        /* renamed from: g, reason: collision with root package name */
        public int f61088g;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61086e = obj;
            this.f61088g |= Integer.MIN_VALUE;
            return b.this.R(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake$output$1", f = "TLSClientHandshake.kt", i = {0, 0, 1, 1}, l = {108, 113, 119, 129, 119, 129}, m = "invokeSuspend", n = {"$this$actor", "useCipher", "$this$actor", "useCipher"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @u0({"SMAP\nTLSClientHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TLSClientHandshake.kt\nio/ktor/network/tls/TLSClientHandshake$output$1\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,552:1\n15#2,3:553\n*S KotlinDebug\n*F\n+ 1 TLSClientHandshake.kt\nio/ktor/network/tls/TLSClientHandshake$output$1\n*L\n122#1:553,3\n*E\n"})
    public static final class g extends SuspendLambda implements p<e40.c<i0>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f61089a;

        /* renamed from: b, reason: collision with root package name */
        public int f61090b;

        /* renamed from: c, reason: collision with root package name */
        public int f61091c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61092d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f61094f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m mVar, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f61094f = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = b.this.new g(this.f61094f, cVar);
            gVar.f61092d = obj;
            return gVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e40.c<i0> cVar, j00.c<? super g2> cVar2) {
            return ((g) create(cVar, cVar2)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0101, code lost:
        
            if (r11.j(r10) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
        
            if (ux.o.o(r11, r0, r10) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
        
            if (ux.o.o(r11, r4, r10) == r1) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:25:0x006b, B:29:0x007e, B:31:0x0086, B:46:0x00b6, B:48:0x0050, B:51:0x0062, B:22:0x003b, B:33:0x008e, B:34:0x009a, B:37:0x00a3), top: B:2:0x0008, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:22:0x003e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b6 -> B:23:0x00c1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0}, l = {445}, m = "receiveServerFinished", n = {"this"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61095a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61096b;

        /* renamed from: d, reason: collision with root package name */
        public int f61098d;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61096b = obj;
            this.f61098d |= Integer.MIN_VALUE;
            return b.this.S(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {}, l = {210}, m = "receiveServerHello", n = {}, s = {})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f61099a;

        /* renamed from: c, reason: collision with root package name */
        public int f61101c;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61099a = obj;
            this.f61101c |= Integer.MIN_VALUE;
            return b.this.T(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0}, l = {u.P}, m = "sendChangeCipherSpec", n = {"packet"}, s = {"L$0"})
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61102a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61103b;

        /* renamed from: d, reason: collision with root package name */
        public int f61105d;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61103b = obj;
            this.f61105d |= Integer.MIN_VALUE;
            return b.this.V(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0}, l = {396}, m = "sendClientCertificate", n = {"chainAndKey"}, s = {"L$0"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61106a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61107b;

        /* renamed from: d, reason: collision with root package name */
        public int f61109d;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61107b = obj;
            this.f61109d |= Integer.MIN_VALUE;
            return b.this.W(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientHandshake", f = "TLSClientHandshake.kt", i = {0}, l = {479}, m = "sendHandshakeRecord", n = {"element"}, s = {"L$0"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61110a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61111b;

        /* renamed from: d, reason: collision with root package name */
        public int f61113d;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61111b = obj;
            this.f61113d |= Integer.MIN_VALUE;
            return b.this.o0(null, null, this);
        }
    }

    public b(@m80.k io.ktor.utils.io.g rawInput, @m80.k m rawOutput, @m80.k c0 config, @m80.k kotlin.coroutines.d coroutineContext) {
        byte[] c11;
        g0.p(rawInput, "rawInput");
        g0.p(rawOutput, "rawOutput");
        g0.p(config, "config");
        g0.p(coroutineContext, "coroutineContext");
        this.f61044a = config;
        this.f61045b = coroutineContext;
        this.f61046c = ux.l0.a();
        c11 = ux.x.c(config.c());
        this.f61047d = c11;
        this.f61048e = e0.c(new x00.a() { // from class: ux.u
            @Override // x00.a
            public final Object invoke() {
                byte[] Q;
                Q = io.ktor.network.tls.b.Q(io.ktor.network.tls.b.this);
                return Q;
            }
        });
        this.f61049f = e0.c(new x00.a() { // from class: ux.v
            @Override // x00.a
            public final Object invoke() {
                wx.i C;
                C = io.ktor.network.tls.b.C(io.ktor.network.tls.b.this);
                return C;
            }
        });
        this.f61050g = e40.g0.j(this, new q0("cio-tls-parser"), 0, new e(rawInput, this, null), 2, null);
        this.f61051h = e40.b.b(this, new q0("cio-tls-encoder"), 0, null, null, new g(rawOutput, null), 14, null);
        this.f61052i = e40.g0.j(this, new q0("cio-tls-handshake"), 0, new d(null), 2, null);
    }

    public static final wx.i C(b bVar) {
        i.a aVar = wx.i.f96961a;
        j0 j0Var = bVar.serverHello;
        if (j0Var == null) {
            g0.S("serverHello");
            j0Var = null;
        }
        return aVar.a(j0Var.a(), bVar.K());
    }

    public static final byte[] Q(b bVar) {
        j0 j0Var = bVar.serverHello;
        j0 j0Var2 = null;
        if (j0Var == null) {
            g0.S("serverHello");
            j0Var = null;
        }
        ux.e a11 = j0Var.a();
        SecretKeySpec secretKeySpec = bVar.masterSecret;
        if (secretKeySpec == null) {
            g0.S("masterSecret");
            secretKeySpec = null;
        }
        j0 j0Var3 = bVar.serverHello;
        if (j0Var3 == null) {
            g0.S("serverHello");
        } else {
            j0Var2 = j0Var3;
        }
        return ux.l.f(secretKeySpec, q.g3(j0Var2.e(), bVar.f61047d), a11.z(), a11.C(), a11.u());
    }

    public static final g2 Y(ux.b bVar, x sendHandshakeRecord) {
        X509Certificate[] x509CertificateArr;
        g0.p(sendHandshakeRecord, "$this$sendHandshakeRecord");
        if (bVar == null || (x509CertificateArr = bVar.a()) == null) {
            x509CertificateArr = new X509Certificate[0];
        }
        o.p(sendHandshakeRecord, x509CertificateArr);
        return g2.f100423a;
    }

    public static final g2 b0(io.ktor.network.tls.extensions.a aVar, b bVar, final Signature signature, x sendHandshakeRecord) {
        g0.p(sendHandshakeRecord, "$this$sendHandshakeRecord");
        sendHandshakeRecord.u(aVar.f().getCode());
        sendHandshakeRecord.u(aVar.i().getCode());
        jz.j.l(bVar.f61046c, new x00.l() { // from class: ux.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c02;
                c02 = io.ktor.network.tls.b.c0(signature, (y40.c0) obj);
                return c02;
            }
        });
        byte[] sign = signature.sign();
        g0.m(sign);
        sendHandshakeRecord.writeShort((short) sign.length);
        jz.h.i(sendHandshakeRecord, sign, 0, 0, 6, null);
        return g2.f100423a;
    }

    public static final g2 c0(Signature signature, y40.c0 it) {
        g0.p(it, "it");
        signature.update(y40.g0.c(it));
        return g2.f100423a;
    }

    public static final g2 g0(y40.c0 c0Var, x sendHandshakeRecord) {
        g0.p(sendHandshakeRecord, "$this$sendHandshakeRecord");
        jz.h.j(sendHandshakeRecord, c0Var);
        return g2.f100423a;
    }

    public static final g2 l0(b bVar, x sendHandshakeRecord) {
        g0.p(sendHandshakeRecord, "$this$sendHandshakeRecord");
        o.q(sendHandshakeRecord, TLSVersion.TLS12, bVar.f61044a.b(), bVar.f61047d, new byte[32], bVar.f61044a.d());
        return g2.f100423a;
    }

    public static final g2 n0(y40.c0 c0Var, x sendHandshakeRecord) {
        g0.p(sendHandshakeRecord, "$this$sendHandshakeRecord");
        jz.h.j(sendHandshakeRecord, c0Var);
        return g2.f100423a;
    }

    public final byte[] D(ux.i iVar) {
        j0 j0Var = this.serverHello;
        if (j0Var == null) {
            g0.S("serverHello");
            j0Var = null;
        }
        int i11 = a.f61053a[j0Var.a().t().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            byte[] bArr = new byte[48];
            this.f61044a.c().nextBytes(bArr);
            bArr[0] = 3;
            bArr[1] = 3;
            return bArr;
        }
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        g0.m(keyAgreement);
        if (iVar == null) {
            throw new TLSException("ECDHE_ECDSA: Encryption info should be provided", null, 2, null);
        }
        keyAgreement.init(iVar.f());
        keyAgreement.doPhase(iVar.h(), true);
        byte[] generateSecret = keyAgreement.generateSecret();
        g0.m(generateSecret);
        return generateSecret;
    }

    public final wx.i F() {
        return (wx.i) this.f61049f.getValue();
    }

    @m80.k
    public final k0<i0> H() {
        return this.f61050g;
    }

    public final byte[] K() {
        return (byte[]) this.f61048e.getValue();
    }

    @m80.k
    public final l0<i0> M() {
        return this.f61051h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (r13.P(r11, (java.security.cert.Certificate) r1, r12, r13, r14) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r1 != r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023e, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable, kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.security.cert.X509Certificate] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.Throwable, kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0088 -> B:17:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.O(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x014f, code lost:
    
        if (r1.e0(r2, r9) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013a, code lost:
    
        if (r1.V(r9) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0129, code lost:
    
        if (r1.Z(r5, r4, r9) == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(io.ktor.network.tls.SecretExchangeType r22, java.security.cert.Certificate r23, ux.c r24, ux.i r25, j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.P(io.ktor.network.tls.SecretExchangeType, java.security.cert.Certificate, ux.c, ux.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x0068, TryCatch #3 {all -> 0x0068, blocks: (B:43:0x0064, B:44:0x00ac, B:46:0x00b4, B:47:0x00ba, B:52:0x0076), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(@m80.k j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.R(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.S(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(j00.c<? super ux.j0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.network.tls.b.i
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.tls.b$i r0 = (io.ktor.network.tls.b.i) r0
            int r1 = r0.f61101c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61101c = r1
            goto L18
        L13:
            io.ktor.network.tls.b$i r0 = new io.ktor.network.tls.b$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f61099a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61101c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            e40.k0<ux.f0> r5 = r4.f61052i
            r0.f61101c = r3
            java.lang.Object r5 = r5.H(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            ux.f0 r5 = (ux.f0) r5
            io.ktor.network.tls.TLSHandshakeType r0 = r5.b()
            io.ktor.network.tls.TLSHandshakeType r1 = io.ktor.network.tls.TLSHandshakeType.ServerHello
            if (r0 != r1) goto L52
            y40.c0 r5 = r5.a()
            ux.j0 r5 = io.ktor.network.tls.a.h(r5)
            return r5
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected TLS handshake ServerHello but got "
            r0.append(r1)
            io.ktor.network.tls.TLSHandshakeType r5 = r5.b()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.T(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(j00.c<? super yz.g2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.network.tls.b.j
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.network.tls.b$j r0 = (io.ktor.network.tls.b.j) r0
            int r1 = r0.f61105d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61105d = r1
            goto L18
        L13:
            io.ktor.network.tls.b$j r0 = new io.ktor.network.tls.b$j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f61103b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61105d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f61102a
            r1 = r0
            y40.c0 r1 = (y40.c0) r1
            kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L2e:
            r0 = move-exception
            r11 = r0
            goto L61
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            kotlin.e.n(r11)
            y40.b r7 = new y40.b
            r7.<init>()
            r7.u(r3)
            e40.l0<ux.i0> r11 = r10.f61051h     // Catch: java.lang.Throwable -> L5e
            ux.i0 r4 = new ux.i0     // Catch: java.lang.Throwable -> L5e
            io.ktor.network.tls.TLSRecordType r5 = io.ktor.network.tls.TLSRecordType.ChangeCipherSpec     // Catch: java.lang.Throwable -> L5e
            r8 = 2
            r9 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5e
            r0.f61102a = r7     // Catch: java.lang.Throwable -> L5e
            r0.f61105d = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r11 = r11.b(r4, r0)     // Catch: java.lang.Throwable -> L5e
            if (r11 != r1) goto L5b
            return r1
        L5b:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        L5e:
            r0 = move-exception
            r11 = r0
            r1 = r7
        L61:
            r1.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.V(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(ux.c r13, j00.c<? super ux.b> r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.W(ux.c, j00.c):java.lang.Object");
    }

    public final Object Z(ux.c cVar, ux.b bVar, j00.c<? super g2> cVar2) {
        final io.ktor.network.tls.extensions.a aVar;
        X509Certificate x509Certificate = (X509Certificate) a0.jc(bVar.a());
        io.ktor.network.tls.extensions.a[] b11 = cVar.b();
        int length = b11.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                aVar = null;
                break;
            }
            aVar = b11[i11];
            if (u30.f0.c2(aVar.g(), x509Certificate.getSigAlgName(), true)) {
                break;
            }
            i11++;
        }
        if (aVar == null) {
            return g2.f100423a;
        }
        if (aVar.i() == SignatureAlgorithm.DSA) {
            return g2.f100423a;
        }
        final Signature signature = Signature.getInstance(((X509Certificate) a0.jc(bVar.a())).getSigAlgName());
        g0.m(signature);
        signature.initSign(bVar.b());
        Object o02 = o0(TLSHandshakeType.CertificateVerify, new x00.l() { // from class: ux.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b02;
                b02 = io.ktor.network.tls.b.b0(io.ktor.network.tls.extensions.a.this, this, signature, (y40.x) obj);
                return b02;
            }
        }, cVar2);
        return o02 == kotlin.coroutines.intrinsics.b.l() ? o02 : g2.f100423a;
    }

    public final Object e0(SecretKeySpec secretKeySpec, j00.c<? super g2> cVar) {
        x xVar = this.f61046c;
        j0 j0Var = this.serverHello;
        if (j0Var == null) {
            g0.S("serverHello");
            j0Var = null;
        }
        final y40.c0 h11 = o.h(ux.h.i(xVar, j0Var.a().v().getOpenSSLName()), secretKeySpec);
        Object o02 = o0(TLSHandshakeType.Finished, new x00.l() { // from class: ux.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g02;
                g02 = io.ktor.network.tls.b.g0(y40.c0.this, (y40.x) obj);
                return g02;
            }
        }, cVar);
        return o02 == kotlin.coroutines.intrinsics.b.l() ? o02 : g2.f100423a;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61045b;
    }

    public final Object j0(j00.c<? super g2> cVar) {
        Object o02 = o0(TLSHandshakeType.ClientHello, new x00.l() { // from class: ux.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l02;
                l02 = io.ktor.network.tls.b.l0(io.ktor.network.tls.b.this, (y40.x) obj);
                return l02;
            }
        }, cVar);
        return o02 == kotlin.coroutines.intrinsics.b.l() ? o02 : g2.f100423a;
    }

    public final Object m0(SecretExchangeType secretExchangeType, Certificate certificate, byte[] bArr, ux.i iVar, j00.c<? super g2> cVar) {
        final y40.b bVar;
        int i11 = a.f61053a[secretExchangeType.ordinal()];
        if (i11 == 1) {
            bVar = new y40.b();
            if (iVar == null) {
                throw new TLSException("ECDHE: Encryption info should be provided", null, 2, null);
            }
            o.n(bVar, iVar.g());
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new y40.b();
            PublicKey publicKey = certificate.getPublicKey();
            g0.o(publicKey, "getPublicKey(...)");
            o.m(bVar, bArr, publicKey, this.f61044a.c());
        }
        Object o02 = o0(TLSHandshakeType.ClientKeyExchange, new x00.l() { // from class: ux.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n02;
                n02 = io.ktor.network.tls.b.n0(y40.c0.this, (y40.x) obj);
                return n02;
            }
        }, cVar);
        return o02 == kotlin.coroutines.intrinsics.b.l() ? o02 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(io.ktor.network.tls.TLSHandshakeType r11, x00.l<? super y40.x, yz.g2> r12, j00.c<? super yz.g2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof io.ktor.network.tls.b.l
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.network.tls.b$l r0 = (io.ktor.network.tls.b.l) r0
            int r1 = r0.f61113d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61113d = r1
            goto L18
        L13:
            io.ktor.network.tls.b$l r0 = new io.ktor.network.tls.b$l
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f61111b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61113d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r11 = r0.f61110a
            ux.i0 r11 = (ux.i0) r11
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L2d:
            r0 = move-exception
            r12 = r0
            goto L75
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            kotlin.e.n(r13)
            y40.b r13 = new y40.b
            r13.<init>()
            r12.invoke(r13)
            y40.b r7 = new y40.b
            r7.<init>()
            long r4 = jz.j.j(r13)
            int r12 = (int) r4
            ux.o.s(r7, r11, r12)
            jz.h.j(r7, r13)
            y40.x r11 = r10.f61046c
            ux.h.H(r11, r7)
            ux.i0 r4 = new ux.i0
            io.ktor.network.tls.TLSRecordType r5 = io.ktor.network.tls.TLSRecordType.Handshake
            r8 = 2
            r9 = 0
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            e40.l0<ux.i0> r11 = r10.f61051h     // Catch: java.lang.Throwable -> L72
            r0.f61110a = r4     // Catch: java.lang.Throwable -> L72
            r0.f61113d = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r11 = r11.b(r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r11 != r1) goto L6f
            return r1
        L6f:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        L72:
            r0 = move-exception
            r12 = r0
            r11 = r4
        L75:
            y40.c0 r11 = r11.a()
            r11.close()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.tls.b.o0(io.ktor.network.tls.TLSHandshakeType, x00.l, j00.c):java.lang.Object");
    }

    public final void p0(j0 j0Var) {
        ux.e a11 = j0Var.a();
        if (!this.f61044a.b().contains(a11)) {
            throw new IllegalStateException(("Unsupported cipher suite " + a11.D() + " in SERVER_HELLO").toString());
        }
        List<io.ktor.network.tls.extensions.a> d11 = io.ktor.network.tls.extensions.b.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d11) {
            io.ktor.network.tls.extensions.a aVar = (io.ktor.network.tls.extensions.a) obj;
            if (aVar.f() == a11.v() && aVar.i() == a11.F()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new TLSException("No appropriate hash algorithm for suite: " + a11, null, 2, null);
        }
        List<io.ktor.network.tls.extensions.a> d12 = j0Var.d();
        if (d12.isEmpty()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (d12.contains((io.ktor.network.tls.extensions.a) it.next())) {
                    return;
                }
            }
        }
        throw new TLSException("No sign algorithms in common. \nServer candidates: " + d12 + " \nClient candidates: " + arrayList, null, 2, null);
    }

    public static /* synthetic */ void G() {
    }

    public static /* synthetic */ void J() {
    }

    public static /* synthetic */ void N() {
    }
}
