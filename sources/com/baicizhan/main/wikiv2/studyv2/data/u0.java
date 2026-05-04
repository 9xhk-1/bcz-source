package com.baicizhan.main.wikiv2.studyv2.data;

import a00.l1;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Pair;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f26108b = "WikiReportManager";

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static EntryPage f26109c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public static EntryAction f26110d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public static WikiStyle f26111e;

    /* renamed from: f, reason: collision with root package name */
    public static int f26112f;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u0 f26107a = new u0();

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static String f26113g = "";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static String f26114h = "";

    /* renamed from: i, reason: collision with root package name */
    public static final int f26115i = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(u0 u0Var, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        u0Var.h(str, map);
    }

    public static /* synthetic */ void o(u0 u0Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        u0Var.n(str, str2);
    }

    @m80.k
    public final String a() {
        return f26114h;
    }

    @m80.k
    public final String b() {
        return f26113g;
    }

    public final int c() {
        return f26112f;
    }

    @m80.l
    public final EntryAction d() {
        return f26110d;
    }

    @m80.l
    public final EntryPage e() {
        return f26109c;
    }

    @m80.l
    public final WikiStyle f() {
        return f26111e;
    }

    @w00.k
    public final void g(@m80.k String eventId) {
        kotlin.jvm.internal.g0.p(eventId, "eventId");
        i(this, eventId, null, 2, null);
    }

    @w00.k
    public final void h(@m80.k String eventId, @m80.k Map<String, ? extends Object> extraMap) {
        String str;
        String style;
        kotlin.jvm.internal.g0.p(eventId, "eventId");
        kotlin.jvm.internal.g0.p(extraMap, "extraMap");
        EntryPage entryPage = f26109c;
        String str2 = "";
        if (entryPage == null || (str = entryPage.getPage()) == null) {
            str = "";
        }
        Pair a11 = h1.a(ma.b.f72920k1, str);
        WikiStyle wikiStyle = f26111e;
        if (wikiStyle != null && (style = wikiStyle.getStyle()) != null) {
            str2 = style;
        }
        Map j02 = l1.j0(a11, h1.a(ma.b.f72926m1, str2));
        j02.putAll(extraMap);
        ma.l.e("study-detail-common", eventId, j02);
        qb.c.b(f26108b, "eventId:" + eventId + ",extra:" + j02, new Object[0]);
    }

    public final void j() {
        f26114h = "";
        f26113g = "";
    }

    public final void k(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        f26114h = str;
    }

    public final void l(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        f26113g = str;
    }

    public final void m(int i11) {
        f26112f = i11;
    }

    public final void n(@m80.k String planType, @m80.k String strategy) {
        kotlin.jvm.internal.g0.p(planType, "planType");
        kotlin.jvm.internal.g0.p(strategy, "strategy");
        f26114h = planType;
        f26113g = strategy;
    }

    public final void p(@m80.l EntryAction entryAction) {
        f26110d = entryAction;
    }

    public final void q(@m80.l EntryPage entryPage) {
        f26109c = entryPage;
    }

    public final void r(@m80.l WikiStyle wikiStyle) {
        f26111e = wikiStyle;
    }
}
