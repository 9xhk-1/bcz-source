package bz;

import io.ktor.util.date.Month;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public Integer f7439a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Integer f7440b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f7441c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Integer f7442d;

    /* renamed from: e, reason: collision with root package name */
    public Month f7443e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Integer f7444f;

    @k
    public final b a() {
        Integer num = this.f7439a;
        g0.m(num);
        int intValue = num.intValue();
        Integer num2 = this.f7440b;
        g0.m(num2);
        int intValue2 = num2.intValue();
        Integer num3 = this.f7441c;
        g0.m(num3);
        int intValue3 = num3.intValue();
        Integer num4 = this.f7442d;
        g0.m(num4);
        int intValue4 = num4.intValue();
        Month e11 = e();
        Integer num5 = this.f7444f;
        g0.m(num5);
        return io.ktor.util.date.a.a(intValue, intValue2, intValue3, intValue4, e11, num5.intValue());
    }

    @l
    public final Integer b() {
        return this.f7442d;
    }

    @l
    public final Integer c() {
        return this.f7441c;
    }

    @l
    public final Integer d() {
        return this.f7440b;
    }

    @k
    public final Month e() {
        Month month = this.f7443e;
        if (month != null) {
            return month;
        }
        g0.S(n.r.f98260b);
        return null;
    }

    @l
    public final Integer f() {
        return this.f7439a;
    }

    @l
    public final Integer g() {
        return this.f7444f;
    }

    public final void h(@l Integer num) {
        this.f7442d = num;
    }

    public final void i(@l Integer num) {
        this.f7441c = num;
    }

    public final void j(@l Integer num) {
        this.f7440b = num;
    }

    public final void k(@k Month month) {
        g0.p(month, "<set-?>");
        this.f7443e = month;
    }

    public final void l(@l Integer num) {
        this.f7439a = num;
    }

    public final void m(@l Integer num) {
        this.f7444f = num;
    }
}
