package com.baicizhan.client.business.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.baicizhan.base.BaseActivity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MeizuAdaptActivity extends BaseActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16365a = "go_where";

    public static void I0(Context context, Intent gowhere) {
        Intent intent = new Intent(context, (Class<?>) MeizuAdaptActivity.class);
        intent.putExtra(f16365a, gowhere);
        context.startActivity(intent);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meizu_cache);
        startActivity((Intent) getIntent().getParcelableExtra(f16365a));
        finish();
    }
}
