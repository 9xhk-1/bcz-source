package pi;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;
import gs.hg;
import gs.jg;
import gs.xi;
import pi.s;
import qi.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class s extends pi.c<m, xi> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f80618k = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends e0<qi.c, b, hg> {

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final yz.c0 f80619f;

        public a() {
            super(s.this.p(), null, 2, null);
            this.f80619f = yz.e0.c(new x00.a() { // from class: pi.r
                @Override // x00.a
                public final Object invoke() {
                    int y11;
                    y11 = s.a.y(s.a.this);
                    return Integer.valueOf(y11);
                }
            });
        }

        public static final int y(a aVar) {
            Application application = aVar.p().getApplication();
            kotlin.jvm.internal.g0.n(application, "null cannot be cast to non-null type android.content.Context");
            return application.getResources().getColor(R.color.main_color_main_word);
        }

        public final int u() {
            return ((Number) this.f80619f.getValue()).intValue();
        }

        @Override // pi.e0, p50.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void g(@m80.k b holder, @m80.k qi.c item) {
            kotlin.jvm.internal.g0.p(holder, "holder");
            kotlin.jvm.internal.g0.p(item, "item");
            holder.a().setText(String.valueOf(item.l()));
            holder.b().setText(item.n());
            gj.d.b(item.n(), item.q(), holder.b(), false, null, u());
            super.g(holder, item);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b r(@m80.k hg binding, @m80.k View v11) {
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(v11, "v");
            return new b(s.this, binding);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public hg s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
            kotlin.jvm.internal.g0.p(inflater, "inflater");
            kotlin.jvm.internal.g0.p(parent, "parent");
            hg d11 = hg.d(inflater, parent, false);
            kotlin.jvm.internal.g0.o(d11, "inflate(...)");
            return d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final TextView f80621a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final TextView f80622b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f80623c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k s sVar, hg binding) {
            super(binding.getRoot());
            kotlin.jvm.internal.g0.p(binding, "binding");
            this.f80623c = sVar;
            TextView number = binding.f55197c;
            kotlin.jvm.internal.g0.o(number, "number");
            this.f80621a = number;
            TextView paraphraseEn = binding.f55198d;
            kotlin.jvm.internal.g0.o(paraphraseEn, "paraphraseEn");
            this.f80622b = paraphraseEn;
        }

        @m80.k
        public final TextView a() {
            return this.f80621a;
        }

        @m80.k
        public final TextView b() {
            return this.f80622b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends e0<e.b, d, jg> {
        public c() {
            super(s.this.p(), null, 2, null);
        }

        @Override // pi.e0, p50.e
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void g(@m80.k d holder, @m80.k e.b item) {
            kotlin.jvm.internal.g0.p(holder, "holder");
            kotlin.jvm.internal.g0.p(item, "item");
            View view = holder.itemView;
            kotlin.jvm.internal.g0.n(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(item.j());
            if (holder.getAdapterPosition() != 0) {
                Object tag = holder.itemView.getTag();
                Boolean bool = Boolean.TRUE;
                if (!kotlin.jvm.internal.g0.g(tag, bool)) {
                    ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
                    kotlin.jvm.internal.g0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    int a11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + xb.f.a(holder.itemView.getContext(), 8.0f);
                    ViewGroup.LayoutParams layoutParams2 = holder.itemView.getLayoutParams();
                    kotlin.jvm.internal.g0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = a11;
                    holder.itemView.setTag(bool);
                }
            }
            super.g(holder, item);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public d r(@m80.k jg binding, @m80.k View v11) {
            kotlin.jvm.internal.g0.p(binding, "binding");
            kotlin.jvm.internal.g0.p(v11, "v");
            return new d(s.this, v11);
        }

        @Override // pi.e0
        @m80.k
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public jg s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
            kotlin.jvm.internal.g0.p(inflater, "inflater");
            kotlin.jvm.internal.g0.p(parent, "parent");
            jg d11 = jg.d(inflater, parent, false);
            kotlin.jvm.internal.g0.o(d11, "inflate(...)");
            return d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f80625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k s sVar, View itemView) {
            super(itemView);
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f80625a = sVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // pi.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k pi.c<m, xi>.a holder, @m80.k m item) {
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
        Drawable drawable = c11.getRoot().getContext().getResources().getDrawable(R.drawable.divider_transparent_8dp, null);
        kotlin.jvm.internal.g0.o(drawable, "getDrawable(...)");
        bVar.setDrawable(drawable);
        recyclerView.addItemDecoration(bVar);
        RecyclerView recyclerView2 = c11.f57471b;
        p50.h hVar = new p50.h();
        hVar.i(qi.c.class, new a());
        hVar.i(e.b.class, new c());
        recyclerView2.setAdapter(hVar);
        return c11;
    }
}
