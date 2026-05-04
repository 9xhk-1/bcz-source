package io.ktor.websocket;

import androidx.collection.SieveCacheKt;
import c40.l2;
import c40.n2;
import c40.q0;
import c40.r0;
import e40.l0;
import io.ktor.websocket.j0;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRawWebSocketJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,100:1\n33#2,3:101\n33#2,3:104\n*S KotlinDebug\n*F\n+ 1 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n53#1:101,3\n57#1:104,3\n*E\n"})
/* loaded from: classes8.dex */
public final class l implements j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f62498h = {o0.k(new MutablePropertyReference1Impl(l.class, "maxFrameSize", "getMaxFrameSize()J", 0)), o0.k(new MutablePropertyReference1Impl(l.class, "masking", "getMasking()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c40.a0 f62499a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e40.o<d> f62500b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62501c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d10.f f62502d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d10.f f62503e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final l0 f62504f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final i0 f62505g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {2, 3}, l = {67, 68, 71, 74}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62506a;

        /* renamed from: b, reason: collision with root package name */
        public int f62507b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return l.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        
            if (r7.b(r11, r10) == r0) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x003b, CancellationException -> 0x003d, ProtocolViolationException -> 0x003f, FrameTooBigException -> 0x0042, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x0042, CancellationException -> 0x003d, blocks: (B:21:0x0036, B:23:0x005e, B:28:0x006d, B:30:0x0075, B:34:0x0049, B:36:0x0050), top: B:2:0x000b, outer: #4 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:22:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n1#1,34:1\n54#2,2:35\n*E\n"})
    public static final class b extends d10.c<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f62509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, l lVar) {
            super(obj);
            this.f62509a = lVar;
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, Long l11, Long l12) {
            kotlin.jvm.internal.g0.p(property, "property");
            long longValue = l12.longValue();
            l11.longValue();
            this.f62509a.b().E0(longValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 RawWebSocketJvm.kt\nio/ktor/websocket/RawWebSocketJvm\n*L\n1#1,34:1\n58#2,2:35\n*E\n"})
    public static final class c extends d10.c<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f62510a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, l lVar) {
            super(obj);
            this.f62510a = lVar;
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, Boolean bool, Boolean bool2) {
            kotlin.jvm.internal.g0.p(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            this.f62510a.d().i0(booleanValue);
        }
    }

    public l(@m80.k io.ktor.utils.io.g input, @m80.k io.ktor.utils.io.m output, long j11, boolean z11, @m80.k kotlin.coroutines.d coroutineContext, @m80.k pz.h<ByteBuffer> pool) {
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(output, "output");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(pool, "pool");
        c40.a0 a11 = n2.a((l2) coroutineContext.get(l2.f7886e0));
        this.f62499a = a11;
        this.f62500b = e40.r.d(0, null, null, 6, null);
        this.f62501c = coroutineContext.plus(a11).plus(new q0("raw-ws"));
        d10.a aVar = d10.a.f47010a;
        this.f62502d = new b(Long.valueOf(j11), this);
        this.f62503e = new c(Boolean.valueOf(z11), this);
        this.f62504f = new l0(output, getCoroutineContext(), z11, pool);
        this.f62505g = new i0(input, getCoroutineContext(), j11, pool);
        c40.k.f(this, null, null, new a(null), 3, null);
        a11.complete();
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<z<?>> A0() {
        return a00.h0.J();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f62502d.setValue(this, f62498h[0], Long.valueOf(j11));
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return ((Boolean) this.f62503e.getValue(this, f62498h[1])).booleanValue();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k d dVar, @m80.k j00.c<? super g2> cVar) {
        return j0.a.a(this, dVar, cVar);
    }

    @m80.k
    public final i0 b() {
        return this.f62505g;
    }

    @m80.k
    public final l0 d() {
        return this.f62504f;
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return ((Number) this.f62502d.getValue(this, f62498h[0])).longValue();
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object g(@m80.k j00.c<? super g2> cVar) {
        Object g11 = this.f62504f.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62501c;
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f62503e.setValue(this, f62498h[1], Boolean.valueOf(z11));
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public e40.k0<d> j() {
        return this.f62500b;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public e40.l0<d> q() {
        return this.f62504f.q();
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        l0.a.a(q(), null, 1, null);
        this.f62499a.complete();
    }

    public /* synthetic */ l(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, long j11, boolean z11, kotlin.coroutines.d dVar, pz.h hVar, int i11, kotlin.jvm.internal.v vVar) {
        this(gVar, mVar, (i11 & 4) != 0 ? SieveCacheKt.NodeLinkMask : j11, (i11 & 8) != 0 ? false : z11, dVar, (i11 & 32) != 0 ? yy.a.a() : hVar);
    }
}
