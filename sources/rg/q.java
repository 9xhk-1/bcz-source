package rg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.baicizhan.client.business.util.Fonts;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.jiongji.andriod.card.R;
import g10.u;
import kotlin.jvm.internal.g0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q {
    public static final int a(@m80.k TextView textView) {
        g0.p(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0 || !k0.t3(text, WordPlanInfoView.f22926m, false, 2, null)) {
            text = null;
        }
        if (text == null) {
            return 0;
        }
        CharSequence text2 = textView.getText();
        g0.o(text2, "getText(...)");
        CharSequence text3 = textView.getText();
        g0.o(text3, "getText(...)");
        return Integer.parseInt(k0.G5(text2, u.W1(0, k0.J3(text3, WordPlanInfoView.f22926m, 0, false, 6, null))));
    }

    public static final int b(@m80.k TextView textView) {
        g0.p(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0 || !k0.t3(text, WordPlanInfoView.f22926m, false, 2, null)) {
            text = null;
        }
        if (text == null) {
            return 0;
        }
        CharSequence text2 = textView.getText();
        g0.o(text2, "getText(...)");
        CharSequence text3 = textView.getText();
        g0.o(text3, "getText(...)");
        return Integer.parseInt(k0.G5(text2, u.W1(0, k0.J3(text3, WordPlanInfoView.f22926m, 0, false, 6, null))));
    }

    @SuppressLint({"SetTextI18n"})
    public static final void c(@m80.k TextView textView, int i11) {
        g0.p(textView, "<this>");
        Context context = textView.getContext();
        g0.o(context, "getContext(...)");
        Typeface SafeFace = Fonts.SafeFace(context, R.font.din_black_italic);
        String str = i11 + WordPlanInfoView.f22926m;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new b(SafeFace), 0, str.length() - 2, 33);
        Context context2 = textView.getContext();
        g0.o(context2, "getContext(...)");
        spannableString.setSpan(new AbsoluteSizeSpan(com.baicizhan.base.a.a(context2) ? xb.f.a(textView.getContext(), com.baicizhan.base.d.g() * 16.0f) : xb.f.a(textView.getContext(), 16.0f)), str.length() - 2, str.length(), 33);
        Context context3 = textView.getContext();
        g0.o(context3, "getContext(...)");
        spannableString.setSpan(new c(context3, 16), str.length() - 2, str.length(), 33);
        textView.setText(spannableString);
    }

    @SuppressLint({"SetTextI18n"})
    public static final void d(@m80.k TextView textView, int i11) {
        g0.p(textView, "<this>");
        Context context = textView.getContext();
        g0.o(context, "getContext(...)");
        Fonts.SafeFace(context, R.font.din_black_italic);
        String str = i11 + WordPlanInfoView.f22926m;
        SpannableString spannableString = new SpannableString(str);
        Context context2 = textView.getContext();
        g0.o(context2, "getContext(...)");
        spannableString.setSpan(new AbsoluteSizeSpan(com.baicizhan.base.a.a(context2) ? xb.f.a(textView.getContext(), com.baicizhan.base.d.g() * 32.0f) : xb.f.a(textView.getContext(), 32.0f)), str.length() - 2, str.length(), 33);
        Context context3 = textView.getContext();
        g0.o(context3, "getContext(...)");
        spannableString.setSpan(new c(context3, 32), str.length() - 2, str.length(), 33);
        textView.setText(spannableString);
    }
}
