package com.baicizhan.main.customview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.customview.widget.ViewDragHelper;
import com.jiongji.andriod.card.R;
import gs.om;
import gs.qm;
import java.lang.reflect.Field;
import qb.c;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ShowOffDragView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public static final String f20143h = "ShowOffDragView";

    /* renamed from: i, reason: collision with root package name */
    public static final int f20144i = 300;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20145j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static float f20146k = 0.13368984f;

    /* renamed from: l, reason: collision with root package name */
    public static float f20147l = 0.17825311f;

    /* renamed from: m, reason: collision with root package name */
    public static float f20148m = 0.08912656f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f20149n = 0.2f;

    /* renamed from: a, reason: collision with root package name */
    public ViewDragHelper f20150a;

    /* renamed from: b, reason: collision with root package name */
    public b f20151b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f20152c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f20153d;

    /* renamed from: e, reason: collision with root package name */
    public int f20154e;

    /* renamed from: f, reason: collision with root package name */
    public int f20155f;

    /* renamed from: g, reason: collision with root package name */
    public om f20156g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ViewDragHelper.Callback {
        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View child, int left, int dx2) {
            return child.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View child, int top, int dy2) {
            return top >= ShowOffDragView.this.f20154e ? ShowOffDragView.this.f20154e : top;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View child) {
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View child) {
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int edgeFlags, int pointerId) {
            ShowOffDragView.this.f20150a.captureChildView(ShowOffDragView.this.f20156g.f56259h.getRoot(), pointerId);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View changedView, int left, int top, int dx2, int dy2) {
            if (top < ShowOffDragView.this.f20155f) {
                return;
            }
            int i11 = ShowOffDragView.this.f20154e - ShowOffDragView.this.f20155f;
            if (i11 <= 0) {
                c.d(ShowOffDragView.f20143h, "span <=0 [%d, %d]", Integer.valueOf(ShowOffDragView.this.f20154e), Integer.valueOf(ShowOffDragView.this.f20155f));
            } else {
                ShowOffDragView.this.r((ShowOffDragView.this.f20154e - top) / i11);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View releasedChild, float xvel, float yvel) {
            if (yvel >= 300.0f) {
                ShowOffDragView.this.f20150a.settleCapturedViewAt(releasedChild.getLeft(), ShowOffDragView.this.f20154e);
                ShowOffDragView.this.f20153d = Boolean.TRUE;
            } else if (yvel <= -300.0f) {
                ShowOffDragView.this.f20150a.settleCapturedViewAt(releasedChild.getLeft(), ShowOffDragView.this.f20155f);
                ShowOffDragView.this.f20153d = Boolean.FALSE;
            } else if (releasedChild.getTop() > (ShowOffDragView.this.f20154e + ShowOffDragView.this.f20155f) / 2) {
                ShowOffDragView.this.f20150a.settleCapturedViewAt(releasedChild.getLeft(), ShowOffDragView.this.f20154e);
                ShowOffDragView.this.f20153d = Boolean.TRUE;
            } else {
                ShowOffDragView.this.f20150a.settleCapturedViewAt(releasedChild.getLeft(), ShowOffDragView.this.f20155f);
                ShowOffDragView.this.f20153d = Boolean.FALSE;
            }
            ShowOffDragView.this.postInvalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View child, int pointerId) {
            return ShowOffDragView.this.f20156g.f56259h.getRoot() == child;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void b0();

        void e();

        void f();
    }

    public ShowOffDragView(Context context) {
        super(context);
        this.f20152c = Boolean.FALSE;
        this.f20153d = Boolean.TRUE;
        this.f20154e = 0;
        this.f20155f = 0;
    }

    private void setVisableMode(boolean visable) {
        this.f20156g.f56259h.f56533e.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56531c.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56543o.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56534f.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56535g.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56540l.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56530b.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56542n.setVisibility(visable ? 0 : 4);
        this.f20156g.f56259h.f56536h.setVisibility(visable ? 4 : 0);
    }

    @Override // android.view.View
    public void computeScroll() {
        ViewDragHelper viewDragHelper = this.f20150a;
        if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
            return;
        }
        postInvalidate();
    }

    public void g() {
        setVisableMode(false);
        this.f20156g.f56259h.f56538j.setVisibility(4);
        this.f20156g.f56259h.f56537i.setVisibility(0);
    }

    public void h(int day, int studyLevel) {
        setVisableMode(true);
        this.f20156g.f56259h.f56533e.setText(getContext().getString(R.string.show_off_bottom_hint, Integer.valueOf(studyLevel)));
        this.f20156g.f56259h.f56531c.setText(String.valueOf(day));
        this.f20156g.f56259h.f56531c.setOnClickListener(null);
    }

    public void i() {
        setVisableMode(false);
        this.f20156g.f56259h.f56538j.setVisibility(0);
        this.f20156g.f56259h.f56537i.setVisibility(4);
    }

    public final void j(String bookName, int word) {
        this.f20156g.f56259h.f56529a.setText(getContext().getString(R.string.show_off_bookname, bookName));
        this.f20156g.f56259h.f56543o.setText(String.valueOf(word));
    }

    public void k(String bookName, int word, int round) {
        this.f20156g.f56259h.f56541m.setText(getContext().getString(R.string.show_off_finish_review, Integer.valueOf(round)));
        this.f20156g.f56257f.setImageResource(R.drawable.showoff_share_finished_review);
        ((RelativeLayout.LayoutParams) this.f20156g.f56260i.getLayoutParams()).setMargins(0, f.a(getContext(), 129.0f), 0, 0);
        this.f20156g.f56260i.setImageResource(R.drawable.showoff_finished_title_review);
        this.f20156g.f56262k.setVisibility(8);
        j(bookName, word);
    }

    public void l(String bookName, int word) {
        this.f20156g.f56259h.f56541m.setText(R.string.show_off_finish_study);
        this.f20156g.f56257f.setImageResource(R.drawable.showoff_share_finished_study);
        this.f20156g.f56260i.setImageResource(R.drawable.showoff_finished_title_study);
        this.f20156g.f56262k.setImageResource(R.drawable.showoff_finished_subtitle_study);
        this.f20156g.f56262k.setVisibility(0);
        j(bookName, word);
    }

    public void m(om binding, b presenter) {
        this.f20156g = binding;
        this.f20151b = presenter;
        q();
        o();
    }

    public final void n() {
        int i11 = this.f20154e;
        f20146k = i11 * 0.08912656f;
        f20147l = i11 * 0.17825311f;
        f20148m = i11 * 0.08912656f;
    }

    public final void o() {
        ViewDragHelper create = ViewDragHelper.create(this, 1.0f, new a());
        this.f20150a = create;
        create.setEdgeTrackingEnabled(8);
        this.f20150a.setMinVelocity(1.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        om omVar = this.f20156g;
        if (v11 == omVar.f56258g) {
            this.f20151b.e();
            return;
        }
        qm qmVar = omVar.f56259h;
        if (v11 == qmVar.f56540l) {
            this.f20151b.b0();
        } else if (v11 == qmVar.f56537i) {
            this.f20151b.f();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        ViewDragHelper viewDragHelper = this.f20150a;
        return viewDragHelper != null ? viewDragHelper.shouldInterceptTouchEvent(ev2) : super.onInterceptTouchEvent(ev2);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        super.onLayout(changed, l11, t11, r11, b11);
        if (!this.f20152c.booleanValue()) {
            this.f20152c = Boolean.TRUE;
            int top = this.f20156g.f56259h.getRoot().getTop();
            this.f20154e = top;
            this.f20155f = top - this.f20156g.f56259h.getRoot().getHeight();
            p();
            n();
        }
        this.f20156g.f56259h.getRoot().setTop(this.f20153d.booleanValue() ? this.f20154e : this.f20155f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        ViewDragHelper viewDragHelper = this.f20150a;
        if (viewDragHelper == null) {
            return true;
        }
        viewDragHelper.processTouchEvent(event);
        return true;
    }

    public final void p() {
        try {
            Field declaredField = this.f20150a.getClass().getDeclaredField("mEdgeSize");
            declaredField.setAccessible(true);
            declaredField.set(this.f20150a, Integer.valueOf(this.f20154e));
        } catch (Exception e11) {
            c.c(f20143h, "", e11);
        }
    }

    public final void q() {
        this.f20156g.f56259h.f56540l.setOnClickListener(this);
        this.f20156g.f56259h.f56537i.setOnClickListener(this);
        this.f20156g.f56258g.setOnClickListener(this);
        Property property = View.TRANSLATION_Y;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f20156g.f56252a, (Property<ImageView, Float>) property, -10.0f).setDuration(500L);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(2);
        duration.start();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f20156g.f56253b, (Property<ImageView, Float>) property, -20.0f).setDuration(500L);
        duration2.setRepeatCount(-1);
        duration2.setRepeatMode(2);
        duration2.start();
    }

    public final void r(float current) {
        s(current);
        u(current);
        t(current);
    }

    public final void s(float current) {
        this.f20156g.f56255d.setTranslationY((-current) * f20146k);
    }

    public final void t(float current) {
        float f11 = -current;
        this.f20156g.f56257f.setTranslationY(f20148m * f11);
        float f12 = 1.0f - (0.2f * current);
        this.f20156g.f56257f.setScaleX(f12);
        this.f20156g.f56257f.setScaleY(f12);
        float f13 = 1.0f - current;
        this.f20156g.f56260i.setAlpha(f13);
        this.f20156g.f56260i.setTranslationY(f20148m * f11);
        this.f20156g.f56262k.setAlpha(f13);
        this.f20156g.f56262k.setTranslationY(f20148m * f11);
        this.f20156g.f56254c.setAlpha(f13);
        this.f20156g.f56254c.setTranslationY(f11 * f20148m);
    }

    public final void u(float current) {
        this.f20156g.f56256e.setTranslationY((-current) * f20147l);
    }

    public ShowOffDragView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f20152c = Boolean.FALSE;
        this.f20153d = Boolean.TRUE;
        this.f20154e = 0;
        this.f20155f = 0;
    }

    public ShowOffDragView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f20152c = Boolean.FALSE;
        this.f20153d = Boolean.TRUE;
        this.f20154e = 0;
        this.f20155f = 0;
    }
}
