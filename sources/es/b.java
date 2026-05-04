package es;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Activity f50108a;

    /* renamed from: b, reason: collision with root package name */
    public SlidingMenu f50109b;

    /* renamed from: c, reason: collision with root package name */
    public View f50110c;

    /* renamed from: d, reason: collision with root package name */
    public View f50111d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f50112e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50113f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f50114g = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f50115a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f50116b;

        public a(final boolean val$open, final boolean val$secondary) {
            this.f50115a = val$open;
            this.f50116b = val$secondary;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f50115a) {
                b.this.f50109b.n(false);
            } else if (this.f50116b) {
                b.this.f50109b.r(false);
            } else {
                b.this.f50109b.p(false);
            }
        }
    }

    public b(Activity activity) {
        this.f50108a = activity;
    }

    public View b(int id2) {
        View findViewById;
        SlidingMenu slidingMenu = this.f50109b;
        if (slidingMenu == null || (findViewById = slidingMenu.findViewById(id2)) == null) {
            return null;
        }
        return findViewById;
    }

    public SlidingMenu c() {
        return this.f50109b;
    }

    public void d(Bundle savedInstanceState) {
        this.f50109b = (SlidingMenu) LayoutInflater.from(this.f50108a).inflate(R.layout.slidingmenumain, (ViewGroup) null);
    }

    public boolean e(int keyCode, KeyEvent event) {
        if (keyCode != 4 || !this.f50109b.h()) {
            return false;
        }
        l();
        return true;
    }

    public void f(Bundle bundle) {
        boolean z11;
        boolean z12;
        if (this.f50111d == null || this.f50110c == null) {
            throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
        }
        this.f50113f = true;
        this.f50109b.f(this.f50108a, !this.f50114g ? 1 : 0, true);
        if (bundle != null) {
            z11 = bundle.getBoolean("SlidingActivityHelper.open");
            z12 = bundle.getBoolean("SlidingActivityHelper.secondary");
        } else {
            z11 = false;
            z12 = false;
        }
        new Handler().post(new a(z11, z12));
    }

    public void g(Bundle outState) {
        outState.putBoolean("SlidingActivityHelper.open", this.f50109b.h());
        outState.putBoolean("SlidingActivityHelper.secondary", this.f50109b.i());
    }

    public void h(View v11, ViewGroup.LayoutParams params) {
        if (this.f50112e) {
            return;
        }
        this.f50110c = v11;
    }

    public void i(View view, ViewGroup.LayoutParams layoutParams) {
        this.f50111d = view;
        this.f50109b.setMenu(view);
    }

    public void j(View v11) {
        this.f50112e = true;
        this.f50108a.setContentView(v11);
    }

    public void k(boolean slidingActionBarEnabled) {
        if (this.f50113f) {
            throw new IllegalStateException("enableSlidingActionBar must be called in onCreate.");
        }
        this.f50114g = slidingActionBarEnabled;
    }

    public void l() {
        this.f50109b.m();
    }

    public void m() {
        this.f50109b.o();
    }

    public void n() {
        this.f50109b.q();
    }

    public void o() {
        this.f50109b.s();
    }
}
