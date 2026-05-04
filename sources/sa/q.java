package sa;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nview_ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 view_ext.kt\ncom/baicizhan/client/business/view/View_extKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,146:1\n13805#2,2:147\n*S KotlinDebug\n*F\n+ 1 view_ext.kt\ncom/baicizhan/client/business/view/View_extKt\n*L\n50#1:147,2\n*E\n"})
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f88193a = "view_ext";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ViewOutlineProvider f88194b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            g0.p(view, "view");
            g0.p(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.max(view.getWidth(), view.getHeight()) / 2.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f88195a;

        public b(float f11) {
            this.f88195a = f11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            g0.p(view, "view");
            g0.p(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f88195a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f88196a;

        public c(View view) {
            this.f88196a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            g0.p(animation, "animation");
            q.z(this.f88196a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            g0.p(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            g0.p(animation, "animation");
        }
    }

    public static final void A(@m80.k final View view) {
        g0.p(view, "<this>");
        z(view, true);
        view.post(new Runnable() { // from class: sa.m
            @Override // java.lang.Runnable
            public final void run() {
                q.B(view);
            }
        });
    }

    public static final void B(View view) {
        ObjectAnimator.ofFloat(view, "translationX", -view.getMeasuredWidth(), 0.0f).start();
    }

    public static final void C(@m80.k final View view) {
        g0.p(view, "<this>");
        z(view, true);
        view.post(new Runnable() { // from class: sa.p
            @Override // java.lang.Runnable
            public final void run() {
                q.D(view);
            }
        });
    }

    public static final void D(View view) {
        ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0.0f).start();
    }

    public static final void f(@m80.k View view) {
        g0.p(view, "<this>");
        view.setOutlineProvider(f88194b);
        view.setClipToOutline(true);
    }

    public static final void g(@m80.k View view, float f11) {
        g0.p(view, "<this>");
        view.setOutlineProvider(h(f11));
        view.setClipToOutline(true);
    }

    @m80.k
    public static final ViewOutlineProvider h(float f11) {
        return new b(f11);
    }

    public static final void i(@m80.k ViewGroup viewGroup, boolean z11, @m80.k x00.l<? super View, g2> block) {
        g0.p(viewGroup, "<this>");
        g0.p(block, "block");
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            g0.o(childAt, "getChildAt(...)");
            block.invoke(childAt);
            if (z11 && (childAt instanceof ViewGroup)) {
                i((ViewGroup) childAt, z11, block);
            }
        }
    }

    @m80.k
    public static final ViewOutlineProvider j() {
        return f88194b;
    }

    @m80.l
    public static final Drawable k(@m80.k ImageView imageView) {
        g0.p(imageView, "<this>");
        return imageView.getDrawable();
    }

    @m80.l
    public static final CharSequence l(@m80.k TextView textView) {
        g0.p(textView, "<this>");
        return textView.getText();
    }

    public static final boolean m(@m80.k View view) {
        g0.p(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void n(@m80.k View view) {
        g0.p(view, "<this>");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getMeasuredHeight());
        ofFloat.addListener(new c(view));
        ofFloat.start();
    }

    public static final void o(@m80.k ImageView imageView, @m80.l Drawable drawable) {
        g0.p(imageView, "<this>");
        imageView.setImageDrawable(drawable);
        z(imageView, drawable != null);
    }

    public static final void p(@m80.k TextView textView, @m80.l CharSequence charSequence) {
        g0.p(textView, "<this>");
        textView.setText(charSequence);
        z(textView, !(charSequence == null || charSequence.length() == 0));
    }

    public static final void q(@m80.k View view, final int i11, @m80.k final x00.l<? super View, g2> l11) {
        g0.p(view, "<this>");
        g0.p(l11, "l");
        final Ref.LongRef longRef = new Ref.LongRef();
        view.setOnClickListener(new View.OnClickListener() { // from class: sa.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.w(Ref.LongRef.this, i11, l11, view2);
            }
        });
    }

    public static final void r(@m80.k View view, @m80.k final View.OnClickListener l11, final int i11) {
        g0.p(view, "<this>");
        g0.p(l11, "l");
        final Ref.LongRef longRef = new Ref.LongRef();
        view.setOnClickListener(new View.OnClickListener() { // from class: sa.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q.x(Ref.LongRef.this, i11, l11, view2);
            }
        });
    }

    public static final void s(@m80.k View[] viewArr, int i11, @m80.k final x00.l<? super View, g2> l11) {
        g0.p(viewArr, "<this>");
        g0.p(l11, "l");
        for (View view : viewArr) {
            q(view, i11, new x00.l() { // from class: sa.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 y11;
                    y11 = q.y(x00.l.this, (View) obj);
                    return y11;
                }
            });
        }
    }

    public static /* synthetic */ void t(View view, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1000;
        }
        q(view, i11, lVar);
    }

    public static /* synthetic */ void u(View view, View.OnClickListener onClickListener, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1000;
        }
        r(view, onClickListener, i11);
    }

    public static /* synthetic */ void v(View[] viewArr, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1000;
        }
        s(viewArr, i11, lVar);
    }

    public static final void w(Ref.LongRef longRef, int i11, x00.l lVar, View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = longRef.element;
        if (j11 == 0 || j11 + i11 < elapsedRealtime) {
            g0.m(view);
            lVar.invoke(view);
            longRef.element = elapsedRealtime;
        }
    }

    public static final void x(Ref.LongRef longRef, int i11, View.OnClickListener onClickListener, View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = longRef.element;
        if (j11 == 0 || j11 + i11 < elapsedRealtime) {
            onClickListener.onClick(view);
            longRef.element = elapsedRealtime;
        }
    }

    public static final g2 y(x00.l lVar, View v11) {
        g0.p(v11, "v");
        lVar.invoke(v11);
        return g2.f100423a;
    }

    public static final void z(@m80.k View view, boolean z11) {
        g0.p(view, "<this>");
        view.setVisibility(z11 ? 0 : 8);
    }
}
