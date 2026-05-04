package v3;

import c4.n;
import com.baicizhan.app.biz.platform.DeviceType;
import com.baicizhan.client.business.dataset.provider.a;
import j.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l.c;
import m80.k;
import m80.l;
import n40.g;
import oa0.r;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {b.class})
@u0({"SMAP\nIDBFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IDBFactory.kt\ncom/baicizhan/app/biz/base/database/IDBPollImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f92898a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c7.e f92899b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f92900c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, o> f92901d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n40.a f92902e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.database.IDBPollImpl", f = "IDBFactory.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, l = {49, 51, 53}, m = "getOrCreateInternal", n = {"schedules", a.d.C0245a.f16161a, "create", "schedules", a.d.C0245a.f16161a, "create", "schedules", a.d.C0245a.f16161a, "create", "it", "$i$a$-let-IDBPollImpl$getOrCreateInternal$2"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    public static final class a<T extends o> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92903a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92904b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92905c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92906d;

        /* renamed from: e, reason: collision with root package name */
        public int f92907e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f92908f;

        /* renamed from: h, reason: collision with root package name */
        public int f92910h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f92908f = obj;
            this.f92910h |= Integer.MIN_VALUE;
            return c.this.f(null, null, null, this);
        }
    }

    public c(@k d driverFactory, @k c7.e deviceRepo, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(driverFactory, "driverFactory");
        g0.p(deviceRepo, "deviceRepo");
        g0.p(tokenProvider, "tokenProvider");
        this.f92898a = driverFactory;
        this.f92899b = deviceRepo;
        this.f92900c = tokenProvider;
        this.f92901d = new LinkedHashMap();
        this.f92902e = g.b(false, 1, null);
    }

    @Override // v3.b
    @l
    public <T extends o> Object a(@k l.g<c.a<g2>> gVar, @k String str, boolean z11, @k p<? super l.e, ? super j00.c<? super T>, ? extends Object> pVar, @k j00.c<? super T> cVar) {
        Boolean a11 = l00.a.a(z11);
        if (!a11.booleanValue()) {
            a11 = null;
        }
        return f(gVar, d(a11 != null ? String.valueOf(this.f92900c.b()) : "", str), pVar, cVar);
    }

    public final String d(String str, String str2) {
        return str + '-' + str2 + v3.a.f92897b;
    }

    public final String e(String str) {
        if (this.f92899b.f() == DeviceType.OHOS) {
            return str;
        }
        return n.h().n() + "/databases/" + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        if (n40.a.C0899a.b(r13, null, r0, 1, null) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00d1, B:22:0x0058, B:23:0x00ae, B:28:0x0082, B:30:0x008c, B:32:0x0092), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:14:0x00d1, B:22:0x0058, B:23:0x00ae, B:28:0x0082, B:30:0x008c, B:32:0x0092), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends j.o> java.lang.Object f(l.g<l.c.a<yz.g2>> r10, java.lang.String r11, x00.p<? super l.e, ? super j00.c<? super T>, ? extends java.lang.Object> r12, j00.c<? super T> r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.c.f(l.g, java.lang.String, x00.p, j00.c):java.lang.Object");
    }
}
