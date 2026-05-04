package com.baicizhan.client.business.util;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.google.android.material.tabs.TabLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class KotlinExtKt {

    @m80.k
    public static final String TAG = "KotlinExt";

    @m80.k
    private static final Context globalApplicationContext;

    static {
        Application a11 = pb.a.a();
        g0.o(a11, "getApp(...)");
        globalApplicationContext = a11;
    }

    public static final void addOnTabSelectedClosure(@m80.k TabLayout tabLayout, @m80.k x00.l<? super TabLayout.i, g2> onTabSelected, @m80.k x00.l<? super TabLayout.i, g2> onTabUnSelected, @m80.k x00.l<? super TabLayout.i, g2> onTabReselected) {
        g0.p(tabLayout, "<this>");
        g0.p(onTabSelected, "onTabSelected");
        g0.p(onTabUnSelected, "onTabUnSelected");
        g0.p(onTabReselected, "onTabReselected");
        tabLayout.h(new KotlinExtKt$addOnTabSelectedClosure$4(onTabSelected, onTabUnSelected, onTabReselected));
    }

    public static /* synthetic */ void addOnTabSelectedClosure$default(TabLayout tabLayout, x00.l onTabSelected, x00.l onTabUnSelected, x00.l onTabReselected, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            onTabSelected = new x00.l<TabLayout.i, g2>() { // from class: com.baicizhan.client.business.util.KotlinExtKt$addOnTabSelectedClosure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TabLayout.i iVar) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(TabLayout.i iVar) {
                    invoke2(iVar);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 2) != 0) {
            onTabUnSelected = new x00.l<TabLayout.i, g2>() { // from class: com.baicizhan.client.business.util.KotlinExtKt$addOnTabSelectedClosure$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TabLayout.i iVar) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(TabLayout.i iVar) {
                    invoke2(iVar);
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            onTabReselected = new x00.l<TabLayout.i, g2>() { // from class: com.baicizhan.client.business.util.KotlinExtKt$addOnTabSelectedClosure$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TabLayout.i iVar) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(TabLayout.i iVar) {
                    invoke2(iVar);
                    return g2.f100423a;
                }
            };
        }
        g0.p(tabLayout, "<this>");
        g0.p(onTabSelected, "onTabSelected");
        g0.p(onTabUnSelected, "onTabUnSelected");
        g0.p(onTabReselected, "onTabReselected");
        tabLayout.h(new KotlinExtKt$addOnTabSelectedClosure$4(onTabSelected, onTabUnSelected, onTabReselected));
    }

    @m80.l
    public static final <T1, T2, R> R allNotNullLet(@m80.l T1 t12, @m80.l T2 t22, @m80.k x00.p<? super T1, ? super T2, ? extends R> block) {
        g0.p(block, "block");
        if (t12 == null || t22 == null) {
            return null;
        }
        return block.invoke(t12, t22);
    }

    public static final void expandTouchArea(@m80.k View view, int i11, int i12, int i13, int i14) {
        g0.p(view, "<this>");
        UiUtils.expandTouchArea(view, i11, i12, i13, i14);
    }

    public static final int getColorInt(int i11) {
        return ContextCompat.getColor(globalApplicationContext, i11);
    }

    public static final int getDimenPx(int i11) {
        return globalApplicationContext.getResources().getDimensionPixelSize(i11);
    }

    public static final float getDpFloat(int i11) {
        return getDpPixels(i11);
    }

    public static final int getDpPixels(int i11) {
        return xb.i.a(globalApplicationContext, i11);
    }

    public static final int getDpValue(int i11) {
        return getDpPixels(i11);
    }

    @m80.l
    public static final Drawable getDrawable(int i11) {
        return ContextCompat.getDrawable(globalApplicationContext, i11);
    }

    @m80.k
    public static final Context getGlobalApplicationContext() {
        return globalApplicationContext;
    }

    public static final int getScreenHeight() {
        return xb.f.f(globalApplicationContext);
    }

    public static final int getScreenWidth() {
        return xb.f.i(globalApplicationContext);
    }

    public static final int getStatusBarHeight() {
        return xb.f.k(globalApplicationContext);
    }

    @m80.k
    public static final String getString(@StringRes int i11) {
        String string = globalApplicationContext.getResources().getString(i11);
        g0.o(string, "getString(...)");
        return string;
    }

    @m80.k
    public static final String getToStr(int i11) {
        String string = globalApplicationContext.getResources().getString(i11);
        g0.o(string, "getString(...)");
        return string;
    }

    public static final int getVisibleAreaPercent(@m80.k View view) {
        g0.p(view, "<this>");
        if (view.getVisibility() != 0) {
            return 0;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            return 0;
        }
        return (int) (((((r0.right - r0.left) * (r0.bottom - r0.top)) * 1.0f) / (view.getWidth() * view.getHeight())) * 100);
    }

    public static final boolean isKvFlagTrue(@m80.k String str) {
        g0.p(str, "<this>");
        return i9.f.c(globalApplicationContext, str);
    }

    @m80.l
    public static final <T, R> R letIfNotNullOrEmpty(@m80.l Collection<? extends T> collection, @m80.k x00.l<? super Collection<? extends T>, ? extends R> block) {
        g0.p(block, "block");
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return block.invoke(collection);
    }

    @m80.l
    public static final <T, R> R runIfNotNull(@m80.l T t11, @m80.k x00.l<? super T, ? extends R> block) {
        g0.p(block, "block");
        if (t11 != null) {
            return block.invoke(t11);
        }
        return null;
    }

    @m80.l
    public static final <T, R> R runIfNotNullOrEmpty(@m80.l List<? extends T> list, @m80.k x00.l<? super List<? extends T>, ? extends R> block) {
        g0.p(block, "block");
        if (list == null || list.size() <= 0) {
            return null;
        }
        return block.invoke(list);
    }

    @m80.l
    public static final <T, R> R runIfNull(@m80.l T t11, @m80.k x00.a<? extends R> block) {
        g0.p(block, "block");
        if (t11 == null) {
            return block.invoke();
        }
        return null;
    }

    public static final void setIsBold(@m80.k TextView textView, boolean z11) {
        g0.p(textView, "<this>");
        textView.setTypeface(Typeface.defaultFromStyle(z11 ? 1 : 0));
    }

    public static final void setKvFlagTrue(@m80.k String str, boolean z11) {
        g0.p(str, "<this>");
        i9.f.j(globalApplicationContext, str, z11);
    }

    public static final void setTextHighLightWithBold(@m80.k TextView textView, @m80.k String content, int i11, int i12) {
        g0.p(textView, "<this>");
        g0.p(content, "content");
        SpannableString spannableString = new SpannableString(content);
        spannableString.setSpan(new StyleSpan(1), i11, i12, 18);
        textView.setText(spannableString);
    }

    public static final void showToast(@m80.k String str) {
        g0.p(str, "<this>");
        va.g.i(str, 0);
    }

    public static final void start(@m80.k Context context, @m80.k Class<? extends AppCompatActivity> clazz) {
        g0.p(context, "<this>");
        g0.p(clazz, "clazz");
        context.startActivity(new Intent(context, clazz));
    }

    @m80.k
    public static final String subWith2Str(@m80.k String str, @m80.k String startStr, @m80.k String endStr) {
        g0.p(str, "<this>");
        g0.p(startStr, "startStr");
        g0.p(endStr, "endStr");
        int J3 = k0.J3(str, startStr, 0, false, 6, null) == -1 ? 0 : k0.J3(str, startStr, 0, false, 6, null) + startStr.length();
        String substring = str.substring(J3, str.length());
        g0.o(substring, "substring(...)");
        int length = k0.J3(substring, endStr, 0, false, 6, null) == -1 ? substring.length() : k0.J3(substring, endStr, 0, false, 6, null);
        qb.c.i(TAG, "start is " + J3 + ", tempStr is " + substring + ", end is " + length, new Object[0]);
        String substring2 = substring.substring(0, length);
        g0.o(substring2, "substring(...)");
        return substring2;
    }

    public static final void expandTouchArea(@m80.k View view, int i11) {
        g0.p(view, "<this>");
        expandTouchArea(view, i11, i11, i11, i11);
    }

    @m80.k
    public static final String getString(@StringRes int i11, @m80.k Object... formatArgs) {
        g0.p(formatArgs, "formatArgs");
        String string = globalApplicationContext.getResources().getString(i11, Arrays.copyOf(formatArgs, formatArgs.length));
        g0.o(string, "getString(...)");
        return string;
    }

    public static final void showToast(@m80.l Throwable th2) {
        va.g.j(th2, 0);
    }
}
