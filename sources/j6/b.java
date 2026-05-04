package j6;

import c4.j;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import l00.d;
import l7.e;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import p8.s;
import ws.i;
import y7.d;
import y7.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nSwitchGameModeUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchGameModeUC.kt\ncom/baicizhan/app/biz/game/uc/mode/SwitchGameModeUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,87:1\n6#2:88\n64#3,2:89\n66#3:92\n67#3,2:98\n6#4:91\n124#5,4:93\n142#6:97\n*S KotlinDebug\n*F\n+ 1 SwitchGameModeUC.kt\ncom/baicizhan/app/biz/game/uc/mode/SwitchGameModeUC\n*L\n25#1:88\n25#1:89,2\n25#1:92\n25#1:98,2\n25#1:91\n25#1:93,4\n25#1:97\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f63540d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f63541e = "SwitchGameModeUC";

    /* renamed from: f, reason: collision with root package name */
    public static final int f63542f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f63543g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f63544h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f63545i = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f63546a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t6.c f63547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b6.a f63548c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.mode.SwitchGameModeUC", f = "SwitchGameModeUC.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {45, 53, 54, 58}, m = "invoke", n = {"mode", "mode", "isFirstSwitch", "mode", "isFirstSwitch", "mode", "isFirstSwitch"}, s = {"I$0", "I$0", "I$1", "I$0", "I$1", "I$0", "I$1"}, v = 1)
    /* renamed from: j6.b$b, reason: collision with other inner class name */
    public static final class C0735b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f63549a;

        /* renamed from: b, reason: collision with root package name */
        public int f63550b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f63551c;

        /* renamed from: e, reason: collision with root package name */
        public int f63553e;

        public C0735b(j00.c<? super C0735b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63551c = obj;
            this.f63553e |= Integer.MIN_VALUE;
            return b.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f63554a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f63555b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f63556c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f63557a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f63558b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f63559c;

            public a(e eVar, l7.c cVar, h10.d dVar) {
                this.f63557a = eVar;
                this.f63558b = cVar;
                this.f63559c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f63557a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f63557a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f63558b.b(this.f63559c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, e eVar, l7.c cVar) {
            this.f63554a = dVar;
            this.f63555b = eVar;
            this.f63556c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            f.a(thriftBuilder, new a(this.f63555b, this.f63556c, this.f63554a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f63554a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public b(@k p thriftService, @k t6.c wordsFullSyncUC, @k b6.a userGuideRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(wordsFullSyncUC, "wordsFullSyncUC");
        g0.p(userGuideRepo, "userGuideRepo");
        this.f63546a = thriftService;
        this.f63547b = wordsFullSyncUC;
        this.f63548c = userGuideRepo;
    }

    public final s a() {
        return (s) w7.f.b(new c(o0.d(s.class), new e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0109, code lost:
    
        if (r2.h(r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r14, @m80.k j00.c<? super java.lang.Integer> r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b.b(int, j00.c):java.lang.Object");
    }
}
