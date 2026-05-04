package com.baicizhan.main.activity.mytab.task.data;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18774c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f18775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18776b;

    public a(int i11, int i12) {
        this.f18775a = i11;
        this.f18776b = i12;
    }

    public static /* synthetic */ a d(a aVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = aVar.f18775a;
        }
        if ((i13 & 2) != 0) {
            i12 = aVar.f18776b;
        }
        return aVar.c(i11, i12);
    }

    public final int a() {
        return this.f18775a;
    }

    public final int b() {
        return this.f18776b;
    }

    @k
    public final a c(int i11, int i12) {
        return new a(i11, i12);
    }

    public final int e() {
        return this.f18775a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18775a == aVar.f18775a && this.f18776b == aVar.f18776b;
    }

    public final int f() {
        return this.f18776b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f18775a) * 31) + Integer.hashCode(this.f18776b);
    }

    @k
    public String toString() {
        return "Achievement(days=" + this.f18775a + ", words=" + this.f18776b + j.f81007d;
    }
}
