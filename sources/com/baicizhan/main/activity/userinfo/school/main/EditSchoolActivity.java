package com.baicizhan.main.activity.userinfo.school.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.userinfo.school.main.EditSchoolActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import gs.j2;
import mf.i;
import zf.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class EditSchoolActivity extends BaseAppCompatActivity implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f19899b = "AccountActivity";

    /* renamed from: a, reason: collision with root package name */
    public j2 f19900a;

    public static void J0(Context context) {
        Intent intent = new Intent(context, (Class<?>) EditSchoolActivity.class);
        intent.setFlags(67108864);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    @Override // zf.a, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public BottomSheetLayout getBottomSheetLayout() {
        return this.f19900a.f55399b;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j2 j2Var = (j2) DataBindingUtil.setContentView(this, R.layout.activity_single_setting_fragment);
        this.f19900a = j2Var;
        j2Var.p(getString(R.string.userinfo_edit_school_title));
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new i(), "editSchoolMainFragment").commit();
        this.f19900a.m(new View.OnClickListener() { // from class: mf.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditSchoolActivity.this.lambda$onCreate$0(view);
            }
        });
    }
}
