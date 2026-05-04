package cn.com.chinatelecom.account.sdk.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
public class c extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private String f9264a;

    /* renamed from: b, reason: collision with root package name */
    private String f9265b;

    /* renamed from: c, reason: collision with root package name */
    private String f9266c;

    /* renamed from: d, reason: collision with root package name */
    private int f9267d;

    /* renamed from: e, reason: collision with root package name */
    private Context f9268e;

    public c(Context context, String str, String str2, int i11, String str3) {
        this.f9268e = context;
        this.f9264a = str;
        this.f9265b = str2;
        this.f9267d = i11;
        this.f9266c = str3;
    }

    private void a(String str, String str2) {
        try {
            Intent intent = new Intent(this.f9268e, (Class<?>) PrivacyWebviewActivity.class);
            intent.putExtra("privacyProtocolUrl", str);
            intent.putExtra("privacyProtocolTitle", str2);
            this.f9268e.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        a(this.f9264a, this.f9265b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i11 = this.f9267d;
        if (i11 == 0) {
            if (!TextUtils.isEmpty(this.f9266c)) {
                i11 = Color.parseColor(this.f9266c);
            }
            textPaint.setUnderlineText(false);
        }
        textPaint.setColor(i11);
        textPaint.setUnderlineText(false);
    }
}
