package pe;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.main.activity.schedule_v2.switchschedule.f0;
import com.jiongji.andriod.card.R;
import gs.sn;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nScheduleBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleBinder.kt\ncom/baicizhan/main/activity/schedule_v2/binder/ScheduleBinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* loaded from: classes4.dex */
public final class g extends zf.b<com.baicizhan.main.activity.schedule_v2.switchschedule.b, a> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f80400h = 8;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f0 f80401g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final sn f80402e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f80403f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g f80404g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k g gVar, @k View itemView, sn binding) {
            super(itemView);
            g0.p(itemView, "itemView");
            g0.p(binding, "binding");
            this.f80404g = gVar;
            this.f80402e = binding;
        }

        @k
        public final sn l() {
            return this.f80402e;
        }

        public final boolean m() {
            return this.f80403f;
        }

        public final void n(boolean z11) {
            this.f80403f = z11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@k LifecycleOwner owner, @k f0 vm2) {
        super(owner, null, 2, null);
        g0.p(owner, "owner");
        g0.p(vm2, "vm");
        this.f80401g = vm2;
    }

    public static final void H(g gVar, com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar, View view) {
        gVar.f80401g.x(bVar);
    }

    public static final void I(g gVar, com.baicizhan.main.activity.schedule_v2.switchschedule.b bVar, View view) {
        gVar.f80401g.S(bVar);
    }

    public final void E(a aVar) {
        Context context = aVar.itemView.getContext();
        View root = aVar.l().getRoot();
        g0.n(root, "null cannot be cast to non-null type android.view.ViewGroup");
        g0.m(context);
        com.baicizhan.base.d.d((ViewGroup) root, context);
    }

    public final void F(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f, 0.0f, 1.0f, 0.0f);
        ofFloat.setDuration(900L);
        ofFloat.start();
    }

    @Override // zf.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void s(@k a holder, @k final com.baicizhan.main.activity.schedule_v2.switchschedule.b item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        sn l11 = holder.l();
        ic.c f11 = hc.c.l(item.n()).j(R.drawable.ic_book_cover_default).f(R.drawable.ic_book_cover_default);
        ImageView bookBg = l11.f56784b;
        g0.o(bookBg, "bookBg");
        f11.o(bookBg);
        l11.f56786d.setText(item.o());
        if (item.v()) {
            l11.f56789g.setVisibility(8);
            l11.f56789g.setOnClickListener(null);
            l11.f56788f.setVisibility(0);
            l11.f56787e.setEnabled(false);
        } else {
            l11.f56789g.setVisibility(0);
            l11.f56789g.setOnClickListener(new View.OnClickListener() { // from class: pe.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.H(g.this, item, view);
                }
            });
            l11.f56788f.setVisibility(4);
            l11.f56787e.setEnabled(true);
            l11.f56787e.setOnClickListener(new View.OnClickListener() { // from class: pe.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.I(g.this, item, view);
                }
            });
        }
        Context context = l11.getRoot().getContext();
        g0.o(context, "getContext(...)");
        if (com.baicizhan.base.a.a(context) && !holder.m()) {
            E(holder);
            holder.n(true);
        }
        Context context2 = l11.f56790h.getContext();
        ProgressBar progressBar = l11.f56790h;
        ThemeResUtil.setBaicizhanProgress(context2, progressBar, 50, progressBar.getResources().getColor(R.color.main_color_background_gray), ColorKt.m2563toArgb8_81llA(bk.b.g0()));
        l11.f56790h.setMax(item.u());
        l11.f56790h.setProgress(item.p());
        l11.f56792j.setMax(item.u());
        l11.f56792j.setProgress(item.q());
        ThemeResUtil.setBaicizhanProgress(l11.f56790h.getContext(), l11.f56790h, 50, ColorKt.m2563toArgb8_81llA(bk.b.J()), ColorKt.m2563toArgb8_81llA(bk.b.g0()));
        Context context3 = l11.f56792j.getContext();
        ProgressBar progressBar2 = l11.f56792j;
        ThemeResUtil.setBaicizhanProgress(context3, progressBar2, 50, progressBar2.getContext().getResources().getColor(R.color.transparent), ColorKt.m2563toArgb8_81llA(bk.b.e0()));
        TextView textView = l11.f56796n;
        textView.setText(textView.getContext().getString(R.string.schedule_adjust_total_count_des, Integer.valueOf(item.u())));
        TextView textView2 = l11.f56795m;
        textView2.setText(textView2.getContext().getString(R.string.schedule_adjust_total_master_count_des, Integer.valueOf(item.q())));
        TextView textView3 = l11.f56794l;
        textView3.setText(textView3.getContext().getString(R.string.schedule_adjust_total_learn_count_des, Integer.valueOf(item.p())));
        int i11 = item.q() != 0 ? 0 : 8;
        l11.f56793k.setVisibility(i11);
        l11.f56795m.setVisibility(i11);
        if (item.p() < item.u()) {
            TextView textView4 = l11.f56785c;
            textView4.setText(textView4.getContext().getString(R.string.schedule_adjust_remain, Integer.valueOf(item.s()), Integer.valueOf(item.t())));
        } else if (item.q() < item.u()) {
            TextView textView5 = l11.f56785c;
            textView5.setText(textView5.getContext().getResources().getString(R.string.schedule_switch_reviewing, Integer.valueOf(item.s())));
        } else {
            l11.f56785c.setText(R.string.schedule_switch_done);
        }
        if (!item.r()) {
            item = null;
        }
        if (item != null) {
            item.w(false);
            View animationBg = l11.f56783a;
            g0.o(animationBg, "animationBg");
            F(animationBg);
        }
        holder.l().executePendingBindings();
    }

    @Override // zf.b
    @k
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public a u(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        sn snVar = (sn) DataBindingUtil.inflate(inflater, R.layout.switch_schedule_item, parent, false);
        View root = snVar.getRoot();
        g0.o(root, "getRoot(...)");
        g0.m(snVar);
        a aVar = new a(this, root, snVar);
        aVar.l().executePendingBindings();
        return aVar;
    }
}
