package lg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.report.ExposureFrameLayout;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.home.plan.k3;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.u0;
import lg.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class f extends lg.a<mg.g, a> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f71239h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f71240i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f71241j = f.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordAdCardBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordAdCardBinder.kt\ncom/baicizhan/main/home/plan/binder/WordAdCardBinder$AdHolder\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,88:1\n18#2,3:89\n*S KotlinDebug\n*F\n+ 1 WordAdCardBinder.kt\ncom/baicizhan/main/home/plan/binder/WordAdCardBinder$AdHolder\n*L\n62#1:89,3\n*E\n"})
    public final class a extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final ImageView f71242e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public mg.g f71243f;

        /* renamed from: g, reason: collision with root package name */
        public float f71244g;

        /* renamed from: h, reason: collision with root package name */
        public float f71245h;

        /* renamed from: i, reason: collision with root package name */
        public float f71246i;

        /* renamed from: j, reason: collision with root package name */
        public float f71247j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ f f71248k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lg.f$a$a, reason: collision with other inner class name */
        public static final class ViewOnTouchListenerC0858a implements View.OnTouchListener {
            public ViewOnTouchListenerC0858a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    a.this.f71244g = motionEvent.getX();
                    a.this.f71245h = motionEvent.getY();
                    return false;
                }
                if (valueOf == null || valueOf.intValue() != 1) {
                    return false;
                }
                a.this.f71246i = motionEvent.getX();
                a.this.f71247j = motionEvent.getY();
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k final f fVar, View itemView) {
            super(itemView);
            kotlin.jvm.internal.g0.p(itemView, "itemView");
            this.f71248k = fVar;
            View findViewById = itemView.findViewById(R.id.ad);
            kotlin.jvm.internal.g0.o(findViewById, "findViewById(...)");
            this.f71242e = (ImageView) findViewById;
            itemView.setOnTouchListener(new ViewOnTouchListenerC0858a());
            sa.q.t(itemView, 0, new x00.l() { // from class: lg.e
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = f.a.m(f.a.this, fVar, (View) obj);
                    return m11;
                }
            }, 1, null);
            itemView.setEnabled(false);
        }

        public static final g2 m(a aVar, f fVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            Context context = it.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            mg.g gVar = aVar.f71243f;
            AdExtraResp h11 = gVar != null ? gVar.h() : null;
            mg.g gVar2 = aVar.f71243f;
            k3.y(context, h11, gVar2 != null ? gVar2.l() : null, new mg.a(0L, 0L, 0, 0, aVar.f71244g, aVar.f71245h, aVar.f71246i, aVar.f71247j, null, null, 783, null));
            a3 C = fVar.C();
            if (C != null) {
                mg.g gVar3 = aVar.f71243f;
                kotlin.jvm.internal.g0.m(gVar3);
                C.W(gVar3);
            }
            return g2.f100423a;
        }

        public final void r(@m80.k mg.g item) {
            kotlin.jvm.internal.g0.p(item, "item");
            this.f71243f = item;
            String j11 = item.j();
            if (j11 != null && j11.length() != 0) {
                hc.c.l(j11).j(R.drawable.img_horizontal_ad_default).o(this.f71242e);
            }
            View view = this.itemView;
            String l11 = item.l();
            view.setEnabled(!(l11 == null || l11.length() == 0));
            View view2 = this.itemView;
            kotlin.jvm.internal.g0.n(view2, "null cannot be cast to non-null type com.baicizhan.client.business.util.report.ExposureFrameLayout");
            ((ExposureFrameLayout) view2).setExposureData(item);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.k LifecycleOwner owner) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // zf.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k a holder, @m80.k mg.g item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.r(item);
    }

    @Override // zf.b
    @m80.k
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public a u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        View inflate = inflater.inflate(R.layout.item_word_ad_card, parent, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        return new a(this, inflate);
    }

    @Override // zf.b
    public void w(boolean z11) {
    }
}
