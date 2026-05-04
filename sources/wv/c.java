package wv;

import a00.r0;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import q30.k0;
import q30.m;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@wv.a
/* loaded from: classes8.dex */
public final class c extends i {

    /* renamed from: f, reason: collision with root package name */
    public static final int f96874f = 0;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LazyListState f96875b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p<i, j, Integer> f96876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f96877d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableState f96878e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<LazyListItemInfo, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f96879a = new a();

        public a() {
            super(1, d.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
        }

        @Override // x00.l
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@m80.k LazyListItemInfo p02) {
            g0.p(p02, "p0");
            return new d(p02);
        }
    }

    public /* synthetic */ c(LazyListState lazyListState, p pVar, int i11, int i12, v vVar) {
        this(lazyListState, pVar, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // wv.i
    public boolean a() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) r0.A3(this.f96875b.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo == null) {
            return false;
        }
        return lazyListItemInfo.getIndex() < l() - 1 || lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() > f();
    }

    @Override // wv.i
    public boolean b() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) r0.L2(this.f96875b.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo == null) {
            return false;
        }
        return lazyListItemInfo.getIndex() > 0 || lazyListItemInfo.getOffset() < g();
    }

    @Override // wv.i
    public int c(float f11, @m80.k DecayAnimationSpec<Float> decayAnimationSpec, float f12) {
        g0.p(decayAnimationSpec, "decayAnimationSpec");
        j e11 = e();
        if (e11 == null) {
            return -1;
        }
        float j11 = j();
        if (j11 <= 0.0f) {
            return e11.a();
        }
        int d11 = d(e11.a());
        int d12 = d(e11.a() + 1);
        if (Math.abs(f11) < 0.5f) {
            return u.I(Math.abs(d11) < Math.abs(d12) ? e11.a() : e11.a() + 1, 0, l() - 1);
        }
        float H = u.H(DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f11), -f12, f12);
        float A = f11 < 0.0f ? u.A(H + d12, 0.0f) : u.t(H + d11, 0.0f);
        k kVar = k.f96927a;
        return u.I(c10.d.L0((e11.a() + (A / j11)) - (d11 / j11)), 0, l() - 1);
    }

    @Override // wv.i
    public int d(int i11) {
        j jVar;
        int L0;
        int intValue;
        Iterator<j> it = h().iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            jVar = it.next();
            if (jVar.a() == i11) {
                break;
            }
        }
        j jVar2 = jVar;
        if (jVar2 != null) {
            L0 = jVar2.b();
            intValue = this.f96876c.invoke(this, jVar2).intValue();
        } else {
            j e11 = e();
            if (e11 == null) {
                return 0;
            }
            L0 = c10.d.L0((i11 - e11.a()) * j()) + e11.b();
            intValue = this.f96876c.invoke(this, e11).intValue();
        }
        return L0 - intValue;
    }

    @Override // wv.i
    @m80.l
    public j e() {
        j jVar = null;
        for (j jVar2 : h()) {
            j jVar3 = jVar2;
            if (jVar3.b() <= this.f96876c.invoke(this, jVar3).intValue()) {
                jVar = jVar2;
            }
        }
        return jVar;
    }

    @Override // wv.i
    public int f() {
        return this.f96875b.getLayoutInfo().getViewportEndOffset() - k();
    }

    @Override // wv.i
    public int g() {
        return this.f96877d;
    }

    @Override // wv.i
    @m80.k
    public m<j> h() {
        return k0.N1(r0.E1(this.f96875b.getLayoutInfo().getVisibleItemsInfo()), a.f96879a);
    }

    public final int i() {
        LazyListLayoutInfo layoutInfo = this.f96875b.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().size() < 2) {
            return 0;
        }
        LazyListItemInfo lazyListItemInfo = layoutInfo.getVisibleItemsInfo().get(0);
        return layoutInfo.getVisibleItemsInfo().get(1).getOffset() - (lazyListItemInfo.getSize() + lazyListItemInfo.getOffset());
    }

    public final float j() {
        Object next;
        LazyListLayoutInfo layoutInfo = this.f96875b.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int offset = ((LazyListItemInfo) next).getOffset();
                do {
                    Object next2 = it.next();
                    int offset2 = ((LazyListItemInfo) next2).getOffset();
                    if (offset > offset2) {
                        next = next2;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo == null) {
            return -1.0f;
        }
        Iterator<T> it2 = layoutInfo.getVisibleItemsInfo().iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) obj;
                int offset3 = lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize();
                do {
                    Object next3 = it2.next();
                    LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next3;
                    int offset4 = lazyListItemInfo3.getOffset() + lazyListItemInfo3.getSize();
                    if (offset3 < offset4) {
                        obj = next3;
                        offset3 = offset4;
                    }
                } while (it2.hasNext());
            }
        }
        LazyListItemInfo lazyListItemInfo4 = (LazyListItemInfo) obj;
        if (lazyListItemInfo4 == null) {
            return -1.0f;
        }
        if (Math.max(lazyListItemInfo.getOffset() + lazyListItemInfo.getSize(), lazyListItemInfo4.getOffset() + lazyListItemInfo4.getSize()) - Math.min(lazyListItemInfo.getOffset(), lazyListItemInfo4.getOffset()) == 0) {
            return -1.0f;
        }
        return (r3 + i()) / layoutInfo.getVisibleItemsInfo().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int k() {
        return ((Number) this.f96878e.getValue()).intValue();
    }

    public final int l() {
        return this.f96875b.getLayoutInfo().getTotalItemsCount();
    }

    public final void m(int i11) {
        this.f96878e.setValue(Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@m80.k LazyListState lazyListState, @m80.k p<? super i, ? super j, Integer> snapOffsetForItem, int i11) {
        g0.p(lazyListState, "lazyListState");
        g0.p(snapOffsetForItem, "snapOffsetForItem");
        this.f96875b = lazyListState;
        this.f96876c = snapOffsetForItem;
        this.f96878e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i11), null, 2, null);
    }
}
