package pi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.lookup.WordWikiActivity;
import com.jiongji.andriod.card.R;
import gs.kg;
import gs.xi;
import pi.v;
import qi.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class v extends c<t, xi> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80636k = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends e0<f.b, b, kg> {
        public a() {
            super(v.this.p(), null, 2, null);
        }

        public static final g2 v(f.b bVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            WordWikiActivity.a aVar = WordWikiActivity.f25556b;
            Context context = it.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            WordWikiActivity.a.d(aVar, context, bVar.l(), 0, null, 12, null);
            return g2.f100423a;
        }

        @Override // pi.e0, p50.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void g(@m80.k b holder, @m80.k final f.b item) {
            kotlin.jvm.internal.g0.p(holder, "holder");
            kotlin.jvm.internal.g0.p(item, "item");
            holder.a().setText(item.k());
            holder.b().setText(item.m());
            View itemView = holder.itemView;
            kotlin.jvm.internal.g0.o(itemView, "itemView");
            sa.q.t(itemView, 0, new x00.l() { // from class: pi.u
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 v11;
                    v11 = v.a.v(f.b.this, (View) obj);
                    return v11;
                }
            }, 1, null);
            super.g(holder, item);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b r(@m80.k kg binding, @m80.k View v11) {
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(v11, "v");
            return new b(v.this, binding, v11);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public kg s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
            kotlin.jvm.internal.g0.p(inflater, "inflater");
            kotlin.jvm.internal.g0.p(parent, "parent");
            kg d11 = kg.d(inflater, parent, false);
            kotlin.jvm.internal.g0.o(d11, "inflate(...)");
            return d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f80638a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f80639b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f80640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k v vVar, @m80.k kg binding, View itemView) {
            super(itemView);
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f80640c = vVar;
            TextView phrase = binding.f55614b;
            kotlin.jvm.internal.g0.o(phrase, "phrase");
            this.f80638a = phrase;
            TextView phraseTrans = binding.f55615c;
            kotlin.jvm.internal.g0.o(phraseTrans, "phraseTrans");
            this.f80639b = phraseTrans;
        }

        @m80.k
        public final TextView a() {
            return this.f80638a;
        }

        @m80.k
        public final TextView b() {
            return this.f80639b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k c<t, xi>.a holder, @m80.k t item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        super.g(holder, item);
        RecyclerView recyclerView = (RecyclerView) holder.itemView.findViewById(R.id.recycler);
        if (recyclerView == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
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
        Drawable drawable = c11.getRoot().getContext().getResources().getDrawable(R.drawable.divider_transparent_12dp, null);
        kotlin.jvm.internal.g0.o(drawable, "getDrawable(...)");
        bVar.setDrawable(drawable);
        recyclerView.addItemDecoration(bVar);
        RecyclerView recyclerView2 = c11.f57471b;
        p50.h hVar = new p50.h();
        hVar.i(f.b.class, new a());
        recyclerView2.setAdapter(hVar);
        return c11;
    }
}
