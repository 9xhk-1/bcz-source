package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a8 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f23448e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f23449a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f23450b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f23451c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Object f23452d;

    public a8(@DrawableRes int i11, @m80.k String description, @m80.l @DrawableRes Integer num, @m80.l Object obj) {
        kotlin.jvm.internal.g0.p(description, "description");
        this.f23449a = i11;
        this.f23450b = description;
        this.f23451c = num;
        this.f23452d = obj;
    }

    public static /* synthetic */ a8 f(a8 a8Var, int i11, String str, Integer num, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = a8Var.f23449a;
        }
        if ((i12 & 2) != 0) {
            str = a8Var.f23450b;
        }
        if ((i12 & 4) != 0) {
            num = a8Var.f23451c;
        }
        if ((i12 & 8) != 0) {
            obj = a8Var.f23452d;
        }
        return a8Var.e(i11, str, num, obj);
    }

    public final int a() {
        return this.f23449a;
    }

    @m80.k
    public final String b() {
        return this.f23450b;
    }

    @m80.l
    public final Integer c() {
        return this.f23451c;
    }

    @m80.l
    public final Object d() {
        return this.f23452d;
    }

    @m80.k
    public final a8 e(@DrawableRes int i11, @m80.k String description, @m80.l @DrawableRes Integer num, @m80.l Object obj) {
        kotlin.jvm.internal.g0.p(description, "description");
        return new a8(i11, description, num, obj);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return this.f23449a == a8Var.f23449a && kotlin.jvm.internal.g0.g(this.f23450b, a8Var.f23450b) && kotlin.jvm.internal.g0.g(this.f23451c, a8Var.f23451c) && kotlin.jvm.internal.g0.g(this.f23452d, a8Var.f23452d);
    }

    @m80.k
    public final String g() {
        return this.f23450b;
    }

    public final int h() {
        return this.f23449a;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f23449a) * 31) + this.f23450b.hashCode()) * 31;
        Integer num = this.f23451c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f23452d;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f23451c;
    }

    @m80.l
    public final Object j() {
        return this.f23452d;
    }

    @m80.k
    public String toString() {
        return "StatusItem(icon=" + this.f23449a + ", description=" + this.f23450b + ", iconBadge=" + this.f23451c + ", status=" + this.f23452d + pn.j.f81007d;
    }

    public /* synthetic */ a8(int i11, String str, Integer num, Object obj, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : obj);
    }
}
