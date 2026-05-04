package com.baicizhan.client.business.util;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDSLKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DSLKit.kt\ncom/baicizhan/client/business/util/DSLKitKt\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,92:1\n35#2:93\n*S KotlinDebug\n*F\n+ 1 DSLKit.kt\ncom/baicizhan/client/business/util/DSLKitKt\n*L\n62#1:93\n*E\n"})
/* loaded from: classes4.dex */
public final class DSLKitKt {
    public static final void highLightDsl(@m80.k TextView textView, @m80.k x00.l<? super SpannableWrapper, g2> action) {
        g0.p(textView, "<this>");
        g0.p(action, "action");
        SpannableWrapper spannableWrapper = new SpannableWrapper();
        action.invoke(spannableWrapper);
        SpannableString spannableString = new SpannableString(spannableWrapper.getContent());
        if (spannableWrapper.getEnd() <= spannableWrapper.getStart()) {
            spannableWrapper.setEnd(spannableWrapper.getContent().length());
        }
        final x00.l<View, g2> onClick = spannableWrapper.getOnClick();
        if (onClick != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            spannableString.setSpan(new ClickableSpan() { // from class: com.baicizhan.client.business.util.DSLKitKt$highLightDsl$1$1$1$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    g0.p(widget, "widget");
                    onClick.invoke(widget);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds2) {
                    g0.p(ds2, "ds");
                    super.updateDrawState(ds2);
                    ds2.setUnderlineText(false);
                }
            }, spannableWrapper.getStart(), spannableWrapper.getEnd(), 33);
        }
        if (spannableWrapper.getTextColor() != -1) {
            spannableString.setSpan(new ForegroundColorSpan(spannableWrapper.getTextColor()), spannableWrapper.getStart(), spannableWrapper.getEnd(), 33);
        }
        if (spannableWrapper.isBold()) {
            spannableString.setSpan(new StyleSpan(1), spannableWrapper.getStart(), spannableWrapper.getEnd(), 33);
        }
        if (spannableWrapper.getSizeDp() != -1) {
            spannableString.setSpan(new AbsoluteSizeSpan(spannableWrapper.getSizeDp(), true), spannableWrapper.getStart(), spannableWrapper.getEnd(), 33);
        }
        textView.setText(spannableString);
    }
}
