package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class s3 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f21648i = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a4 f21649a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<q3> f21650b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<q3> f21651c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<r3> f21652d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final y3 f21653e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Object f21654f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final Object f21655g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final w5 f21656h;

    public s3(@m80.k a4 winningModel, @m80.k List<q3> leftAd, @m80.k List<q3> rightAd, @m80.k List<r3> collapsedAd, @m80.k y3 msgModel, @m80.l Object obj, @m80.l Object obj2, @m80.k w5 wordsPlanStatus) {
        kotlin.jvm.internal.g0.p(winningModel, "winningModel");
        kotlin.jvm.internal.g0.p(leftAd, "leftAd");
        kotlin.jvm.internal.g0.p(rightAd, "rightAd");
        kotlin.jvm.internal.g0.p(collapsedAd, "collapsedAd");
        kotlin.jvm.internal.g0.p(msgModel, "msgModel");
        kotlin.jvm.internal.g0.p(wordsPlanStatus, "wordsPlanStatus");
        this.f21649a = winningModel;
        this.f21650b = leftAd;
        this.f21651c = rightAd;
        this.f21652d = collapsedAd;
        this.f21653e = msgModel;
        this.f21654f = obj;
        this.f21655g = obj2;
        this.f21656h = wordsPlanStatus;
    }

    public static /* synthetic */ s3 j(s3 s3Var, a4 a4Var, List list, List list2, List list3, y3 y3Var, Object obj, Object obj2, w5 w5Var, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            a4Var = s3Var.f21649a;
        }
        if ((i11 & 2) != 0) {
            list = s3Var.f21650b;
        }
        if ((i11 & 4) != 0) {
            list2 = s3Var.f21651c;
        }
        if ((i11 & 8) != 0) {
            list3 = s3Var.f21652d;
        }
        if ((i11 & 16) != 0) {
            y3Var = s3Var.f21653e;
        }
        if ((i11 & 32) != 0) {
            obj = s3Var.f21654f;
        }
        if ((i11 & 64) != 0) {
            obj2 = s3Var.f21655g;
        }
        if ((i11 & 128) != 0) {
            w5Var = s3Var.f21656h;
        }
        Object obj4 = obj2;
        w5 w5Var2 = w5Var;
        y3 y3Var2 = y3Var;
        Object obj5 = obj;
        return s3Var.i(a4Var, list, list2, list3, y3Var2, obj5, obj4, w5Var2);
    }

    @m80.k
    public final a4 a() {
        return this.f21649a;
    }

    @m80.k
    public final List<q3> b() {
        return this.f21650b;
    }

    @m80.k
    public final List<q3> c() {
        return this.f21651c;
    }

    @m80.k
    public final List<r3> d() {
        return this.f21652d;
    }

    @m80.k
    public final y3 e() {
        return this.f21653e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return kotlin.jvm.internal.g0.g(this.f21649a, s3Var.f21649a) && kotlin.jvm.internal.g0.g(this.f21650b, s3Var.f21650b) && kotlin.jvm.internal.g0.g(this.f21651c, s3Var.f21651c) && kotlin.jvm.internal.g0.g(this.f21652d, s3Var.f21652d) && kotlin.jvm.internal.g0.g(this.f21653e, s3Var.f21653e) && kotlin.jvm.internal.g0.g(this.f21654f, s3Var.f21654f) && kotlin.jvm.internal.g0.g(this.f21655g, s3Var.f21655g) && kotlin.jvm.internal.g0.g(this.f21656h, s3Var.f21656h);
    }

    @m80.l
    public final Object f() {
        return this.f21654f;
    }

    @m80.l
    public final Object g() {
        return this.f21655g;
    }

    @m80.k
    public final w5 h() {
        return this.f21656h;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f21649a.hashCode() * 31) + this.f21650b.hashCode()) * 31) + this.f21651c.hashCode()) * 31) + this.f21652d.hashCode()) * 31) + this.f21653e.hashCode()) * 31;
        Object obj = this.f21654f;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f21655g;
        return ((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f21656h.hashCode();
    }

    @m80.k
    public final s3 i(@m80.k a4 winningModel, @m80.k List<q3> leftAd, @m80.k List<q3> rightAd, @m80.k List<r3> collapsedAd, @m80.k y3 msgModel, @m80.l Object obj, @m80.l Object obj2, @m80.k w5 wordsPlanStatus) {
        kotlin.jvm.internal.g0.p(winningModel, "winningModel");
        kotlin.jvm.internal.g0.p(leftAd, "leftAd");
        kotlin.jvm.internal.g0.p(rightAd, "rightAd");
        kotlin.jvm.internal.g0.p(collapsedAd, "collapsedAd");
        kotlin.jvm.internal.g0.p(msgModel, "msgModel");
        kotlin.jvm.internal.g0.p(wordsPlanStatus, "wordsPlanStatus");
        return new s3(winningModel, leftAd, rightAd, collapsedAd, msgModel, obj, obj2, wordsPlanStatus);
    }

    @m80.l
    public final Object k() {
        return this.f21655g;
    }

    @m80.k
    public final List<r3> l() {
        return this.f21652d;
    }

    @m80.k
    public final List<q3> m() {
        return this.f21650b;
    }

    @m80.k
    public final y3 n() {
        return this.f21653e;
    }

    @m80.l
    public final Object o() {
        return this.f21654f;
    }

    @m80.k
    public final List<q3> p() {
        return this.f21651c;
    }

    @m80.k
    public final a4 q() {
        return this.f21649a;
    }

    @m80.k
    public final w5 r() {
        return this.f21656h;
    }

    @m80.k
    public String toString() {
        return "HomeModel(winningModel=" + this.f21649a + ", leftAd=" + this.f21650b + ", rightAd=" + this.f21651c + ", collapsedAd=" + this.f21652d + ", msgModel=" + this.f21653e + ", player=" + this.f21654f + ", background=" + this.f21655g + ", wordsPlanStatus=" + this.f21656h + pn.j.f81007d;
    }
}
