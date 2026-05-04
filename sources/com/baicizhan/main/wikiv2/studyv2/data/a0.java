package com.baicizhan.main.wikiv2.studyv2.data;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f26013d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f26014a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f26015b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Uri f26016c;

    public a0(@m80.k String title, @m80.l String str, @m80.l Uri uri) {
        kotlin.jvm.internal.g0.p(title, "title");
        this.f26014a = title;
        this.f26015b = str;
        this.f26016c = uri;
    }

    public static /* synthetic */ a0 e(a0 a0Var, String str, String str2, Uri uri, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a0Var.f26014a;
        }
        if ((i11 & 2) != 0) {
            str2 = a0Var.f26015b;
        }
        if ((i11 & 4) != 0) {
            uri = a0Var.f26016c;
        }
        return a0Var.d(str, str2, uri);
    }

    @m80.k
    public final String a() {
        return this.f26014a;
    }

    @m80.l
    public final String b() {
        return this.f26015b;
    }

    @m80.l
    public final Uri c() {
        return this.f26016c;
    }

    @m80.k
    public final a0 d(@m80.k String title, @m80.l String str, @m80.l Uri uri) {
        kotlin.jvm.internal.g0.p(title, "title");
        return new a0(title, str, uri);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.g0.g(this.f26014a, a0Var.f26014a) && kotlin.jvm.internal.g0.g(this.f26015b, a0Var.f26015b) && kotlin.jvm.internal.g0.g(this.f26016c, a0Var.f26016c);
    }

    @m80.l
    public final String f() {
        return this.f26015b;
    }

    @m80.l
    public final Uri g() {
        return this.f26016c;
    }

    @m80.k
    public final String h() {
        return this.f26014a;
    }

    public int hashCode() {
        int hashCode = this.f26014a.hashCode() * 31;
        String str = this.f26015b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f26016c;
        return hashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "MnemonicInfo(title=" + this.f26014a + ", content=" + this.f26015b + ", img=" + this.f26016c + pn.j.f81007d;
    }

    public /* synthetic */ a0(String str, String str2, Uri uri, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : uri);
    }
}
