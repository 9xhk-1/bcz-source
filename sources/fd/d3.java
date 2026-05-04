package fd;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jiongji.andriod.card.R;
import va.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f51552a = "d3";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f51553a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f51554b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f51555c;

        public a(final ViewGroup val$parent, final Runnable val$dismiss, final Rect val$rect) {
            this.f51553a = val$parent;
            this.f51554b = val$dismiss;
            this.f51555c = val$rect;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v11, MotionEvent event) {
            v11.setVisibility(8);
            this.f51553a.removeView(v11);
            this.f51554b.run();
            return event.getX() <= ((float) this.f51555c.left) || event.getX() >= ((float) this.f51555c.right) || event.getY() <= ((float) this.f51555c.top) || event.getY() >= ((float) this.f51555c.bottom);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f51556a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f51557b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f51558c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f51559d;

        public b(final TextView val$tip, final ViewGroup val$guideLayout, final Rect val$rectStart, final Context val$context) {
            this.f51556a = val$tip;
            this.f51557b = val$guideLayout;
            this.f51558c = val$rectStart;
            this.f51559d = val$context;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Rect rect = new Rect();
            this.f51556a.getGlobalVisibleRect(rect);
            View findViewById = this.f51557b.findViewById(R.id.arrow);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.height = (this.f51558c.top - xb.i.a(this.f51559d, 32.0f)) - rect.bottom;
            findViewById.setLayoutParams(layoutParams);
            this.f51556a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f51560a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f51561b;

        public c(final View val$startButton, final Runnable val$r) {
            this.f51560a = val$startButton;
            this.f51561b = val$r;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d3.k(this.f51560a)) {
                this.f51560a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f51561b.run();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f51562a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f51563b;

        public d(final View val$dailyNewCount, final Runnable val$r) {
            this.f51562a = val$dailyNewCount;
            this.f51563b = val$r;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d3.k(this.f51562a)) {
                qb.c.b(d3.f51552a, "onGlobalLayout: not done", new Object[0]);
            } else {
                this.f51562a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f51563b.run();
            }
        }
    }

    public static /* synthetic */ void a(ViewGroup viewGroup, ViewGroup viewGroup2, Runnable runnable) {
        i9.f.j(viewGroup.getContext(), i9.f.f60388o, true);
        viewGroup2.setVisibility(8);
        viewGroup.removeView(viewGroup2);
        runnable.run();
    }

    public static /* synthetic */ void b(final ViewGroup viewGroup, View view, View view2, String str, final Runnable runnable) {
        ma.l.a(ma.t.f73009h, ma.a.f72762i0);
        Context context = viewGroup.getContext();
        final ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_guide_new_user_experience_plan_adjust, viewGroup, false);
        viewGroup.addView(viewGroup2);
        va.l g11 = va.l.a().g(-1728053248);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.common_corner_medium);
        Rect rect = new Rect();
        final Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        view2.getGlobalVisibleRect(rect2);
        g11.d(new l.b(rect.left - xb.i.a(context, 20.0f), rect.top - xb.i.a(context, 56.0f), rect2.right + xb.i.a(context, 20.0f), rect2.bottom + xb.i.a(context, 32.0f), dimensionPixelSize));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.findViewById(R.id.position_stroke).getLayoutParams();
        int a11 = xb.i.a(context, 8.0f);
        layoutParams.leftMargin = rect2.left - a11;
        layoutParams.topMargin = rect2.top - a11;
        int i11 = a11 * 2;
        layoutParams.width = rect2.width() + i11;
        layoutParams.height = rect2.height() + i11;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.findViewById(R.id.pointer).getLayoutParams();
        layoutParams2.leftMargin = (int) (rect2.left + ((rect2.width() * 2) / 5.0f));
        layoutParams2.topMargin = rect2.bottom - xb.i.a(context, 2.0f);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.tip);
        textView.setText(str);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        int a12 = rect.left - xb.i.a(context, 20.0f);
        layoutParams3.leftMargin = a12;
        layoutParams3.rightMargin = a12;
        layoutParams3.topMargin = rect2.bottom + xb.i.a(context, 100.0f);
        textView.setLayoutParams(layoutParams3);
        View findViewById = viewGroup2.findViewById(R.id.done);
        findViewById.getLocalVisibleRect(rect);
        lq.c.b(viewGroup2, g11);
        final Runnable runnable2 = new Runnable() { // from class: fd.z2
            @Override // java.lang.Runnable
            public final void run() {
                d3.a(viewGroup, viewGroup2, runnable);
            }
        };
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: fd.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                runnable2.run();
            }
        });
        viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: fd.b3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return d3.e(rect2, runnable2, view3, motionEvent);
            }
        });
    }

    public static /* synthetic */ boolean d(Rect rect, ViewGroup viewGroup, Runnable runnable, View view, MotionEvent motionEvent) {
        boolean z11 = motionEvent.getX() <= ((float) rect.left) || motionEvent.getX() >= ((float) rect.right) || motionEvent.getY() <= ((float) rect.top) || motionEvent.getY() >= ((float) rect.bottom);
        if (!z11) {
            view.setVisibility(8);
            viewGroup.removeView(view);
            runnable.run();
        }
        return z11;
    }

    public static /* synthetic */ boolean e(Rect rect, Runnable runnable, View view, MotionEvent motionEvent) {
        boolean z11 = motionEvent.getX() <= ((float) rect.left) || motionEvent.getX() >= ((float) rect.right) || motionEvent.getY() <= ((float) rect.top) || motionEvent.getY() >= ((float) rect.bottom);
        if (!z11) {
            runnable.run();
        }
        return z11;
    }

    public static /* synthetic */ void f(View view, final ViewGroup viewGroup, View view2, String str, final Runnable runnable) {
        qb.c.i(f51552a, "newUserExperienceGuide: (w, h): " + view.getWidth() + org.junit.jupiter.api.j2.O + view.getHeight(), new Object[0]);
        gi.v.a(4096);
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_guide_new_user_experience, viewGroup, false);
        viewGroup.addView(viewGroup2);
        va.l g11 = va.l.a().g(-1728053248);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.common_corner_medium);
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        float f11 = dimensionPixelSize;
        g11.d(new l.b(rect.left - xb.i.a(context, 20.0f), rect.top - xb.i.a(context, 44.0f), rect.right + xb.i.a(context, 48.0f), rect.bottom + xb.i.a(context, 8.0f), f11));
        TextView textView = (TextView) viewGroup2.findViewById(R.id.tip);
        textView.setText(str);
        int a11 = rect.left - xb.i.a(context, 20.0f);
        textView.setPadding(a11, 0, a11, 0);
        int a12 = xb.i.a(context, 2.0f);
        final Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        g11.d(new l.b(rect2.left - a12, rect2.top - a12, rect2.right + a12, rect2.bottom + a12, f11));
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new b(textView, viewGroup2, rect2, context));
        lq.c.b(viewGroup2, g11);
        viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: fd.y2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return d3.d(rect2, viewGroup, runnable, view3, motionEvent);
            }
        });
    }

    public static boolean h(final ViewGroup parent, View dailyNewCount, View startButton, Runnable dismiss) {
        if (!gi.v.c(4096) || !gi.v.d()) {
            return false;
        }
        n(parent, dailyNewCount, startButton, dismiss);
        return true;
    }

    public static boolean i(final ViewGroup parent, View dailyNewCount, View adjust, String desc, Runnable dismiss) {
        qb.c.i(f51552a, "checkNewExperienceGuide: " + gi.v.c(4096), new Object[0]);
        if (!gi.v.c(4096)) {
            return false;
        }
        l(parent, dailyNewCount, adjust, desc, dismiss);
        return true;
    }

    public static boolean j(final ViewGroup parent, View dailyNewCount, View adjust, String desc, Runnable dismiss) {
        m(parent, dailyNewCount, adjust, desc, dismiss);
        return true;
    }

    public static boolean k(View v11) {
        boolean globalVisibleRect = v11.getGlobalVisibleRect(new Rect());
        qb.c.i(f51552a, "state = " + globalVisibleRect + ", laidOut = " + v11.isLaidOut() + ", w = " + v11.getWidth() + ", h =" + v11.getHeight(), new Object[0]);
        return globalVisibleRect && v11.isLaidOut() && v11.getWidth() != 0 && v11.getHeight() != 0;
    }

    public static void l(final ViewGroup parent, final View dailyNewCount, final View startButton, final String desc, final Runnable dismiss) {
        if (parent.findViewById(R.id.new_user_experience) != null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: fd.c3
            @Override // java.lang.Runnable
            public final void run() {
                d3.f(startButton, parent, dailyNewCount, desc, dismiss);
            }
        };
        if (k(startButton)) {
            runnable.run();
        } else {
            startButton.getViewTreeObserver().addOnGlobalLayoutListener(new c(startButton, runnable));
        }
    }

    public static void m(final ViewGroup parent, final View dailyNewCount, final View adjust, final String desc, final Runnable dismiss) {
        if (parent.findViewById(R.id.new_user_experience_plan_adjust) != null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: fd.x2
            @Override // java.lang.Runnable
            public final void run() {
                d3.b(parent, dailyNewCount, adjust, desc, dismiss);
            }
        };
        if (k(dailyNewCount)) {
            runnable.run();
        } else {
            qb.c.b(f51552a, "layout not done, wait", new Object[0]);
            dailyNewCount.getViewTreeObserver().addOnGlobalLayoutListener(new d(dailyNewCount, runnable));
        }
    }

    public static void n(final ViewGroup parent, View dailyNewCount, View startButton, Runnable dismiss) {
        if (parent.findViewById(R.id.new_user_guide_layout) != null) {
            return;
        }
        gi.v.a(4096);
        Context context = parent.getContext();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.main_newuser_guide_layout, parent, false);
        parent.addView(viewGroup);
        va.l g11 = va.l.a().g(-1728053248);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.common_corner_medium);
        xb.i.a(context, 6.0f);
        Rect rect = new Rect();
        dailyNewCount.getGlobalVisibleRect(rect);
        float f11 = dimensionPixelSize;
        g11.d(new l.b(rect.left - xb.i.a(context, 20.0f), rect.top - xb.i.a(context, 44.0f), rect.right + xb.i.a(context, 48.0f), rect.bottom + xb.i.a(context, 8.0f), f11));
        View findViewById = viewGroup.findViewById(R.id.daily_new_count_tip);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = rect.left - xb.i.a(context, 20.0f);
        layoutParams.topMargin = rect.bottom + xb.i.a(context, 16.0f);
        findViewById.setLayoutParams(layoutParams);
        int a11 = xb.i.a(context, 2.0f);
        startButton.getGlobalVisibleRect(rect);
        g11.d(new l.b(rect.left - a11, rect.top - a11, rect.right + a11, rect.bottom + a11, f11));
        View findViewById2 = viewGroup.findViewById(R.id.start_study_tip);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams2.leftMargin = rect.left + xb.i.a(context, 8.0f);
        layoutParams2.topMargin = rect.bottom + xb.i.a(context, 8.0f);
        findViewById2.setLayoutParams(layoutParams2);
        lq.c.b(viewGroup, g11);
        viewGroup.setOnTouchListener(new a(parent, dismiss, rect));
    }
}
