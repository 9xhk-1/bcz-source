package r6;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import p8.i1;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nFetchEntitlementsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchEntitlementsUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchEntitlementsUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,59:1\n6#2:60\n64#3,2:61\n66#3:64\n67#3,2:70\n6#4:63\n124#5,4:65\n142#6:69\n*S KotlinDebug\n*F\n+ 1 FetchEntitlementsUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchEntitlementsUC\n*L\n20#1:60\n20#1:61,2\n20#1:64\n20#1:70,2\n20#1:63\n20#1:65,4\n20#1:69\n*E\n"})
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83167a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f83168b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchEntitlementsUC", f = "FetchEntitlementsUC.kt", i = {1, 1, 1, 2, 2, 2}, l = {25, 28, 37}, m = "invoke", n = {"infos", "it", "$i$a$-also-FetchEntitlementsUC$invoke$2", "infos", "it", "$i$a$-let-FetchEntitlementsUC$invoke$3"}, s = {"L$0", "L$2", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83169a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83170b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83171c;

        /* renamed from: d, reason: collision with root package name */
        public int f83172d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f83173e;

        /* renamed from: g, reason: collision with root package name */
        public int f83175g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83173e = obj;
            this.f83175g |= Integer.MIN_VALUE;
            return l.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<u8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83176a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83177b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83178c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83179a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83180b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83181c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83179a = eVar;
                this.f83180b = cVar;
                this.f83181c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83179a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83179a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83180b.b(this.f83181c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83176a = dVar;
            this.f83177b = eVar;
            this.f83178c = cVar;
        }

        public final void a(w7.d<u8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83177b, this.f83178c, this.f83176a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83176a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<u8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public l(@m80.k l7.p thrift, @m80.k c6.b userGameInfo) {
        g0.p(thrift, "thrift");
        g0.p(userGameInfo, "userGameInfo");
        this.f83167a = thrift;
        this.f83168b = userGameInfo;
    }

    public final i1 a(u8.j jVar) {
        String str;
        Integer num = jVar.f91957h;
        if ((num == null || num.intValue() != 0) && (str = jVar.f91950a) != null && str.length() != 0) {
            Long l11 = jVar.f91951b;
            long longValue = l11 != null ? l11.longValue() : 0L;
            Integer num2 = jVar.f91952c;
            if (num2 != null) {
                int intValue = num2.intValue();
                Integer num3 = jVar.f91953d;
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    Long l12 = jVar.f91954e;
                    if (l12 != null) {
                        long longValue2 = l12.longValue();
                        Integer num4 = jVar.f91956g;
                        if (num4 != null) {
                            long intValue3 = num4.intValue();
                            Integer num5 = jVar.f91955f;
                            if (num5 != null) {
                                return new i1(longValue, intValue, intValue2, longValue2, new p8.n(intValue3, num5.intValue()));
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final u8.h b() {
        return (u8.h) w7.f.b(new b(o0.d(u8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.l.c(j00.c):java.lang.Object");
    }
}
