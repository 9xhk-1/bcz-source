package com.baicizhan.main.activity.setting.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.auth.QQAuthHelper;
import com.baicizhan.main.activity.setting.account.AccountActivity;
import com.jiongji.andriod.card.R;
import gs.j2;
import ve.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AccountActivity extends BaseAppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19591b = "AccountActivity";

    /* renamed from: a, reason: collision with root package name */
    public j2 f19592a;

    public static void J0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) AccountActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        QQAuthHelper.h().l(requestCode, resultCode, data);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j2 j2Var = (j2) DataBindingUtil.setContentView(this, R.layout.activity_single_setting_fragment);
        this.f19592a = j2Var;
        j2Var.p(getString(R.string.setting_account_mgr));
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, d.D(2), "").commit();
        this.f19592a.m(new View.OnClickListener() { // from class: ve.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountActivity.this.lambda$onCreate$0(view);
            }
        });
    }
}
