package pi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.widget.WikiVideoView;
import gs.dj;
import kotlin.Triple;
import pi.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class v0 extends c<q0, dj> {

    /* renamed from: m, reason: collision with root package name */
    public static final int f80641m = 8;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public a f80642k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f80643l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(@m80.k WikiVideoView wikiVideoView);

        void b(@m80.k ViewGroup viewGroup, @m80.k WikiVideoView wikiVideoView, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f80644a;

        public b(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f80644a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f80644a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f80644a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    public static final void M(v0 v0Var, boolean z11) {
        if (z11) {
            v0Var.p().d0();
        }
    }

    public static final void N(WikiVideoView wikiVideoView, v0 v0Var, c.a aVar) {
        Q(wikiVideoView, v0Var, aVar);
    }

    public static final g2 O(WikiVideoView wikiVideoView, v0 v0Var, c.a aVar, Boolean bool) {
        if (bool != null && !kotlin.jvm.internal.g0.g(bool, Boolean.valueOf(wikiVideoView.n()))) {
            Q(wikiVideoView, v0Var, aVar);
        }
        return g2.f100423a;
    }

    public static final g2 P(WikiVideoView wikiVideoView, Triple triple) {
        if (triple != null && ((Boolean) triple.getThird()).booleanValue()) {
            wikiVideoView.u();
        }
        return g2.f100423a;
    }

    public static final void Q(WikiVideoView wikiVideoView, v0 v0Var, c<q0, dj>.a aVar) {
        wikiVideoView.setFullscreen(!wikiVideoView.n());
        a aVar2 = v0Var.f80642k;
        if (aVar2 != null) {
            FrameLayout root = aVar.c().getRoot();
            kotlin.jvm.internal.g0.n(root, "null cannot be cast to non-null type android.view.ViewGroup");
            aVar2.b(root, wikiVideoView, wikiVideoView.n());
        }
    }

    @Override // pi.c
    public void C(@m80.k final c<q0, dj>.a holder) {
        final WikiVideoView wikiVideoView;
        kotlin.jvm.internal.g0.p(holder, "holder");
        dj c11 = holder.c();
        if (c11 == null || (wikiVideoView = c11.f54638b) == null) {
            return;
        }
        a aVar = this.f80642k;
        if (aVar != null) {
            aVar.a(wikiVideoView);
        }
        wikiVideoView.setOnToggleListener(new WikiVideoView.f() { // from class: pi.r0
            @Override // com.baicizhan.client.business.widget.WikiVideoView.f
            public final void a(boolean z11) {
                v0.M(v0.this, z11);
            }
        });
        wikiVideoView.setOnFullscreenListener(new WikiVideoView.e() { // from class: pi.s0
            @Override // com.baicizhan.client.business.widget.WikiVideoView.e
            public final void a() {
                v0.N(WikiVideoView.this, this, holder);
            }
        });
        LiveData<Boolean> B = p().B();
        LifecycleOwner q11 = q();
        kotlin.jvm.internal.g0.m(q11);
        B.observe(q11, new b(new x00.l() { // from class: pi.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O;
                O = v0.O(WikiVideoView.this, this, holder, (Boolean) obj);
                return O;
            }
        }));
        LiveData<Triple<Integer, Integer, Boolean>> x11 = p().x();
        LifecycleOwner q12 = q();
        kotlin.jvm.internal.g0.m(q12);
        x11.observe(q12, new b(new x00.l() { // from class: pi.u0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = v0.P(WikiVideoView.this, (Triple) obj);
                return P;
            }
        }));
    }

    @Override // pi.c
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<q0, dj>.a holder, @m80.k q0 item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        dj c11 = holder.c();
        if (c11 == null) {
            return;
        }
        c11.f54638b.setFullscreenEnabled(true);
        WordMediaRecord d11 = item.e().d();
        if (d11 != null) {
            c11.f54638b.setVideoURI(m9.c.d(d11.getTvpath()));
            if (c11.f54638b.getTag() == null) {
                c11.f54638b.setTag(new Object());
                c11.f54638b.setSnapshot(rb.d.b(c11.getRoot().getContext()) == 0 ? m9.c.d(d11.getTvSnapshotPath()) : null);
                g2 g2Var = g2.f100423a;
            }
        }
        super.g(holder, item);
    }

    @Override // pi.c
    @m80.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public dj z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return dj.c(inflater);
    }

    public final void R(@m80.k a interaction) {
        kotlin.jvm.internal.g0.p(interaction, "interaction");
        this.f80642k = interaction;
    }
}
