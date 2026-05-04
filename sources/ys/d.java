package ys;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import ws.h;
import ws.i;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface d<TArgs, THandler> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f100303a = new a();

        @Override // ts.e
        public void write(@k i protocol) {
            g0.p(protocol, "protocol");
            protocol.g6("void");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.microsoft.thrifty.service.server.ServerCall", f = "ServerCall.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {48, 50, 52, 57}, m = "process$suspendImpl", n = {"$this", "msg", "input", "output", "errorHandler", "handler", "$this", "msg", "input", "output", "errorHandler", "$this", "msg", "input", "output", "errorHandler"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class b<TArgs, THandler> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f100304a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100305b;

        /* renamed from: c, reason: collision with root package name */
        public Object f100306c;

        /* renamed from: d, reason: collision with root package name */
        public Object f100307d;

        /* renamed from: e, reason: collision with root package name */
        public Object f100308e;

        /* renamed from: f, reason: collision with root package name */
        public Object f100309f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f100310g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ d<TArgs, THandler> f100311h;

        /* renamed from: i, reason: collision with root package name */
        public int f100312i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<TArgs, THandler> dVar, j00.c<? super b> cVar) {
            super(cVar);
            this.f100311h = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100310g = obj;
            this.f100312i |= Integer.MIN_VALUE;
            return d.e(this.f100311h, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.microsoft.thrifty.service.server.ServerCall$process$2", f = "ServerCall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<i, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100313a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100314b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ts.e f100315c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ts.e eVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f100315c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            c cVar2 = new c(this.f100315c, cVar);
            cVar2.f100314b = obj;
            return cVar2;
        }

        @Override // x00.p
        @l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k i iVar, @l j00.c<? super g2> cVar) {
            return ((c) create(iVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f100313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f100315c.write((i) this.f100314b);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:40|(3:(1:(1:44)(2:45|46))(2:47|48)|31|32)(9:49|50|51|15|16|17|(4:19|20|21|22)|31|32))(1:10))(1:54)|11|12|(7:14|15|16|17|(0)|31|32)|35))|56|6|7|(0)(0)|11|12|(0)|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
    
        if (ys.e.c(r8, r9, (byte) 0, r11, r14, 2, null) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011d, code lost:
    
        if (r8.a(r9, r10, r11, r12, r13, r14) != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        r13 = r0;
        r6 = r8;
        r8 = (ys.d<TArgs, THandler>) r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
    
        if (r0 == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7 A[Catch: Exception -> 0x00fc, TRY_LEAVE, TryCatch #1 {Exception -> 0x00fc, blocks: (B:17:0x00cf, B:19:0x00d7), top: B:16:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, ws.i] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ws.i] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ys.d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ys.d, ys.d<TArgs, THandler>] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, ys.d] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ys.b] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, ws.i] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8, types: [ws.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <TArgs, THandler> java.lang.Object e(ys.d<TArgs, THandler> r8, ws.h r9, ws.i r10, ws.i r11, ys.b r12, THandler r13, j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ys.d.e(ys.d, ws.h, ws.i, ws.i, ys.b, java.lang.Object, j00.c):java.lang.Object");
    }

    @l
    Object a(@k i iVar, @k j00.c<? super TArgs> cVar);

    @l
    Object b(TArgs targs, THandler thandler, @k j00.c<? super ts.e> cVar);

    @l
    default Object c(@k h hVar, @k i iVar, @k i iVar2, @k ys.b bVar, THandler thandler, @k j00.c<? super g2> cVar) {
        return e(this, hVar, iVar, iVar2, bVar, thandler, cVar);
    }

    boolean d();
}
