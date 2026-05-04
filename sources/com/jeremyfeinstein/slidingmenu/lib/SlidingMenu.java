package com.jeremyfeinstein.slidingmenu.lib;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SlidingMenu extends RelativeLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final String f38862g = "SlidingMenu";

    /* renamed from: h, reason: collision with root package name */
    public static final int f38863h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f38864i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f38865j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f38866k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f38867l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f38868m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f38869n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f38870o = 2;

    /* renamed from: a, reason: collision with root package name */
    public boolean f38871a;

    /* renamed from: b, reason: collision with root package name */
    public CustomViewAbove f38872b;

    /* renamed from: c, reason: collision with root package name */
    public CustomViewBehind f38873c;

    /* renamed from: d, reason: collision with root package name */
    public f f38874d;

    /* renamed from: e, reason: collision with root package name */
    public f f38875e;

    /* renamed from: f, reason: collision with root package name */
    public d f38876f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f38877a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in2) {
                return new SavedState(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public int a() {
            return this.f38877a;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f38877a);
        }

        public SavedState(Parcelable superState, int item) {
            super(superState);
            this.f38877a = item;
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f38877a = in2.readInt();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38882a;

        public b(final int val$layerType) {
            this.f38882a = val$layerType;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("changing layerType. hardware? ");
            sb2.append(this.f38882a == 2);
            Log.v(SlidingMenu.f38862g, sb2.toString());
            SlidingMenu.this.getContent().setLayerType(this.f38882a, null);
            SlidingMenu.this.getMenu().setLayerType(this.f38882a, null);
            if (SlidingMenu.this.getSecondaryMenu() != null) {
                SlidingMenu.this.getSecondaryMenu().setLayerType(this.f38882a, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(Canvas canvas, float percentOpen);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void onClose();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void e();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a();
    }

    public SlidingMenu(Context context) {
        this(context, (AttributeSet) null);
    }

    public void d(View v11) {
        this.f38872b.b(v11);
    }

    public void e(Activity activity, int slideStyle) {
        f(activity, slideStyle, false);
    }

    public void f(Activity activity, int slideStyle, boolean actionbarOverlay) {
        if (slideStyle != 0 && slideStyle != 1) {
            throw new IllegalArgumentException("slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT");
        }
        if (getParent() != null) {
            throw new IllegalStateException("This SlidingMenu appears to already be attached");
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (slideStyle == 0) {
            this.f38871a = false;
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
            viewGroup2.setBackgroundResource(resourceId);
            viewGroup.removeView(viewGroup2);
            viewGroup.addView(this);
            setContent(viewGroup2);
            return;
        }
        if (slideStyle != 1) {
            return;
        }
        this.f38871a = actionbarOverlay;
        ViewGroup viewGroup3 = (ViewGroup) activity.findViewById(R.id.content);
        View childAt = viewGroup3.getChildAt(0);
        viewGroup3.removeView(childAt);
        viewGroup3.addView(this);
        setContent(childAt);
        if (childAt.getBackground() == null) {
            childAt.setBackgroundResource(resourceId);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean fitSystemWindows(Rect insets) {
        int i11 = insets.left;
        int i12 = insets.right;
        int i13 = insets.top;
        int i14 = insets.bottom;
        if (this.f38871a) {
            return true;
        }
        Log.v(f38862g, "setting padding!");
        setPadding(i11, i13, i12, i14);
        return true;
    }

    public void g() {
        this.f38872b.e();
    }

    public int getBehindOffset() {
        return ((RelativeLayout.LayoutParams) this.f38873c.getLayoutParams()).rightMargin;
    }

    public float getBehindScrollScale() {
        return this.f38873c.getScrollScale();
    }

    public View getContent() {
        return this.f38872b.getContent();
    }

    public View getMenu() {
        return this.f38873c.getContent();
    }

    public int getMode() {
        return this.f38873c.getMode();
    }

    public View getSecondaryMenu() {
        return this.f38873c.getSecondaryContent();
    }

    public int getTouchModeAbove() {
        return this.f38872b.getTouchMode();
    }

    public int getTouchmodeMarginThreshold() {
        return this.f38873c.getMarginThreshold();
    }

    public boolean h() {
        return this.f38872b.getCurrentItem() == 0 || this.f38872b.getCurrentItem() == 2;
    }

    public boolean i() {
        return this.f38872b.getCurrentItem() == 2;
    }

    public boolean j() {
        return this.f38872b.r();
    }

    @TargetApi(11)
    public void k(float percentOpen) {
        int i11 = (percentOpen <= 0.0f || percentOpen >= 1.0f) ? 0 : 2;
        if (i11 != getContent().getLayerType()) {
            getHandler().post(new b(i11));
        }
    }

    public void l(View v11) {
        this.f38872b.x(v11);
    }

    public void m() {
        n(true);
    }

    public void n(boolean animate) {
        this.f38872b.y(1, animate);
    }

    public void o() {
        p(true);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f38872b.setCurrentItem(savedState.a());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f38872b.getCurrentItem());
    }

    public void p(boolean animate) {
        this.f38872b.y(0, animate);
    }

    public void q() {
        r(true);
    }

    public void r(boolean animate) {
        this.f38872b.y(2, animate);
    }

    public void s() {
        t(true);
    }

    public void setAboveOffset(int i11) {
        this.f38872b.setAboveOffset(i11);
    }

    public void setAboveOffsetRes(int resID) {
        setAboveOffset((int) getContext().getResources().getDimension(resID));
    }

    public void setBehindCanvasTransformer(c t11) {
        this.f38873c.setCanvasTransformer(t11);
    }

    public void setBehindOffset(int i11) {
        this.f38873c.setWidthOffset(i11);
    }

    public void setBehindOffsetRes(int resID) {
        setBehindOffset((int) getContext().getResources().getDimension(resID));
    }

    public void setBehindScrollScale(float f11) {
        if (f11 < 0.0f && f11 > 1.0f) {
            throw new IllegalStateException("ScrollScale must be between 0 and 1");
        }
        this.f38873c.setScrollScale(f11);
    }

    public void setBehindWidth(int i11) {
        int width;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        try {
            Point point = new Point();
            Display.class.getMethod("getSize", Point.class).invoke(defaultDisplay, point);
            width = point.x;
        } catch (Exception unused) {
            width = defaultDisplay.getWidth();
        }
        setBehindOffset(width - i11);
    }

    public void setBehindWidthRes(int res) {
        setBehindWidth((int) getContext().getResources().getDimension(res));
    }

    public void setContent(int res) {
        setContent(LayoutInflater.from(getContext()).inflate(res, (ViewGroup) null));
    }

    public void setFadeDegree(float f11) {
        this.f38873c.setFadeDegree(f11);
    }

    public void setFadeEnabled(boolean b11) {
        this.f38873c.setFadeEnabled(b11);
    }

    public void setMenu(int res) {
        setMenu(LayoutInflater.from(getContext()).inflate(res, (ViewGroup) null));
    }

    public void setMode(int mode) {
        if (mode != 0 && mode != 1 && mode != 2) {
            throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
        }
        this.f38873c.setMode(mode);
    }

    public void setOnCloseListener(d listener) {
        this.f38876f = listener;
    }

    public void setOnClosedListener(e listener) {
        this.f38872b.setOnClosedListener(listener);
    }

    public void setOnOpenListener(f listener) {
        this.f38874d = listener;
    }

    public void setOnOpenedListener(g listener) {
        this.f38872b.setOnOpenedListener(listener);
    }

    public void setSecondaryMenu(int res) {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(res, (ViewGroup) null));
    }

    public void setSecondaryOnOpenListner(f listener) {
        this.f38875e = listener;
    }

    public void setSecondaryShadowDrawable(int resId) {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(resId));
    }

    public void setSelectedView(View v11) {
        this.f38873c.setSelectedView(v11);
    }

    public void setSelectorBitmap(Bitmap b11) {
        this.f38873c.setSelectorBitmap(b11);
    }

    public void setSelectorDrawable(int res) {
        this.f38873c.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), res));
    }

    public void setSelectorEnabled(boolean b11) {
        this.f38873c.setSelectorEnabled(true);
    }

    public void setShadowDrawable(int resId) {
        setShadowDrawable(getContext().getResources().getDrawable(resId));
    }

    public void setShadowWidth(int pixels) {
        this.f38873c.setShadowWidth(pixels);
    }

    public void setShadowWidthRes(int resId) {
        setShadowWidth((int) getResources().getDimension(resId));
    }

    public void setSlidingEnabled(boolean b11) {
        this.f38872b.setSlidingEnabled(b11);
    }

    public void setStatic(boolean b11) {
        if (b11) {
            setSlidingEnabled(false);
            this.f38872b.setCustomViewBehind(null);
            this.f38872b.setCurrentItem(1);
        } else {
            this.f38872b.setCurrentItem(1);
            this.f38872b.setCustomViewBehind(this.f38873c);
            setSlidingEnabled(true);
        }
    }

    public void setTouchModeAbove(int i11) {
        if (i11 != 1 && i11 != 0 && i11 != 2) {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        this.f38872b.setTouchMode(i11);
    }

    public void setTouchModeBehind(int i11) {
        if (i11 != 1 && i11 != 0 && i11 != 2) {
            throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
        }
        this.f38873c.setTouchMode(i11);
    }

    public void setTouchmodeMarginThreshold(int touchmodeMarginThreshold) {
        this.f38873c.setMarginThreshold(touchmodeMarginThreshold);
    }

    public void t(boolean animate) {
        if (h()) {
            n(animate);
        } else {
            p(animate);
        }
    }

    public SlidingMenu(Activity activity, int slideStyle) {
        this(activity, (AttributeSet) null);
        e(activity, slideStyle);
    }

    public void setContent(View view) {
        this.f38872b.setContent(view);
        m();
    }

    public void setMenu(View v11) {
        this.f38873c.setContent(v11);
    }

    public void setSecondaryMenu(View v11) {
        this.f38873c.setSecondaryContent(v11);
    }

    public void setSecondaryShadowDrawable(Drawable d11) {
        this.f38873c.setSecondaryShadowDrawable(d11);
    }

    public void setShadowDrawable(Drawable d11) {
        this.f38873c.setShadowDrawable(d11);
    }

    public SlidingMenu(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SlidingMenu(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f38871a = false;
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        CustomViewBehind customViewBehind = new CustomViewBehind(context);
        this.f38873c = customViewBehind;
        addView(customViewBehind, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        CustomViewAbove customViewAbove = new CustomViewAbove(context);
        this.f38872b = customViewAbove;
        addView(customViewAbove, layoutParams2);
        this.f38872b.setCustomViewBehind(this.f38873c);
        this.f38873c.setCustomViewAbove(this.f38872b);
        this.f38872b.setOnPageChangeListener(new a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, com.jiongji.andriod.card.R.styleable.SlidingMenu);
        setMode(obtainStyledAttributes.getInt(5, 0));
        int resourceId = obtainStyledAttributes.getResourceId(12, -1);
        if (resourceId != -1) {
            setContent(resourceId);
        } else {
            setContent(new FrameLayout(context));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, -1);
        if (resourceId2 != -1) {
            setMenu(resourceId2);
        } else {
            setMenu(new FrameLayout(context));
        }
        setTouchModeAbove(obtainStyledAttributes.getInt(10, 0));
        setTouchModeBehind(obtainStyledAttributes.getInt(11, 0));
        int dimension = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(2, -1.0f);
        if (dimension != -1 && dimension2 != -1) {
            throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
        }
        if (dimension != -1) {
            setBehindOffset(dimension);
        } else if (dimension2 != -1) {
            setBehindWidth(dimension2);
        } else {
            setBehindOffset(0);
        }
        setBehindScrollScale(obtainStyledAttributes.getFloat(1, 0.33f));
        int resourceId3 = obtainStyledAttributes.getResourceId(8, -1);
        if (resourceId3 != -1) {
            setShadowDrawable(resourceId3);
        }
        setShadowWidth((int) obtainStyledAttributes.getDimension(9, 0.0f));
        setFadeEnabled(obtainStyledAttributes.getBoolean(4, true));
        setFadeDegree(obtainStyledAttributes.getFloat(3, 0.33f));
        setSelectorEnabled(obtainStyledAttributes.getBoolean(7, false));
        int resourceId4 = obtainStyledAttributes.getResourceId(6, -1);
        if (resourceId4 != -1) {
            setSelectorDrawable(resourceId4);
        }
        obtainStyledAttributes.recycle();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements CustomViewAbove.c {

        /* renamed from: b, reason: collision with root package name */
        public static final int f38878b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f38879c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f38880d = 2;

        public a() {
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove.c
        public void onPageSelected(int position) {
            if (position == 0 && SlidingMenu.this.f38874d != null) {
                SlidingMenu.this.f38874d.a();
                return;
            }
            if (position == 1 && SlidingMenu.this.f38876f != null) {
                SlidingMenu.this.f38876f.onClose();
            } else {
                if (position != 2 || SlidingMenu.this.f38875e == null) {
                    return;
                }
                SlidingMenu.this.f38875e.a();
            }
        }

        @Override // com.jeremyfeinstein.slidingmenu.lib.CustomViewAbove.c
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
