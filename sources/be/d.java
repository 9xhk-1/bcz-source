package be;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import fd.d3;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import va.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnchorGuideParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchorGuideParser.kt\ncom/baicizhan/main/activity/guide/AnchorGuideParser\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,88:1\n337#2:89\n*S KotlinDebug\n*F\n+ 1 AnchorGuideParser.kt\ncom/baicizhan/main/activity/guide/AnchorGuideParser\n*L\n41#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class d extends s {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final a f6768i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f6769j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final String f6770k = d.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f6771a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f6772b;

        public b(View view, x00.a<g2> aVar) {
            this.f6771a = view;
            this.f6772b = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d3.k(this.f6771a)) {
                qb.c.b(d.f6770k, "onGlobalLayout: not done", new Object[0]);
            } else {
                this.f6771a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f6772b.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k ViewGroup container, @m80.k Lifecycle lifecycle) {
        super(container, lifecycle);
        g0.p(container, "container");
        g0.p(lifecycle, "lifecycle");
    }

    public static final g2 w(k kVar, View view, final ViewGroup viewGroup, int i11, Integer num, final x00.a aVar) {
        va.l g11 = va.l.a().g(kVar.p());
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (kVar.r(rect)) {
            final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
            inflate.setAlpha(0.0f);
            viewGroup.addView(inflate);
            rect.inset(-Math.max(kVar.D(), kVar.I().getFirst().intValue()), -Math.max(kVar.D(), kVar.I().getSecond().intValue()));
            g11.d(new l.b(new RectF(rect), kVar.E()));
            if (num == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            View findViewById = inflate.findViewById(num.intValue());
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            g0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i12 = rect.top;
            marginLayoutParams.topMargin = i12;
            int i13 = rect.left;
            marginLayoutParams.leftMargin = i13;
            marginLayoutParams.width = rect.right - i13;
            marginLayoutParams.height = rect.bottom - i12;
            findViewById.setLayoutParams(layoutParams);
            g0.m(inflate);
            kVar.B(viewGroup, inflate, findViewById, rect, new x00.a() { // from class: be.b
                @Override // x00.a
                public final Object invoke() {
                    g2 x11;
                    x11 = d.x(viewGroup, inflate, aVar);
                    return x11;
                }
            });
            ViewCompat.setBackground(inflate, g11);
            if (!kVar.v()) {
                inflate.setOnTouchListener(new View.OnTouchListener() { // from class: be.c
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        boolean y11;
                        y11 = d.y(view2, motionEvent);
                        return y11;
                    }
                });
            }
            inflate.animate().alpha(1.0f).start();
        } else {
            qb.c.q(f6770k, "Not enough space!", new Object[0]);
        }
        return g2.f100423a;
    }

    public static final g2 x(ViewGroup viewGroup, View view, x00.a aVar) {
        viewGroup.removeView(view);
        aVar.invoke();
        return g2.f100423a;
    }

    public static final boolean y(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // be.s
    public boolean o(@m80.k final k guider, @m80.k final ViewGroup parent, @m80.k final x00.a<g2> onDismiss) {
        g0.p(guider, "guider");
        g0.p(parent, "parent");
        g0.p(onDismiss, "onDismiss");
        if (guider.a()) {
            return false;
        }
        Triple<Integer, Integer, Integer> A = guider.A();
        final int intValue = A.component1().intValue();
        int intValue2 = A.component2().intValue();
        final Integer component3 = A.component3();
        if (parent.findViewById(intValue2) != null) {
            return true;
        }
        View target = guider.getTarget();
        if (target == null) {
            x00.a<View> f11 = guider.f();
            target = f11 != null ? f11.invoke() : null;
            if (target == null) {
                return false;
            }
        }
        final View view = target;
        x00.a aVar = new x00.a() { // from class: be.a
            @Override // x00.a
            public final Object invoke() {
                g2 w11;
                w11 = d.w(k.this, view, parent, intValue, component3, onDismiss);
                return w11;
            }
        };
        if (d3.k(view)) {
            aVar.invoke();
        } else {
            qb.c.b(f6770k, "layout not done, wait", new Object[0]);
            view.getViewTreeObserver().addOnGlobalLayoutListener(new b(view, aVar));
        }
        return true;
    }
}
