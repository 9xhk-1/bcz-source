package com.baicizhan.platform.base.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes6.dex */
public final class n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f28442d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f28443a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28444b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28445c;

    public /* synthetic */ n2(float f11, float f12, long j11, kotlin.jvm.internal.v vVar) {
        this(f11, f12, j11);
    }

    public static /* synthetic */ n2 e(n2 n2Var, float f11, float f12, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = n2Var.f28443a;
        }
        if ((i11 & 2) != 0) {
            f12 = n2Var.f28444b;
        }
        if ((i11 & 4) != 0) {
            j11 = n2Var.f28445c;
        }
        return n2Var.d(f11, f12, j11);
    }

    public final float a() {
        return this.f28443a;
    }

    public final float b() {
        return this.f28444b;
    }

    public final long c() {
        return this.f28445c;
    }

    @m80.k
    public final n2 d(float f11, float f12, long j11) {
        return new n2(f11, f12, j11, null);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return Float.compare(this.f28443a, n2Var.f28443a) == 0 && Float.compare(this.f28444b, n2Var.f28444b) == 0 && IntSize.m5284equalsimpl0(this.f28445c, n2Var.f28445c);
    }

    public final long f() {
        return this.f28445c;
    }

    public final float g() {
        return this.f28443a;
    }

    public final float h() {
        return this.f28444b;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f28443a) * 31) + Float.hashCode(this.f28444b)) * 31) + IntSize.m5287hashCodeimpl(this.f28445c);
    }

    @m80.k
    public String toString() {
        return "CoordinateInfo(x=" + this.f28443a + ", y=" + this.f28444b + ", size=" + IntSize.m5289toStringimpl(this.f28445c) + pn.j.f81007d;
    }

    public n2(float f11, float f12, long j11) {
        this.f28443a = f11;
        this.f28444b = f12;
        this.f28445c = j11;
    }
}
