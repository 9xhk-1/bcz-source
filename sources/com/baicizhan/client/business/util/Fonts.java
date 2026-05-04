package com.baicizhan.client.business.util;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.annotation.FontRes;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "Fonts")
@u0({"SMAP\nFontUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontUtils.kt\ncom/baicizhan/client/business/util/Fonts\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,40:1\n13805#2,2:41\n*S KotlinDebug\n*F\n+ 1 FontUtils.kt\ncom/baicizhan/client/business/util/Fonts\n*L\n36#1:41,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Fonts {

    @m80.k
    private static final String TAG_FONT = "FontUtils";

    @m80.l
    public static final Typeface SafeFace(@m80.k Context context, @FontRes int i11) {
        g0.p(context, "context");
        try {
            return ResourcesCompat.getFont(context, i11);
        } catch (Exception e11) {
            qb.c.c("FontUtils", "safe face ", e11);
            return null;
        }
    }

    public static final void setSafeFace(@m80.k TextView textView, @FontRes int i11) {
        g0.p(textView, "<this>");
        Context context = textView.getContext();
        g0.o(context, "getContext(...)");
        textView.setTypeface(SafeFace(context, i11));
    }

    public static final void setSafeFace(@FontRes int i11, @m80.k TextView... views) {
        g0.p(views, "views");
        if (views.length == 0) {
            return;
        }
        Context context = views[0].getContext();
        g0.o(context, "getContext(...)");
        Typeface SafeFace = SafeFace(context, i11);
        if (SafeFace != null) {
            for (TextView textView : views) {
                textView.setTypeface(SafeFace);
            }
        }
    }
}
