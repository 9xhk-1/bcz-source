package com.baicizhan.client.business.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.baicizhan.base.BaseFragmentActivity;
import com.baicizhan.client.business.util.ThemeUtil;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class DialogFragmentActivity extends BaseFragmentActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final String f17001e = "df_base";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17002f = "df_class_name";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17003g = "df_tag";

    /* renamed from: h, reason: collision with root package name */
    public static final String f17004h = "standard_theme";

    /* renamed from: a, reason: collision with root package name */
    public Bundle f17005a;

    /* renamed from: b, reason: collision with root package name */
    public String f17006b;

    /* renamed from: c, reason: collision with root package name */
    public String f17007c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17008d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Bundle f17009a;

        public final void a() {
            if (this.f17009a == null) {
                this.f17009a = new Bundle();
            }
        }

        public Bundle b() {
            return this.f17009a;
        }

        public a c(Bundle dfBase) {
            a();
            this.f17009a.putBundle(DialogFragmentActivity.f17001e, dfBase);
            return this;
        }

        public a d(Class<? extends DialogFragment> dfClass) {
            a();
            this.f17009a.putString(DialogFragmentActivity.f17002f, dfClass.getName());
            return this;
        }

        public a e(String dfTag) {
            a();
            this.f17009a.putString(DialogFragmentActivity.f17003g, dfTag);
            return this;
        }

        public a f(boolean standardTheme) {
            a();
            this.f17009a.putBoolean(DialogFragmentActivity.f17004h, standardTheme);
            return this;
        }
    }

    public static void I0(Activity activity, DialogInterface dialog) {
        if (activity instanceof DialogFragmentActivity) {
            ((DialogFragmentActivity) activity).J0(dialog);
        }
    }

    public static void K0(Context context, Class<? extends Activity> dfActivityClass, Bundle extras) {
        Intent intent = new Intent(context, dfActivityClass);
        intent.putExtras(extras);
        context.startActivity(intent);
    }

    public static void L0(Context context, Class<? extends Activity> dfActivityClass, Bundle base, Class<? extends DialogFragment> dfClass, String dfTag, boolean standardTheme) {
        Intent intent = new Intent(context, dfActivityClass);
        intent.putExtra(f17001e, base);
        intent.putExtra(f17002f, dfClass.getName());
        intent.putExtra(f17003g, dfTag);
        intent.putExtra(f17004h, standardTheme);
        context.startActivity(intent);
    }

    public abstract void J0(DialogInterface dialog);

    @Override // android.app.Activity
    public void finish() {
        overridePendingTransition(R.anim.business_no_fade, R.anim.business_no_fade);
        super.finish();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.business_no_fade, R.anim.business_no_fade);
        if (savedInstanceState != null) {
            this.f17005a = savedInstanceState.getBundle(f17001e);
            this.f17006b = savedInstanceState.getString(f17002f);
            this.f17007c = savedInstanceState.getString(f17003g);
            this.f17008d = savedInstanceState.getBoolean(f17004h);
        } else {
            Intent intent = getIntent();
            this.f17005a = intent.getBundleExtra(f17001e);
            this.f17006b = intent.getStringExtra(f17002f);
            this.f17007c = intent.getStringExtra(f17003g);
            this.f17008d = intent.getBooleanExtra(f17004h, this.f17008d);
        }
        if (this.f17008d) {
            ThemeUtil.setThemeOnActivityCreate(this);
        }
        try {
            DialogFragment dialogFragment = (DialogFragment) Class.forName(this.f17006b).newInstance();
            dialogFragment.setArguments(this.f17005a);
            dialogFragment.show(getSupportFragmentManager(), this.f17007c);
        } catch (Exception e11) {
            e11.printStackTrace();
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBundle(f17001e, this.f17005a);
        outState.putString(f17002f, this.f17006b);
        outState.putString(f17003g, this.f17007c);
        outState.putBoolean(f17004h, this.f17008d);
    }
}
