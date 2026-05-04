package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class s4 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23987f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f23988a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f23989b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<String> f23990c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f23991d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f23992e;

    public s4(@m80.k String atlas, @m80.k String skeleton, @m80.k List<String> states, @m80.k String anchor, @m80.k String resourceId) {
        kotlin.jvm.internal.g0.p(atlas, "atlas");
        kotlin.jvm.internal.g0.p(skeleton, "skeleton");
        kotlin.jvm.internal.g0.p(states, "states");
        kotlin.jvm.internal.g0.p(anchor, "anchor");
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        this.f23988a = atlas;
        this.f23989b = skeleton;
        this.f23990c = states;
        this.f23991d = anchor;
        this.f23992e = resourceId;
    }

    public static /* synthetic */ s4 g(s4 s4Var, String str, String str2, List list, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = s4Var.f23988a;
        }
        if ((i11 & 2) != 0) {
            str2 = s4Var.f23989b;
        }
        if ((i11 & 4) != 0) {
            list = s4Var.f23990c;
        }
        if ((i11 & 8) != 0) {
            str3 = s4Var.f23991d;
        }
        if ((i11 & 16) != 0) {
            str4 = s4Var.f23992e;
        }
        String str5 = str4;
        List list2 = list;
        return s4Var.f(str, str2, list2, str3, str5);
    }

    @m80.k
    public final String a() {
        return this.f23988a;
    }

    @m80.k
    public final String b() {
        return this.f23989b;
    }

    @m80.k
    public final List<String> c() {
        return this.f23990c;
    }

    @m80.k
    public final String d() {
        return this.f23991d;
    }

    @m80.k
    public final String e() {
        return this.f23992e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return kotlin.jvm.internal.g0.g(this.f23988a, s4Var.f23988a) && kotlin.jvm.internal.g0.g(this.f23989b, s4Var.f23989b) && kotlin.jvm.internal.g0.g(this.f23990c, s4Var.f23990c) && kotlin.jvm.internal.g0.g(this.f23991d, s4Var.f23991d) && kotlin.jvm.internal.g0.g(this.f23992e, s4Var.f23992e);
    }

    @m80.k
    public final s4 f(@m80.k String atlas, @m80.k String skeleton, @m80.k List<String> states, @m80.k String anchor, @m80.k String resourceId) {
        kotlin.jvm.internal.g0.p(atlas, "atlas");
        kotlin.jvm.internal.g0.p(skeleton, "skeleton");
        kotlin.jvm.internal.g0.p(states, "states");
        kotlin.jvm.internal.g0.p(anchor, "anchor");
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        return new s4(atlas, skeleton, states, anchor, resourceId);
    }

    @m80.k
    public final String h() {
        return this.f23991d;
    }

    public int hashCode() {
        return (((((((this.f23988a.hashCode() * 31) + this.f23989b.hashCode()) * 31) + this.f23990c.hashCode()) * 31) + this.f23991d.hashCode()) * 31) + this.f23992e.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f23988a;
    }

    @m80.k
    public final String j() {
        return this.f23992e;
    }

    @m80.k
    public final String k() {
        return this.f23989b;
    }

    @m80.k
    public final List<String> l() {
        return this.f23990c;
    }

    @m80.k
    public String toString() {
        return "IslandAnimationInfo(atlas=" + this.f23988a + ", skeleton=" + this.f23989b + ", states=" + this.f23990c + ", anchor=" + this.f23991d + ", resourceId=" + this.f23992e + pn.j.f81007d;
    }

    public /* synthetic */ s4(String str, String str2, List list, String str3, String str4, int i11, kotlin.jvm.internal.v vVar) {
        this(str, str2, list, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4);
    }
}
