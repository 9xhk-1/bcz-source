package com.baicizhan.main.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.baicizhan.base.BaseAppCompatActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import gs.j2;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SingleFragmentActivity extends BaseAppCompatActivity implements zf.a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f18188h = "SingleSettingFragmentActivity";

    /* renamed from: i, reason: collision with root package name */
    public static final String f18189i = "fragment_class";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18190j = "fragment_extras";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18191k = "fragment_theme_dark";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18192l = "fragment_theme_divider";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18193m = "title";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18194n = "background";

    /* renamed from: a, reason: collision with root package name */
    public j2 f18195a;

    /* renamed from: b, reason: collision with root package name */
    public String f18196b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f18197c;

    /* renamed from: d, reason: collision with root package name */
    public String f18198d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18199e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18200f;

    /* renamed from: g, reason: collision with root package name */
    public int f18201g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            SingleFragmentActivity.this.finish();
        }
    }

    public static void I0(Context context, Class<? extends Fragment> fragment, Bundle fragExtras, String title) {
        J0(context, fragment, fragExtras, title, false, true);
    }

    public static void J0(Context context, Class<? extends Fragment> fragment, Bundle fragExtras, String title, boolean darkMode, boolean showDivider) {
        K0(context, fragment, fragExtras, title, darkMode, showDivider, 0);
    }

    public static void K0(Context context, Class<? extends Fragment> fragment, Bundle fragExtras, String title, boolean darkMode, boolean showDivider, int backgroundColor) {
        Intent intent = new Intent(context, (Class<?>) SingleFragmentActivity.class);
        intent.putExtra("fragment_class", fragment.getName());
        intent.putExtra(f18190j, fragExtras);
        intent.putExtra(f18191k, darkMode);
        intent.putExtra(f18192l, showDivider);
        intent.putExtra("title", title);
        intent.putExtra(f18194n, backgroundColor);
        context.startActivity(intent);
        ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
    }

    @Override // zf.a, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public BottomSheetLayout getBottomSheetLayout() {
        return this.f18195a.f55399b;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        if (savedInstanceState != null) {
            this.f18196b = savedInstanceState.getString("fragment_class");
            this.f18197c = savedInstanceState.getBundle(f18190j);
            this.f18198d = savedInstanceState.getString("title");
            this.f18199e = savedInstanceState.getBoolean(f18191k, false);
            this.f18200f = savedInstanceState.getBoolean(f18192l, true);
            this.f18201g = savedInstanceState.getInt(f18194n, 0);
        } else {
            this.f18196b = getIntent().getStringExtra("fragment_class");
            this.f18197c = getIntent().getBundleExtra(f18190j);
            this.f18198d = getIntent().getStringExtra("title");
            this.f18199e = getIntent().getBooleanExtra(f18191k, false);
            this.f18200f = getIntent().getBooleanExtra(f18192l, true);
            this.f18201g = getIntent().getIntExtra(f18194n, 0);
        }
        if (TextUtils.isEmpty(this.f18196b)) {
            finish();
            return;
        }
        j2 j2Var = (j2) DataBindingUtil.setContentView(this, R.layout.activity_single_setting_fragment);
        this.f18195a = j2Var;
        j2Var.m(new a());
        int i11 = this.f18201g;
        if (i11 != 0) {
            this.f18195a.f55400c.setBackgroundColor(i11);
        }
        this.f18195a.p(this.f18198d);
        if (this.f18199e) {
            setTheme(R.style.AppCompatStandardDefaultLight);
            this.f18195a.n(true);
        }
        this.f18195a.o(this.f18200f);
        try {
            Fragment fragment = (Fragment) Class.forName(this.f18196b).newInstance();
            Bundle bundle = this.f18197c;
            if (bundle != null) {
                fragment.setArguments(bundle);
            }
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();
        } catch (Exception e11) {
            c.d(f18188h, "create single fragment activity's fragment failed. " + e11, new Object[0]);
            e11.printStackTrace();
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("fragment_class", this.f18196b);
        outState.putBundle(f18190j, this.f18197c);
        outState.putString("title", this.f18198d);
    }
}
