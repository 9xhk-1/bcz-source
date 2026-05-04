package w4;

import a00.i0;
import a00.r0;
import com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType;
import com.baicizhan.app.biz.game.model.RewardPackageType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l3.o;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nUIEffectCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIEffectCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/UIEffectCollector\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n58#2,6:143\n58#2,6:149\n58#2,6:155\n58#2,6:161\n58#2,6:167\n58#2,6:173\n1056#3:179\n1563#3:180\n1634#3,3:181\n*S KotlinDebug\n*F\n+ 1 UIEffectCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/UIEffectCollector\n*L\n22#1:143,6\n23#1:149,6\n24#1:155,6\n25#1:161,6\n26#1:167,6\n27#1:173,6\n76#1:179\n77#1:180\n77#1:181,3\n*E\n"})
/* loaded from: classes3.dex */
public final class r implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f95136b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f95137c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f95138d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f95139e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c0 f95140f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c0 f95141g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectCollector", f = "UIEffectCollector.kt", i = {0, 0, 0, 0}, l = {56}, m = "collectEffectWrappers$biz_release", n = {"config", "collectedWrappers", "sortedEffectTypes", "effectType"}, s = {"L$0", "L$1", "L$2", "L$4"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95147a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95148b;

        /* renamed from: c, reason: collision with root package name */
        public Object f95149c;

        /* renamed from: d, reason: collision with root package name */
        public Object f95150d;

        /* renamed from: e, reason: collision with root package name */
        public Object f95151e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f95152f;

        /* renamed from: h, reason: collision with root package name */
        public int f95154h;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95152f = obj;
            this.f95154h |= Integer.MIN_VALUE;
            return r.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UIEffectCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/UIEffectCollector\n*L\n1#1,328:1\n76#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l((Integer) ((Map.Entry) t11).getValue(), (Integer) ((Map.Entry) t12).getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class d implements x00.a<w4.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f95155a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f95156b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f95157c;

        public d(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f95155a = aVar;
            this.f95156b = aVar2;
            this.f95157c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w4.c] */
        @Override // x00.a
        public final w4.c invoke() {
            pa0.a aVar = this.f95155a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(w4.c.class), this.f95156b, this.f95157c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class e implements x00.a<q> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f95158a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f95159b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f95160c;

        public e(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f95158a = aVar;
            this.f95159b = aVar2;
            this.f95160c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w4.q] */
        @Override // x00.a
        public final q invoke() {
            pa0.a aVar = this.f95158a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(q.class), this.f95159b, this.f95160c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class f implements x00.a<w4.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f95161a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f95162b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f95163c;

        public f(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f95161a = aVar;
            this.f95162b = aVar2;
            this.f95163c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w4.g] */
        @Override // x00.a
        public final w4.g invoke() {
            pa0.a aVar = this.f95161a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(w4.g.class), this.f95162b, this.f95163c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class g implements x00.a<w4.e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f95164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f95165b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f95166c;

        public g(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f95164a = aVar;
            this.f95165b = aVar2;
            this.f95166c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w4.e] */
        @Override // x00.a
        public final w4.e invoke() {
            pa0.a aVar = this.f95164a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(w4.e.class), this.f95165b, this.f95166c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class h implements x00.a<m> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f95167a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f95168b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f95169c;

        public h(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f95167a = aVar;
            this.f95168b = aVar2;
            this.f95169c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w4.m] */
        @Override // x00.a
        public final m invoke() {
            pa0.a aVar = this.f95167a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(m.class), this.f95168b, this.f95169c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class i implements x00.a<o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f95170a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f95171b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f95172c;

        public i(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f95170a = aVar;
            this.f95171b = aVar2;
            this.f95172c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, w4.o] */
        @Override // x00.a
        public final o invoke() {
            pa0.a aVar = this.f95170a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(o.class), this.f95171b, this.f95172c);
        }
    }

    public r() {
        jb0.c cVar = jb0.c.f64013a;
        this.f95136b = e0.b(cVar.b(), new d(this, null, null));
        this.f95137c = e0.b(cVar.b(), new e(this, null, null));
        this.f95138d = e0.b(cVar.b(), new f(this, null, null));
        this.f95139e = e0.b(cVar.b(), new g(this, null, null));
        this.f95140f = e0.b(cVar.b(), new h(this, null, null));
        this.f95141g = e0.b(cVar.b(), new i(this, null, null));
    }

    private final m g() {
        return (m) this.f95140f.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        if (r9.k() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00af -> B:10:0x00b4). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k w4.r.a r18, @m80.k j00.c<? super java.util.List<? extends x4.a>> r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.r.b(w4.r$a, j00.c):java.lang.Object");
    }

    public final Object c(h10.d<? extends l3.o> dVar, a aVar, j00.c<? super x4.a> cVar) {
        if (g0.g(dVar, o0.d(o.v.class))) {
            return d().f(cVar);
        }
        if (g0.g(dVar, o0.d(o.z.class))) {
            return d().e(RewardPackageType.WordsRound, cVar);
        }
        if (g0.g(dVar, o0.d(o.s.class))) {
            return d().e(RewardPackageType.SentenceRound, cVar);
        }
        if (g0.g(dVar, o0.d(o.y.class))) {
            return d().d(cVar);
        }
        if (g0.g(dVar, o0.d(o.u.class))) {
            return f().l(cVar);
        }
        if (g0.g(dVar, o0.d(o.c.class))) {
            return j().b(cVar);
        }
        if (g0.g(dVar, o0.d(o.f.class))) {
            return j().c(cVar);
        }
        if (g0.g(dVar, o0.d(o.k.class))) {
            return f().m(cVar);
        }
        if (g0.g(dVar, o0.d(o.a.class))) {
            return f().e(cVar);
        }
        if (g0.g(dVar, o0.d(o.i.class))) {
            return f().j(cVar);
        }
        if (g0.g(dVar, o0.d(o.h.class))) {
            return f().f(aVar.l(), cVar);
        }
        if (g0.g(dVar, o0.d(o.j.class))) {
            return f().g(aVar.l(), cVar);
        }
        if (g0.g(dVar, o0.d(o.g.class))) {
            return f().k(cVar);
        }
        if (g0.g(dVar, o0.d(o.n.class))) {
            return f().i(cVar);
        }
        if (g0.g(dVar, o0.d(o.d.class))) {
            return e().e(cVar);
        }
        if (g0.g(dVar, o0.d(o.w.class))) {
            Object i11 = e().i(aVar.h(), cVar);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : (x4.a) i11;
        }
        if (g0.g(dVar, o0.d(o.r.class))) {
            Object g11 = e().g(aVar.h(), cVar);
            return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : (x4.a) g11;
        }
        if (g0.g(dVar, o0.d(o.C0837o.class))) {
            return e().f(cVar);
        }
        if (g0.g(dVar, o0.d(o.e.class))) {
            Object l11 = g().l(cVar);
            return l11 == kotlin.coroutines.intrinsics.b.l() ? l11 : (x4.a) l11;
        }
        if (g0.g(dVar, o0.d(o.q.class))) {
            return g().q(aVar.h());
        }
        if (g0.g(dVar, o0.d(o.x.class))) {
            return g().s(aVar.h());
        }
        if (g0.g(dVar, o0.d(o.m.class))) {
            return g().p(aVar.h());
        }
        if (g0.g(dVar, o0.d(o.p.class))) {
            return g().m(aVar.h());
        }
        if (g0.g(dVar, o0.d(o.t.class))) {
            return i().c(cVar);
        }
        if (g0.g(dVar, o0.d(o.a0.class))) {
            return i().d(cVar);
        }
        z6.b.j(z6.b.f101032b, s.f95173a, "collect effect failed, effect: " + dVar, null, 4, null);
        return null;
    }

    public final w4.c d() {
        return (w4.c) this.f95136b.getValue();
    }

    public final w4.e e() {
        return (w4.e) this.f95139e.getValue();
    }

    public final w4.g f() {
        return (w4.g) this.f95138d.getValue();
    }

    public final o i() {
        return (o) this.f95141g.getValue();
    }

    public final q j() {
        return (q) this.f95137c.getValue();
    }

    public final List<h10.d<? extends l3.o>> k(t tVar) {
        List z52 = r0.z5(tVar.g().entrySet(), new c());
        ArrayList arrayList = new ArrayList(i0.d0(z52, 10));
        Iterator it = z52.iterator();
        while (it.hasNext()) {
            arrayList.add((h10.d) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final t f95142a;

        /* renamed from: b, reason: collision with root package name */
        public final int f95143b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f95144c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final UIEffectStrategyType f95145d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final c40.r0 f95146e;

        public a(@m80.k t priorityConfig, int i11, boolean z11, @m80.k UIEffectStrategyType uIEffectStrategyType, @m80.k c40.r0 coroutineScope) {
            g0.p(priorityConfig, "priorityConfig");
            g0.p(uIEffectStrategyType, "uIEffectStrategyType");
            g0.p(coroutineScope, "coroutineScope");
            this.f95142a = priorityConfig;
            this.f95143b = i11;
            this.f95144c = z11;
            this.f95145d = uIEffectStrategyType;
            this.f95146e = coroutineScope;
        }

        public static /* synthetic */ a g(a aVar, t tVar, int i11, boolean z11, UIEffectStrategyType uIEffectStrategyType, c40.r0 r0Var, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                tVar = aVar.f95142a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f95143b;
            }
            if ((i12 & 4) != 0) {
                z11 = aVar.f95144c;
            }
            if ((i12 & 8) != 0) {
                uIEffectStrategyType = aVar.f95145d;
            }
            if ((i12 & 16) != 0) {
                r0Var = aVar.f95146e;
            }
            c40.r0 r0Var2 = r0Var;
            boolean z12 = z11;
            return aVar.f(tVar, i11, z12, uIEffectStrategyType, r0Var2);
        }

        @m80.k
        public final t a() {
            return this.f95142a;
        }

        public final int b() {
            return this.f95143b;
        }

        public final boolean c() {
            return this.f95144c;
        }

        @m80.k
        public final UIEffectStrategyType d() {
            return this.f95145d;
        }

        @m80.k
        public final c40.r0 e() {
            return this.f95146e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f95142a, aVar.f95142a) && this.f95143b == aVar.f95143b && this.f95144c == aVar.f95144c && this.f95145d == aVar.f95145d && g0.g(this.f95146e, aVar.f95146e);
        }

        @m80.k
        public final a f(@m80.k t priorityConfig, int i11, boolean z11, @m80.k UIEffectStrategyType uIEffectStrategyType, @m80.k c40.r0 coroutineScope) {
            g0.p(priorityConfig, "priorityConfig");
            g0.p(uIEffectStrategyType, "uIEffectStrategyType");
            g0.p(coroutineScope, "coroutineScope");
            return new a(priorityConfig, i11, z11, uIEffectStrategyType, coroutineScope);
        }

        @m80.k
        public final c40.r0 h() {
            return this.f95146e;
        }

        public int hashCode() {
            return (((((((this.f95142a.hashCode() * 31) + Integer.hashCode(this.f95143b)) * 31) + Boolean.hashCode(this.f95144c)) * 31) + this.f95145d.hashCode()) * 31) + this.f95146e.hashCode();
        }

        public final int i() {
            return this.f95143b;
        }

        @m80.k
        public final t j() {
            return this.f95142a;
        }

        public final boolean k() {
            return this.f95144c;
        }

        @m80.k
        public final UIEffectStrategyType l() {
            return this.f95145d;
        }

        @m80.k
        public String toString() {
            return "CollectConfig(priorityConfig=" + this.f95142a + ", maxCount=" + this.f95143b + ", stopOnFirst=" + this.f95144c + ", uIEffectStrategyType=" + this.f95145d + ", coroutineScope=" + this.f95146e + ')';
        }

        public /* synthetic */ a(t tVar, int i11, boolean z11, UIEffectStrategyType uIEffectStrategyType, c40.r0 r0Var, int i12, kotlin.jvm.internal.v vVar) {
            this(tVar, (i12 & 2) != 0 ? Integer.MAX_VALUE : i11, (i12 & 4) != 0 ? false : z11, uIEffectStrategyType, r0Var);
        }
    }
}
