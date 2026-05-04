package com.baicizhan.client.video.activity;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import com.baicizhan.base.BaseFragmentActivity;
import com.jiongji.andriod.card.R;
import dc.c;
import gs.f3;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordTVActivity extends BaseFragmentActivity {

    /* renamed from: a, reason: collision with root package name */
    public FragmentManager f17774a;

    /* renamed from: b, reason: collision with root package name */
    public f3 f17775b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            WordTVActivity.this.finish();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f17775b = (f3) DataBindingUtil.setContentView(this, R.layout.activity_word_tv);
        if (x.r().c(this)) {
            finish();
            return;
        }
        this.f17775b.f54859a.D(new a());
        this.f17775b.f54859a.V(getString(R.string.video_title_tv));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f17774a = supportFragmentManager;
        supportFragmentManager.beginTransaction().replace(R.id.placeholder, new c()).commitAllowingStateLoss();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
