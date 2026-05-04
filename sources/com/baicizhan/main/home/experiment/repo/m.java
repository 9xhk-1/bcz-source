package com.baicizhan.main.home.experiment.repo;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21551d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f21552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21554c;

    public m(int i11, int i12, int i13) {
        this.f21552a = i11;
        this.f21553b = i12;
        this.f21554c = i13;
    }

    public static /* synthetic */ m e(m mVar, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = mVar.f21552a;
        }
        if ((i14 & 2) != 0) {
            i12 = mVar.f21553b;
        }
        if ((i14 & 4) != 0) {
            i13 = mVar.f21554c;
        }
        return mVar.d(i11, i12, i13);
    }

    public final int a() {
        return this.f21552a;
    }

    public final int b() {
        return this.f21553b;
    }

    public final int c() {
        return this.f21554c;
    }

    @m80.k
    public final m d(int i11, int i12, int i13) {
        return new m(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f21552a == mVar.f21552a && this.f21553b == mVar.f21553b && this.f21554c == mVar.f21554c;
    }

    public final int f() {
        return this.f21552a;
    }

    public final int g() {
        return this.f21554c;
    }

    public final int h() {
        return this.f21553b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f21552a) * 31) + Integer.hashCode(this.f21553b)) * 31) + Integer.hashCode(this.f21554c);
    }

    @m80.k
    public String toString() {
        return "GameBookProgress(current=" + this.f21552a + ", total=" + this.f21553b + ", masteredCount=" + this.f21554c + pn.j.f81007d;
    }

    public /* synthetic */ m(int i11, int i12, int i13, int i14, kotlin.jvm.internal.v vVar) {
        this(i11, i12, (i14 & 4) != 0 ? 0 : i13);
    }
}
