package com.baicizhan.main.home.dialog;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f20882p = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f20883a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f20884b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final AnnotatedString f20885c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final x00.r<ColumnScope, Modifier, Composer, Integer, g2> f20886d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20887e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20888f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f20889g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String f20890h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20891i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final String f20892j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final x00.l<Boolean, g2> f20893k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20894l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final x00.a<g2> f20895m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final x00.a<g2> f20896n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final x00.a<g2> f20897o;

    public e0() {
        this(null, null, null, null, false, 0, null, null, false, null, null, false, null, null, null, 32767, null);
    }

    public static final g2 e(boolean z11) {
        return g2.f100423a;
    }

    public static final g2 f() {
        return g2.f100423a;
    }

    public static final g2 g() {
        return g2.f100423a;
    }

    public static final g2 h() {
        return g2.f100423a;
    }

    public final boolean A() {
        return this.f20887e;
    }

    @m80.k
    public final String B() {
        return this.f20892j;
    }

    public final boolean C() {
        return this.f20891i;
    }

    public final boolean D() {
        return this.f20894l;
    }

    @m80.l
    public final x00.r<ColumnScope, Modifier, Composer, Integer, g2> E() {
        return this.f20886d;
    }

    public final int F() {
        return this.f20888f;
    }

    @m80.k
    public final String G() {
        return this.f20884b;
    }

    @m80.l
    public final String H() {
        return this.f20889g;
    }

    @m80.k
    public final x00.a<g2> I() {
        return this.f20896n;
    }

    @m80.k
    public final x00.l<Boolean, g2> J() {
        return this.f20893k;
    }

    @m80.k
    public final x00.a<g2> K() {
        return this.f20895m;
    }

    @m80.k
    public final x00.a<g2> L() {
        return this.f20897o;
    }

    @m80.l
    public final String M() {
        return this.f20890h;
    }

    @m80.k
    public final String N() {
        return this.f20883a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.g0.g(this.f20883a, e0Var.f20883a) && kotlin.jvm.internal.g0.g(this.f20884b, e0Var.f20884b) && kotlin.jvm.internal.g0.g(this.f20885c, e0Var.f20885c) && kotlin.jvm.internal.g0.g(this.f20886d, e0Var.f20886d) && this.f20887e == e0Var.f20887e && this.f20888f == e0Var.f20888f && kotlin.jvm.internal.g0.g(this.f20889g, e0Var.f20889g) && kotlin.jvm.internal.g0.g(this.f20890h, e0Var.f20890h) && this.f20891i == e0Var.f20891i && kotlin.jvm.internal.g0.g(this.f20892j, e0Var.f20892j) && kotlin.jvm.internal.g0.g(this.f20893k, e0Var.f20893k) && this.f20894l == e0Var.f20894l && kotlin.jvm.internal.g0.g(this.f20895m, e0Var.f20895m) && kotlin.jvm.internal.g0.g(this.f20896n, e0Var.f20896n) && kotlin.jvm.internal.g0.g(this.f20897o, e0Var.f20897o);
    }

    public int hashCode() {
        int hashCode = ((this.f20883a.hashCode() * 31) + this.f20884b.hashCode()) * 31;
        AnnotatedString annotatedString = this.f20885c;
        int hashCode2 = (hashCode + (annotatedString == null ? 0 : annotatedString.hashCode())) * 31;
        x00.r<ColumnScope, Modifier, Composer, Integer, g2> rVar = this.f20886d;
        int hashCode3 = (((((hashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31) + Boolean.hashCode(this.f20887e)) * 31) + Integer.hashCode(this.f20888f)) * 31;
        String str = this.f20889g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20890h;
        return ((((((((((((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f20891i)) * 31) + this.f20892j.hashCode()) * 31) + this.f20893k.hashCode()) * 31) + Boolean.hashCode(this.f20894l)) * 31) + this.f20895m.hashCode()) * 31) + this.f20896n.hashCode()) * 31) + this.f20897o.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f20883a;
    }

    @m80.k
    public final String j() {
        return this.f20892j;
    }

    @m80.k
    public final x00.l<Boolean, g2> k() {
        return this.f20893k;
    }

    public final boolean l() {
        return this.f20894l;
    }

    @m80.k
    public final x00.a<g2> m() {
        return this.f20895m;
    }

    @m80.k
    public final x00.a<g2> n() {
        return this.f20896n;
    }

    @m80.k
    public final x00.a<g2> o() {
        return this.f20897o;
    }

    @m80.k
    public final String p() {
        return this.f20884b;
    }

    @m80.l
    public final AnnotatedString q() {
        return this.f20885c;
    }

    @m80.l
    public final x00.r<ColumnScope, Modifier, Composer, Integer, g2> r() {
        return this.f20886d;
    }

    public final boolean s() {
        return this.f20887e;
    }

    public final int t() {
        return this.f20888f;
    }

    @m80.k
    public String toString() {
        String str = this.f20883a;
        String str2 = this.f20884b;
        AnnotatedString annotatedString = this.f20885c;
        return "PromptInfo(title=" + str + ", message=" + str2 + ", annotatedMessage=" + ((Object) annotatedString) + ", content=" + this.f20886d + ", cancelable=" + this.f20887e + ", icon=" + this.f20888f + ", negative=" + this.f20889g + ", positive=" + this.f20890h + ", checked=" + this.f20891i + ", checkDescription=" + this.f20892j + ", onCheckConfirm=" + this.f20893k + ", closeOn=" + this.f20894l + ", onClose=" + this.f20895m + ", onCancel=" + this.f20896n + ", onConfirm=" + this.f20897o + pn.j.f81007d;
    }

    @m80.l
    public final String u() {
        return this.f20889g;
    }

    @m80.l
    public final String v() {
        return this.f20890h;
    }

    public final boolean w() {
        return this.f20891i;
    }

    @m80.k
    public final e0 x(@m80.k String title, @m80.k String message, @m80.l AnnotatedString annotatedString, @m80.l x00.r<? super ColumnScope, ? super Modifier, ? super Composer, ? super Integer, g2> rVar, boolean z11, @DrawableRes int i11, @m80.l String str, @m80.l String str2, boolean z12, @m80.k String checkDescription, @m80.k x00.l<? super Boolean, g2> onCheckConfirm, boolean z13, @m80.k x00.a<g2> onClose, @m80.k x00.a<g2> onCancel, @m80.k x00.a<g2> onConfirm) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(checkDescription, "checkDescription");
        kotlin.jvm.internal.g0.p(onCheckConfirm, "onCheckConfirm");
        kotlin.jvm.internal.g0.p(onClose, "onClose");
        kotlin.jvm.internal.g0.p(onCancel, "onCancel");
        kotlin.jvm.internal.g0.p(onConfirm, "onConfirm");
        return new e0(title, message, annotatedString, rVar, z11, i11, str, str2, z12, checkDescription, onCheckConfirm, z13, onClose, onCancel, onConfirm);
    }

    @m80.l
    public final AnnotatedString z() {
        return this.f20885c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@m80.k String title, @m80.k String message, @m80.l AnnotatedString annotatedString, @m80.l x00.r<? super ColumnScope, ? super Modifier, ? super Composer, ? super Integer, g2> rVar, boolean z11, @DrawableRes int i11, @m80.l String str, @m80.l String str2, boolean z12, @m80.k String checkDescription, @m80.k x00.l<? super Boolean, g2> onCheckConfirm, boolean z13, @m80.k x00.a<g2> onClose, @m80.k x00.a<g2> onCancel, @m80.k x00.a<g2> onConfirm) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(message, "message");
        kotlin.jvm.internal.g0.p(checkDescription, "checkDescription");
        kotlin.jvm.internal.g0.p(onCheckConfirm, "onCheckConfirm");
        kotlin.jvm.internal.g0.p(onClose, "onClose");
        kotlin.jvm.internal.g0.p(onCancel, "onCancel");
        kotlin.jvm.internal.g0.p(onConfirm, "onConfirm");
        this.f20883a = title;
        this.f20884b = message;
        this.f20885c = annotatedString;
        this.f20886d = rVar;
        this.f20887e = z11;
        this.f20888f = i11;
        this.f20889g = str;
        this.f20890h = str2;
        this.f20891i = z12;
        this.f20892j = checkDescription;
        this.f20893k = onCheckConfirm;
        this.f20894l = z13;
        this.f20895m = onClose;
        this.f20896n = onCancel;
        this.f20897o = onConfirm;
    }

    public /* synthetic */ e0(String str, String str2, AnnotatedString annotatedString, x00.r rVar, boolean z11, int i11, String str3, String str4, boolean z12, String str5, x00.l lVar, boolean z13, x00.a aVar, x00.a aVar2, x00.a aVar3, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? null : annotatedString, (i12 & 8) != 0 ? null : rVar, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? null : str3, (i12 & 128) == 0 ? str4 : null, (i12 & 256) != 0 ? false : z12, (i12 & 512) == 0 ? str5 : "", (i12 & 1024) != 0 ? new x00.l() { // from class: com.baicizhan.main.home.dialog.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = e0.e(((Boolean) obj).booleanValue());
                return e11;
            }
        } : lVar, (i12 & 2048) == 0 ? z13 : false, (i12 & 4096) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.dialog.b0
            @Override // x00.a
            public final Object invoke() {
                g2 f11;
                f11 = e0.f();
                return f11;
            }
        } : aVar, (i12 & 8192) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.dialog.c0
            @Override // x00.a
            public final Object invoke() {
                g2 g11;
                g11 = e0.g();
                return g11;
            }
        } : aVar2, (i12 & 16384) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.dialog.d0
            @Override // x00.a
            public final Object invoke() {
                g2 h11;
                h11 = e0.h();
                return h11;
            }
        } : aVar3);
    }
}
