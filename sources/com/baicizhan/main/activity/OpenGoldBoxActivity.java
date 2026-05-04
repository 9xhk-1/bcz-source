package com.baicizhan.main.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.k;
import com.airbnb.lottie.s0;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.jiongji.andriod.card.R;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import q9.l;
import qb.c;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class OpenGoldBoxActivity extends BaseActivity implements s0 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f18132f = "OpenGoldBoxT";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18133g = "key_coin_count";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18134h = "lucky_strike";

    /* renamed from: i, reason: collision with root package name */
    public static final int f18135i = 2000;

    /* renamed from: a, reason: collision with root package name */
    public LottieAnimationView f18136a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f18137b;

    /* renamed from: c, reason: collision with root package name */
    public IAudioPlayer f18138c;

    /* renamed from: d, reason: collision with root package name */
    public int f18139d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18140e = false;

    private void K0() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f18139d = intent.getIntExtra(f18133g, 0);
            this.f18140e = intent.getBooleanExtra(f18134h, false);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.animation_view);
        this.f18136a = lottieAnimationView;
        lottieAnimationView.setRenderMode(RenderMode.HARDWARE);
        this.f18137b = (TextView) findViewById(R.id.open_box_title);
        this.f18136a.setAnimation(this.f18140e ? R.raw.open_gold_box_luck : R.raw.open_gold_box);
        this.f18136a.j(this);
        this.f18136a.A();
    }

    public static void L0(Context context, int coinCount, boolean luckyStrike) {
        Intent intent = new Intent(context, (Class<?>) OpenGoldBoxActivity.class);
        intent.putExtra(f18133g, coinCount);
        intent.putExtra(f18134h, luckyStrike);
        context.startActivity(intent);
    }

    public final void M0(int count) {
        String string = getString(R.string.daka_lotter_result_coin, Integer.valueOf(count));
        SpannableString spannableString = new SpannableString(string);
        int indexOf = string.indexOf(String.valueOf(count));
        spannableString.setSpan(new ForegroundColorSpan(-12537), indexOf, String.valueOf(count).length() + indexOf, 18);
        spannableString.setSpan(new StyleSpan(1), indexOf, String.valueOf(count).length() + indexOf, 18);
        spannableString.setSpan(new RelativeSizeSpan(1.636f), indexOf, String.valueOf(count).length() + indexOf, 18);
        this.f18137b.setText(spannableString);
    }

    @Override // com.airbnb.lottie.s0
    public void b(k composition) {
        long duration = this.f18136a.getDuration();
        this.f18138c.a(R.raw.open_box_luck);
        c.i(f18132f, "lottie duration: %d", Long.valueOf(duration));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rx.c.I2(30L, timeUnit).E5(duration, timeUnit).I3(tb0.a.a()).r5(new a());
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_no_fade_long, R.anim.business_no_fade_long);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gold_box);
        K0();
        this.f18138c = new l(this);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IAudioPlayer iAudioPlayer = this.f18138c;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f18136a.z();
        this.f18136a.setVisibility(8);
        this.f18137b.setVisibility(8);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f18136a.J();
        this.f18136a.setVisibility(0);
        this.f18137b.setVisibility(0);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Long> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.activity.OpenGoldBoxActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0282a implements Runnable {
            public RunnableC0282a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OpenGoldBoxActivity.this.finish();
            }
        }

        public a() {
        }

        @Override // qb0.c
        public void onCompleted() {
            OpenGoldBoxActivity openGoldBoxActivity = OpenGoldBoxActivity.this;
            openGoldBoxActivity.M0(openGoldBoxActivity.f18139d);
            new Handler(OpenGoldBoxActivity.this.getMainLooper()).postDelayed(new RunnableC0282a(), 2000L);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Long aLong) {
            int length = String.valueOf(Math.abs(OpenGoldBoxActivity.this.f18139d)).length();
            int pow = (int) Math.pow(10.0d, length - 1);
            OpenGoldBoxActivity.this.M0(new Random().nextInt(((int) Math.pow(10.0d, length)) - pow) + pow);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }
}
