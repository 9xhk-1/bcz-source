package com.baicizhan.main.home.plan.newexam;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f22577e = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f22578a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LearnButtonType f22579b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a f22580c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f22581d;

    public b(@m80.k String text, @m80.k LearnButtonType type, @m80.k a action, @m80.k String reportData) {
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(action, "action");
        kotlin.jvm.internal.g0.p(reportData, "reportData");
        this.f22578a = text;
        this.f22579b = type;
        this.f22580c = action;
        this.f22581d = reportData;
    }

    public static /* synthetic */ b f(b bVar, String str, LearnButtonType learnButtonType, a aVar, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f22578a;
        }
        if ((i11 & 2) != 0) {
            learnButtonType = bVar.f22579b;
        }
        if ((i11 & 4) != 0) {
            aVar = bVar.f22580c;
        }
        if ((i11 & 8) != 0) {
            str2 = bVar.f22581d;
        }
        return bVar.e(str, learnButtonType, aVar, str2);
    }

    @m80.k
    public final String a() {
        return this.f22578a;
    }

    @m80.k
    public final LearnButtonType b() {
        return this.f22579b;
    }

    @m80.k
    public final a c() {
        return this.f22580c;
    }

    @m80.k
    public final String d() {
        return this.f22581d;
    }

    @m80.k
    public final b e(@m80.k String text, @m80.k LearnButtonType type, @m80.k a action, @m80.k String reportData) {
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(type, "type");
        kotlin.jvm.internal.g0.p(action, "action");
        kotlin.jvm.internal.g0.p(reportData, "reportData");
        return new b(text, type, action, reportData);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.g0.g(this.f22578a, bVar.f22578a) && this.f22579b == bVar.f22579b && kotlin.jvm.internal.g0.g(this.f22580c, bVar.f22580c) && kotlin.jvm.internal.g0.g(this.f22581d, bVar.f22581d);
    }

    @m80.k
    public final a g() {
        return this.f22580c;
    }

    @m80.k
    public final String h() {
        return this.f22581d;
    }

    public int hashCode() {
        return (((((this.f22578a.hashCode() * 31) + this.f22579b.hashCode()) * 31) + this.f22580c.hashCode()) * 31) + this.f22581d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f22578a;
    }

    @m80.k
    public final LearnButtonType j() {
        return this.f22579b;
    }

    @m80.k
    public String toString() {
        return "ButtonState(text=" + this.f22578a + ", type=" + this.f22579b + ", action=" + this.f22580c + ", reportData=" + this.f22581d + pn.j.f81007d;
    }
}
