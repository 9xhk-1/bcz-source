package com.baicizhan.client.business.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qb.c;
import sa.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class WebBlankView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f16773b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f16774c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final String f16775d = WebBlankView.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public Group f16776a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f16777a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebBlankView f16778b;

        public b(boolean z11, WebBlankView webBlankView) {
            this.f16777a = z11;
            this.f16778b = webBlankView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            g0.p(animation, "animation");
            if (this.f16777a) {
                return;
            }
            q.z(this.f16778b, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            g0.p(animation, "animation");
            if (this.f16777a) {
                q.z(this.f16778b, true);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WebBlankView(@k Context context) {
        this(context, null, 0, 0, 14, null);
        g0.p(context, "context");
    }

    public static /* synthetic */ void h(WebBlankView webBlankView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        webBlankView.g(z11, z12);
    }

    @w00.k
    public final void g(boolean z11, boolean z12) {
        animate().cancel();
        Group group = this.f16776a;
        if (group == null) {
            g0.S("widgetsGroup");
            group = null;
        }
        q.z(group, z11);
        c.b(f16775d, "set visible: " + z11 + ", animated: " + z12, new Object[0]);
        float f11 = z11 ? 1.0f : 0.0f;
        if (z12) {
            animate().alpha(f11).setDuration(350L).setStartDelay(1000L).setListener(new b(z11, this)).start();
        } else {
            setAlpha(f11);
            q.z(this, z11);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.group);
        g0.o(findViewById, "findViewById(...)");
        this.f16776a = (Group) findViewById;
    }

    @w00.k
    public final void setVisible(boolean z11) {
        h(this, z11, false, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WebBlankView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WebBlankView(@k Context context, @l AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public WebBlankView(@k Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        g0.p(context, "context");
    }

    public /* synthetic */ WebBlankView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, v vVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
