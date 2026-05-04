package l7;

import com.baicizhan.app.biz.platform.DeviceType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import w30.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {g.class})
@u0({"SMAP\nThriftCookieProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftCookieProvider.kt\ncom/baicizhan/app/biz/thrift/ThriftCookieProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: classes3.dex */
public final class i implements g, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f70567b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c7.e f70568c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c7.h f70569d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c7.m f70570e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c7.l f70571f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f70572g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70573a;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.Android.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceType.IOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceType.OHOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70573a = iArr;
        }
    }

    public i(@m80.k com.baicizhan.app.biz.auth.r tokenHolder, @m80.k c7.e deviceRepo, @m80.k c7.h appRepo, @m80.k c7.m codec, @m80.k c7.l timeZoneRepo) {
        kotlin.jvm.internal.g0.p(tokenHolder, "tokenHolder");
        kotlin.jvm.internal.g0.p(deviceRepo, "deviceRepo");
        kotlin.jvm.internal.g0.p(appRepo, "appRepo");
        kotlin.jvm.internal.g0.p(codec, "codec");
        kotlin.jvm.internal.g0.p(timeZoneRepo, "timeZoneRepo");
        this.f70567b = tokenHolder;
        this.f70568c = deviceRepo;
        this.f70569d = appRepo;
        this.f70570e = codec;
        this.f70571f = timeZoneRepo;
        this.f70572g = yz.e0.c(new x00.a() { // from class: l7.h
            @Override // x00.a
            public final Object invoke() {
                String c11;
                c11 = i.c(i.this);
                return c11;
            }
        });
    }

    public static final String c(i iVar) {
        return iVar.d();
    }

    @Override // l7.g
    @m80.k
    public String a() {
        return l() + e() + "; " + m();
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("device_name=" + this.f70570e.a(f()) + "; ");
        sb2.append("version=" + this.f70570e.a(this.f70568c.k()) + "; ");
        sb2.append("os_version=" + this.f70570e.a(this.f70568c.k()) + "; ");
        sb2.append("app_name=" + this.f70570e.a(String.valueOf(this.f70569d.b())) + "; ");
        sb2.append("app_version=" + this.f70570e.a(String.valueOf(this.f70569d.b())) + "; ");
        sb2.append("channel=" + this.f70570e.a(this.f70569d.getChannel()) + "; ");
        sb2.append("serial=" + this.f70570e.a(this.f70568c.e()) + "; ");
        sb2.append("device_id=" + this.f70570e.a(this.f70568c.e()) + "; ");
        sb2.append("time_zone=" + this.f70570e.a(this.f70571f.a()) + "; ");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final String e() {
        return "client_time=" + b.C1273b.f94770b.a().toEpochMilliseconds();
    }

    public final String f() {
        int i11 = a.f70573a[this.f70568c.f().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return this.f70568c.i();
            }
            if (i11 == 3) {
                return this.f70568c.i();
            }
            throw new NoWhenBranchMatchedException();
        }
        return "android/" + this.f70568c.i() + '-' + this.f70568c.g();
    }

    @m80.k
    public final c7.h g() {
        return this.f70569d;
    }

    @m80.k
    public final c7.m i() {
        return this.f70570e;
    }

    @m80.k
    public final c7.e j() {
        return this.f70568c;
    }

    @m80.k
    public final com.baicizhan.app.biz.auth.r k() {
        return this.f70567b;
    }

    public final String l() {
        return (String) this.f70572g.getValue();
    }

    public final String m() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("access_token=");
        String a11 = this.f70567b.a();
        sb2.append(a11 != null ? this.f70570e.a(a11) : null);
        return sb2.toString();
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
