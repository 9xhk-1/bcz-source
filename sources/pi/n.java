package pi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;
import gs.ig;
import gs.ng;
import gs.xi;
import kotlin.Triple;
import pi.n;
import pi.q;
import qi.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class n extends pi.c<m, xi> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80591k = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends e0<e.b, b, ig> {
        public a() {
            super(n.this.p(), null, 2, null);
        }

        @Override // pi.e0, p50.e
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void g(@m80.k b holder, @m80.k e.b item) {
            kotlin.jvm.internal.g0.p(holder, "holder");
            kotlin.jvm.internal.g0.p(item, "item");
            sa.q.z(holder.b(), item.j().length() > 0);
            holder.b().setText(item.j());
            holder.a().setText(item.h());
            super.g(holder, item);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public b r(@m80.k ig binding, @m80.k View v11) {
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(v11, "v");
            return new b(n.this, binding, v11);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public ig s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
            kotlin.jvm.internal.g0.p(inflater, "inflater");
            kotlin.jvm.internal.g0.p(parent, "parent");
            ig d11 = ig.d(inflater, parent, false);
            kotlin.jvm.internal.g0.o(d11, "inflate(...)");
            return d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f80593a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f80594b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f80595c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k n nVar, @m80.k ig binding, View itemView) {
            super(itemView);
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f80595c = nVar;
            TextView type = binding.f55325c;
            kotlin.jvm.internal.g0.o(type, "type");
            this.f80593a = type;
            TextView meaning = binding.f55324b;
            kotlin.jvm.internal.g0.o(meaning, "meaning");
            this.f80594b = meaning;
        }

        @m80.k
        public final TextView a() {
            return this.f80594b;
        }

        @m80.k
        public final TextView b() {
            return this.f80593a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends e0<qi.c, d, ng> {
        public c() {
            super(n.this.p(), null, 2, null);
        }

        @Override // pi.e0, p50.e
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void g(@m80.k d holder, @m80.k qi.c item) {
            kotlin.jvm.internal.g0.p(holder, "holder");
            kotlin.jvm.internal.g0.p(item, "item");
            holder.f().setText(item.o());
            LottieAnimationView g11 = holder.g();
            String p11 = item.p();
            sa.q.z(g11, !(p11 == null || p11.length() == 0));
            gj.d.a(item.n(), item.q(), holder.e(), false, null);
            super.g(holder, item);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public d r(@m80.k ng binding, @m80.k View v11) {
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(v11, "v");
            n nVar = n.this;
            pi.c<T, CB>.a v12 = nVar.v();
            kotlin.jvm.internal.g0.m(v12);
            return new d(nVar, binding, v11, v12.getAdapterPosition());
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public ng s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
            kotlin.jvm.internal.g0.p(inflater, "inflater");
            kotlin.jvm.internal.g0.p(parent, "parent");
            ng d11 = ng.d(inflater, parent, false);
            kotlin.jvm.internal.g0.o(d11, "inflate(...)");
            return d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final int f80597a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f80598b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final TextView f80599c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final LottieAnimationView f80600d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f80601e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k final n nVar, @m80.k ng binding, View itemView, int i11) {
            super(itemView);
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f80601e = nVar;
            this.f80597a = i11;
            TextView sentence = binding.f56067c;
            kotlin.jvm.internal.g0.o(sentence, "sentence");
            this.f80598b = sentence;
            TextView translation = binding.f56068d;
            kotlin.jvm.internal.g0.o(translation, "translation");
            this.f80599c = translation;
            LottieAnimationView voice = binding.f56069e;
            kotlin.jvm.internal.g0.o(voice, "voice");
            this.f80600d = voice;
            ImageView illustration = binding.f56066b;
            kotlin.jvm.internal.g0.o(illustration, "illustration");
            sa.q.z(illustration, false);
            sa.q.t(voice, 0, new x00.l() { // from class: pi.o
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 c11;
                    c11 = n.d.c(n.this, this, (View) obj);
                    return c11;
                }
            }, 1, null);
            LiveData<Triple<Integer, Integer, Boolean>> x11 = nVar.p().x();
            LifecycleOwner q11 = nVar.q();
            kotlin.jvm.internal.g0.m(q11);
            x11.observe(q11, new q.a(new x00.l() { // from class: pi.p
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 d11;
                    d11 = n.d.d(n.d.this, (Triple) obj);
                    return d11;
                }
            }));
        }

        public static final g2 c(n nVar, d dVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            nVar.p().K(dVar.f80597a, dVar.getAdapterPosition());
            return g2.f100423a;
        }

        public static final g2 d(d dVar, Triple triple) {
            if (triple != null && ((Number) triple.getFirst()).intValue() == dVar.f80597a && ((Number) triple.getSecond()).intValue() == dVar.getAdapterPosition()) {
                if (((Boolean) triple.getThird()).booleanValue()) {
                    dVar.f80600d.A();
                } else {
                    dVar.f80600d.m();
                    dVar.f80600d.setFrame(0);
                }
            }
            return g2.f100423a;
        }

        @m80.k
        public final TextView e() {
            return this.f80598b;
        }

        @m80.k
        public final TextView f() {
            return this.f80599c;
        }

        @m80.k
        public final LottieAnimationView g() {
            return this.f80600d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k pi.c<m, xi>.a holder, @m80.k m item) {
        RecyclerView recyclerView;
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        xi c11 = holder.c();
        Object adapter = (c11 == null || (recyclerView = c11.f57471b) == null) ? null : recyclerView.getAdapter();
        p50.h hVar = adapter instanceof p50.h ? (p50.h) adapter : null;
        if (hVar != null) {
            hVar.m(item.e().d());
            hVar.notifyDataSetChanged();
        }
    }

    @Override // pi.c
    @m80.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public xi z(@m80.k LayoutInflater inflater) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        xi c11 = xi.c(inflater);
        RecyclerView recyclerView = c11.f57471b;
        Context context = c11.getRoot().getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        xl.b bVar = new xl.b(context, 1);
        Drawable drawable = c11.getRoot().getContext().getResources().getDrawable(R.drawable.divider_transparent_16dp, null);
        kotlin.jvm.internal.g0.o(drawable, "getDrawable(...)");
        bVar.setDrawable(drawable);
        recyclerView.addItemDecoration(bVar);
        RecyclerView recyclerView2 = c11.f57471b;
        p50.h hVar = new p50.h();
        hVar.i(qi.c.class, new c());
        hVar.i(e.b.class, new a());
        recyclerView2.setAdapter(hVar);
        return c11;
    }
}
