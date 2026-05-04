package pi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import gs.bj;
import pi.i0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class i0 extends e0<g0, a, bj> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f80562f = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f80563a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k final i0 i0Var, @m80.k bj binding, View itemView) {
            super(itemView);
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f80563a = i0Var;
            TextView report = binding.f54299b;
            kotlin.jvm.internal.g0.o(report, "report");
            sa.q.t(report, 0, new x00.l() { // from class: pi.h0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b11;
                    b11 = i0.a.b(i0.this, (View) obj);
                    return b11;
                }
            }, 1, null);
        }

        public static final g2 b(i0 i0Var, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            i0Var.p().M();
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.e0
    @m80.k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public a r(@m80.k bj binding, @m80.k View v11) {
        kotlin.jvm.internal.g0.p(binding, "binding");
        kotlin.jvm.internal.g0.p(v11, "v");
        return new a(this, binding, v11);
    }

    @Override // pi.e0
    @m80.k
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public bj s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        bj d11 = bj.d(inflater, parent, false);
        kotlin.jvm.internal.g0.o(d11, "inflate(...)");
        return d11;
    }
}
