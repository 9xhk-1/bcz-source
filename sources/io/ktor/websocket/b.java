package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.h1;
import c40.l2;
import c40.n2;
import c40.q0;
import c40.r0;
import c40.s0;
import c40.x0;
import com.jiongji.andriod.card.R;
import e40.l0;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.a;
import io.ktor.websocket.d;
import ix.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import org.slf4j.Logger;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n33#2,2:373\n33#2,2:375\n33#2,2:377\n1797#3,3:379\n1797#3,3:382\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl\n*L\n137#1:373,2\n263#1:375,2\n283#1:377,2\n342#1:379,3\n345#1:382,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements io.ktor.websocket.a, j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j0 f62331a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.x<CloseReason> f62332b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final e40.o<io.ktor.websocket.d> f62333c;

    @m80.k
    private volatile /* synthetic */ int closed;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e40.o<io.ktor.websocket.d> f62334d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c40.a0 f62335e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<z<?>> f62336f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62337g;

    /* renamed from: h, reason: collision with root package name */
    public long f62338h;

    /* renamed from: i, reason: collision with root package name */
    public long f62339i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final x0<CloseReason> f62340j;

    @m80.k
    volatile /* synthetic */ Object pinger;

    @m80.k
    private volatile /* synthetic */ int started;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f62326k = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final d.e f62330o = new d.e(new byte[0], io.ktor.websocket.f.f62392a);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62327l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "pinger");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f62328m = AtomicIntegerFieldUpdater.newUpdater(b.class, "closed");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f62329n = AtomicIntegerFieldUpdater.newUpdater(b.class, "started");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0}, l = {336}, m = "checkMaxFrameSize", n = {g.b.f62794h}, s = {"I$0"})
    /* renamed from: io.ktor.websocket.b$b, reason: collision with other inner class name */
    public static final class C0727b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f62341a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62342b;

        /* renamed from: d, reason: collision with root package name */
        public int f62344d;

        public C0727b(j00.c<? super C0727b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62342b = obj;
            this.f62344d |= Integer.MIN_VALUE;
            return b.this.m(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 2}, l = {262, 266, 276}, m = "outgoingProcessorLoop", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62345a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62346b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62347c;

        /* renamed from: e, reason: collision with root package name */
        public int f62349e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62347c = obj;
            this.f62349e |= Integer.MIN_VALUE;
            return b.this.p(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {377, 183, R.styleable.Theme_drawable_tab_mall_1111, 189, 190, 192, 207, R.styleable.Theme_drawable_sound, R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_mall_1111}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", TypedValues.AttributesType.S_FRAME, "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
    @u0({"SMAP\nDefaultWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n+ 3 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,372:1\n160#2:373\n94#2,3:374\n161#2:377\n101#2:380\n162#2:381\n97#2,3:382\n33#3,2:378\n*S KotlinDebug\n*F\n+ 1 DefaultWebSocketSession.kt\nio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1\n*L\n178#1:373\n178#1:374,3\n178#1:377\n178#1:380\n178#1:381\n178#1:382,3\n179#1:378,2\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62350a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62351b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62352c;

        /* renamed from: d, reason: collision with root package name */
        public Object f62353d;

        /* renamed from: e, reason: collision with root package name */
        public Object f62354e;

        /* renamed from: f, reason: collision with root package name */
        public Object f62355f;

        /* renamed from: g, reason: collision with root package name */
        public Object f62356g;

        /* renamed from: h, reason: collision with root package name */
        public Object f62357h;

        /* renamed from: i, reason: collision with root package name */
        public int f62358i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f62359j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e40.l0<d.C0728d> f62361l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e40.l0<? super d.C0728d> l0Var, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f62361l = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = b.this.new d(this.f62361l, cVar);
            dVar.f62359j = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:132:0x04e6, code lost:
        
            if (io.ktor.websocket.k0.a(r0, r4, r30) == r2) goto L152;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x045b, code lost:
        
            if (io.ktor.websocket.k0.a(r0, r4, r30) == r2) goto L152;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x03ba, code lost:
        
            r4 = r11.element;
            kotlin.jvm.internal.g0.m(r4);
            jz.h.i((y40.x) r4, r0.d(), 0, 0, 6, null);
            r0 = r12;
            r12 = r6;
            r6 = r0;
            r0 = r11;
            r11 = r8;
            r8 = r9;
            r9 = r10;
            r10 = r0;
            r0 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x03ff, code lost:
        
            if (io.ktor.websocket.k0.a(r0, r4, r30) == r2) goto L152;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0186 A[Catch: all -> 0x004a, TryCatch #4 {all -> 0x004a, blocks: (B:13:0x0045, B:14:0x03b6, B:20:0x017e, B:22:0x0186, B:24:0x0196, B:25:0x01b2, B:27:0x01b6, B:29:0x01c0, B:31:0x01ce, B:32:0x01d2, B:35:0x01f0, B:45:0x023b, B:47:0x023f, B:49:0x0245, B:52:0x0260, B:53:0x0264, B:55:0x0268, B:58:0x0283, B:59:0x0287, B:90:0x03bd, B:104:0x006e, B:109:0x00c3, B:112:0x00e8, B:117:0x0104, B:119:0x0129), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x02ba A[Catch: all -> 0x009c, TryCatch #5 {all -> 0x009c, blocks: (B:62:0x02b4, B:64:0x02ba, B:66:0x02be, B:67:0x02c0, B:69:0x02c4, B:70:0x02ca, B:72:0x02ed, B:74:0x02f1, B:78:0x032b, B:107:0x0097), top: B:106:0x0097 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02ed A[Catch: all -> 0x009c, TryCatch #5 {all -> 0x009c, blocks: (B:62:0x02b4, B:64:0x02ba, B:66:0x02be, B:67:0x02c0, B:69:0x02c4, B:70:0x02ca, B:72:0x02ed, B:74:0x02f1, B:78:0x032b, B:107:0x0097), top: B:106:0x0097 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x03bd A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #4 {all -> 0x004a, blocks: (B:13:0x0045, B:14:0x03b6, B:20:0x017e, B:22:0x0186, B:24:0x0196, B:25:0x01b2, B:27:0x01b6, B:29:0x01c0, B:31:0x01ce, B:32:0x01d2, B:35:0x01f0, B:45:0x023b, B:47:0x023f, B:49:0x0245, B:52:0x0260, B:53:0x0264, B:55:0x0268, B:58:0x0283, B:59:0x0287, B:90:0x03bd, B:104:0x006e, B:109:0x00c3, B:112:0x00e8, B:117:0x0104, B:119:0x0129), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r0v42, types: [T, io.ktor.websocket.d] */
        /* JADX WARN: Type inference failed for: r0v78 */
        /* JADX WARN: Type inference failed for: r0v95 */
        /* JADX WARN: Type inference failed for: r4v29, types: [T, y40.x] */
        /* JADX WARN: Type inference failed for: r7v13, types: [e40.l0] */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v20, types: [e40.l0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v27 */
        /* JADX WARN: Type inference failed for: r7v29 */
        /* JADX WARN: Type inference failed for: r7v31 */
        /* JADX WARN: Type inference failed for: r7v34 */
        /* JADX WARN: Type inference failed for: r7v35 */
        /* JADX WARN: Type inference failed for: r7v7, types: [e40.l0] */
        /* JADX WARN: Type inference failed for: r7v9, types: [e40.l0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0243 -> B:15:0x031e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0316 -> B:15:0x031e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x03ae -> B:14:0x03b6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 1290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", f = "DefaultWebSocketSession.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.p<CloseReason, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f62362a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62363b;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = b.this.new e(cVar);
            eVar.f62363b = obj;
            return eVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CloseReason closeReason, j00.c<? super g2> cVar) {
            return ((e) create(closeReason, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f62362a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                CloseReason closeReason = (CloseReason) this.f62363b;
                b bVar = b.this;
                IOException iOException = new IOException("Ping timeout");
                this.f62362a = 1;
                if (bVar.x(closeReason, iOException, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", i = {}, l = {R.styleable.Theme_drawable_walk_sound2, 257, 257, 257, 250, 257, 257, 254, 257, 257}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62365a;

        /* renamed from: b, reason: collision with root package name */
        public int f62366b;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new f(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a1, code lost:
        
            if (io.ktor.websocket.k0.c(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
        
            if (io.ktor.websocket.k0.c(r11, null, r10, 1, null) == r1) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (io.ktor.websocket.k0.c(r11, null, r10, 1, null) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
        
            if (r11.p(r10) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            if (io.ktor.websocket.k0.c(r11, null, r10, 1, null) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
        
            if (io.ktor.websocket.b.y(r4, r5, null, r7, 2, null) != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
        
            if (io.ktor.websocket.k0.c(r11, null, r10, 1, null) != r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
        
            if (io.ktor.websocket.k0.c(r11, null, r10, 1, null) != r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
        
            if (io.ktor.websocket.k0.d(r0, r0, r10) != r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0144 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", i = {0, 0, 0}, l = {290}, m = "sendCloseSequence", n = {"this", "exception", "reasonToSend"}, s = {"L$0", "L$1", "L$2"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62368a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62369b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62370c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62371d;

        /* renamed from: f, reason: collision with root package name */
        public int f62373f;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62371d = obj;
            this.f62373f |= Integer.MIN_VALUE;
            return b.this.x(null, null, this);
        }
    }

    public b(@m80.k j0 raw, long j11, long j12) {
        kotlin.jvm.internal.g0.p(raw, "raw");
        this.f62331a = raw;
        this.pinger = null;
        c40.x<CloseReason> c11 = c40.z.c(null, 1, null);
        this.f62332b = c11;
        this.f62333c = e40.r.d(8, null, null, 6, null);
        this.f62334d = e40.r.d(p.b(), null, null, 6, null);
        this.closed = 0;
        c40.a0 a11 = n2.a((l2) raw.getCoroutineContext().get(l2.f7886e0));
        this.f62335e = a11;
        this.f62336f = new ArrayList();
        this.started = 0;
        this.f62337g = raw.getCoroutineContext().plus(a11).plus(new q0("ws-default"));
        this.f62338h = j11;
        this.f62339i = j12;
        this.f62340j = c11;
    }

    public static /* synthetic */ Object o(b bVar, String str, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "Server is going down";
        }
        return bVar.n(str, cVar);
    }

    public static /* synthetic */ Object y(b bVar, CloseReason closeReason, Throwable th2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        return bVar.x(closeReason, th2, cVar);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<z<?>> A0() {
        return this.f62336f;
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f62331a.E0(j11);
    }

    @Override // io.ktor.websocket.a
    public void L0(long j11) {
        this.f62338h = j11;
        u();
    }

    @Override // io.ktor.websocket.a
    public void N0(@m80.k List<? extends z<?>> negotiatedExtensions) {
        kotlin.jvm.internal.g0.p(negotiatedExtensions, "negotiatedExtensions");
        if (!f62329n.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        Logger f11 = io.ktor.websocket.c.f();
        if (ez.b.a(f11)) {
            f11.trace("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + a00.r0.r3(negotiatedExtensions, null, null, null, 0, null, null, 63, null));
        }
        this.f62336f.addAll(negotiatedExtensions);
        u();
        t(h.d(this, q()));
        v();
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return this.f62331a.Q0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return a.C0726a.a(this, dVar, cVar);
    }

    @Override // io.ktor.websocket.a
    public long a0() {
        return this.f62339i;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return this.f62331a.d0();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        Object g11 = this.f62331a.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62337g;
    }

    @Override // io.ktor.websocket.a
    @m80.k
    public x0<CloseReason> h0() {
        return this.f62340j;
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f62331a.i0(z11);
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public e40.k0<io.ktor.websocket.d> j() {
        return this.f62333c;
    }

    @Override // io.ktor.websocket.a
    public void k0(long j11) {
        this.f62339i = j11;
        u();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(y40.x r9, io.ktor.websocket.d r10, j00.c<? super yz.g2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.b.C0727b
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.b$b r0 = (io.ktor.websocket.b.C0727b) r0
            int r1 = r0.f62344d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62344d = r1
            goto L18
        L13:
            io.ktor.websocket.b$b r0 = new io.ktor.websocket.b$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f62342b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62344d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            int r9 = r0.f62341a
            kotlin.e.n(r11)
            goto L82
        L33:
            kotlin.e.n(r11)
            byte[] r10 = r10.d()
            int r10 = r10.length
            if (r9 == 0) goto L42
            int r11 = jz.h.f(r9)
            goto L43
        L42:
            r11 = 0
        L43:
            int r10 = r10 + r11
            long r4 = (long) r10
            long r6 = r8.d0()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L89
            if (r9 == 0) goto L52
            r9.close()
        L52:
            io.ktor.websocket.CloseReason r9 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r11 = io.ktor.websocket.CloseReason.Codes.TOO_BIG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Frame is too big: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r4 = ". Max size is "
            r2.append(r4)
            long r4 = r8.d0()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r9.<init>(r11, r2)
            r0.f62341a = r10
            r0.f62344d = r3
            java.lang.Object r9 = io.ktor.websocket.k0.a(r8, r9, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            r9 = r10
        L82:
            io.ktor.websocket.FrameTooBigException r10 = new io.ktor.websocket.FrameTooBigException
            long r0 = (long) r9
            r10.<init>(r0)
            throw r10
        L89:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.b.m(y40.x, io.ktor.websocket.d, j00.c):java.lang.Object");
    }

    @m80.l
    public final Object n(@m80.k String str, @m80.k j00.c<? super g2> cVar) {
        Object y11 = y(this, new CloseReason(CloseReason.Codes.GOING_AWAY, str), null, cVar, 2, null);
        return y11 == kotlin.coroutines.intrinsics.b.l() ? y11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (y(r6, r7, null, r9, 2, null) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dc -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.b.p(j00.c):java.lang.Object");
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public e40.l0<io.ktor.websocket.d> q() {
        return this.f62334d;
    }

    public final io.ktor.websocket.d r(io.ktor.websocket.d dVar) {
        Iterator<T> it = A0().iterator();
        while (it.hasNext()) {
            dVar = ((z) it.next()).d(dVar);
        }
        return dVar;
    }

    public final io.ktor.websocket.d s(io.ktor.websocket.d dVar) {
        Iterator<T> it = A0().iterator();
        while (it.hasNext()) {
            dVar = ((z) it.next()).c(dVar);
        }
        return dVar;
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        l2.a.b(this.f62335e, null, 1, null);
        s0.f(this.f62331a, null, 1, null);
    }

    public final l2 t(e40.l0<? super d.C0728d> l0Var) {
        q0 q0Var;
        l2 f11;
        q0Var = io.ktor.websocket.c.f62376c;
        f11 = c40.k.f(this, q0Var.plus(h1.g()), null, new d(l0Var, null), 2, null);
        return f11;
    }

    public final void u() {
        b bVar;
        e40.l0<d.e> b11;
        long x02 = x0();
        if (this.closed == 0 && x02 > 0) {
            bVar = this;
            b11 = h.b(bVar, this.f62331a.q(), x02, a0(), new e(null));
        } else {
            bVar = this;
            b11 = null;
        }
        e40.l0 l0Var = (e40.l0) f62327l.getAndSet(this, b11);
        if (l0Var != null) {
            l0.a.a(l0Var, null, 1, null);
        }
        if (b11 != null) {
            e40.s.m(b11.m(f62330o));
        }
        if (bVar.closed == 0 || b11 == null) {
            return;
        }
        u();
    }

    public final l2 v() {
        q0 q0Var;
        q0Var = io.ktor.websocket.c.f62377d;
        return c40.i.d(this, q0Var.plus(h1.g()), CoroutineStart.UNDISPATCHED, new f(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(io.ktor.websocket.CloseReason r6, java.lang.Throwable r7, j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.websocket.b.g
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.websocket.b$g r0 = (io.ktor.websocket.b.g) r0
            int r1 = r0.f62373f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62373f = r1
            goto L18
        L13:
            io.ktor.websocket.b$g r0 = new io.ktor.websocket.b$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f62371d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62373f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.f62370c
            io.ktor.websocket.CloseReason r6 = (io.ktor.websocket.CloseReason) r6
            java.lang.Object r7 = r0.f62369b
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r0 = r0.f62368a
            io.ktor.websocket.b r0 = (io.ktor.websocket.b) r0
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L36
            goto Lb8
        L36:
            r8 = move-exception
            goto Lcc
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.e.n(r8)
            boolean r8 = r5.z()
            if (r8 != 0) goto L4d
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L4d:
            org.slf4j.Logger r8 = io.ktor.websocket.c.f()
            boolean r2 = ez.b.a(r8)
            if (r2 == 0) goto L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Sending Close Sequence for session "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = " with reason "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = " and exception "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r8.trace(r2)
        L7b:
            c40.a0 r8 = r5.f62335e
            r8.complete()
            if (r6 != 0) goto L8b
            io.ktor.websocket.CloseReason r6 = new io.ktor.websocket.CloseReason
            io.ktor.websocket.CloseReason$Codes r8 = io.ktor.websocket.CloseReason.Codes.NORMAL
            java.lang.String r2 = ""
            r6.<init>(r8, r2)
        L8b:
            r5.u()     // Catch: java.lang.Throwable -> Lb4
            short r8 = r6.e()     // Catch: java.lang.Throwable -> Lb4
            io.ktor.websocket.CloseReason$Codes r2 = io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY     // Catch: java.lang.Throwable -> Lb4
            short r2 = r2.getCode()     // Catch: java.lang.Throwable -> Lb4
            if (r8 == r2) goto Lb7
            io.ktor.websocket.j0 r8 = r5.f62331a     // Catch: java.lang.Throwable -> Lb4
            e40.l0 r8 = r8.q()     // Catch: java.lang.Throwable -> Lb4
            io.ktor.websocket.d$b r2 = new io.ktor.websocket.d$b     // Catch: java.lang.Throwable -> Lb4
            r2.<init>(r6)     // Catch: java.lang.Throwable -> Lb4
            r0.f62368a = r5     // Catch: java.lang.Throwable -> Lb4
            r0.f62369b = r7     // Catch: java.lang.Throwable -> Lb4
            r0.f62370c = r6     // Catch: java.lang.Throwable -> Lb4
            r0.f62373f = r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r8 = r8.b(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r8 != r1) goto Lb7
            return r1
        Lb4:
            r8 = move-exception
            r0 = r5
            goto Lcc
        Lb7:
            r0 = r5
        Lb8:
            c40.x<io.ktor.websocket.CloseReason> r8 = r0.f62332b
            r8.c0(r6)
            if (r7 == 0) goto Lc9
            e40.o<io.ktor.websocket.d> r6 = r0.f62334d
            r6.z(r7)
            e40.o<io.ktor.websocket.d> r6 = r0.f62333c
            r6.z(r7)
        Lc9:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        Lcc:
            c40.x<io.ktor.websocket.CloseReason> r1 = r0.f62332b
            r1.c0(r6)
            if (r7 == 0) goto Ldd
            e40.o<io.ktor.websocket.d> r6 = r0.f62334d
            r6.z(r7)
            e40.o<io.ktor.websocket.d> r6 = r0.f62333c
            r6.z(r7)
        Ldd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.b.x(io.ktor.websocket.CloseReason, java.lang.Throwable, j00.c):java.lang.Object");
    }

    @Override // io.ktor.websocket.a
    public long x0() {
        return this.f62338h;
    }

    public final boolean z() {
        return f62328m.compareAndSet(this, 0, 1);
    }
}
