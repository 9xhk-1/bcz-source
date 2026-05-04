package com.baicizhan.main.customview.calendar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baicizhan.client.business.util.animation.EasingType;
import com.baicizhan.client.business.util.animation.ElasticInterpolator;
import com.jiongji.andriod.card.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CalendarView extends FrameLayout {
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = 3;
    public static final int P = 7;
    public static final int Q = 42;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public h I;
    public f J;
    public TextView K;
    public Calendar L;

    /* renamed from: a, reason: collision with root package name */
    public TextView f20212a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f20213b;

    /* renamed from: c, reason: collision with root package name */
    public View f20214c;

    /* renamed from: d, reason: collision with root package name */
    public TextView[] f20215d;

    /* renamed from: e, reason: collision with root package name */
    public View[] f20216e;

    /* renamed from: f, reason: collision with root package name */
    public TextView[] f20217f;

    /* renamed from: g, reason: collision with root package name */
    public View[] f20218g;

    /* renamed from: h, reason: collision with root package name */
    public g f20219h;

    /* renamed from: i, reason: collision with root package name */
    public int f20220i;

    /* renamed from: j, reason: collision with root package name */
    public int f20221j;

    /* renamed from: k, reason: collision with root package name */
    public int f20222k;

    /* renamed from: l, reason: collision with root package name */
    public int f20223l;

    /* renamed from: m, reason: collision with root package name */
    public int f20224m;

    /* renamed from: n, reason: collision with root package name */
    public int f20225n;

    /* renamed from: o, reason: collision with root package name */
    public int f20226o;

    /* renamed from: p, reason: collision with root package name */
    public int f20227p;

    /* renamed from: q, reason: collision with root package name */
    public int f20228q;

    /* renamed from: r, reason: collision with root package name */
    public int f20229r;

    /* renamed from: s, reason: collision with root package name */
    public int f20230s;

    /* renamed from: t, reason: collision with root package name */
    public int f20231t;

    /* renamed from: u, reason: collision with root package name */
    public int f20232u;

    /* renamed from: v, reason: collision with root package name */
    public int f20233v;

    /* renamed from: w, reason: collision with root package name */
    public int f20234w;

    /* renamed from: x, reason: collision with root package name */
    public int f20235x;

    /* renamed from: y, reason: collision with root package name */
    public int f20236y;

    /* renamed from: z, reason: collision with root package name */
    public int f20237z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (CalendarView.this.f20219h != null) {
                Calendar calendar = Calendar.getInstance(v11.getResources().getConfiguration().locale);
                calendar.setTime((Date) v11.getTag(R.id.tag_calendar));
                CalendarView.this.f20219h.a(calendar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20239a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f20240b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20241c;

        public b(final List val$animSets, final int val$findex) {
            this.f20240b = val$animSets;
            this.f20241c = val$findex;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            if (this.f20239a) {
                return;
            }
            if (animation.getAnimatedFraction() >= (this.f20240b.size() - this.f20241c) / this.f20240b.size()) {
                if (this.f20241c <= this.f20240b.size() - 2) {
                    ((Animator) this.f20240b.get(this.f20241c + 1)).start();
                }
                this.f20239a = true;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final h f20252a;

        public f(h listener) {
            this.f20252a = listener;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = this.f20252a;
            if (hVar != null) {
                hVar.a();
                this.f20252a.b();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a(Calendar calendar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        void a();

        void b();
    }

    public CalendarView(Context context) {
        super(context);
        this.H = true;
        this.K = null;
        this.L = null;
        h(context, null, R.style.DefaultCalendarView);
    }

    public static Drawable g(int bgColor, int strokeColor, int strokePadding, int strokeWidth) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(bgColor);
        if (strokeColor == 0 && strokeWidth == 0 && strokePadding == 0) {
            return gradientDrawable;
        }
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, strokePadding, strokePadding, strokePadding, strokePadding);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setStroke(strokeWidth, strokeColor);
        return new LayerDrawable(new Drawable[]{gradientDrawable2, insetDrawable});
    }

    public void e(Calendar calendar) {
        TextView textView;
        this.L = calendar;
        Calendar calendar2 = Calendar.getInstance(getResources().getConfiguration().locale);
        TextView textView2 = this.K;
        if (textView2 != null) {
            calendar2.setTime((Date) textView2.getTag(R.id.tag_calendar));
            if (bg.a.e(calendar, calendar2)) {
                return;
            }
        }
        if (this.L == null && (textView = this.K) != null) {
            s(textView, false);
            this.K = null;
            return;
        }
        for (TextView textView3 : this.f20217f) {
            calendar2.setTime((Date) textView3.getTag(R.id.tag_calendar));
            if (bg.a.e(calendar2, calendar)) {
                TextView textView4 = this.K;
                if (textView4 != null) {
                    s(textView4, false);
                }
                this.K = textView3;
                s(textView3, true);
            }
        }
    }

    public final void f(TypedArray a11) {
        this.f20220i = a11.getDimensionPixelSize(18, this.f20220i);
        this.f20221j = a11.getDimensionPixelSize(22, this.f20221j);
        this.f20222k = a11.getDimensionPixelSize(10, this.f20222k);
        this.f20223l = a11.getDimensionPixelSize(12, this.f20223l);
        this.f20224m = a11.getDimensionPixelSize(3, this.f20224m);
        this.f20225n = a11.getDimensionPixelSize(11, this.f20225n);
        this.f20226o = a11.getDimensionPixelSize(1, this.f20226o);
        this.f20227p = a11.getDimensionPixelSize(19, this.f20227p);
        this.f20228q = a11.getDimensionPixelSize(17, this.f20228q);
        this.f20229r = a11.getDimensionPixelSize(23, this.f20229r);
        this.f20230s = a11.getDimensionPixelSize(20, this.f20230s);
        this.H = a11.getBoolean(0, true);
        this.f20231t = a11.getDimensionPixelSize(5, this.f20231t);
        this.f20232u = a11.getDimensionPixelSize(4, this.f20232u);
        this.f20233v = a11.getColor(13, this.f20233v);
        this.f20234w = a11.getColor(25, this.f20234w);
        this.f20235x = a11.getColor(21, this.f20235x);
        this.f20236y = a11.getColor(2, this.f20236y);
        this.f20237z = a11.getColor(14, this.f20237z);
        this.A = a11.getColor(24, this.A);
        this.B = a11.getColor(6, this.B);
        this.C = a11.getColor(9, this.C);
        this.D = a11.getColor(16, this.D);
        this.E = a11.getColor(15, this.E);
        this.F = a11.getColor(7, 0);
        this.G = a11.getColor(8, 0);
    }

    public int getDayBottomPadding() {
        return this.f20226o;
    }

    public int getDayHeight() {
        return this.f20224m;
    }

    public int getDayTopPadding() {
        return this.f20225n;
    }

    public TextView[] getDayViews() {
        return this.f20217f;
    }

    public int getDayWidth() {
        return this.f20223l;
    }

    public int getTitleBottomPadding() {
        return this.f20228q;
    }

    public int getTitleTopPadding() {
        return this.f20227p;
    }

    public int getWeekTitleBottomPadding() {
        return this.f20230s;
    }

    public int getWeekTitleTopPadding() {
        return this.f20229r;
    }

    public final void h(Context context, AttributeSet attrs, int defStyleRes) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.calendar_view, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.CalendarView, 0, defStyleRes);
        f(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        i(inflate);
    }

    public final void i(View root) {
        TextView textView = (TextView) root.findViewById(R.id.month);
        this.f20212a = textView;
        textView.setTextSize(0, this.f20220i);
        this.f20212a.setTextColor(this.f20233v);
        TextView textView2 = this.f20212a;
        textView2.setPadding(textView2.getPaddingLeft(), this.f20227p, this.f20212a.getPaddingRight(), this.f20228q);
        TextView textView3 = (TextView) root.findViewById(R.id.year);
        this.f20213b = textView3;
        textView3.setTextSize(0, this.f20220i);
        this.f20213b.setTextColor(this.f20234w);
        TextView textView4 = this.f20213b;
        textView4.setPadding(textView4.getPaddingLeft(), this.f20227p, this.f20213b.getPaddingRight(), this.f20228q);
        View findViewById = root.findViewById(R.id.weeks_title);
        this.f20214c = findViewById;
        findViewById.setPadding(findViewById.getPaddingLeft(), this.f20229r, this.f20214c.getPaddingRight(), this.f20230s);
        this.f20215d = new TextView[7];
        for (int i11 = 1; i11 <= 7; i11++) {
            int identifier = getResources().getIdentifier("week_title_" + i11, "id", fs.b.f52352b);
            int i12 = i11 + (-1);
            this.f20215d[i12] = (TextView) root.findViewById(identifier);
            this.f20215d[i12].setTextSize(0, (float) this.f20221j);
            this.f20215d[i12].setTextColor(this.f20235x);
        }
        this.f20216e = new View[42];
        this.f20217f = new TextView[42];
        for (int i13 = 1; i13 <= 42; i13++) {
            int i14 = i13 - 1;
            this.f20217f[i14] = (TextView) root.findViewById(getResources().getIdentifier("day_" + i13, "id", fs.b.f52352b));
            this.f20217f[i14].setTextSize(0, (float) this.f20222k);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20217f[i14].getLayoutParams();
            layoutParams.width = this.f20223l;
            layoutParams.height = this.f20224m;
            this.f20217f[i14].setLayoutParams(layoutParams);
            this.f20216e[i14] = root.findViewById(getResources().getIdentifier("day_shell_" + i13, "id", fs.b.f52352b));
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f20216e[i14].getLayoutParams();
            layoutParams2.height = this.f20224m + this.f20226o + this.f20225n;
            this.f20216e[i14].setLayoutParams(layoutParams2);
            View view = this.f20216e[i14];
            view.setPadding(view.getPaddingLeft(), this.f20225n, this.f20216e[i14].getPaddingRight(), this.f20226o);
        }
        this.f20218g = new View[6];
        for (int i15 = 1; i15 <= 6; i15++) {
            this.f20218g[i15 - 1] = root.findViewById(getResources().getIdentifier("week_row_" + i15, "id", fs.b.f52352b));
        }
        k(null);
    }

    public final boolean j(List<Calendar> selectedCalendars) {
        if (selectedCalendars == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance(getResources().getConfiguration().locale);
        Calendar calendar2 = null;
        boolean z11 = false;
        for (Calendar calendar3 : selectedCalendars) {
            if (bg.a.f(calendar3, calendar)) {
                if (calendar2 != null && Math.abs(calendar3.get(6) - calendar2.get(6)) > 1) {
                    return false;
                }
                calendar2 = calendar3;
            }
            if (bg.a.e(calendar3, calendar)) {
                z11 = true;
            }
        }
        return z11;
    }

    public void k(List<Calendar> selectedCalendars) {
        l(selectedCalendars, null);
    }

    public void l(List<Calendar> selectedCalendars, h listener) {
        Calendar calendar = Calendar.getInstance(getResources().getConfiguration().locale);
        calendar.setFirstDayOfWeek(1);
        m(selectedCalendars, null, calendar, listener);
    }

    public void m(List<Calendar> selectedCalendars, List<Calendar> selectedCalendars2, Calendar calendar, h listener) {
        calendar.setFirstDayOfWeek(1);
        o(calendar);
        p(calendar);
        n(calendar, selectedCalendars, selectedCalendars2, listener);
    }

    public final void n(Calendar calendarParam, List<Calendar> selectedCalendars, List<Calendar> selectedCalendars2, final h listener) {
        int i11;
        int i12;
        Calendar calendar;
        List<AnimatorSet> list;
        TextView textView;
        List<Calendar> list2 = selectedCalendars;
        Calendar calendar2 = (Calendar) calendarParam.clone();
        calendar2.set(5, 1);
        int b11 = bg.a.b(calendar2.get(7), calendar2);
        int actualMaximum = calendar2.getActualMaximum(5);
        Calendar calendar3 = (Calendar) calendar2.clone();
        calendar3.add(5, -(b11 - 1));
        int i13 = 42;
        int i14 = 42 - ((actualMaximum + b11) - 1);
        boolean j11 = j(list2);
        List<AnimatorSet> arrayList = new ArrayList<>();
        int i15 = 0;
        while (i15 < i13) {
            TextView textView2 = this.f20217f[i15];
            Date time = calendar3.getTime();
            textView2.setText(new SimpleDateFormat("d", Locale.getDefault()).format(time));
            textView2.setTag(R.id.tag_calendar, time);
            textView2.setTag(R.id.tag_select_type, 3);
            textView2.setOnClickListener(new a());
            if (!bg.a.f(calendar3, calendar2)) {
                textView2.setTextColor(this.f20237z);
            } else if (bg.a.g(calendar3)) {
                textView2.setTextColor(this.A);
            } else {
                textView2.setTextColor(this.f20236y);
            }
            if (i15 < 35 || i14 / 7.0f < 1.0f) {
                i11 = 0;
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
                i11 = 0;
            }
            lq.c.b(textView2, new ColorDrawable(i11));
            if (list2 != null) {
                i12 = i15;
                calendar = calendar3;
                list = arrayList;
                textView = textView2;
                v(textView, calendar, list2, calendar2, list, j11, this.B, this.C, 1);
            } else {
                i12 = i15;
                calendar = calendar3;
                list = arrayList;
                textView = textView2;
            }
            if (selectedCalendars2 != null) {
                v(textView, calendar, selectedCalendars2, calendar2, list, j11, this.F, this.f20236y, 2);
            }
            calendar.add(5, 1);
            arrayList = list;
            i13 = 42;
            calendar3 = calendar;
            i15 = i12 + 1;
            list2 = selectedCalendars;
        }
        List<AnimatorSet> list3 = arrayList;
        if (list3.isEmpty() && listener != null) {
            f fVar = new f(listener);
            this.J = fVar;
            postDelayed(fVar, 300L);
        }
        for (int i16 = 0; i16 < list3.size(); i16++) {
            AnimatorSet animatorSet = list3.get(i16);
            ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
            if (!childAnimations.isEmpty()) {
                Animator animator = childAnimations.get(0);
                if (animator instanceof ObjectAnimator) {
                    ((ObjectAnimator) animator).addUpdateListener(new b(list3, i16));
                    if (i16 == 0) {
                        animatorSet.setStartDelay(600L);
                        animatorSet.addListener(new c(listener));
                        animatorSet.start();
                    }
                    if (i16 == list3.size() - 1) {
                        animatorSet.addListener(new d(listener));
                    }
                }
            }
        }
        TextView textView3 = this.K;
        if (textView3 != null) {
            s(textView3, true);
        }
        View[] viewArr = this.f20218g;
        View view = viewArr[viewArr.length - 1];
        if (this.f20217f[35].getVisibility() != 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    public final void o(Calendar calendar) {
        this.f20212a.setText(bg.a.c(calendar, Locale.US) + " ");
        this.f20213b.setText(bg.a.d(calendar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.J);
    }

    public final void p(Calendar calendar) {
        String[] shortWeekdays = new DateFormatSymbols(Locale.US).getShortWeekdays();
        for (int i11 = 1; i11 < shortWeekdays.length; i11++) {
            String str = shortWeekdays[i11];
            int i12 = 3;
            if (str.length() < 3) {
                i12 = str.length();
            }
            this.f20215d[bg.a.b(i11, calendar) - 1].setText(str.substring(0, i12).toUpperCase());
        }
    }

    public void q(int width, int height) {
        this.f20223l = width;
        this.f20224m = height;
        for (int i11 = 1; i11 <= 42; i11++) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20217f[i11 - 1].getLayoutParams();
            layoutParams.width = this.f20223l;
            layoutParams.height = this.f20224m;
        }
    }

    public void r(int top, int bottom) {
        this.f20225n = top;
        this.f20226o = bottom;
        for (int i11 = 1; i11 <= 42; i11++) {
            int i12 = i11 - 1;
            ((LinearLayout.LayoutParams) this.f20216e[i12].getLayoutParams()).height = this.f20224m + this.f20225n + this.f20226o;
            View view = this.f20216e[i12];
            view.setPadding(view.getPaddingLeft(), this.f20225n, this.f20216e[i12].getPaddingRight(), this.f20226o);
        }
    }

    public final void s(TextView textView, boolean needStoke) {
        int intValue = ((Integer) textView.getTag(R.id.tag_select_type)).intValue();
        lq.c.b(textView, g(intValue == 1 ? this.B : intValue == 2 ? this.F : 0, needStoke ? this.G : 0, this.f20232u, this.f20231t));
    }

    public void setAnimationEnable(boolean enable) {
        this.H = enable;
    }

    public void setDayHeight(int height) {
        this.f20224m = height;
        for (int i11 = 1; i11 <= 42; i11++) {
            int i12 = i11 - 1;
            ((RelativeLayout.LayoutParams) this.f20217f[i12].getLayoutParams()).height = this.f20224m;
            ((LinearLayout.LayoutParams) this.f20216e[i12].getLayoutParams()).height = this.f20224m + this.f20225n + this.f20226o;
            View view = this.f20216e[i12];
            view.setPadding(view.getPaddingLeft(), this.f20225n, this.f20216e[i12].getPaddingRight(), this.f20226o);
        }
    }

    public void setDaySelectedBackgroundColor(int color) {
        this.B = color;
    }

    public void setDaySelectedTextColor(int color) {
        this.C = color;
    }

    public void setDayTextColor(int color) {
        this.f20236y = color;
        for (int i11 = 1; i11 <= 42; i11++) {
            this.f20217f[i11 - 1].setTextColor(this.f20236y);
        }
    }

    public void setDayTextSize(int size) {
        this.f20222k = size;
        for (int i11 = 1; i11 <= 42; i11++) {
            this.f20217f[i11 - 1].setTextSize(0, this.f20222k);
        }
    }

    public void setDayWidth(int width) {
        this.f20223l = width;
        for (int i11 = 1; i11 <= 42; i11++) {
            ((RelativeLayout.LayoutParams) this.f20217f[i11 - 1].getLayoutParams()).width = this.f20223l;
        }
    }

    public void setMonthTextColor(int color) {
        this.f20233v = color;
        this.f20212a.setTextColor(color);
    }

    public void setOnItemClick(g onItemClick) {
        this.f20219h = onItemClick;
    }

    public void setOverflowDaySelectedBackgroundColor(int color) {
        this.E = color;
    }

    public void setOverflowDaySelectedTextColor(int color) {
        this.D = color;
    }

    public void setOverflowDayTextColor(int color) {
        this.f20237z = color;
    }

    public void setTitleTextSize(int size) {
        this.f20220i = size;
        this.f20212a.setTextSize(0, size);
        this.f20213b.setTextSize(0, this.f20220i);
    }

    public void setTitleVisibility(int visibility) {
        this.f20212a.setVisibility(visibility);
        this.f20213b.setVisibility(visibility);
    }

    public void setWeekTitleTextColor(int color) {
        this.f20235x = color;
        for (int i11 = 1; i11 <= 7; i11++) {
            this.f20215d[i11 - 1].setTextColor(this.f20235x);
        }
    }

    public void setWeekTitleTextSize(int size) {
        this.f20221j = size;
        for (int i11 = 1; i11 <= 7; i11++) {
            this.f20215d[i11 - 1].setTextSize(0, this.f20221j);
        }
    }

    public void setWeekendsDayTextColor(int color) {
        this.A = color;
    }

    public void setYearTextColor(int color) {
        this.f20234w = color;
        this.f20213b.setTextColor(color);
    }

    public void t(int top, int bottom) {
        this.f20227p = top;
        this.f20228q = bottom;
        TextView textView = this.f20212a;
        textView.setPadding(textView.getPaddingLeft(), this.f20227p, this.f20212a.getPaddingRight(), this.f20228q);
        TextView textView2 = this.f20213b;
        textView2.setPadding(textView2.getPaddingLeft(), this.f20227p, this.f20213b.getPaddingRight(), this.f20228q);
    }

    public void u(int top, int bottom) {
        this.f20229r = top;
        this.f20230s = bottom;
        View view = this.f20214c;
        view.setPadding(view.getPaddingLeft(), this.f20229r, this.f20214c.getPaddingRight(), this.f20230s);
    }

    public final void v(final TextView dayView, Calendar runCalendar, List<Calendar> selectedCalendars, Calendar calendar, List<AnimatorSet> animSets, boolean isCurrentMonthSelectedSmoothly, int daySelectBgColor, int daySelectColor, int type) {
        for (Calendar calendar2 : selectedCalendars) {
            if (bg.a.e(runCalendar, calendar2)) {
                int i11 = bg.a.f(runCalendar, calendar) ? daySelectBgColor : this.E;
                int i12 = bg.a.f(runCalendar, calendar) ? daySelectColor : this.D;
                dayView.setTag(R.id.tag_select_type, Integer.valueOf(type));
                Calendar calendar3 = this.L;
                int i13 = (calendar3 == null || !bg.a.e(calendar3, calendar2)) ? 0 : this.G;
                if (!this.H || !isCurrentMonthSelectedSmoothly) {
                    lq.c.b(dayView, g(i11, i13, this.f20232u, this.f20231t));
                    dayView.setTextColor(i12);
                    return;
                }
                ObjectAnimator duration = ObjectAnimator.ofFloat(dayView, "alpha", 1.0f, 0.0f).setDuration(500L);
                duration.addListener(new e(i11, i13, dayView, i12));
                duration.start();
                dayView.setPivotX(dayView.getWidth() / 2);
                dayView.setPivotY(dayView.getHeight() / 2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dayView, "scaleX", 0.2f, 1.0f);
                ofFloat.setDuration(400L);
                EasingType.Type type2 = EasingType.Type.OUT;
                ofFloat.setInterpolator(new ElasticInterpolator(type2, 0.0f, 0.65f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dayView, "scaleY", 0.2f, 1.0f);
                ofFloat2.setDuration(400L);
                ofFloat2.setInterpolator(new ElasticInterpolator(type2, 0.0f, 0.65f));
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dayView, "alpha", 0.0f, 1.0f);
                ofFloat3.setDuration(400L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                animSets.add(animatorSet);
                return;
            }
        }
    }

    public CalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.H = true;
        this.K = null;
        this.L = null;
        h(context, attrs, R.style.DefaultCalendarView);
    }

    public CalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.H = true;
        this.K = null;
        this.L = null;
        h(context, attrs, R.style.DefaultCalendarView);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f20243a;

        public c(final h val$listener) {
            this.f20243a = val$listener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            h hVar = this.f20243a;
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f20245a;

        public d(final h val$listener) {
            this.f20245a = val$listener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            h hVar = this.f20245a;
            if (hVar != null) {
                hVar.b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20247a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20248b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f20249c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f20250d;

        public e(final int val$backgroundColor, final int val$strokeColor, final TextView val$dayView, final int val$toTextColor) {
            this.f20247a = val$backgroundColor;
            this.f20248b = val$strokeColor;
            this.f20249c = val$dayView;
            this.f20250d = val$toTextColor;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            lq.c.b(this.f20249c, CalendarView.g(this.f20247a, this.f20248b, CalendarView.this.f20232u, CalendarView.this.f20231t));
            this.f20249c.setTextColor(this.f20250d);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }
}
