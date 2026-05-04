package pi;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;
import gs.ng;
import kotlin.Triple;
import pi.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class d0 extends c<a0, ng> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80543k = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f80544a;

        public a(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f80544a = function;
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
            return this.f80544a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f80544a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    public static final g2 K(d0 d0Var, c.a aVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        oi.b0.L(d0Var.p(), aVar.getAdapterPosition(), 0, 2, null);
        oi.b0.u(d0Var.p(), ma.a.D4, null, 2, null);
        return g2.f100423a;
    }

    public static final g2 L(c.a aVar, LottieAnimationView lottieAnimationView, Triple triple) {
        if (triple != null && ((Number) triple.getFirst()).intValue() == aVar.getAdapterPosition()) {
            if (((Boolean) triple.getThird()).booleanValue()) {
                lottieAnimationView.A();
            } else {
                lottieAnimationView.m();
                lottieAnimationView.setFrame(0);
            }
        }
        return g2.f100423a;
    }

    @Override // pi.c
    public void C(@m80.k final c<a0, ng>.a holder) {
        final LottieAnimationView lottieAnimationView;
        kotlin.jvm.internal.g0.p(holder, "holder");
        ng c11 = holder.c();
        if (c11 == null || (lottieAnimationView = c11.f56069e) == null) {
            return;
        }
        sa.q.t(lottieAnimationView, 0, new x00.l() { // from class: pi.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K;
                K = d0.K(d0.this, holder, (View) obj);
                return K;
            }
        }, 1, null);
        LiveData<Triple<Integer, Integer, Boolean>> x11 = p().x();
        LifecycleOwner q11 = q();
        if (q11 == null) {
            return;
        }
        x11.observe(q11, new a(new x00.l() { // from class: pi.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 L;
                L = d0.L(c.a.this, lottieAnimationView, (Triple) obj);
                return L;
            }
        }));
    }

    @Override // pi.c
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<a0, ng>.a holder, @m80.k a0 item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        ng c11 = holder.c();
        if (c11 != null) {
            LottieAnimationView voice = c11.f56069e;
            kotlin.jvm.internal.g0.o(voice, "voice");
            String p11 = item.e().p();
            sa.q.z(voice, !(p11 == null || p11.length() == 0));
            c11.f56067c.setText(item.e().n());
            c11.f56068d.setText(item.e().o());
            ImageView illustration = c11.f56066b;
            kotlin.jvm.internal.g0.o(illustration, "illustration");
            String k11 = item.e().k();
            sa.q.z(illustration, true ^ (k11 == null || k11.length() == 0));
            String k12 = item.e().k();
            if (k12 != null) {
                ic.c f11 = hc.c.l(k12).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
                ImageView illustration2 = c11.f56066b;
                kotlin.jvm.internal.g0.o(illustration2, "illustration");
                f11.o(illustration2);
            }
            gj.d.a(item.e().n(), item.e().q(), c11.f56067c, false, null);
        }
        super.g(holder, item);
    }

    @Override // pi.c
    @m80.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public ng z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return ng.c(inflater);
    }
}
