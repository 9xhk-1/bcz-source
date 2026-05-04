package com.baicizhan.main.customview.calendar;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.client.business.util.animation.EasingType;
import com.baicizhan.client.business.util.animation.ElasticInterpolator;
import com.baicizhan.main.customview.calendar.SpecialDateView;
import com.baicizhan.online.user_study_api.UserDakaSpecialDay;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import x00.l;
import xb.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SpecialDateView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List<ImageView> f20253a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public CalendarView f20254a;

        /* renamed from: b, reason: collision with root package name */
        public List<UserDakaSpecialDay> f20255b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.customview.calendar.SpecialDateView$a$a, reason: collision with other inner class name */
        public class RunnableC0302a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SpecialDateView f20256a;

            public RunnableC0302a(final SpecialDateView val$specialDateView) {
                this.f20256a = val$specialDateView;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e(this.f20256a);
            }
        }

        public SpecialDateView b(@NonNull Context context, @NonNull ViewGroup parent) {
            SpecialDateView specialDateView = new SpecialDateView(context);
            specialDateView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            parent.addView(specialDateView);
            parent.post(new RunnableC0302a(specialDateView));
            return specialDateView;
        }

        public final void c(List<b> paramses, ViewGroup parent) {
            if (e.h(paramses)) {
                return;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) parent.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int measuredHeight = displayMetrics.heightPixels - parent.getMeasuredHeight();
            Iterator<b> it = paramses.iterator();
            while (it.hasNext()) {
                it.next().f20259b.y -= measuredHeight;
            }
        }

        public final List<b> d() {
            List<UserDakaSpecialDay> list;
            char c11;
            CalendarView calendarView = this.f20254a;
            if (calendarView == null || calendarView.getDayViews() == null || (list = this.f20255b) == null || list.isEmpty()) {
                return null;
            }
            char c12 = 2;
            int[] iArr = new int[2];
            ArrayList arrayList = new ArrayList();
            TextView[] dayViews = this.f20254a.getDayViews();
            int length = dayViews.length;
            int i11 = 0;
            while (i11 < length) {
                TextView textView = dayViews[i11];
                Object tag = textView.getTag();
                if (tag == null || !(tag instanceof Date)) {
                    return null;
                }
                Date date = (Date) tag;
                Iterator<UserDakaSpecialDay> it = this.f20255b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c11 = c12;
                        break;
                    }
                    UserDakaSpecialDay next = it.next();
                    Calendar calendar = Calendar.getInstance(this.f20254a.getResources().getConfiguration().locale);
                    long convert2Time = TimeUtil.convert2Time(next.date);
                    calendar.setTimeInMillis(convert2Time);
                    c11 = c12;
                    Calendar calendar2 = Calendar.getInstance(this.f20254a.getResources().getConfiguration().locale);
                    calendar2.setTime(date);
                    if (bg.a.e(calendar2, calendar)) {
                        textView.getLocationInWindow(iArr);
                        Point point = new Point();
                        point.x = iArr[0] + (this.f20254a.getDayWidth() / 2);
                        point.y = iArr[1] + (this.f20254a.getDayHeight() / 2);
                        b bVar = new b();
                        bVar.f20258a = convert2Time;
                        bVar.f20260c = (this.f20254a.getDayWidth() * 8) / 5;
                        bVar.f20261d = (this.f20254a.getDayHeight() * 8) / 5;
                        bVar.f20259b = new Point();
                        bVar.f20259b.x = point.x - (bVar.f20260c / 2);
                        bVar.f20259b.y = point.y - (bVar.f20261d / 2);
                        bVar.f20262e = next.img_url;
                        arrayList.add(bVar);
                        break;
                    }
                    c12 = c11;
                }
                i11++;
                c12 = c11;
            }
            return arrayList;
        }

        public final void e(SpecialDateView specialDateView) {
            List<b> d11 = d();
            c(d11, specialDateView);
            if (d11 != null && !d11.isEmpty()) {
                specialDateView.f20253a = new ArrayList(d11.size());
                for (b bVar : d11) {
                    ImageView imageView = new ImageView(specialDateView.getContext());
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(bVar.f20260c, bVar.f20261d));
                    imageView.setTag(bVar);
                    specialDateView.addView(imageView);
                    specialDateView.f20253a.add(imageView);
                }
            }
            specialDateView.f();
        }

        public a f(@NonNull CalendarView calendarView) {
            this.f20254a = calendarView;
            return this;
        }

        public a g(@NonNull List<UserDakaSpecialDay> specialDates) {
            this.f20255b = specialDates;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f20258a;

        /* renamed from: b, reason: collision with root package name */
        public Point f20259b;

        /* renamed from: c, reason: collision with root package name */
        public int f20260c;

        /* renamed from: d, reason: collision with root package name */
        public int f20261d;

        /* renamed from: e, reason: collision with root package name */
        public String f20262e;

        public b() {
        }
    }

    public static /* synthetic */ g2 a(ImageView imageView, b bVar, Bitmap bitmap) {
        h(imageView, bitmap);
        bg.c.b(bVar.f20262e, bitmap);
        return null;
    }

    public static void g(View view, b params) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, params.f20259b.x + (params.f20260c / 2), params.f20259b.y + (params.f20261d / 2));
        scaleAnimation.setDuration(500L);
        EasingType.Type type = EasingType.Type.OUT;
        scaleAnimation.setInterpolator(new ElasticInterpolator(type, 0.0f, 0.65f));
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, params.f20261d / 2, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new ElasticInterpolator(type, 0.0f, 0.65f));
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);
        Calendar calendar = Calendar.getInstance(view.getResources().getConfiguration().locale);
        Calendar calendar2 = Calendar.getInstance(view.getResources().getConfiguration().locale);
        calendar2.setTimeInMillis(params.f20258a);
        boolean f11 = bg.a.f(calendar, calendar2);
        boolean z11 = !f11;
        if (f11 && !bg.a.e(calendar, calendar2)) {
            z11 = calendar2.getTimeInMillis() < calendar.getTimeInMillis();
        }
        if (z11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.4f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
        view.setVisibility(0);
        view.startAnimation(animationSet);
    }

    public static void h(ImageView target, Bitmap bitmap) {
        target.setImageBitmap(bitmap);
        g(target, (b) target.getTag());
    }

    public final void f() {
        List<ImageView> list = this.f20253a;
        if (list != null) {
            for (final ImageView imageView : list) {
                final b bVar = (b) imageView.getTag();
                imageView.setVisibility(4);
                imageView.setX(bVar.f20259b.x);
                imageView.setY(bVar.f20259b.y);
                Bitmap c11 = bg.c.c(bVar.f20262e);
                if (c11 != null) {
                    h(imageView, c11);
                } else {
                    hc.c.p(bVar.f20262e).l(new l() { // from class: bg.d
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            return SpecialDateView.a(imageView, bVar, (Bitmap) obj);
                        }
                    }, null);
                }
            }
        }
    }

    public SpecialDateView(Context context) {
        super(context);
    }

    public SpecialDateView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SpecialDateView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements e0 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<ImageView> f20263a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20264b;

        public c(ImageView target, String url) {
            this.f20263a = new WeakReference<>(target);
            this.f20264b = url;
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapFailed(Exception e11, Drawable drawable) {
            qb.c.c("ContentLoadTarget", "", e11);
        }

        @Override // com.squareup.picasso.e0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            ImageView imageView = this.f20263a.get();
            if (imageView == null) {
                return;
            }
            SpecialDateView.h(imageView, bitmap);
            bg.c.b(this.f20264b, bitmap);
        }

        @Override // com.squareup.picasso.e0
        public void onPrepareLoad(Drawable drawable) {
        }
    }
}
