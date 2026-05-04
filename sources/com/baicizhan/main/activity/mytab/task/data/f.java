package com.baicizhan.main.activity.mytab.task.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final int f18780h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f18781a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f18783c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f18784d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18785e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<i> f18786f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18787g;

    public f(int i11, int i12, @k List<String> icon, @k String exchangeUrl, int i13, @k List<i> tasks, long j11) {
        g0.p(icon, "icon");
        g0.p(exchangeUrl, "exchangeUrl");
        g0.p(tasks, "tasks");
        this.f18781a = i11;
        this.f18782b = i12;
        this.f18783c = icon;
        this.f18784d = exchangeUrl;
        this.f18785e = i13;
        this.f18786f = tasks;
        this.f18787g = j11;
    }

    public static /* synthetic */ f i(f fVar, int i11, int i12, List list, String str, int i13, List list2, long j11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = fVar.f18781a;
        }
        if ((i14 & 2) != 0) {
            i12 = fVar.f18782b;
        }
        if ((i14 & 4) != 0) {
            list = fVar.f18783c;
        }
        if ((i14 & 8) != 0) {
            str = fVar.f18784d;
        }
        if ((i14 & 16) != 0) {
            i13 = fVar.f18785e;
        }
        if ((i14 & 32) != 0) {
            list2 = fVar.f18786f;
        }
        if ((i14 & 64) != 0) {
            j11 = fVar.f18787g;
        }
        long j12 = j11;
        int i15 = i13;
        List list3 = list2;
        return fVar.h(i11, i12, list, str, i15, list3, j12);
    }

    public final int a() {
        return this.f18781a;
    }

    public final int b() {
        return this.f18782b;
    }

    @k
    public final List<String> c() {
        return this.f18783c;
    }

    @k
    public final String d() {
        return this.f18784d;
    }

    public final int e() {
        return this.f18785e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18781a == fVar.f18781a && this.f18782b == fVar.f18782b && g0.g(this.f18783c, fVar.f18783c) && g0.g(this.f18784d, fVar.f18784d) && this.f18785e == fVar.f18785e && g0.g(this.f18786f, fVar.f18786f) && this.f18787g == fVar.f18787g;
    }

    @k
    public final List<i> f() {
        return this.f18786f;
    }

    public final long g() {
        return this.f18787g;
    }

    @k
    public final f h(int i11, int i12, @k List<String> icon, @k String exchangeUrl, int i13, @k List<i> tasks, long j11) {
        g0.p(icon, "icon");
        g0.p(exchangeUrl, "exchangeUrl");
        g0.p(tasks, "tasks");
        return new f(i11, i12, icon, exchangeUrl, i13, tasks, j11);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f18781a) * 31) + Integer.hashCode(this.f18782b)) * 31) + this.f18783c.hashCode()) * 31) + this.f18784d.hashCode()) * 31) + Integer.hashCode(this.f18785e)) * 31) + this.f18786f.hashCode()) * 31) + Long.hashCode(this.f18787g);
    }

    public final int j() {
        return this.f18781a;
    }

    @k
    public final String k() {
        return this.f18784d;
    }

    @k
    public final List<String> l() {
        return this.f18783c;
    }

    public final int m() {
        return this.f18785e;
    }

    @k
    public final List<i> n() {
        return this.f18786f;
    }

    public final int o() {
        return this.f18782b;
    }

    public final long p() {
        return this.f18787g;
    }

    @k
    public String toString() {
        return "CreditTaskCenterInfo(coin=" + this.f18781a + ", todayCoin=" + this.f18782b + ", icon=" + this.f18783c + ", exchangeUrl=" + this.f18784d + ", newArrivalTime=" + this.f18785e + ", tasks=" + this.f18786f + ", updateTime=" + this.f18787g + j.f81007d;
    }
}
