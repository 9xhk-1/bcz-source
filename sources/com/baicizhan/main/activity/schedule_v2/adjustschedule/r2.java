package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19192d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19195c;

    public r2(int i11, int i12, int i13) {
        this.f19193a = i11;
        this.f19194b = i12;
        this.f19195c = i13;
    }

    public static /* synthetic */ r2 e(r2 r2Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = r2Var.f19193a;
        }
        if ((i14 & 2) != 0) {
            i12 = r2Var.f19194b;
        }
        if ((i14 & 4) != 0) {
            i13 = r2Var.f19195c;
        }
        return r2Var.d(i11, i12, i13);
    }

    public final int a() {
        return this.f19193a;
    }

    public final int b() {
        return this.f19194b;
    }

    public final int c() {
        return this.f19195c;
    }

    @m80.k
    public final r2 d(int i11, int i12, int i13) {
        return new r2(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.f19193a == r2Var.f19193a && this.f19194b == r2Var.f19194b && this.f19195c == r2Var.f19195c;
    }

    public final int f() {
        return this.f19193a;
    }

    public final int g() {
        return this.f19195c;
    }

    public final int h() {
        return this.f19194b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f19193a) * 31) + Integer.hashCode(this.f19194b)) * 31) + Integer.hashCode(this.f19195c);
    }

    @m80.k
    public String toString() {
        return "ScheduleProgress(current=" + this.f19193a + ", total=" + this.f19194b + ", masteredCount=" + this.f19195c + pn.j.f81007d;
    }

    public /* synthetic */ r2(int i11, int i12, int i13, int i14, kotlin.jvm.internal.v vVar) {
        this(i11, i12, (i14 & 4) != 0 ? 0 : i13);
    }
}
