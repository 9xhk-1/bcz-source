package x4;

import c40.r0;
import c40.x0;
import com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l3.o;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C1309a f97395a = new C1309a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f97396b = "EffectWrapper";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: x4.a$a, reason: collision with other inner class name */
    public static final class C1309a {
        public /* synthetic */ C1309a(v vVar) {
            this();
        }

        public C1309a() {
        }
    }

    public /* synthetic */ a(v vVar) {
        this();
    }

    public static /* synthetic */ Object e(a aVar, long j11, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
        }
        if ((i11 & 1) != 0) {
            j11 = 5000;
        }
        return aVar.d(j11, cVar);
    }

    @k
    public abstract EffectType a();

    public boolean b() {
        return true;
    }

    @l
    public abstract Object d(long j11, @k j00.c<? super o> cVar);

    public a() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final o f97397c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final EffectType f97398d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k o effect, @k EffectType effectType) {
            super(null);
            g0.p(effect, "effect");
            g0.p(effectType, "effectType");
            this.f97397c = effect;
            this.f97398d = effectType;
        }

        public static /* synthetic */ b i(b bVar, o oVar, EffectType effectType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                oVar = bVar.f97397c;
            }
            if ((i11 & 2) != 0) {
                effectType = bVar.f97398d;
            }
            return bVar.h(oVar, effectType);
        }

        @Override // x4.a
        @k
        public EffectType a() {
            return this.f97398d;
        }

        @Override // x4.a
        @l
        public Object d(long j11, @k j00.c<? super o> cVar) {
            return this.f97397c;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return g0.g(this.f97397c, bVar.f97397c) && this.f97398d == bVar.f97398d;
        }

        @k
        public final o f() {
            return this.f97397c;
        }

        @k
        public final EffectType g() {
            return this.f97398d;
        }

        @k
        public final b h(@k o effect, @k EffectType effectType) {
            g0.p(effect, "effect");
            g0.p(effectType, "effectType");
            return new b(effect, effectType);
        }

        public int hashCode() {
            return (this.f97397c.hashCode() * 31) + this.f97398d.hashCode();
        }

        @k
        public final o j() {
            return this.f97397c;
        }

        @k
        public String toString() {
            return "Immediate(effect=" + this.f97397c + ", effectType=" + this.f97398d + ')';
        }

        public /* synthetic */ b(o oVar, EffectType effectType, int i11, v vVar) {
            this(oVar, (i11 & 2) != 0 ? EffectType.Default : effectType);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final x0<o> f97399c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f97400d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final EffectType f97401e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectWrapper$Preloaded", f = "EffectWrapper.kt", i = {0}, l = {57}, m = "resolve", n = {com.alipay.sdk.m.m.a.f10784h0}, s = {"J$0"}, v = 1)
        /* renamed from: x4.a$c$a, reason: collision with other inner class name */
        public static final class C1310a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public long f97402a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f97403b;

            /* renamed from: d, reason: collision with root package name */
            public int f97405d;

            public C1310a(j00.c<? super C1310a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f97403b = obj;
                this.f97405d |= Integer.MIN_VALUE;
                return c.this.d(0L, this);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectWrapper$Preloaded$resolve$2", f = "EffectWrapper.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements p<r0, j00.c<? super o>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f97406a;

            public b(j00.c<? super b> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return c.this.new b(cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super o> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f97406a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                    return obj;
                }
                e.n(obj);
                x0 x0Var = c.this.f97399c;
                this.f97406a = 1;
                Object i12 = x0Var.i(this);
                return i12 == l11 ? l11 : i12;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@k x0<? extends o> loader, @k String effectName, @k EffectType effectType) {
            super(null);
            g0.p(loader, "loader");
            g0.p(effectName, "effectName");
            g0.p(effectType, "effectType");
            this.f97399c = loader;
            this.f97400d = effectName;
            this.f97401e = effectType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c k(c cVar, x0 x0Var, String str, EffectType effectType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                x0Var = cVar.f97399c;
            }
            if ((i11 & 2) != 0) {
                str = cVar.f97400d;
            }
            if ((i11 & 4) != 0) {
                effectType = cVar.f97401e;
            }
            return cVar.j(x0Var, str, effectType);
        }

        @Override // x4.a
        @k
        public EffectType a() {
            return this.f97401e;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: Exception -> 0x002c, TimeoutCancellationException -> 0x00c6, TryCatch #2 {TimeoutCancellationException -> 0x00c6, Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0068, B:14:0x006d, B:15:0x00a8, B:19:0x008b, B:23:0x003b), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[Catch: Exception -> 0x002c, TimeoutCancellationException -> 0x00c6, TryCatch #2 {TimeoutCancellationException -> 0x00c6, Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0068, B:14:0x006d, B:15:0x00a8, B:19:0x008b, B:23:0x003b), top: B:7:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override // x4.a
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object d(long r12, @m80.k j00.c<? super l3.o> r14) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.a.c.d(long, j00.c):java.lang.Object");
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return g0.g(this.f97399c, cVar.f97399c) && g0.g(this.f97400d, cVar.f97400d) && this.f97401e == cVar.f97401e;
        }

        public final x0<o> g() {
            return this.f97399c;
        }

        public final String h() {
            return this.f97400d;
        }

        public int hashCode() {
            return (((this.f97399c.hashCode() * 31) + this.f97400d.hashCode()) * 31) + this.f97401e.hashCode();
        }

        @k
        public final EffectType i() {
            return this.f97401e;
        }

        @k
        public final c j(@k x0<? extends o> loader, @k String effectName, @k EffectType effectType) {
            g0.p(loader, "loader");
            g0.p(effectName, "effectName");
            g0.p(effectType, "effectType");
            return new c(loader, effectName, effectType);
        }

        @k
        public String toString() {
            return "Preloaded(loader=" + this.f97399c + ", effectName=" + this.f97400d + ", effectType=" + this.f97401e + ')';
        }

        public /* synthetic */ c(x0 x0Var, String str, EffectType effectType, int i11, v vVar) {
            this(x0Var, (i11 & 2) != 0 ? "PreloadedEffect" : str, (i11 & 4) != 0 ? EffectType.Default : effectType);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends a {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final EffectType f97408c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Iterator<a> f97409d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public a f97410e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(@k List<? extends a> effects, @k EffectType effectType) {
            super(0 == true ? 1 : 0);
            g0.p(effects, "effects");
            g0.p(effectType, "effectType");
            this.f97408c = effectType;
            Iterator it = effects.iterator();
            this.f97409d = it;
            this.f97410e = it.hasNext() ? (a) it.next() : null;
        }

        @Override // x4.a
        @k
        public EffectType a() {
            return this.f97408c;
        }

        @Override // x4.a
        public boolean b() {
            return this.f97410e == null;
        }

        @Override // x4.a
        public void c() {
            this.f97410e = this.f97409d.hasNext() ? this.f97409d.next() : null;
        }

        @Override // x4.a
        @l
        public Object d(long j11, @k j00.c<? super o> cVar) {
            a aVar = this.f97410e;
            if (aVar != null) {
                return a.e(aVar, 0L, cVar, 1, null);
            }
            return null;
        }

        public /* synthetic */ d(List list, EffectType effectType, int i11, v vVar) {
            this(list, (i11 & 2) != 0 ? EffectType.Default : effectType);
        }
    }

    public void c() {
    }
}
