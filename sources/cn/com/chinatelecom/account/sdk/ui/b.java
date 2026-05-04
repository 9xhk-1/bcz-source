package cn.com.chinatelecom.account.sdk.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.d.f;
import cn.com.chinatelecom.account.api.d.j;
import cn.com.chinatelecom.account.sdk.AuthPageConfig;
import cn.com.chinatelecom.account.sdk.AuthViewConfig;
import cn.com.chinatelecom.account.sdk.PrivacyAgreementConfig;
import cn.com.chinatelecom.account.sdk.a.d;
import cn.com.chinatelecom.account.sdk.ui.a;

/* loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private Context f9241a;

    /* renamed from: b, reason: collision with root package name */
    private cn.com.chinatelecom.account.sdk.a.a f9242b;

    /* renamed from: c, reason: collision with root package name */
    private AuthPageConfig f9243c;

    /* renamed from: d, reason: collision with root package name */
    private AuthViewConfig f9244d = d.a().c();

    /* renamed from: e, reason: collision with root package name */
    private View.OnClickListener f9245e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f9246f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f9247g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f9248h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f9249i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f9250j;

    /* renamed from: k, reason: collision with root package name */
    private View f9251k;

    /* renamed from: l, reason: collision with root package name */
    private View f9252l;

    /* renamed from: m, reason: collision with root package name */
    private View f9253m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f9254n;

    /* renamed from: o, reason: collision with root package name */
    private View f9255o;

    /* renamed from: p, reason: collision with root package name */
    private View f9256p;

    /* renamed from: q, reason: collision with root package name */
    private View f9257q;

    /* renamed from: r, reason: collision with root package name */
    private View f9258r;

    /* renamed from: s, reason: collision with root package name */
    private View f9259s;

    /* renamed from: t, reason: collision with root package name */
    private String f9260t;

    public b(Activity activity, cn.com.chinatelecom.account.sdk.a.a aVar, AuthPageConfig authPageConfig, View.OnClickListener onClickListener, String str) {
        this.f9260t = str;
        this.f9241a = activity;
        this.f9245e = onClickListener;
        this.f9242b = aVar;
        this.f9243c = authPageConfig;
        a(activity);
        b(activity);
        e();
        if (this.f9244d != null) {
            c(activity);
        }
        a();
    }

    private void e() {
        this.f9251k.setOnClickListener(this.f9245e);
        this.f9252l.setOnClickListener(this);
        View view = this.f9253m;
        if (view != null) {
            view.setOnClickListener(this);
        }
        AuthViewConfig authViewConfig = this.f9244d;
        if (authViewConfig == null || authViewConfig.R == 0) {
            f();
        }
    }

    private void f() {
        try {
            CharSequence text = this.f9254n.getText();
            if (text.length() >= 18) {
                String str = (String) this.f9254n.getTag();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                spannableStringBuilder.setSpan(new c(this.f9241a, this.f9242b.b(null), "", 0, str), 5, 18, 33);
                this.f9254n.setText(spannableStringBuilder);
                this.f9254n.setMovementMethod(LinkMovementMethod.getInstance());
                this.f9254n.setHighlightColor(this.f9241a.getResources().getColor(R.color.transparent));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private boolean g() {
        return this.f9246f.isChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        f.a(this.f9260t).c();
        if (!this.f9242b.b()) {
            c();
            cn.com.chinatelecom.account.api.a.a().a((CtSetting) null, new cn.com.chinatelecom.account.api.c() { // from class: cn.com.chinatelecom.account.sdk.ui.b.2
                @Override // cn.com.chinatelecom.account.api.c
                public void a(String str) {
                    cn.com.chinatelecom.account.sdk.a.a.a().a(b.this.f9241a, str, (TextView) null);
                }
            });
        } else {
            this.f9252l.setEnabled(false);
            this.f9252l.setClickable(false);
            cn.com.chinatelecom.account.sdk.a.a.a().a(this.f9241a);
        }
    }

    public void a() {
        TextView textView = this.f9247g;
        if (textView != null) {
            textView.setText(cn.com.chinatelecom.account.sdk.a.a.a().c());
        }
    }

    public void c() {
        try {
            this.f9252l.setEnabled(false);
            this.f9252l.setClickable(false);
            this.f9250j.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f9241a, cn.com.chinatelecom.account.sdk.R.anim.ct_account_rotate_anim_iv);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.f9250j.startAnimation(loadAnimation);
            this.f9249i.setVisibility(8);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void d() {
        try {
            this.f9250j.clearAnimation();
            this.f9250j.setVisibility(8);
            this.f9249i.setVisibility(0);
            this.f9252l.setClickable(true);
            this.f9252l.setEnabled(true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.f9243c.e()) {
            if (this.f9246f == null || g()) {
                h();
                return;
            } else {
                b();
                return;
            }
        }
        if (view.getId() == this.f9243c.h()) {
            f.a(this.f9260t).c(0L);
            this.f9242b.a(j.j());
        } else if (view.getId() == this.f9243c.j()) {
            a(this.f9242b.b(null), "");
        }
    }

    private void a(Activity activity) {
        this.f9251k = activity.findViewById(this.f9243c.b());
        this.f9247g = (TextView) activity.findViewById(this.f9243c.c());
        this.f9252l = activity.findViewById(this.f9243c.e());
        this.f9250j = (ImageView) activity.findViewById(this.f9243c.f());
        this.f9249i = (TextView) activity.findViewById(this.f9243c.g());
        this.f9254n = (TextView) activity.findViewById(this.f9243c.j());
        if (this.f9243c.h() != 0) {
            this.f9253m = activity.findViewById(this.f9243c.h());
        }
        if (this.f9243c.d() != 0) {
            TextView textView = (TextView) activity.findViewById(this.f9243c.d());
            this.f9248h = textView;
            textView.setText(this.f9242b.d());
            if (this.f9242b.e()) {
                this.f9248h.setCompoundDrawables(null, null, null, null);
            }
        }
        if (this.f9243c.i() != 0) {
            this.f9246f = (CheckBox) activity.findViewById(this.f9243c.i());
        }
    }

    private void c(Activity activity) {
        int i11 = this.f9244d.f9071a;
        if (i11 != 0) {
            View findViewById = activity.findViewById(i11);
            int i12 = this.f9244d.f9096b;
            if (i12 != 0) {
                findViewById.setBackgroundColor(i12);
            }
        }
        int i13 = this.f9244d.f9097c;
        if (i13 != 0) {
            ImageView imageView = (ImageView) activity.findViewById(i13);
            int i14 = this.f9244d.f9098d;
            if (i14 != 0) {
                imageView.setImageResource(i14);
            }
        }
        int i15 = this.f9244d.f9099e;
        if (i15 != 0) {
            TextView textView = (TextView) activity.findViewById(i15);
            if (!TextUtils.isEmpty(this.f9244d.f9100f)) {
                textView.setText(this.f9244d.f9100f);
            }
            int i16 = this.f9244d.f9101g;
            if (i16 != 0) {
                textView.setTextColor(i16);
            }
            int i17 = this.f9244d.f9102h;
            if (i17 != 0) {
                textView.setTextSize(i17);
            }
        }
        int i18 = this.f9244d.f9103i;
        if (i18 != 0) {
            ImageView imageView2 = (ImageView) activity.findViewById(i18);
            if (this.f9244d.f9107m) {
                imageView2.setVisibility(8);
            }
            int i19 = this.f9244d.f9104j;
            if (i19 != 0) {
                imageView2.setImageResource(i19);
            }
            AuthViewConfig authViewConfig = this.f9244d;
            if (authViewConfig.f9105k != 0 && authViewConfig.f9106l != 0) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                AuthViewConfig authViewConfig2 = this.f9244d;
                layoutParams.width = authViewConfig2.f9105k;
                layoutParams.height = authViewConfig2.f9106l;
                imageView2.setLayoutParams(layoutParams);
            }
            if (this.f9244d.f9108n != 0) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                layoutParams2.topMargin = this.f9244d.f9108n;
                imageView2.setLayoutParams(layoutParams2);
            }
        }
        int i21 = this.f9244d.f9109o;
        if (i21 != 0) {
            TextView textView2 = (TextView) activity.findViewById(i21);
            int i22 = this.f9244d.f9110p;
            if (i22 != 0) {
                textView2.setTextColor(i22);
            }
            int i23 = this.f9244d.f9111q;
            if (i23 != 0) {
                textView2.setTextSize(i23);
            }
            if (this.f9244d.f9112r != 0) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams3.topMargin = this.f9244d.f9112r;
                textView2.setLayoutParams(layoutParams3);
            }
        }
        int i24 = this.f9244d.f9113s;
        if (i24 != 0) {
            TextView textView3 = (TextView) activity.findViewById(i24);
            if (this.f9244d.f9114t != 0) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) textView3.getLayoutParams();
                layoutParams4.topMargin = this.f9244d.f9114t;
                textView3.setLayoutParams(layoutParams4);
            }
        }
        int i25 = this.f9244d.f9115u;
        if (i25 != 0) {
            View findViewById2 = activity.findViewById(i25);
            int i26 = this.f9244d.f9116v;
            if (i26 != 0) {
                findViewById2.setBackgroundColor(i26);
            }
            int i27 = this.f9244d.f9117w;
            if (i27 != 0) {
                findViewById2.setBackgroundResource(i27);
            }
            AuthViewConfig authViewConfig3 = this.f9244d;
            if (authViewConfig3.f9118x != 0 && authViewConfig3.f9119y != 0) {
                ViewGroup.LayoutParams layoutParams5 = findViewById2.getLayoutParams();
                AuthViewConfig authViewConfig4 = this.f9244d;
                layoutParams5.width = authViewConfig4.f9118x;
                layoutParams5.height = authViewConfig4.f9119y;
                findViewById2.setLayoutParams(layoutParams5);
            }
            if (this.f9244d.f9120z != 0) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
                layoutParams6.topMargin = this.f9244d.f9120z;
                findViewById2.setLayoutParams(layoutParams6);
            }
        }
        int i28 = this.f9244d.A;
        if (i28 != 0) {
            TextView textView4 = (TextView) activity.findViewById(i28);
            if (!TextUtils.isEmpty(this.f9244d.B)) {
                textView4.setText(this.f9244d.B);
            }
            int i29 = this.f9244d.C;
            if (i29 != 0) {
                textView4.setTextColor(i29);
            }
            int i31 = this.f9244d.D;
            if (i31 != 0) {
                textView4.setTextSize(i31);
            }
        }
        int i32 = this.f9244d.E;
        if (i32 != 0) {
            ImageView imageView3 = (ImageView) activity.findViewById(i32);
            int i33 = this.f9244d.F;
            if (i33 != 0) {
                imageView3.setImageResource(i33);
            }
        }
        int i34 = this.f9244d.G;
        if (i34 != 0) {
            TextView textView5 = (TextView) activity.findViewById(i34);
            if (this.f9244d.H != 0) {
                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) textView5.getLayoutParams();
                layoutParams7.topMargin = this.f9244d.H;
                textView5.setLayoutParams(layoutParams7);
            }
            if (!TextUtils.isEmpty(this.f9244d.I)) {
                textView5.setText(this.f9244d.I);
            }
            int i35 = this.f9244d.J;
            if (i35 != 0) {
                textView5.setTextColor(i35);
            }
            int i36 = this.f9244d.K;
            if (i36 != 0) {
                textView5.setTextSize(i36);
            }
            if (this.f9244d.L) {
                textView5.setVisibility(8);
            }
        }
        int i37 = this.f9244d.M;
        if (i37 != 0) {
            View findViewById3 = activity.findViewById(i37);
            if (this.f9244d.N != 0) {
                RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) findViewById3.getLayoutParams();
                layoutParams8.bottomMargin = this.f9244d.N;
                findViewById3.setLayoutParams(layoutParams8);
            }
        }
        int i38 = this.f9244d.O;
        if (i38 != 0) {
            CheckBox checkBox = (CheckBox) activity.findViewById(i38);
            int i39 = this.f9244d.P;
            if (i39 != 0) {
                checkBox.setButtonDrawable(i39);
            }
            if (this.f9244d.Q != 0) {
                checkBox.setChecked(false);
            }
        }
        AuthViewConfig authViewConfig5 = this.f9244d;
        if (authViewConfig5.R != 0) {
            if (authViewConfig5.f9075ad != null) {
                d(activity);
            } else {
                e(activity);
            }
        }
    }

    private void d(Activity activity) {
        TextView textView = (TextView) activity.findViewById(this.f9244d.R);
        PrivacyAgreementConfig privacyAgreementConfig = this.f9244d.f9075ad;
        String str = privacyAgreementConfig.privacyText;
        int i11 = privacyAgreementConfig.privacyTextColor;
        int i12 = privacyAgreementConfig.privacyTextSize;
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        }
        if (i11 != 0) {
            textView.setTextColor(i11);
        }
        if (i12 != 0) {
            textView.setTextSize(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a11 = this.f9242b.a(this.f9244d.f9075ad);
        String b11 = this.f9242b.b(this.f9244d.f9075ad);
        String str2 = this.f9244d.f9075ad.customAgreementTitle;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!TextUtils.isEmpty(a11) && str.contains("$OAT")) {
            if (TextUtils.isEmpty(str2) || !str.contains("$CAT")) {
                int indexOf = str.indexOf("$OAT");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a11);
                spannableStringBuilder2.setSpan(new c(this.f9241a, b11, "", this.f9244d.f9075ad.operatorAgreementTitleColor, null), 0, a11.length(), 33);
                spannableStringBuilder.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder2);
            } else {
                int indexOf2 = str.indexOf("$OAT");
                int indexOf3 = str.indexOf("$CAT");
                if (indexOf2 < indexOf3) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(a11);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str2);
                    spannableStringBuilder3.setSpan(new c(this.f9241a, b11, "", this.f9244d.f9075ad.operatorAgreementTitleColor, null), 0, a11.length(), 33);
                    String replace = str2.replace("《", "").replace("》", "");
                    Context context = this.f9241a;
                    PrivacyAgreementConfig privacyAgreementConfig2 = this.f9244d.f9075ad;
                    spannableStringBuilder4.setSpan(new c(context, privacyAgreementConfig2.customAgreementLink, replace, privacyAgreementConfig2.customAgreementTitleColor, null), 0, str2.length(), 33);
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 4, (CharSequence) spannableStringBuilder3);
                    int length = indexOf3 + a11.length();
                    spannableStringBuilder.replace(length - 4, length, (CharSequence) spannableStringBuilder4);
                } else {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(a11);
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(str2);
                    spannableStringBuilder5.setSpan(new c(this.f9241a, b11, "", this.f9244d.f9075ad.operatorAgreementTitleColor, null), 0, a11.length(), 33);
                    String replace2 = str2.replace("《", "").replace("》", "");
                    Context context2 = this.f9241a;
                    PrivacyAgreementConfig privacyAgreementConfig3 = this.f9244d.f9075ad;
                    spannableStringBuilder6.setSpan(new c(context2, privacyAgreementConfig3.customAgreementLink, replace2, privacyAgreementConfig3.customAgreementTitleColor, null), 0, str2.length(), 33);
                    spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) spannableStringBuilder6);
                    int length2 = indexOf2 + str2.length();
                    spannableStringBuilder.replace(length2 - 4, length2, (CharSequence) spannableStringBuilder5);
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(activity.getResources().getColor(R.color.transparent));
    }

    private void e(Activity activity) {
        TextView textView = (TextView) activity.findViewById(this.f9244d.R);
        if (!TextUtils.isEmpty(this.f9244d.S)) {
            textView.setText(this.f9244d.S);
        }
        int i11 = this.f9244d.T;
        if (i11 != 0) {
            textView.setTextColor(i11);
        }
        int i12 = this.f9244d.U;
        if (i12 != 0) {
            textView.setTextSize(i12);
        }
        if (TextUtils.isEmpty(this.f9244d.S)) {
            return;
        }
        AuthViewConfig authViewConfig = this.f9244d;
        if (authViewConfig.W == 0 && authViewConfig.Z == 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9244d.S);
        AuthViewConfig authViewConfig2 = this.f9244d;
        int i13 = authViewConfig2.W;
        if (i13 != 0 && authViewConfig2.V < i13) {
            c cVar = new c(this.f9241a, this.f9242b.b(null), "", this.f9244d.X, null);
            AuthViewConfig authViewConfig3 = this.f9244d;
            spannableStringBuilder.setSpan(cVar, authViewConfig3.V, authViewConfig3.W, 33);
        }
        AuthViewConfig authViewConfig4 = this.f9244d;
        int i14 = authViewConfig4.Z;
        if (i14 != 0 && authViewConfig4.Y < i14) {
            Context context = this.f9241a;
            AuthViewConfig authViewConfig5 = this.f9244d;
            c cVar2 = new c(context, authViewConfig5.f9073ab, authViewConfig5.f9074ac, authViewConfig5.f9072aa, null);
            AuthViewConfig authViewConfig6 = this.f9244d;
            spannableStringBuilder.setSpan(cVar2, authViewConfig6.Y, authViewConfig6.Z, 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(activity.getResources().getColor(R.color.transparent));
    }

    public void b() {
        if (d.a().b() == null) {
            return;
        }
        final a aVar = new a(this.f9241a, cn.com.chinatelecom.account.sdk.R.style.CtAuthDialog);
        aVar.a(new a.InterfaceC0151a() { // from class: cn.com.chinatelecom.account.sdk.ui.b.1
            @Override // cn.com.chinatelecom.account.sdk.ui.a.InterfaceC0151a
            public void a() {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
                b.this.h();
            }
        });
    }

    private void b(Activity activity) {
        if (this.f9243c.s() != 0 && this.f9243c.x() != null) {
            View findViewById = activity.findViewById(this.f9243c.s());
            this.f9255o = findViewById;
            findViewById.setOnClickListener(this.f9243c.x());
        }
        if (this.f9243c.t() != 0 && this.f9243c.y() != null) {
            View findViewById2 = activity.findViewById(this.f9243c.t());
            this.f9256p = findViewById2;
            findViewById2.setOnClickListener(this.f9243c.y());
        }
        if (this.f9243c.u() != 0 && this.f9243c.z() != null) {
            View findViewById3 = activity.findViewById(this.f9243c.u());
            this.f9257q = findViewById3;
            findViewById3.setOnClickListener(this.f9243c.z());
        }
        if (this.f9243c.v() != 0 && this.f9243c.A() != null) {
            View findViewById4 = activity.findViewById(this.f9243c.v());
            this.f9258r = findViewById4;
            findViewById4.setOnClickListener(this.f9243c.A());
        }
        if (this.f9243c.w() == 0 || this.f9243c.B() == null) {
            return;
        }
        View findViewById5 = activity.findViewById(this.f9243c.w());
        this.f9259s = findViewById5;
        findViewById5.setOnClickListener(this.f9243c.B());
    }

    private void a(String str, String str2) {
        Intent intent = new Intent(this.f9241a, (Class<?>) PrivacyWebviewActivity.class);
        intent.putExtra("privacyProtocolUrl", str);
        intent.putExtra("privacyProtocolTitle", str2);
        this.f9241a.startActivity(intent);
    }
}
