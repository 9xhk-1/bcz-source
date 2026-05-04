package jg;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.baicizhan.client.business.util.KotlinExtKt;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f64077a = 44;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f64078b = "review_recall_guide_flag";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f64079c = "home_word_book_guide_flag";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f64080d = "daka_v2_new_guide_flag";

    @k
    public static final c a(@k Context context, int i11, int i12) {
        g0.p(context, "context");
        View inflate = LayoutInflater.from(context).inflate(i11, (ViewGroup) null, false);
        g0.m(inflate);
        View findViewById = inflate.findViewById(i12);
        g0.o(findViewById, "findViewById(...)");
        return new c(inflate, findViewById);
    }

    @k
    public static final c b(@k View guideView, @k View nextBtn) {
        g0.p(guideView, "guideView");
        g0.p(nextBtn, "nextBtn");
        return new c(guideView, nextBtn);
    }

    @k
    public static final c c(@k Activity activity, int i11, int i12, int i13, @k int... topIds) {
        g0.p(activity, "activity");
        g0.p(topIds, "topIds");
        View inflate = LayoutInflater.from(activity).inflate(i11, (ViewGroup) null, false);
        for (int i14 : topIds) {
            ViewGroup.LayoutParams layoutParams = inflate.findViewById(i14).getLayoutParams();
            g0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (zb.a.k(activity) - KotlinExtKt.getDpPixels(44)) + i13;
        }
        g0.m(inflate);
        View findViewById = inflate.findViewById(i12);
        g0.o(findViewById, "findViewById(...)");
        return new c(inflate, findViewById);
    }

    @k
    public static final c d(@k Activity activity, int i11, int i12, @k int... topIds) {
        g0.p(activity, "activity");
        g0.p(topIds, "topIds");
        View inflate = LayoutInflater.from(activity).inflate(i11, (ViewGroup) null, false);
        for (int i13 : topIds) {
            ViewGroup.LayoutParams layoutParams = inflate.findViewById(i13).getLayoutParams();
            g0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += zb.a.k(activity) - KotlinExtKt.getDpPixels(44);
        }
        g0.m(inflate);
        View findViewById = inflate.findViewById(i12);
        g0.o(findViewById, "findViewById(...)");
        return new c(inflate, findViewById);
    }

    public static final boolean e(@k String str) {
        g0.p(str, "<this>");
        return !i9.f.c(pb.a.a(), str);
    }

    public static final void f(@k String str) {
        g0.p(str, "<this>");
        i9.f.j(pb.a.a(), str, false);
    }

    public static final void g(@k String str) {
        g0.p(str, "<this>");
        i9.f.j(pb.a.a(), str, true);
    }
}
