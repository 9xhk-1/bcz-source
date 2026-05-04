package lg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.report.ExposureConstraintLayout;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;
import gs.de;
import kotlin.jvm.internal.u0;
import lg.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d extends lg.a<mg.c, a> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f71230h = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nGridAdBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridAdBinder.kt\ncom/baicizhan/main/home/plan/binder/GridAdBinder$ViewHolder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,58:1\n13870#2,2:59\n13872#2:62\n35#3:61\n*S KotlinDebug\n*F\n+ 1 GridAdBinder.kt\ncom/baicizhan/main/home/plan/binder/GridAdBinder$ViewHolder\n*L\n32#1:59,2\n32#1:62\n33#1:61\n*E\n"})
    public final class a extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final AspectRoundImageView[] f71231e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f71232f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@m80.k lg.d r2, gs.de r3) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.f71232f = r2
                com.baicizhan.client.business.util.report.ExposureConstraintLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                r1.<init>(r2)
                com.baicizhan.main.view.AspectRoundImageView r2 = r3.f54623b
                com.baicizhan.main.view.AspectRoundImageView r3 = r3.f54624c
                com.baicizhan.main.view.AspectRoundImageView[] r2 = new com.baicizhan.main.view.AspectRoundImageView[]{r2, r3}
                r1.f71231e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.d.a.<init>(lg.d, gs.de):void");
        }

        public static final g2 n(d dVar, mg.g gVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            a3 C = dVar.C();
            if (C != null) {
                C.W(gVar);
            }
            return g2.f100423a;
        }

        public final void m(@m80.k mg.c data) {
            kotlin.jvm.internal.g0.p(data, "data");
            AspectRoundImageView[] aspectRoundImageViewArr = this.f71231e;
            final d dVar = this.f71232f;
            int length = aspectRoundImageViewArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                AspectRoundImageView aspectRoundImageView = aspectRoundImageViewArr[i11];
                int i13 = i12 + 1;
                mg.g gVar = data.d().get(i12);
                if (gVar != null) {
                    final mg.g gVar2 = gVar;
                    ic.c j11 = hc.c.l(gVar2.j()).j(R.drawable.img_grid_ad_default);
                    kotlin.jvm.internal.g0.m(aspectRoundImageView);
                    j11.o(aspectRoundImageView);
                    sa.q.t(aspectRoundImageView, 0, new x00.l() { // from class: lg.c
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 n11;
                            n11 = d.a.n(d.this, gVar2, (View) obj);
                            return n11;
                        }
                    }, 1, null);
                }
                i11++;
                i12 = i13;
            }
            View view = this.itemView;
            ExposureConstraintLayout exposureConstraintLayout = view instanceof ExposureConstraintLayout ? (ExposureConstraintLayout) view : null;
            if (exposureConstraintLayout != null) {
                exposureConstraintLayout.setExposureData(data);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k LifecycleOwner owner) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // zf.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k a holder, @m80.k mg.c item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.m(item);
    }

    @Override // zf.b
    @m80.k
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public a u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        de c11 = de.c(inflater);
        kotlin.jvm.internal.g0.o(c11, "inflate(...)");
        return new a(this, c11);
    }
}
