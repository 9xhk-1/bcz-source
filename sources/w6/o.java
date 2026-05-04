package w6;

import a00.r0;
import k3.a4;
import k3.b4;
import k3.z3;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l7.j0;
import oa0.r;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {b4.class})
@u0({"SMAP\nWebServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebServiceImpl.kt\ncom/baicizhan/app/biz/h5/WebServiceImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,53:1\n37#2,2:54\n*S KotlinDebug\n*F\n+ 1 WebServiceImpl.kt\ncom/baicizhan/app/biz/h5/WebServiceImpl\n*L\n32#1:54,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o implements b4 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final j0 f95436b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l7.g f95437c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f f95438d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j f95439e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final b f95440f;

    public o(@m80.k j0 thriftUAProvider, @m80.k l7.g thriftCookieProvider, @m80.k f urlRepo, @m80.k j checker, @m80.k b payRepo) {
        g0.p(thriftUAProvider, "thriftUAProvider");
        g0.p(thriftCookieProvider, "thriftCookieProvider");
        g0.p(urlRepo, "urlRepo");
        g0.p(checker, "checker");
        g0.p(payRepo, "payRepo");
        this.f95436b = thriftUAProvider;
        this.f95437c = thriftCookieProvider;
        this.f95438d = urlRepo;
        this.f95439e = checker;
        this.f95440f = payRepo;
    }

    @Override // k3.b4
    public boolean i(@m80.k String url) {
        g0.p(url, "url");
        return this.f95439e.i(url);
    }

    @Override // k3.b4
    @m80.l
    public Object n1(@m80.k String str, @m80.k j00.c<? super String> cVar) {
        return this.f95438d.a(str, cVar);
    }

    @Override // k3.b4
    @m80.l
    public Object r2(@m80.k j00.c<? super z3> cVar) {
        String[] strArr;
        strArr = p.f95441a;
        return new z3(strArr, (String[]) r0.J4(k0.o5(this.f95437c.a(), new String[]{com.alipay.sdk.m.u.i.f11097b}, false, 0, 6, null), this.f95440f.a()).toArray(new String[0]));
    }

    @Override // k3.b4
    @m80.l
    public Object u0(@m80.k j00.c<? super a4[]> cVar) {
        return new a4[0];
    }

    @Override // k3.b4
    @m80.l
    public Object x2(@m80.k j00.c<? super String> cVar) {
        return this.f95436b.a();
    }
}
