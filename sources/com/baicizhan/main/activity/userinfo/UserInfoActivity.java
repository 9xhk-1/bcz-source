package com.baicizhan.main.activity.userinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.userinfo.UserInfoActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import ef.k;
import gs.j2;
import q9.x;
import zf.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UserInfoActivity extends BaseAppCompatActivity implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19862b = "AccountActivity";

    /* renamed from: a, reason: collision with root package name */
    public j2 f19863a;

    public static void J0(Activity context) {
        Intent intent = new Intent(context, (Class<?>) UserInfoActivity.class);
        intent.setFlags(67108864);
        context.startActivity(intent);
        context.overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
    }

    @Override // zf.a, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public BottomSheetLayout getBottomSheetLayout() {
        return this.f19863a.f55399b;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        j2 j2Var = (j2) DataBindingUtil.setContentView(this, R.layout.activity_single_setting_fragment);
        this.f19863a = j2Var;
        j2Var.p(getString(R.string.userinfo_title));
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new k(), "UserInfoFragment").commit();
        this.f19863a.m(new View.OnClickListener() { // from class: ef.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserInfoActivity.this.lambda$onCreate$0(view);
            }
        });
    }
}
