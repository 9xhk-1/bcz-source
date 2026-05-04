package com.baicizhan.main.customview;

import android.content.Context;
import android.util.AttributeSet;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ClozeTextView extends HighlightTextView {

    /* renamed from: d, reason: collision with root package name */
    public static String f19998d = "ClozeTextView";

    public ClozeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CharSequence getAnswer() {
        return getHighlightText().toString().replaceAll("[\\[\\]]|·", "");
    }

    @Override // com.baicizhan.main.customview.HighlightTextView
    public CharSequence getHighlightText() {
        CharSequence highlightText = super.getHighlightText();
        return highlightText == null ? "" : highlightText;
    }

    public void i() {
        setHighlightText(getHighlightText().toString().replaceAll("\\[[^\\]]*\\]", "__"));
    }

    public void j(CharSequence text) {
        setHighlightText(getHighlightText().toString().replaceFirst("\\[" + ((Object) text) + "\\]+", "__"));
    }

    public CharSequence k() {
        Matcher matcher = Pattern.compile("\\][^\\[]*\\[").matcher(new StringBuffer(getHighlightText()).reverse().toString());
        if (!matcher.find()) {
            return null;
        }
        String substring = matcher.group(0).substring(1, matcher.group(0).length() - 1);
        setHighlightText(new StringBuffer(matcher.replaceFirst("__")).reverse().toString());
        return new StringBuffer(substring).reverse();
    }

    public void l(CharSequence ans) {
        setHighlightText(getHighlightText().toString().replaceFirst("__", "[" + ((Object) ans) + "]"));
    }

    public void setProblem(CharSequence text) {
        setHighlightText(text.toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "·").replaceAll("\\[[^\\]]*\\]", "__"));
    }
}
