package bq;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7169f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final int f7170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7172c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7173d;

    /* renamed from: e, reason: collision with root package name */
    public int f7174e = -1;

    public d(int i11, int i12, int i13, int i14) {
        this.f7170a = i11;
        this.f7171b = i12;
        this.f7172c = i13;
        this.f7173d = i14;
    }

    public int a() {
        return this.f7172c;
    }

    public int b() {
        return this.f7171b;
    }

    public int c() {
        return this.f7174e;
    }

    public int d() {
        return this.f7170a;
    }

    public int e() {
        return this.f7173d;
    }

    public int f() {
        return this.f7171b - this.f7170a;
    }

    public boolean g() {
        return h(this.f7174e);
    }

    public boolean h(int i11) {
        return i11 != -1 && this.f7172c == (i11 % 3) * 3;
    }

    public void i(int i11) {
        this.f7174e = i11;
    }

    public void j() {
        this.f7174e = ((this.f7173d / 30) * 3) + (this.f7172c / 3);
    }

    public String toString() {
        return this.f7174e + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f7173d;
    }
}
