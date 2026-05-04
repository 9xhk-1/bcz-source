package fj;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.jiongji.andriod.card.R;
import gs.fg;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiMnemonicInfoBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiMnemonicInfoBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiMnemonicInfoBinder\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,86:1\n35#2:87\n*S KotlinDebug\n*F\n+ 1 WikiMnemonicInfoBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiMnemonicInfoBinder\n*L\n54#1:87\n*E\n"})
/* loaded from: classes3.dex */
public final class l extends li.e<com.baicizhan.main.wikiv2.studyv2.data.a0, a> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f51928i = 8;

    /* renamed from: e, reason: collision with root package name */
    public int f51929e;

    /* renamed from: f, reason: collision with root package name */
    public float f51930f;

    /* renamed from: g, reason: collision with root package name */
    public int f51931g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51932h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<fg> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f51933e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k l lVar, fg itemBinding) {
            super(itemBinding);
            g0.p(itemBinding, "itemBinding");
            this.f51933e = lVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@m80.k LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        this.f51929e = -1;
        this.f51930f = -1.0f;
        this.f51931g = -1;
    }

    public static final void y(final l lVar, final fg fgVar, View view) {
        if (lVar.f51929e < 0) {
            lVar.f51929e = fgVar.f54930b.getWidth();
            lVar.f51930f = fgVar.f54930b.getHeight() / lVar.f51929e;
            lVar.f51931g = fgVar.getRoot().getMeasuredWidth() - KotlinExtKt.getDpPixels(32);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(fgVar.f54930b.getWidth(), lVar.f51932h ? lVar.f51929e : lVar.f51931g);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fj.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.z(fg.this, lVar, valueAnimator);
            }
        });
        ofInt.start();
        lVar.f51932h = !lVar.f51932h;
    }

    public static final void z(fg fgVar, l lVar, ValueAnimator it) {
        g0.p(it, "it");
        ViewGroup.LayoutParams layoutParams = fgVar.f54930b.getLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        g0.n(it.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = (int) (((Integer) r5).intValue() * lVar.f51930f);
        fgVar.f54930b.setLayoutParams(layoutParams);
    }

    @Override // li.e
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        return new a(this, (fg) wi.p.f96399a.b(fg.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(fg.class, holder.b());
    }

    @Override // p50.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.studyv2.data.a0 mnemonicInfo) {
        String f11;
        g0.p(holder, "holder");
        g0.p(mnemonicInfo, "mnemonicInfo");
        final fg b11 = holder.b();
        if (mnemonicInfo.h().length() == 0) {
            b11.f54929a.setText(KotlinExtKt.getToStr(R.string.wiki_v2_no_mnemonic_tip));
        } else {
            b11.f54931c.setText(mnemonicInfo.h());
            b11.f54929a.setText(mnemonicInfo.f());
        }
        TextView mnemonicType = b11.f54931c;
        g0.o(mnemonicType, "mnemonicType");
        boolean z11 = false;
        sa.q.z(mnemonicType, mnemonicInfo.h().length() > 0);
        Uri g11 = mnemonicInfo.g();
        if (g11 != null) {
            ic.c f12 = hc.c.j(g11).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
            ImageView mnemonicImg = b11.f54930b;
            g0.o(mnemonicImg, "mnemonicImg");
            f12.o(mnemonicImg);
        }
        ImageView mnemonicImg2 = b11.f54930b;
        g0.o(mnemonicImg2, "mnemonicImg");
        if (mnemonicInfo.g() != null && ((f11 = mnemonicInfo.f()) == null || f11.length() == 0)) {
            z11 = true;
        }
        sa.q.z(mnemonicImg2, z11);
        b11.f54930b.setOnClickListener(new View.OnClickListener() { // from class: fj.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.y(l.this, b11, view);
            }
        });
        o(holder);
    }
}
