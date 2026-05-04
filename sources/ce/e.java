package ce;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.text.HtmlCompat;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.jiongji.andriod.card.R;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class e extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8534h = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f8535b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f8536c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Triple<Integer, Integer, Integer> f8537d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8538e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8539f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8540g;

    public e(@k Context context, @k View target, @k Triple<Integer, Integer, Integer> guiderViewIds, boolean z11) {
        g0.p(context, "context");
        g0.p(target, "target");
        g0.p(guiderViewIds, "guiderViewIds");
        this.f8535b = context;
        this.f8536c = target;
        this.f8537d = guiderViewIds;
        this.f8538e = z11;
        this.f8539f = xb.f.i(getContext());
        this.f8540g = xb.f.f(getContext());
    }

    public static final void M(e eVar, x00.a aVar, View view) {
        eVar.b();
        aVar.invoke();
    }

    @Override // be.k
    @k
    public Triple<Integer, Integer, Integer> A() {
        return this.f8537d;
    }

    @Override // ce.a
    public void K(@k ViewGroup parent, @k View guideView, @k View anchorView, @k Rect anchorRect, @k final x00.a<g2> onDismiss) {
        g0.p(parent, "parent");
        g0.p(guideView, "guideView");
        g0.p(anchorView, "anchorView");
        g0.p(anchorRect, "anchorRect");
        g0.p(onDismiss, "onDismiss");
        TextView textView = (TextView) guideView.findViewById(R.id.tip);
        textView.setText(HtmlCompat.fromHtml(KotlinExtKt.getString(R.string.guide_golden_nav_exam_assistant), 63));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        g0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (Math.max(anchorRect.right, parent.getMeasuredWidth() - xb.i.a(getContext(), 24.0f)) - (anchorRect.left + (anchorRect.width() / 2))) * 2;
        textView.setLayoutParams(layoutParams2);
        TextView textView2 = (TextView) guideView.findViewById(R.id.confirm);
        if (anchorRect.bottom + xb.i.a(getContext(), 70.0f) > this.f8540g) {
            int a11 = xb.i.a(getContext(), 12.0f);
            textView2.setPadding(a11, textView2.getPaddingTop(), a11, textView2.getPaddingBottom());
            if (Build.VERSION.SDK_INT >= 26) {
                textView2.setAutoSizeTextTypeWithDefaults(1);
            }
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            g0.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = (this.f8539f - anchorRect.right) - (a11 * 2);
            ConstraintSet constraintSet = new ConstraintSet();
            ViewParent parent2 = textView2.getParent();
            g0.n(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            constraintSet.clone((ConstraintLayout) parent2);
            constraintSet.clear(R.id.confirm);
            constraintSet.connect(R.id.confirm, 3, anchorView.getId(), 3);
            constraintSet.connect(R.id.confirm, 4, anchorView.getId(), 4);
            constraintSet.connect(R.id.confirm, 6, anchorView.getId(), 7);
            ViewParent parent3 = textView2.getParent();
            g0.n(parent3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            constraintSet.connect(R.id.confirm, 7, ((ConstraintLayout) parent3).getId(), 7);
            constraintSet.constrainMaxHeight(R.id.confirm, xb.i.a(getContext(), 48.0f));
            constraintSet.setMargin(R.id.confirm, 6, a11);
            constraintSet.setMargin(R.id.confirm, 7, a11);
            ViewParent parent4 = textView2.getParent();
            g0.n(parent4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            constraintSet.applyTo((ConstraintLayout) parent4);
            textView2.setLayoutParams(layoutParams4);
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ce.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.M(e.this, onDismiss, view);
            }
        });
    }

    @Override // be.k
    public boolean a() {
        return i9.f.c(getContext(), i9.f.f60396s);
    }

    @Override // be.k
    public void b() {
        i9.f.j(getContext(), i9.f.f60396s, true);
    }

    @Override // be.k
    @k
    public Context getContext() {
        return this.f8535b;
    }

    @Override // ce.a, be.k
    @k
    public View getTarget() {
        return this.f8536c;
    }

    @Override // ce.a, be.k
    public boolean i() {
        return this.f8538e;
    }

    @Override // be.k
    public boolean r(@k Rect targetRect) {
        g0.p(targetRect, "targetRect");
        return targetRect.height() + xb.i.a(getContext(), 6.0f) >= xb.i.a(getContext(), 70.0f);
    }

    public /* synthetic */ e(Context context, View view, Triple triple, boolean z11, int i11, v vVar) {
        this(context, view, (i11 & 4) != 0 ? new Triple(Integer.valueOf(R.layout.layout_main_guide_golden_exam_assistant), Integer.valueOf(R.id.main_guide_exam_assistant), Integer.valueOf(R.id.anchor)) : triple, (i11 & 8) != 0 ? true : z11);
    }
}
