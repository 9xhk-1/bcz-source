package lg;

import a00.l1;
import ag.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.report.ExposureFrameLayout;
import com.baicizhan.main.customview.banner.CarousalBannerView;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;
import gs.td;
import gs.ud;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b extends lg.a<mg.b, C0856b> {

    /* renamed from: j, reason: collision with root package name */
    public static final int f71212j = 8;

    /* renamed from: h, reason: collision with root package name */
    public C0856b f71213h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public Lifecycle f71214i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends ag.b<mg.g, C0855a> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lg.b$a$a, reason: collision with other inner class name */
        public final class C0855a extends RecyclerView.ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final ImageView f71216a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f71217b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0855a(@m80.k a aVar, ud binding) {
                super(binding.getRoot());
                kotlin.jvm.internal.g0.p(binding, "binding");
                this.f71217b = aVar;
                AspectRoundImageView ad2 = binding.f57004b;
                kotlin.jvm.internal.g0.o(ad2, "ad");
                this.f71216a = ad2;
            }

            @m80.k
            public final ImageView a() {
                return this.f71216a;
            }
        }

        public a() {
        }

        @Override // ag.b
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void f(@m80.k C0855a holder, @m80.k mg.g data, int i11) {
            kotlin.jvm.internal.g0.p(holder, "holder");
            kotlin.jvm.internal.g0.p(data, "data");
            hc.c.l(data.j()).j(R.drawable.img_carousal_ad_default).o(holder.a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @m80.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public C0855a onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
            kotlin.jvm.internal.g0.p(parent, "parent");
            ud c11 = ud.c(LayoutInflater.from(parent.getContext()));
            kotlin.jvm.internal.g0.o(c11, "inflate(...)");
            return new C0855a(this, c11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCarousalAdBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarousalAdBinder.kt\ncom/baicizhan/main/home/plan/binder/CarousalAdBinder$ViewHolder\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,139:1\n35#2:140\n*S KotlinDebug\n*F\n+ 1 CarousalAdBinder.kt\ncom/baicizhan/main/home/plan/binder/CarousalAdBinder$ViewHolder\n*L\n76#1:140\n*E\n"})
    /* renamed from: lg.b$b, reason: collision with other inner class name */
    public final class C0856b extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final CarousalBannerView f71218e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f71219f;

        /* renamed from: g, reason: collision with root package name */
        public int f71220g;

        /* renamed from: h, reason: collision with root package name */
        public int f71221h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ b f71222i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lg.b$b$a */
        public static final class a implements b.a<mg.g> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f71223a;

            public a(b bVar) {
                this.f71223a = bVar;
            }

            @Override // ag.b.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(mg.g data) {
                kotlin.jvm.internal.g0.p(data, "data");
                a3 C = this.f71223a.C();
                if (C != null) {
                    C.W(data);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lg.b$b$b, reason: collision with other inner class name */
        public static final class C0857b implements CarousalBannerView.a {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ mg.b f71225b;

            public C0857b(mg.b bVar) {
                this.f71225b = bVar;
            }

            @Override // com.baicizhan.main.customview.banner.CarousalBannerView.a
            public void a(int i11) {
                C0856b.this.f71220g = i11;
                C0856b.this.o(this.f71225b);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0856b(@m80.k lg.b r2, gs.td r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.f71222i = r2
                com.baicizhan.client.business.util.report.ExposureFrameLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                r1.<init>(r2)
                com.baicizhan.main.customview.banner.CarousalBannerView r2 = r3.f56878b
                java.lang.String r3 = "homeAdCarousal"
                kotlin.jvm.internal.g0.o(r2, r3)
                r1.f71218e = r2
                r2 = -1
                r1.f71221h = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.b.C0856b.<init>(lg.b, gs.td):void");
        }

        public final void m(@m80.k mg.b data) {
            kotlin.jvm.internal.g0.p(data, "data");
            a aVar = this.f71222i.new a();
            b bVar = this.f71222i;
            aVar.i(new a(bVar));
            this.f71218e.p(data.d(), aVar);
            Lifecycle E = bVar.E();
            if (E != null) {
                E.addObserver(this.f71218e);
            }
            View view = this.itemView;
            ExposureFrameLayout exposureFrameLayout = view instanceof ExposureFrameLayout ? (ExposureFrameLayout) view : null;
            if (exposureFrameLayout != null) {
                exposureFrameLayout.setExposureData(data);
            }
            this.f71218e.setMPageShowCallback(new C0857b(data));
        }

        public final boolean n() {
            return this.f71219f;
        }

        public final void o(@m80.k mg.b data) {
            kotlin.jvm.internal.g0.p(data, "data");
            int i11 = this.f71220g;
            if (i11 != this.f71221h && i11 >= 0 && this.f71219f) {
                List<mg.g> d11 = data.d();
                if (d11 != null) {
                    ma.l.e(ma.t.f73010i, ma.a.f72842t3, l1.W(h1.a("adv_id", d11.get(this.f71220g).i()), h1.a("id", d11.get(this.f71220g).i()), h1.a("idx", Integer.valueOf(d11.get(this.f71220g).k()))));
                }
                this.f71221h = this.f71220g;
            }
        }

        public final void p(boolean z11) {
            this.f71219f = z11;
        }

        public final void q(@m80.k mg.b data) {
            kotlin.jvm.internal.g0.p(data, "data");
            this.f71219f = true;
            o(data);
        }

        public final void r() {
            C0856b c0856b = this.f71222i.f71213h;
            if (c0856b == null) {
                kotlin.jvm.internal.g0.S("holder");
                c0856b = null;
            }
            c0856b.f71219f = false;
            this.f71221h = -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@m80.k LifecycleOwner owner) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @m80.l
    public final Lifecycle E() {
        return this.f71214i;
    }

    @Override // zf.b
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k C0856b holder, @m80.k mg.b item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.m(item);
    }

    @Override // zf.b
    @m80.k
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public C0856b u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        td c11 = td.c(inflater);
        kotlin.jvm.internal.g0.o(c11, "inflate(...)");
        C0856b c0856b = new C0856b(this, c11);
        this.f71213h = c0856b;
        return c0856b;
    }

    public final void H(@m80.l Lifecycle lifecycle) {
        this.f71214i = lifecycle;
    }

    public final void I(@m80.k mg.b data) {
        kotlin.jvm.internal.g0.p(data, "data");
        C0856b c0856b = this.f71213h;
        if (c0856b == null) {
            kotlin.jvm.internal.g0.S("holder");
            c0856b = null;
        }
        c0856b.q(data);
    }

    public final void J() {
        C0856b c0856b = this.f71213h;
        if (c0856b == null) {
            kotlin.jvm.internal.g0.S("holder");
            c0856b = null;
        }
        c0856b.r();
    }
}
