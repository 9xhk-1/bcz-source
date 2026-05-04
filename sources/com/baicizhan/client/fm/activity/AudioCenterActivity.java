package com.baicizhan.client.fm.activity;

import ab.e;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import bb.d;
import cb.a;
import com.baicizhan.client.business.widget.WordErrFeedbackFragment;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.client.fm.data.NotifyInfo;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;
import db.a;
import db.c;
import gs.k;
import hj.p;
import java.lang.reflect.Field;
import ma.l;
import ma.t;
import q9.x;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class AudioCenterActivity extends e implements View.OnClickListener, WordErrFeedbackFragment.c, a.c, c.i, ViewPager.OnPageChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public ViewPager f17319e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17320f;

    /* renamed from: g, reason: collision with root package name */
    public k f17321g;

    /* renamed from: h, reason: collision with root package name */
    public d f17322h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends FragmentPagerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17323a;

        public a(FragmentManager fm2) {
            super(fm2);
            this.f17323a = false;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            if (position != 0) {
                if (position != 1) {
                    return null;
                }
                return new c();
            }
            AudioCenterActivity.this.f17322h = d.k0();
            AudioCenterActivity.this.f17322h.B0(AudioCenterActivity.this);
            return AudioCenterActivity.this.f17322h;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup container, int position, Object object) {
            super.setPrimaryItem(container, position, object);
            if (!(object instanceof d) || this.f17323a) {
                return;
            }
            ((d) object).D0();
            this.f17323a = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TabLayout f17325a;

        public b(final TabLayout val$tabLayout) {
            this.f17325a = val$tabLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f17325a.getChildAt(0);
                int a11 = f.a(this.f17325a.getContext(), 40.0f);
                for (int i11 = 0; i11 < linearLayout.getChildCount(); i11++) {
                    View childAt = linearLayout.getChildAt(i11);
                    Field declaredField = childAt.getClass().getDeclaredField("textView");
                    declaredField.setAccessible(true);
                    TextView textView = (TextView) declaredField.get(childAt);
                    childAt.setPadding(0, 0, 0, 0);
                    int width = textView.getWidth();
                    if (width == 0) {
                        textView.measure(0, 0);
                        width = textView.getMeasuredWidth();
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.width = width;
                    layoutParams.leftMargin = a11;
                    layoutParams.rightMargin = a11;
                    childAt.setLayoutParams(layoutParams);
                    childAt.invalidate();
                }
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (NoSuchFieldException e12) {
                e12.printStackTrace();
            }
        }
    }

    public static void N0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) AudioCenterActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    @Override // db.c.i
    public void A() {
        d dVar = this.f17322h;
        if (dVar != null) {
            dVar.l0(NotifyInfo.getPastExamListenNotifyInfoJson(this));
        }
    }

    public final void L0() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        this.f17319e = viewPager;
        viewPager.setOffscreenPageLimit(1);
        this.f17319e.setAdapter(new a(getSupportFragmentManager()));
        this.f17319e.addOnPageChangeListener(this);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.tab_indicator_audio_center, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, f.a(this, 24.0f), f.a(this, 2.0f));
            tabLayout.setSelectedTabIndicator(drawable);
        }
        tabLayout.setupWithViewPager(this.f17319e);
        TabLayout.i D = tabLayout.D(0);
        if (D != null) {
            D.D("单词音频");
        }
        TabLayout.i D2 = tabLayout.D(1);
        if (D2 != null) {
            D2.D("真题音频");
        }
        M0(tabLayout);
    }

    public void M0(final TabLayout tabLayout) {
        tabLayout.post(new b(tabLayout));
    }

    @Override // db.a.c
    public void g0() {
        d dVar = this.f17322h;
        if (dVar != null) {
            dVar.l0(NotifyInfo.getReadPlanNotifyInfoJson(this));
        }
    }

    @Override // com.baicizhan.client.business.widget.WordErrFeedbackFragment.c
    public void j() {
        a.c cVar = new a.c();
        cVar.b(1);
        i80.c.f().q(cVar);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.home) {
            d dVar = this.f17322h;
            if (dVar != null) {
                dVar.Z(this);
            }
            finish();
        }
    }

    @Override // ab.e, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        this.f17320f = false;
        k kVar = (k) DataBindingUtil.setContentView(this, R.layout.activity_audio_center);
        this.f17321g = kVar;
        kVar.f55554a.D(new View.OnClickListener() { // from class: ab.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioCenterActivity.this.lambda$onCreate$0(view);
            }
        });
        setVolumeControlStream(3);
        p.c(this);
    }

    @Override // ab.e, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ViewPager viewPager = this.f17319e;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this);
        }
        d dVar = this.f17322h;
        if (dVar != null) {
            dVar.Z(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            Log.d("whiz", "fm fragment's activity back key clicked.");
            d dVar = this.f17322h;
            if (dVar != null) {
                dVar.Z(this);
            }
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        if (position >= 1) {
            l.a(t.f73015n, ma.a.f72840t1);
        }
        d dVar = this.f17322h;
        if (dVar == null) {
            return;
        }
        if (position >= 1) {
            dVar.z0();
        } else {
            dVar.A0();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        d dVar = this.f17322h;
        if (dVar != null) {
            dVar.l0(NotifyInfo.getFmNotifyInfoJson(this));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (this.f17320f) {
            return;
        }
        L0();
        this.f17320f = true;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
}
