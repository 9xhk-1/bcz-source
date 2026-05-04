package com.baicizhan.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.ForceAuthActivity;
import com.jiongji.andriod.card.R;
import gs.l0;
import ve.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ForceAuthActivity extends BaseAppCompatActivity {
    public static void J0(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) ForceAuthActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((l0) DataBindingUtil.setContentView(this, R.layout.activity_force_auth)).f55670a.D(new View.OnClickListener() { // from class: fd.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForceAuthActivity.this.lambda$onCreate$0(view);
            }
        });
        getSupportFragmentManager().beginTransaction().add(R.id.nav_container, d.D(1)).commitAllowingStateLoss();
    }
}
