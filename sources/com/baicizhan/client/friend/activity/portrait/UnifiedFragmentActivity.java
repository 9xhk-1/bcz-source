package com.baicizhan.client.friend.activity.portrait;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.baicizhan.base.BaseAppCompatActivity;
import com.jiongji.andriod.card.R;
import gs.bc;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UnifiedFragmentActivity extends BaseAppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final String f17658d = "UnifiedFragmentActivity";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17659e = "fragment_class";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17660f = "title";

    /* renamed from: a, reason: collision with root package name */
    public bc f17661a;

    /* renamed from: b, reason: collision with root package name */
    public String f17662b;

    /* renamed from: c, reason: collision with root package name */
    public String f17663c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            UnifiedFragmentActivity.this.finish();
        }
    }

    public static void I0(Context context, Class<? extends Fragment> fragmentClass, String title) {
        Intent intent = new Intent(context, (Class<?>) UnifiedFragmentActivity.class);
        intent.putExtra("fragment_class", fragmentClass.getName());
        intent.putExtra("title", title);
        context.startActivity(intent);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Fragment fragment;
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppCompatStandardDefault);
        if (savedInstanceState != null) {
            this.f17662b = savedInstanceState.getString("fragment_class");
            this.f17663c = savedInstanceState.getString("title");
        } else {
            this.f17662b = getIntent().getStringExtra("fragment_class");
            this.f17663c = getIntent().getStringExtra("title");
        }
        try {
            fragment = (Fragment) Class.forName(this.f17662b).newInstance();
        } catch (Exception unused) {
            c.d(f17658d, "fragment class name cannot be converted to class: " + this.f17662b, new Object[0]);
            finish();
            fragment = null;
        }
        if (fragment != null) {
            bc bcVar = (bc) DataBindingUtil.setContentView(this, R.layout.friend_activity_unified_fragment);
            this.f17661a = bcVar;
            bcVar.f54280a.D(new a());
            this.f17661a.f54280a.V(this.f17663c);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("fragment_class", this.f17662b);
        outState.putString("title", this.f17663c);
    }
}
