package com.baicizhan.main.wikiv2.studyv2.data;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26120d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f26121a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f26122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26123c;

    public w(int i11, @m80.k String examName, int i12) {
        kotlin.jvm.internal.g0.p(examName, "examName");
        this.f26121a = i11;
        this.f26122b = examName;
        this.f26123c = i12;
    }

    public static /* synthetic */ w e(w wVar, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = wVar.f26121a;
        }
        if ((i13 & 2) != 0) {
            str = wVar.f26122b;
        }
        if ((i13 & 4) != 0) {
            i12 = wVar.f26123c;
        }
        return wVar.d(i11, str, i12);
    }

    public final int a() {
        return this.f26121a;
    }

    @m80.k
    public final String b() {
        return this.f26122b;
    }

    public final int c() {
        return this.f26123c;
    }

    @m80.k
    public final w d(int i11, @m80.k String examName, int i12) {
        kotlin.jvm.internal.g0.p(examName, "examName");
        return new w(i11, examName, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f26121a == wVar.f26121a && kotlin.jvm.internal.g0.g(this.f26122b, wVar.f26122b) && this.f26123c == wVar.f26123c;
    }

    @m80.k
    public final String f() {
        return this.f26122b;
    }

    public final int g() {
        return this.f26123c;
    }

    public final int h() {
        return this.f26121a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f26121a) * 31) + this.f26122b.hashCode()) * 31) + Integer.hashCode(this.f26123c);
    }

    @m80.k
    public String toString() {
        return "ExamInfo(recent=" + this.f26121a + ", examName=" + this.f26122b + ", nums=" + this.f26123c + pn.j.f81007d;
    }
}
