package com.baicizhan.main.activity.daka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.daka.datasource.k;
import com.jiongji.andriod.card.R;
import i9.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ShareDakaSettingActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final String f18324c = "msNeedShowShareDakaSetting";

    /* renamed from: a, reason: collision with root package name */
    public View f18325a;

    /* renamed from: b, reason: collision with root package name */
    public View f18326b;

    public static int I0(Intent in2, int defaultValue) {
        return in2 != null ? in2.getIntExtra(ShareDakaSettingActivity.class.getName(), defaultValue) : defaultValue;
    }

    private void J0() {
        this.f18325a = findViewById(R.id.classic);
        this.f18326b = findViewById(R.id.poster);
        this.f18325a.setOnClickListener(this);
        this.f18326b.setOnClickListener(this);
        findViewById(R.id.back).setOnClickListener(this);
        findViewById(R.id.setting_daka).setOnClickListener(this);
        ((TextView) findViewById(R.id.setting_daka_hint)).setText(Html.fromHtml(getResources().getString(R.string.share_mode_hint)));
        P0(k.d());
    }

    public static boolean K0() {
        return j.c(f18324c, true);
    }

    public static void M0(boolean needShow) {
        j.n(f18324c, needShow);
    }

    public static void O0(Activity context, int requestCode, int extra) {
        Intent intent = new Intent(context, (Class<?>) ShareDakaSettingActivity.class);
        intent.putExtra(ShareDakaSettingActivity.class.getName(), extra);
        context.startActivityForResult(intent, requestCode);
    }

    public final void L0(int code) {
        Intent intent = new Intent();
        intent.putExtra(ShareDakaSettingActivity.class.getName(), getIntent().getIntExtra(ShareDakaSettingActivity.class.getName(), 0));
        setResult(code, intent);
    }

    public final void N0() {
        j.n(f18324c, false);
        k.f(this.f18325a.isSelected());
        L0(-1);
        finish();
    }

    public final void P0(boolean isClassic) {
        this.f18325a.setSelected(isClassic);
        this.f18326b.setSelected(!isClassic);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        L0(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        switch (id2) {
            case R.id.back /* 2131361956 */:
                L0(0);
                finish();
                break;
            case R.id.classic /* 2131362138 */:
            case R.id.poster /* 2131363367 */:
                P0(id2 == R.id.classic);
                break;
            case R.id.setting_daka /* 2131363575 */:
                N0();
                break;
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_share_daka_poster);
        J0();
    }
}
