package f40;

import a00.h0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q30.k0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
@u0({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    @m80.l
    @w00.g
    public volatile WeakReference<l00.c> _lastObservedFrame;

    @w00.g
    @m80.k
    public volatile String _state = j.f50943a;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final r f50929a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f50930b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final WeakReference<kotlin.coroutines.d> f50931c;

    /* renamed from: d, reason: collision with root package name */
    public int f50932d;

    @m80.l
    @w00.g
    public volatile Thread lastObservedThread;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends RestrictedSuspendLambda implements x00.p<q30.o<? super StackTraceElement>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f50933a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50934b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f50936d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f50936d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = i.this.new a(this.f50936d, cVar);
            aVar.f50934b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f50933a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                q30.o oVar = (q30.o) this.f50934b;
                i iVar = i.this;
                l00.c callerFrame = this.f50936d.getCallerFrame();
                this.f50933a = 1;
                if (iVar.k(oVar, callerFrame, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(q30.o<? super StackTraceElement> oVar, j00.c<? super g2> cVar) {
            return ((a) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0}, l = {169}, m = "yieldFrames", n = {"$this$yieldFrames", TypedValues.AttributesType.S_FRAME}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50937a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50938b;

        /* renamed from: c, reason: collision with root package name */
        public Object f50939c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f50940d;

        /* renamed from: f, reason: collision with root package name */
        public int f50942f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50940d = obj;
            this.f50942f |= Integer.MIN_VALUE;
            return i.this.k(null, null, this);
        }
    }

    public i(@m80.l kotlin.coroutines.d dVar, @m80.l r rVar, long j11) {
        this.f50929a = rVar;
        this.f50930b = j11;
        this.f50931c = new WeakReference<>(dVar);
    }

    public final List<StackTraceElement> b() {
        r rVar = this.f50929a;
        return rVar == null ? h0.J() : k0.I3(q30.q.b(new a(rVar, null)));
    }

    @m80.l
    public final kotlin.coroutines.d c() {
        return this.f50931c.get();
    }

    @m80.l
    public final r d() {
        return this.f50929a;
    }

    @m80.k
    public final List<StackTraceElement> e() {
        return b();
    }

    @m80.l
    public final l00.c f() {
        WeakReference<l00.c> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @m80.k
    public final String g() {
        return this._state;
    }

    @m80.k
    public final List<StackTraceElement> h() {
        l00.c f11 = f();
        if (f11 == null) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList();
        while (f11 != null) {
            StackTraceElement stackTraceElement = f11.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f11 = f11.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@m80.l l00.c cVar) {
        this._lastObservedFrame = cVar != null ? new WeakReference<>(cVar) : null;
    }

    public final synchronized void j(@m80.k String str, @m80.k j00.c<?> cVar, boolean z11) {
        try {
            if (g0.g(this._state, j.f50944b) && g0.g(str, j.f50944b) && z11) {
                this.f50932d++;
            } else if (this.f50932d > 0 && g0.g(str, j.f50945c)) {
                this.f50932d--;
                return;
            }
            if (g0.g(this._state, str) && g0.g(str, j.f50945c) && f() != null) {
                return;
            }
            this._state = str;
            i(cVar instanceof l00.c ? (l00.c) cVar : null);
            this.lastObservedThread = g0.g(str, j.f50944b) ? Thread.currentThread() : null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:11:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(q30.o<? super java.lang.StackTraceElement> r5, l00.c r6, j00.c<? super yz.g2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof f40.i.b
            if (r0 == 0) goto L13
            r0 = r7
            f40.i$b r0 = (f40.i.b) r0
            int r1 = r0.f50942f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50942f = r1
            goto L18
        L13:
            f40.i$b r0 = new f40.i$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50940d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50942f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f50939c
            f40.i r5 = (f40.i) r5
            java.lang.Object r6 = r0.f50938b
            l00.c r6 = (l00.c) r6
            java.lang.Object r2 = r0.f50937a
            q30.o r2 = (q30.o) r2
            kotlin.e.n(r7)
            goto L5f
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.e.n(r7)
            r7 = r6
            r6 = r4
        L42:
            if (r7 != 0) goto L47
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L47:
            java.lang.StackTraceElement r2 = r7.getStackTraceElement()
            if (r2 == 0) goto L62
            r0.f50937a = r5
            r0.f50938b = r7
            r0.f50939c = r6
            r0.f50942f = r3
            java.lang.Object r2 = r5.b(r2, r0)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r2 = r5
            r5 = r6
            r6 = r7
        L5f:
            r7 = r6
            r6 = r5
            r5 = r2
        L62:
            l00.c r7 = r7.getCallerFrame()
            if (r7 == 0) goto L69
            goto L42
        L69:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.i.k(q30.o, l00.c, j00.c):java.lang.Object");
    }

    @m80.k
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
