package cn.com.chinatelecom.account.sdk.ui;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import cn.com.chinatelecom.account.sdk.AuthPageConfig;
import cn.com.chinatelecom.account.sdk.AuthViewConfig;
import cn.com.chinatelecom.account.sdk.PrivacyAgreementConfig;
import cn.com.chinatelecom.account.sdk.a.d;

/* loaded from: classes3.dex */
public class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0151a f9232a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9233b;

    /* renamed from: c, reason: collision with root package name */
    private AuthPageConfig f9234c;

    /* renamed from: d, reason: collision with root package name */
    private AuthViewConfig f9235d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f9236e;

    /* renamed from: f, reason: collision with root package name */
    private View f9237f;

    /* renamed from: g, reason: collision with root package name */
    private View f9238g;

    /* renamed from: cn.com.chinatelecom.account.sdk.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0151a {
        void a();
    }

    public a(Context context, int i11) {
        super(context, i11);
        this.f9233b = context;
    }

    private void b() {
        try {
            CharSequence text = this.f9236e.getText();
            if (text.length() >= 18) {
                String str = (String) this.f9236e.getTag();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                spannableStringBuilder.setSpan(new c(this.f9233b, cn.com.chinatelecom.account.sdk.a.a.a().b(null), "", 0, str), 5, 18, 33);
                this.f9236e.setText(spannableStringBuilder);
                this.f9236e.setMovementMethod(LinkMovementMethod.getInstance());
                this.f9236e.setHighlightColor(this.f9233b.getResources().getColor(R.color.transparent));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void c() {
        int i11 = this.f9235d.f9076ae;
        if (i11 != 0) {
            findViewById(i11).setBackgroundResource(this.f9235d.f9077af);
            int i12 = this.f9235d.f9078ag;
            if (i12 != 0) {
                View view = this.f9237f;
                if ((view instanceof TextView) && (this.f9238g instanceof TextView)) {
                    ((TextView) view).setTextColor(i12);
                    ((TextView) this.f9238g).setTextColor(this.f9235d.f9078ag);
                }
            }
            int i13 = this.f9235d.f9079ah;
            if (i13 != 0) {
                View view2 = this.f9237f;
                if ((view2 instanceof TextView) && (this.f9238g instanceof TextView)) {
                    ((TextView) view2).setTextSize(i13);
                    ((TextView) this.f9238g).setTextSize(this.f9235d.f9079ah);
                }
            }
        }
        AuthViewConfig authViewConfig = this.f9235d;
        if (authViewConfig.f9080ai != 0) {
            if (authViewConfig.f9075ad != null) {
                d();
            } else {
                e();
            }
        }
    }

    private void d() {
        TextView textView = (TextView) findViewById(this.f9235d.f9080ai);
        PrivacyAgreementConfig privacyAgreementConfig = this.f9235d.f9075ad;
        String str = privacyAgreementConfig.dialogPrivacyText;
        int i11 = privacyAgreementConfig.dialogPrivacyTextColor;
        int i12 = privacyAgreementConfig.dialogPrivacyTextSize;
        if (i11 != 0) {
            textView.setTextColor(i11);
        }
        if (i12 != 0) {
            textView.setTextSize(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a11 = cn.com.chinatelecom.account.sdk.a.a.a().a(this.f9235d.f9075ad);
        String b11 = cn.com.chinatelecom.account.sdk.a.a.a().b(this.f9235d.f9075ad);
        String str2 = this.f9235d.f9075ad.customAgreementTitle;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!TextUtils.isEmpty(a11) && str.contains("$OAT")) {
            if (TextUtils.isEmpty(str2) || !str.contains("$CAT")) {
                int indexOf = str.indexOf("$OAT");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a11);
                spannableStringBuilder2.setSpan(new c(this.f9233b, b11, "", this.f9235d.f9075ad.dialogOperatorAgreementTitleColor, null), 0, a11.length(), 33);
                spannableStringBuilder.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder2);
            } else {
                int indexOf2 = str.indexOf("$OAT");
                int indexOf3 = str.indexOf("$CAT");
                if (indexOf2 < indexOf3) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(a11);
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(str2);
                    spannableStringBuilder3.setSpan(new c(this.f9233b, b11, "", this.f9235d.f9075ad.dialogOperatorAgreementTitleColor, null), 0, a11.length(), 33);
                    String replace = str2.replace("《", "").replace("》", "");
                    Context context = this.f9233b;
                    PrivacyAgreementConfig privacyAgreementConfig2 = this.f9235d.f9075ad;
                    spannableStringBuilder4.setSpan(new c(context, privacyAgreementConfig2.customAgreementLink, replace, privacyAgreementConfig2.dialogCustomAgreementTitleColor, null), 0, str2.length(), 33);
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 4, (CharSequence) spannableStringBuilder3);
                    int length = indexOf3 + a11.length();
                    spannableStringBuilder.replace(length - 4, length, (CharSequence) spannableStringBuilder4);
                } else {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(a11);
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(str2);
                    spannableStringBuilder5.setSpan(new c(this.f9233b, b11, "", this.f9235d.f9075ad.dialogOperatorAgreementTitleColor, null), 0, a11.length(), 33);
                    String replace2 = str2.replace("《", "").replace("》", "");
                    Context context2 = this.f9233b;
                    PrivacyAgreementConfig privacyAgreementConfig3 = this.f9235d.f9075ad;
                    spannableStringBuilder6.setSpan(new c(context2, privacyAgreementConfig3.customAgreementLink, replace2, privacyAgreementConfig3.dialogCustomAgreementTitleColor, null), 0, str2.length(), 33);
                    spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) spannableStringBuilder6);
                    int length2 = indexOf2 + str2.length();
                    spannableStringBuilder.replace(length2 - 4, length2, (CharSequence) spannableStringBuilder5);
                }
            }
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(this.f9233b.getResources().getColor(R.color.transparent));
    }

    private void e() {
        TextView textView = (TextView) findViewById(this.f9235d.f9080ai);
        if (!TextUtils.isEmpty(this.f9235d.f9081aj)) {
            textView.setText(this.f9235d.f9081aj);
        }
        int i11 = this.f9235d.f9082ak;
        if (i11 != 0) {
            textView.setTextColor(i11);
        }
        int i12 = this.f9235d.f9083al;
        if (i12 != 0) {
            textView.setTextSize(i12);
        }
        if (TextUtils.isEmpty(this.f9235d.f9081aj)) {
            return;
        }
        AuthViewConfig authViewConfig = this.f9235d;
        if (authViewConfig.f9085an == 0 && authViewConfig.f9088aq == 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9235d.f9081aj);
        AuthViewConfig authViewConfig2 = this.f9235d;
        int i13 = authViewConfig2.f9085an;
        if (i13 != 0 && authViewConfig2.f9084am < i13) {
            c cVar = new c(this.f9233b, cn.com.chinatelecom.account.sdk.a.a.a().b(null), "", this.f9235d.f9086ao, "");
            AuthViewConfig authViewConfig3 = this.f9235d;
            spannableStringBuilder.setSpan(cVar, authViewConfig3.f9084am, authViewConfig3.f9085an, 33);
        }
        AuthViewConfig authViewConfig4 = this.f9235d;
        int i14 = authViewConfig4.f9088aq;
        if (i14 != 0 && authViewConfig4.f9087ap < i14) {
            Context context = this.f9233b;
            AuthViewConfig authViewConfig5 = this.f9235d;
            c cVar2 = new c(context, authViewConfig5.f9090as, authViewConfig5.f9091at, authViewConfig5.f9089ar, "");
            AuthViewConfig authViewConfig6 = this.f9235d;
            spannableStringBuilder.setSpan(cVar2, authViewConfig6.f9087ap, authViewConfig6.f9088aq, 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(this.f9233b.getResources().getColor(R.color.transparent));
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AuthPageConfig b11 = d.a().b();
        this.f9234c = b11;
        if (b11 == null) {
            dismiss();
            return;
        }
        this.f9235d = d.a().c();
        setContentView(this.f9234c.k());
        setCanceledOnTouchOutside(false);
        a();
        if (this.f9235d != null) {
            c();
        }
    }

    private void a() {
        this.f9236e = (TextView) findViewById(this.f9234c.l());
        this.f9237f = findViewById(this.f9234c.m());
        this.f9238g = findViewById(this.f9234c.n());
        AuthViewConfig authViewConfig = this.f9235d;
        if (authViewConfig == null || authViewConfig.f9080ai == 0) {
            b();
        }
        this.f9237f.setOnClickListener(new View.OnClickListener() { // from class: cn.com.chinatelecom.account.sdk.ui.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.dismiss();
            }
        });
        this.f9238g.setOnClickListener(new View.OnClickListener() { // from class: cn.com.chinatelecom.account.sdk.ui.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (a.this.f9232a != null) {
                    a.this.f9232a.a();
                }
            }
        });
    }

    public void a(InterfaceC0151a interfaceC0151a) {
        this.f9232a = interfaceC0151a;
        show();
    }
}
