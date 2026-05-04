package fd;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.main.activity.LearningActivity;
import com.jiongji.andriod.card.R;
import va.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m1 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f51650j = "LearnGuideBuilder";

    /* renamed from: k, reason: collision with root package name */
    public static int f51651k = 84;

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f51652a;

    /* renamed from: b, reason: collision with root package name */
    public Context f51653b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f51654c;

    /* renamed from: d, reason: collision with root package name */
    public ViewGroup f51655d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f51656e;

    /* renamed from: g, reason: collision with root package name */
    public f f51658g;

    /* renamed from: f, reason: collision with root package name */
    public int f51657f = -1;

    /* renamed from: h, reason: collision with root package name */
    public View.OnTouchListener f51659h = new a();

    /* renamed from: i, reason: collision with root package name */
    public View.OnTouchListener f51660i = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            m1.this.i();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            return action == 0 || action == 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f51663a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f51664b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f51665c;

        public c(final boolean val$includeOptions, final int[] val$hollowIds, final View val$preDrawAnchor) {
            this.f51663a = val$includeOptions;
            this.f51664b = val$hollowIds;
            this.f51665c = val$preDrawAnchor;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            FrameLayout frameLayout = (FrameLayout) m1.this.f51654c.findViewById(R.id.content);
            if (frameLayout == null || frameLayout.getPaddingTop() == 0) {
                return true;
            }
            m1.this.l(this.f51663a, this.f51664b);
            this.f51665c.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            Drawable background = view.getBackground();
            if ((background instanceof va.l) && ((va.l) background).f(motionEvent.getX(), motionEvent.getY())) {
                m1.this.i();
                return false;
            }
            m1.this.i();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            Drawable background = view.getBackground();
            if ((background instanceof va.l) && ((va.l) background).f(motionEvent.getX(), motionEvent.getY())) {
                m1.this.i();
                return false;
            }
            m1.this.i();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void onDismiss();
    }

    public m1(ViewGroup parent) {
        this.f51654c = parent;
        Context context = parent.getContext();
        this.f51653b = context;
        LayoutInflater from = LayoutInflater.from(context);
        this.f51652a = from;
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.learning_guide_portrait, this.f51654c, false);
        this.f51655d = viewGroup;
        this.f51656e = (TextView) viewGroup.findViewById(R.id.guild_title);
    }

    public static m1 f(LearningActivity activity) {
        return new m1(activity.N);
    }

    public m1 e() {
        this.f51655d.setOnTouchListener(this.f51659h);
        return this;
    }

    public m1 g(int bottomLine) {
        this.f51657f = bottomLine;
        return this;
    }

    public void h() {
        this.f51654c.addView(this.f51655d);
    }

    public final void i() {
        this.f51655d.setVisibility(8);
        this.f51654c.removeView(this.f51655d);
        f fVar = this.f51658g;
        if (fVar != null) {
            fVar.onDismiss();
        }
    }

    public final void j(va.l drawable, int id2, int imgId) {
        int a11 = xb.i.a(this.f51653b, 8.0f);
        Rect rect = new Rect();
        this.f51654c.findViewById(id2).getGlobalVisibleRect(rect);
        drawable.d(new l.b(rect.left, rect.top, rect.right, rect.bottom, a11));
        ImageView imageView = (ImageView) this.f51655d.findViewById(imgId);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        int i11 = rect.left;
        layoutParams.leftMargin = i11 + (((rect.right - i11) - layoutParams.width) / 2);
        layoutParams.topMargin = rect.top - layoutParams.height;
        imageView.setLayoutParams(layoutParams);
    }

    public m1 k(final View preDrawAnchor, final boolean includeOptions, final int... hollowIds) {
        preDrawAnchor.getViewTreeObserver().addOnPreDrawListener(new c(includeOptions, hollowIds, preDrawAnchor));
        return this;
    }

    public final void l(final boolean includeOptions, final int... hollowIds) {
        ViewGroup viewGroup;
        va.l g11 = va.l.a().g(Integer.MIN_VALUE);
        Rect rect = new Rect();
        int a11 = xb.i.a(this.f51653b, 8.0f);
        int a12 = xb.i.a(this.f51653b, 5.0f);
        int a13 = xb.i.a(this.f51653b, 3.0f);
        if (includeOptions && (viewGroup = (ViewGroup) this.f51654c.findViewById(R.id.option_container)) != null) {
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                ((ViewGroup) viewGroup.getChildAt(i11)).getChildAt(0).getGlobalVisibleRect(rect);
                g11.d(new l.b(rect.left - a13, rect.top - a13, rect.right + a13, rect.bottom + a13, a11));
                if (i11 == 0) {
                    p(rect.top);
                }
            }
        }
        for (int i12 : hollowIds) {
            View findViewById = this.f51654c.findViewById(i12);
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(rect);
                g11.d(new l.b(rect.left - a12, rect.top - a12, rect.right + a12, rect.bottom + a12, a11));
            }
        }
        lq.c.b(this.f51655d, g11);
        this.f51655d.setOnTouchListener(new d());
    }

    public m1 m(final View preDarwAnchor, final int kill, final int hint, final int voice) {
        this.f51655d.removeAllViews();
        this.f51655d.addView((FrameLayout) this.f51652a.inflate(R.layout.learning_guide_portrait_customize_operation_des, this.f51655d, false), new FrameLayout.LayoutParams(-1, -1));
        preDarwAnchor.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: fd.l1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean n11;
                n11 = m1.this.n(kill, hint, voice);
                return n11;
            }
        });
        return this;
    }

    public final /* synthetic */ boolean n(int i11, int i12, int i13) {
        va.l g11 = va.l.a().g(Integer.MIN_VALUE);
        j(g11, i11, R.id.guide_kill);
        j(g11, i12, R.id.guide_hint);
        j(g11, i13, R.id.guide_voice);
        this.f51655d.setOnTouchListener(new e());
        lq.c.b(this.f51655d, g11);
        return true;
    }

    public m1 o() {
        this.f51655d.setBackgroundColor(Integer.MIN_VALUE);
        return this;
    }

    public final void p(int y11) {
        TextView textView = this.f51656e;
        if (textView != null) {
            textView.setY((y11 - textView.getHeight()) - xb.i.a(this.f51655d.getContext(), 15.0f));
        }
    }

    public m1 q() {
        this.f51655d.setOnTouchListener(this.f51660i);
        return this;
    }

    public m1 r(f listener) {
        this.f51658g = listener;
        return this;
    }

    public m1 s(int layoutResId) {
        this.f51655d.removeAllViews();
        this.f51652a.inflate(layoutResId, this.f51655d, true);
        this.f51655d.setOnTouchListener(this.f51659h);
        return this;
    }

    public m1 t(int id2) {
        this.f51656e.setText(id2);
        return this;
    }

    public m1 u(int padding) {
        f51651k = padding;
        return this;
    }
}
