package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26126d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f26127a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f26128b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f26129c;

    public x(@m80.k String meanType, @m80.k String mean, @m80.l String str) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        this.f26127a = meanType;
        this.f26128b = mean;
        this.f26129c = str;
    }

    public static /* synthetic */ x e(x xVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = xVar.f26127a;
        }
        if ((i11 & 2) != 0) {
            str2 = xVar.f26128b;
        }
        if ((i11 & 4) != 0) {
            str3 = xVar.f26129c;
        }
        return xVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f26127a;
    }

    @m80.k
    public final String b() {
        return this.f26128b;
    }

    @m80.l
    public final String c() {
        return this.f26129c;
    }

    @m80.k
    public final x d(@m80.k String meanType, @m80.k String mean, @m80.l String str) {
        kotlin.jvm.internal.g0.p(meanType, "meanType");
        kotlin.jvm.internal.g0.p(mean, "mean");
        return new x(meanType, mean, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.g0.g(this.f26127a, xVar.f26127a) && kotlin.jvm.internal.g0.g(this.f26128b, xVar.f26128b) && kotlin.jvm.internal.g0.g(this.f26129c, xVar.f26129c);
    }

    @m80.k
    public final String f() {
        return this.f26128b;
    }

    @m80.k
    public final String g() {
        return this.f26127a;
    }

    @m80.l
    public final String h() {
        return this.f26129c;
    }

    public int hashCode() {
        int hashCode = ((this.f26127a.hashCode() * 31) + this.f26128b.hashCode()) * 31;
        String str = this.f26129c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "ExamMean(meanType=" + this.f26127a + ", mean=" + this.f26128b + ", percent=" + this.f26129c + pn.j.f81007d;
    }
}
