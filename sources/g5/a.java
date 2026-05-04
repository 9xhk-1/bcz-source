package g5;

import com.baicizhan.app.api.service.BizException;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.biz.game.model.MembershipLevel;
import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.online.playground_api.PlaygroundApiService;
import com.jiongji.andriod.card.R;
import com.microsoft.thrifty.service.a;
import java.util.concurrent.CancellationException;
import k3.n4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import m3.l0;
import o6.f0;
import org.junit.platform.engine.support.hierarchical.DefaultParallelExecutionConfigurationStrategy;
import w30.b;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {n4.class})
@u0({"SMAP\nWordsGameServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordsGameServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/wordsgame/WordsGameServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 7 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 8 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 9 Koin.kt\norg/koin/core/Koin\n+ 10 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,335:1\n12#2,3:336\n15#2,10:351\n12#3,12:339\n1#4:361\n1563#5:362\n1634#5,3:363\n1563#5:378\n1634#5,3:379\n6#6:366\n6#6:382\n64#7,2:367\n66#7:370\n67#7,2:376\n64#7,2:383\n66#7:386\n67#7,2:392\n6#8:369\n6#8:385\n124#9,4:371\n124#9,4:387\n142#10:375\n142#10:391\n*S KotlinDebug\n*F\n+ 1 WordsGameServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/wordsgame/WordsGameServiceImpl\n*L\n-1#1:336,3\n-1#1:351,10\n-1#1:339,12\n220#1:362\n220#1:363,3\n275#1:378\n275#1:379,3\n247#1:366\n282#1:382\n247#1:367,2\n247#1:370\n247#1:376,2\n282#1:383,2\n282#1:386\n282#1:392,2\n247#1:369\n282#1:385\n247#1:371,4\n282#1:387,4\n247#1:375\n282#1:391\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements n4 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f0 f52705b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c6.b f52706c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final o6.p f52707d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f52708e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final o6.x f52709f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o6.n f52710g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.n f52711h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.k f52712i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final o6.a f52713j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final o6.t f52714k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final i6.a f52715l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final l6.x f52716m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final g6.i f52717n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final o6.d f52718o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.t f52719p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final l7.p f52720q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.d f52721r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final g6.a f52722s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final g6.g f52723t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final q5.a f52724u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: g5.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0624a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52725a;

        static {
            int[] iArr = new int[GameType.values().length];
            try {
                iArr[GameType.Learning.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameType.Spelling.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GameType.Review.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GameType.AiLeadU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52725a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<u8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f52726a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f52727b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f52728c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: g5.a$b$a, reason: collision with other inner class name */
        public static final class C0625a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f52729a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f52730b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f52731c;

            public C0625a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f52729a = eVar;
                this.f52730b = cVar;
                this.f52731c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f52729a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f52729a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f52730b.b(this.f52731c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f52726a = dVar;
            this.f52727b = eVar;
            this.f52728c = cVar;
        }

        public final void a(w7.d<u8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0625a(this.f52727b, this.f52728c, this.f52726a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f52726a);
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<PlaygroundApiService>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f52732a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f52733b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f52734c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: g5.a$c$a, reason: collision with other inner class name */
        public static final class C0626a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f52735a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f52736b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f52737c;

            public C0626a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f52735a = eVar;
                this.f52736b = cVar;
                this.f52737c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f52735a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f52735a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f52736b.b(this.f52737c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f52732a = dVar;
            this.f52733b = eVar;
            this.f52734c = cVar;
        }

        public final void a(w7.d<PlaygroundApiService> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0626a(this.f52733b, this.f52734c, this.f52732a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f52732a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<PlaygroundApiService> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {264}, m = "addCombo", n = {"addComboReqVo", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$addCombo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$addCombo$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52738a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52739b;

        /* renamed from: c, reason: collision with root package name */
        public int f52740c;

        /* renamed from: d, reason: collision with root package name */
        public int f52741d;

        /* renamed from: e, reason: collision with root package name */
        public int f52742e;

        /* renamed from: f, reason: collision with root package name */
        public int f52743f;

        /* renamed from: g, reason: collision with root package name */
        public long f52744g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52745h;

        /* renamed from: j, reason: collision with root package name */
        public int f52747j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52745h = obj;
            this.f52747j |= Integer.MIN_VALUE;
            return a.this.J2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0}, l = {301}, m = "checkEnergySufficient", n = {"isVip"}, s = {"Z$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f52748a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f52749b;

        /* renamed from: d, reason: collision with root package name */
        public int f52751d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52749b = obj;
            this.f52751d |= Integer.MIN_VALUE;
            return a.this.v(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {}, l = {294}, m = "checkIsVip", n = {}, s = {}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f52752a;

        /* renamed from: c, reason: collision with root package name */
        public int f52754c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52752a = obj;
            this.f52754c |= Integer.MIN_VALUE;
            return a.this.E(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.Theme_drawable_tab_lecture_new}, m = "checkNextLevelAvailability", n = {"tag$iv", "enterDay", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$checkNextLevelAvailability$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$checkNextLevelAvailability$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f52755a;

        /* renamed from: b, reason: collision with root package name */
        public int f52756b;

        /* renamed from: c, reason: collision with root package name */
        public int f52757c;

        /* renamed from: d, reason: collision with root package name */
        public int f52758d;

        /* renamed from: e, reason: collision with root package name */
        public int f52759e;

        /* renamed from: f, reason: collision with root package name */
        public Object f52760f;

        /* renamed from: g, reason: collision with root package name */
        public long f52761g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52762h;

        /* renamed from: j, reason: collision with root package name */
        public int f52764j;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52762h = obj;
            this.f52764j |= Integer.MIN_VALUE;
            return a.this.R0(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {258}, m = "claimFreeMembership", n = {"tag$iv", "freeType", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$claimFreeMembership$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$claimFreeMembership$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f52765a;

        /* renamed from: b, reason: collision with root package name */
        public int f52766b;

        /* renamed from: c, reason: collision with root package name */
        public int f52767c;

        /* renamed from: d, reason: collision with root package name */
        public int f52768d;

        /* renamed from: e, reason: collision with root package name */
        public int f52769e;

        /* renamed from: f, reason: collision with root package name */
        public Object f52770f;

        /* renamed from: g, reason: collision with root package name */
        public long f52771g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52772h;

        /* renamed from: j, reason: collision with root package name */
        public int f52774j;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52772h = obj;
            this.f52774j |= Integer.MIN_VALUE;
            return a.this.z(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {128}, m = "enableSpell", n = {"enableSpellReqVo", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$enableSpell$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$enableSpell$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52775a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52776b;

        /* renamed from: c, reason: collision with root package name */
        public int f52777c;

        /* renamed from: d, reason: collision with root package name */
        public int f52778d;

        /* renamed from: e, reason: collision with root package name */
        public int f52779e;

        /* renamed from: f, reason: collision with root package name */
        public int f52780f;

        /* renamed from: g, reason: collision with root package name */
        public long f52781g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52782h;

        /* renamed from: j, reason: collision with root package name */
        public int f52784j;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52782h = obj;
            this.f52784j |= Integer.MIN_VALUE;
            return a.this.T0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {110}, m = "getCurrentGame", n = {"gameType", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$getCurrentGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$getCurrentGame$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52785a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52786b;

        /* renamed from: c, reason: collision with root package name */
        public int f52787c;

        /* renamed from: d, reason: collision with root package name */
        public int f52788d;

        /* renamed from: e, reason: collision with root package name */
        public int f52789e;

        /* renamed from: f, reason: collision with root package name */
        public int f52790f;

        /* renamed from: g, reason: collision with root package name */
        public long f52791g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52792h;

        /* renamed from: j, reason: collision with root package name */
        public int f52794j;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52792h = obj;
            this.f52794j |= Integer.MIN_VALUE;
            return a.this.Z0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {205, 206}, m = "getMembershipInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$getMembershipInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$getMembershipInfo$2$1", "tag$iv", "vipModel", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$getMembershipInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$getMembershipInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52795a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52796b;

        /* renamed from: c, reason: collision with root package name */
        public int f52797c;

        /* renamed from: d, reason: collision with root package name */
        public int f52798d;

        /* renamed from: e, reason: collision with root package name */
        public int f52799e;

        /* renamed from: f, reason: collision with root package name */
        public int f52800f;

        /* renamed from: g, reason: collision with root package name */
        public long f52801g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52802h;

        /* renamed from: j, reason: collision with root package name */
        public int f52804j;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52802h = obj;
            this.f52804j |= Integer.MIN_VALUE;
            return a.this.E0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {140}, m = "getRechargeInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$getRechargeInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$getRechargeInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52805a;

        /* renamed from: b, reason: collision with root package name */
        public int f52806b;

        /* renamed from: c, reason: collision with root package name */
        public int f52807c;

        /* renamed from: d, reason: collision with root package name */
        public int f52808d;

        /* renamed from: e, reason: collision with root package name */
        public int f52809e;

        /* renamed from: f, reason: collision with root package name */
        public long f52810f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f52811g;

        /* renamed from: i, reason: collision with root package name */
        public int f52813i;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52811g = obj;
            this.f52813i |= Integer.MIN_VALUE;
            return a.this.j2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {289}, m = "getStudyBuddyInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$getStudyBuddyInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$getStudyBuddyInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52814a;

        /* renamed from: b, reason: collision with root package name */
        public int f52815b;

        /* renamed from: c, reason: collision with root package name */
        public int f52816c;

        /* renamed from: d, reason: collision with root package name */
        public int f52817d;

        /* renamed from: e, reason: collision with root package name */
        public int f52818e;

        /* renamed from: f, reason: collision with root package name */
        public long f52819f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f52820g;

        /* renamed from: i, reason: collision with root package name */
        public int f52822i;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52820g = obj;
            this.f52822i |= Integer.MIN_VALUE;
            return a.this.z0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.Theme_drawable_walk_sound4}, m = "getUserEntitlementSaleInfo", n = {"tag$iv", "$this$getUserEntitlementSaleInfo_u240", DefaultParallelExecutionConfigurationStrategy.CONFIG_STRATEGY_PROPERTY_NAME, "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$getUserEntitlementSaleInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$getUserEntitlementSaleInfo$2$1", "$i$a$-runCatching-WordsGameServiceImpl$getUserEntitlementSaleInfo$2$1$rsp$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52823a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52824b;

        /* renamed from: c, reason: collision with root package name */
        public Object f52825c;

        /* renamed from: d, reason: collision with root package name */
        public int f52826d;

        /* renamed from: e, reason: collision with root package name */
        public int f52827e;

        /* renamed from: f, reason: collision with root package name */
        public int f52828f;

        /* renamed from: g, reason: collision with root package name */
        public int f52829g;

        /* renamed from: h, reason: collision with root package name */
        public int f52830h;

        /* renamed from: i, reason: collision with root package name */
        public long f52831i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f52832j;

        /* renamed from: l, reason: collision with root package name */
        public int f52834l;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52832j = obj;
            this.f52834l |= Integer.MIN_VALUE;
            return a.this.L0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {189}, m = "lookup", n = {"word", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$lookup$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$lookup$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52835a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52836b;

        /* renamed from: c, reason: collision with root package name */
        public int f52837c;

        /* renamed from: d, reason: collision with root package name */
        public int f52838d;

        /* renamed from: e, reason: collision with root package name */
        public int f52839e;

        /* renamed from: f, reason: collision with root package name */
        public int f52840f;

        /* renamed from: g, reason: collision with root package name */
        public long f52841g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52842h;

        /* renamed from: j, reason: collision with root package name */
        public int f52844j;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52842h = obj;
            this.f52844j |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.Theme_drawable_share}, m = "preloadResource", n = {"preloadResourceReq", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$preloadResource$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$preloadResource$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52845a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52846b;

        /* renamed from: c, reason: collision with root package name */
        public int f52847c;

        /* renamed from: d, reason: collision with root package name */
        public int f52848d;

        /* renamed from: e, reason: collision with root package name */
        public int f52849e;

        /* renamed from: f, reason: collision with root package name */
        public int f52850f;

        /* renamed from: g, reason: collision with root package name */
        public long f52851g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52852h;

        /* renamed from: j, reason: collision with root package name */
        public int f52854j;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52852h = obj;
            this.f52854j |= Integer.MIN_VALUE;
            return a.this.V1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {134}, m = "rechargeStar", n = {"rechargeStarReqVo", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$rechargeStar$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$rechargeStar$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52855a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52856b;

        /* renamed from: c, reason: collision with root package name */
        public int f52857c;

        /* renamed from: d, reason: collision with root package name */
        public int f52858d;

        /* renamed from: e, reason: collision with root package name */
        public int f52859e;

        /* renamed from: f, reason: collision with root package name */
        public int f52860f;

        /* renamed from: g, reason: collision with root package name */
        public long f52861g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52862h;

        /* renamed from: j, reason: collision with root package name */
        public int f52864j;

        public q(j00.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52862h = obj;
            this.f52864j |= Integer.MIN_VALUE;
            return a.this.E2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {271}, m = "resetCombo", n = {"gameId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$resetCombo$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$resetCombo$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52865a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52866b;

        /* renamed from: c, reason: collision with root package name */
        public int f52867c;

        /* renamed from: d, reason: collision with root package name */
        public int f52868d;

        /* renamed from: e, reason: collision with root package name */
        public int f52869e;

        /* renamed from: f, reason: collision with root package name */
        public int f52870f;

        /* renamed from: g, reason: collision with root package name */
        public long f52871g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52872h;

        /* renamed from: j, reason: collision with root package name */
        public int f52874j;

        public r(j00.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52872h = obj;
            this.f52874j |= Integer.MIN_VALUE;
            return a.this.G2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {283}, m = "reviveLavaQuest", n = {"tag$iv", "playgroundApiService", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$reviveLavaQuest$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$reviveLavaQuest$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52875a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52876b;

        /* renamed from: c, reason: collision with root package name */
        public int f52877c;

        /* renamed from: d, reason: collision with root package name */
        public int f52878d;

        /* renamed from: e, reason: collision with root package name */
        public int f52879e;

        /* renamed from: f, reason: collision with root package name */
        public int f52880f;

        /* renamed from: g, reason: collision with root package name */
        public long f52881g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52882h;

        /* renamed from: j, reason: collision with root package name */
        public int f52884j;

        public s(j00.c<? super s> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52882h = obj;
            this.f52884j |= Integer.MIN_VALUE;
            return a.this.G0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {96, 100}, m = "startGame", n = {"gameType", "tag$iv", "roundType", "enterDay", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$startGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$startGame$2$1", "gameType", "tag$iv", "roundType", "enterDay", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$startGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$startGame$2$1", "cost"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f52885a;

        /* renamed from: b, reason: collision with root package name */
        public int f52886b;

        /* renamed from: c, reason: collision with root package name */
        public int f52887c;

        /* renamed from: d, reason: collision with root package name */
        public int f52888d;

        /* renamed from: e, reason: collision with root package name */
        public int f52889e;

        /* renamed from: f, reason: collision with root package name */
        public int f52890f;

        /* renamed from: g, reason: collision with root package name */
        public Object f52891g;

        /* renamed from: h, reason: collision with root package name */
        public Object f52892h;

        /* renamed from: i, reason: collision with root package name */
        public Object f52893i;

        /* renamed from: j, reason: collision with root package name */
        public long f52894j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f52895k;

        /* renamed from: m, reason: collision with root package name */
        public int f52897m;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52895k = obj;
            this.f52897m |= Integer.MIN_VALUE;
            return a.this.q2(0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {153, 164}, m = "submitGame", n = {"submitGameReq", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$submitGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$submitGame$2$1", "submitGameReq", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$submitGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$submitGame$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52898a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52899b;

        /* renamed from: c, reason: collision with root package name */
        public int f52900c;

        /* renamed from: d, reason: collision with root package name */
        public int f52901d;

        /* renamed from: e, reason: collision with root package name */
        public int f52902e;

        /* renamed from: f, reason: collision with root package name */
        public int f52903f;

        /* renamed from: g, reason: collision with root package name */
        public long f52904g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52905h;

        /* renamed from: j, reason: collision with root package name */
        public int f52907j;

        public u(j00.c<? super u> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52905h = obj;
            this.f52907j |= Integer.MIN_VALUE;
            return a.this.W1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {122}, m = "syncBehavior", n = {"syncBehaviorVo", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$syncBehavior$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$syncBehavior$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52908a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52909b;

        /* renamed from: c, reason: collision with root package name */
        public int f52910c;

        /* renamed from: d, reason: collision with root package name */
        public int f52911d;

        /* renamed from: e, reason: collision with root package name */
        public int f52912e;

        /* renamed from: f, reason: collision with root package name */
        public int f52913f;

        /* renamed from: g, reason: collision with root package name */
        public long f52914g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52915h;

        /* renamed from: j, reason: collision with root package name */
        public int f52917j;

        public v(j00.c<? super v> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52915h = obj;
            this.f52917j |= Integer.MIN_VALUE;
            return a.this.L(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {116}, m = "syncState", n = {"synState", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$syncState$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$syncState$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52918a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52919b;

        /* renamed from: c, reason: collision with root package name */
        public int f52920c;

        /* renamed from: d, reason: collision with root package name */
        public int f52921d;

        /* renamed from: e, reason: collision with root package name */
        public int f52922e;

        /* renamed from: f, reason: collision with root package name */
        public int f52923f;

        /* renamed from: g, reason: collision with root package name */
        public long f52924g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52925h;

        /* renamed from: j, reason: collision with root package name */
        public int f52927j;

        public w(j00.c<? super w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52925h = obj;
            this.f52927j |= Integer.MIN_VALUE;
            return a.this.S(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.wordsgame.WordsGameServiceImpl", f = "WordsGameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.Theme_drawable_test_nodate}, m = "winningStreak", n = {"winningStreakReqVo", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsGameServiceImpl$winningStreak$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsGameServiceImpl$winningStreak$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f52928a;

        /* renamed from: b, reason: collision with root package name */
        public Object f52929b;

        /* renamed from: c, reason: collision with root package name */
        public int f52930c;

        /* renamed from: d, reason: collision with root package name */
        public int f52931d;

        /* renamed from: e, reason: collision with root package name */
        public int f52932e;

        /* renamed from: f, reason: collision with root package name */
        public int f52933f;

        /* renamed from: g, reason: collision with root package name */
        public long f52934g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f52935h;

        /* renamed from: j, reason: collision with root package name */
        public int f52937j;

        public x(j00.c<? super x> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f52935h = obj;
            this.f52937j |= Integer.MIN_VALUE;
            return a.this.A1(null, this);
        }
    }

    public a(@m80.k f0 doStartGameUC, @m80.k c6.b userGameInfoRepo, @m80.k o6.p getCurrentWordsGameUc, @m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRound, @m80.k o6.x processLearningBehaviorUC, @m80.k o6.n enableSpellUc, @m80.k com.baicizhan.app.biz.game.uc.monetization.n rechargeLifeUC, @m80.k com.baicizhan.app.biz.game.uc.monetization.k getRechargeInfoUC, @m80.k o6.a commitGameUC, @m80.k o6.t giveUpUC, @m80.k i6.a lookupWordUC, @m80.k l6.x preloadResourceUC, @m80.k g6.i syncComboUC, @m80.k o6.d doCheckNextLevelUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.t winWordsGameUC, @m80.k l7.p thrift, @m80.k com.baicizhan.app.biz.game.uc.monetization.d claimFreeMemberUC, @m80.k g6.a addComboUC, @m80.k g6.g resetComboUC, @m80.k q5.a ipAvatarStateRepo) {
        g0.p(doStartGameUC, "doStartGameUC");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(getCurrentWordsGameUc, "getCurrentWordsGameUc");
        g0.p(gameRound, "gameRound");
        g0.p(processLearningBehaviorUC, "processLearningBehaviorUC");
        g0.p(enableSpellUc, "enableSpellUc");
        g0.p(rechargeLifeUC, "rechargeLifeUC");
        g0.p(getRechargeInfoUC, "getRechargeInfoUC");
        g0.p(commitGameUC, "commitGameUC");
        g0.p(giveUpUC, "giveUpUC");
        g0.p(lookupWordUC, "lookupWordUC");
        g0.p(preloadResourceUC, "preloadResourceUC");
        g0.p(syncComboUC, "syncComboUC");
        g0.p(doCheckNextLevelUC, "doCheckNextLevelUC");
        g0.p(winWordsGameUC, "winWordsGameUC");
        g0.p(thrift, "thrift");
        g0.p(claimFreeMemberUC, "claimFreeMemberUC");
        g0.p(addComboUC, "addComboUC");
        g0.p(resetComboUC, "resetComboUC");
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        this.f52705b = doStartGameUC;
        this.f52706c = userGameInfoRepo;
        this.f52707d = getCurrentWordsGameUc;
        this.f52708e = gameRound;
        this.f52709f = processLearningBehaviorUC;
        this.f52710g = enableSpellUc;
        this.f52711h = rechargeLifeUC;
        this.f52712i = getRechargeInfoUC;
        this.f52713j = commitGameUC;
        this.f52714k = giveUpUC;
        this.f52715l = lookupWordUC;
        this.f52716m = preloadResourceUC;
        this.f52717n = syncComboUC;
        this.f52718o = doCheckNextLevelUC;
        this.f52719p = winWordsGameUC;
        this.f52720q = thrift;
        this.f52721r = claimFreeMemberUC;
        this.f52722s = addComboUC;
        this.f52723t = resetComboUC;
        this.f52724u = ipAvatarStateRepo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:14:0x0080, B:23:0x00c5, B:25:0x00cc, B:27:0x00d0, B:29:0x00d4, B:31:0x00d8, B:33:0x00dc, B:44:0x0140, B:35:0x00e4, B:37:0x00ef, B:39:0x0103, B:41:0x0117, B:43:0x012c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[Catch: all -> 0x00bb, TryCatch #1 {all -> 0x00bb, blocks: (B:14:0x0080, B:23:0x00c5, B:25:0x00cc, B:27:0x00d0, B:29:0x00d4, B:31:0x00d8, B:33:0x00dc, B:44:0x0140, B:35:0x00e4, B:37:0x00ef, B:39:0x0103, B:41:0x0117, B:43:0x012c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, long] */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A1(@m80.k m3.c2 r11, @m80.k j00.c<? super java.lang.Boolean> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.A1(m3.c2, j00.c):java.lang.Object");
    }

    public final boolean B0(h5.g gVar) {
        h5.x h11 = gVar.h();
        return h11 != null && h11.h() >= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(j00.c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g5.a.f
            if (r0 == 0) goto L13
            r0 = r5
            g5.a$f r0 = (g5.a.f) r0
            int r1 = r0.f52754c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52754c = r1
            goto L18
        L13:
            g5.a$f r0 = new g5.a$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f52752a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f52754c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            c6.b r5 = r4.f52706c
            r0.f52754c = r3
            java.lang.Object r5 = r5.r(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            h5.y r5 = (h5.y) r5
            boolean r5 = com.baicizhan.app.biz.game.model.a.d(r5)
            java.lang.Boolean r5 = l00.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.E(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c A[Catch: all -> 0x0124, TryCatch #1 {all -> 0x0124, blocks: (B:23:0x0105, B:25:0x010c, B:27:0x0110, B:29:0x0114, B:31:0x0118, B:33:0x011c, B:44:0x0183, B:35:0x0127, B:37:0x0132, B:39:0x0146, B:41:0x015a, B:43:0x016f), top: B:22:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f A[Catch: all -> 0x0124, TryCatch #1 {all -> 0x0124, blocks: (B:23:0x0105, B:25:0x010c, B:27:0x0110, B:29:0x0114, B:31:0x0118, B:33:0x011c, B:44:0x0183, B:35:0x0127, B:37:0x0132, B:39:0x0146, B:41:0x015a, B:43:0x016f), top: B:22:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E0(@m80.k j00.c<? super m3.i0> r15) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.E0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E2(@m80.k m3.p0 r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.E2(m3.p0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:22:0x00de, B:24:0x00e5, B:26:0x00e9, B:28:0x00ed, B:30:0x00f1, B:32:0x00f5, B:43:0x015c, B:34:0x0100, B:36:0x010b, B:38:0x011f, B:40:0x0133, B:42:0x0148), top: B:21:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:22:0x00de, B:24:0x00e5, B:26:0x00e9, B:28:0x00ed, B:30:0x00f1, B:32:0x00f5, B:43:0x015c, B:34:0x0100, B:36:0x010b, B:38:0x011f, B:40:0x0133, B:42:0x0148), top: B:21:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G0(@m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.G0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0072, B:14:0x008c, B:16:0x0094, B:17:0x00a5, B:19:0x00ab, B:21:0x00bd, B:28:0x00b9), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0072, B:14:0x008c, B:16:0x0094, B:17:0x00a5, B:19:0x00ab, B:21:0x00bd, B:28:0x00b9), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0072, B:14:0x008c, B:16:0x0094, B:17:0x00a5, B:19:0x00ab, B:21:0x00bd, B:28:0x00b9), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106 A[Catch: all -> 0x011e, TryCatch #2 {all -> 0x011e, blocks: (B:33:0x00ff, B:35:0x0106, B:37:0x010a, B:39:0x010e, B:41:0x0112, B:43:0x0116, B:54:0x017d, B:45:0x0121, B:47:0x012c, B:49:0x0140, B:51:0x0154, B:53:0x0169), top: B:32:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169 A[Catch: all -> 0x011e, TryCatch #2 {all -> 0x011e, blocks: (B:33:0x00ff, B:35:0x0106, B:37:0x010a, B:39:0x010e, B:41:0x0112, B:43:0x0116, B:54:0x017d, B:45:0x0121, B:47:0x012c, B:49:0x0140, B:51:0x0154, B:53:0x0169), top: B:32:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G2(@m80.k java.lang.String r11, @m80.k j00.c<? super m3.u0> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.G2(java.lang.String, j00.c):java.lang.Object");
    }

    public final boolean I0(h5.g gVar) {
        return gVar.j().d() > w3.g.n();
    }

    public final int J(boolean z11) {
        return z11 ? MembershipLevel.Vip.getValue() : MembershipLevel.Free.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:22:0x00d2, B:24:0x00d9, B:26:0x00dd, B:28:0x00e1, B:30:0x00e5, B:32:0x00e9, B:43:0x0150, B:34:0x00f4, B:36:0x00ff, B:38:0x0113, B:40:0x0127, B:42:0x013c), top: B:21:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:22:0x00d2, B:24:0x00d9, B:26:0x00dd, B:28:0x00e1, B:30:0x00e5, B:32:0x00e9, B:43:0x0150, B:34:0x00f4, B:36:0x00ff, B:38:0x0113, B:40:0x0127, B:42:0x013c), top: B:21:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J2(@m80.k m3.m r11, @m80.k j00.c<? super m3.l> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.J2(m3.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(@m80.k m3.t1 r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.L(m3.t1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x0113, TryCatch #1 {all -> 0x0113, blocks: (B:28:0x00f4, B:30:0x00fb, B:32:0x00ff, B:34:0x0103, B:36:0x0107, B:38:0x010b, B:50:0x0171, B:41:0x0115, B:43:0x0120, B:45:0x0134, B:47:0x0148, B:49:0x015d), top: B:27:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d A[Catch: all -> 0x0113, TryCatch #1 {all -> 0x0113, blocks: (B:28:0x00f4, B:30:0x00fb, B:32:0x00ff, B:34:0x0103, B:36:0x0107, B:38:0x010b, B:50:0x0171, B:41:0x0115, B:43:0x0120, B:45:0x0134, B:47:0x0148, B:49:0x015d), top: B:27:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L0(@m80.k j00.c<? super m3.a2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.L0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R0(int r11, @m80.k j00.c<? super m3.f> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.R0(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(@m80.k m3.u1 r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.S(m3.u1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:22:0x00bf, B:24:0x00c6, B:26:0x00ca, B:28:0x00ce, B:30:0x00d2, B:32:0x00d6, B:43:0x013c, B:34:0x00e0, B:36:0x00eb, B:38:0x00ff, B:40:0x0113, B:42:0x0128), top: B:21:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:22:0x00bf, B:24:0x00c6, B:26:0x00ca, B:28:0x00ce, B:30:0x00d2, B:32:0x00d6, B:43:0x013c, B:34:0x00e0, B:36:0x00eb, B:38:0x00ff, B:40:0x0113, B:42:0x0128), top: B:21:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T0(@m80.k m3.n r17, @m80.k j00.c<? super yz.g2> r18) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.T0(m3.n, j00.c):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:22:0x00ec, B:24:0x00f3, B:26:0x00f7, B:28:0x00fb, B:30:0x00ff, B:32:0x0103, B:43:0x016a, B:34:0x010e, B:36:0x0119, B:38:0x012d, B:40:0x0141, B:42:0x0156), top: B:21:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:22:0x00ec, B:24:0x00f3, B:26:0x00f7, B:28:0x00fb, B:30:0x00ff, B:32:0x0103, B:43:0x016a, B:34:0x010e, B:36:0x0119, B:38:0x012d, B:40:0x0141, B:42:0x0156), top: B:21:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V1(@m80.k m3.l0 r14, @m80.k j00.c<? super yz.g2> r15) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.V1(m3.l0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:14:0x00e0, B:16:0x0112, B:17:0x0119, B:19:0x011f, B:20:0x0126, B:22:0x012c, B:26:0x0136, B:28:0x014b, B:36:0x0052, B:37:0x008f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011f A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:14:0x00e0, B:16:0x0112, B:17:0x0119, B:19:0x011f, B:20:0x0126, B:22:0x012c, B:26:0x0136, B:28:0x014b, B:36:0x0052, B:37:0x008f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012c A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:14:0x00e0, B:16:0x0112, B:17:0x0119, B:19:0x011f, B:20:0x0126, B:22:0x012c, B:26:0x0136, B:28:0x014b, B:36:0x0052, B:37:0x008f), top: B:8:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W1(@m80.k m3.n1 r23, @m80.k j00.c<? super m3.l1> r24) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.W1(m3.n1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Z0(@m80.k com.baicizhan.app.api.service.GameType r11, @m80.k j00.c<? super m3.o2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.Z0(com.baicizhan.app.api.service.GameType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0072, B:14:0x0076, B:20:0x00c7, B:21:0x00d2), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0072, B:14:0x0076, B:20:0x00c7, B:21:0x00d2), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0 A[Catch: all -> 0x00f8, TryCatch #2 {all -> 0x00f8, blocks: (B:25:0x00d9, B:27:0x00e0, B:29:0x00e4, B:31:0x00e8, B:33:0x00ec, B:35:0x00f0, B:46:0x0157, B:37:0x00fb, B:39:0x0106, B:41:0x011a, B:43:0x012e, B:45:0x0143), top: B:24:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143 A[Catch: all -> 0x00f8, TryCatch #2 {all -> 0x00f8, blocks: (B:25:0x00d9, B:27:0x00e0, B:29:0x00e4, B:31:0x00e8, B:33:0x00ec, B:35:0x00f0, B:46:0x0157, B:37:0x00fb, B:39:0x0106, B:41:0x011a, B:43:0x012e, B:45:0x0143), top: B:24:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k java.lang.String r12, @m80.k j00.c<? super k3.f4> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.d(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:33:0x00dc, B:35:0x00e3, B:37:0x00e7, B:39:0x00eb, B:41:0x00ef, B:43:0x00f3, B:54:0x015a, B:45:0x00fe, B:47:0x0109, B:49:0x011d, B:51:0x0131, B:53:0x0146), top: B:32:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:33:0x00dc, B:35:0x00e3, B:37:0x00e7, B:39:0x00eb, B:41:0x00ef, B:43:0x00f3, B:54:0x015a, B:45:0x00fe, B:47:0x0109, B:49:0x011d, B:51:0x0131, B:53:0x0146), top: B:32:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j2(@m80.k j00.c<? super m3.o0> r15) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.j2(j00.c):java.lang.Object");
    }

    public final RoundType p1(GameType gameType) {
        int i11 = C0624a.f52725a[gameType.ordinal()];
        if (i11 == 1) {
            return RoundType.LEARNING;
        }
        if (i11 == 2) {
            return RoundType.SPELLING;
        }
        if (i11 == 3) {
            return RoundType.REVIEW;
        }
        if (i11 == 4) {
            return RoundType.AI_LEADS_U;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152 A[Catch: all -> 0x016a, TryCatch #3 {all -> 0x016a, blocks: (B:23:0x014b, B:25:0x0152, B:27:0x0156, B:29:0x015a, B:31:0x015e, B:33:0x0162, B:44:0x01c8, B:35:0x016c, B:37:0x0177, B:39:0x018b, B:41:0x019f, B:43:0x01b4), top: B:22:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b4 A[Catch: all -> 0x016a, TryCatch #3 {all -> 0x016a, blocks: (B:23:0x014b, B:25:0x0152, B:27:0x0156, B:29:0x015a, B:31:0x015e, B:33:0x0162, B:44:0x01c8, B:35:0x016c, B:37:0x0177, B:39:0x018b, B:41:0x019f, B:43:0x01b4), top: B:22:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q2(int r20, @m80.k com.baicizhan.app.api.service.GameType r21, @m80.k j00.c<? super m3.c1> r22) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.q2(int, com.baicizhan.app.api.service.GameType, j00.c):java.lang.Object");
    }

    @Override // k3.n4
    @m80.l
    @s3.a
    public Object t0(@m80.k l0 l0Var, @m80.k j00.c<? super Boolean> cVar) throws BizException, CancellationException {
        b.C1273b c1273b = b.C1273b.f94770b;
        long epochMilliseconds = c1273b.a().toEpochMilliseconds();
        try {
            Boolean a11 = l00.a.a(false);
            if (c4.n.h().k()) {
                z6.b.d(z6.b.f101032b, s3.c.f87469a, "[checkResource] cost: " + (c1273b.a().toEpochMilliseconds() - epochMilliseconds), null, 4, null);
            }
            return a11;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(boolean r5, j00.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g5.a.e
            if (r0 == 0) goto L13
            r0 = r6
            g5.a$e r0 = (g5.a.e) r0
            int r1 = r0.f52751d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52751d = r1
            goto L18
        L13:
            g5.a$e r0 = new g5.a$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f52749b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f52751d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            if (r5 == 0) goto L3b
            java.lang.Boolean r5 = l00.a.a(r3)
            return r5
        L3b:
            c6.b r6 = r4.f52706c
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r2 = com.baicizhan.app.biz.game.repo.userresource.LanguageType.En
            r0.f52748a = r5
            r0.f52751d = r3
            java.lang.Object r6 = r6.k(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            h5.g r6 = (h5.g) r6
            boolean r5 = r4.B0(r6)
            if (r5 != 0) goto L5a
            boolean r5 = r4.I0(r6)
            if (r5 == 0) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            java.lang.Boolean r5 = l00.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.v(boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:22:0x00a7, B:24:0x00ae, B:26:0x00b2, B:28:0x00b6, B:30:0x00ba, B:32:0x00be, B:43:0x0125, B:34:0x00c9, B:36:0x00d4, B:38:0x00e8, B:40:0x00fc, B:42:0x0111), top: B:21:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111 A[Catch: all -> 0x00c6, TryCatch #2 {all -> 0x00c6, blocks: (B:22:0x00a7, B:24:0x00ae, B:26:0x00b2, B:28:0x00b6, B:30:0x00ba, B:32:0x00be, B:43:0x0125, B:34:0x00c9, B:36:0x00d4, B:38:0x00e8, B:40:0x00fc, B:42:0x0111), top: B:21:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(int r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.z(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4 A[Catch: all -> 0x00cc, TryCatch #2 {all -> 0x00cc, blocks: (B:22:0x00ad, B:24:0x00b4, B:26:0x00b8, B:28:0x00bc, B:30:0x00c0, B:32:0x00c4, B:43:0x012b, B:34:0x00cf, B:36:0x00da, B:38:0x00ee, B:40:0x0102, B:42:0x0117), top: B:21:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117 A[Catch: all -> 0x00cc, TryCatch #2 {all -> 0x00cc, blocks: (B:22:0x00ad, B:24:0x00b4, B:26:0x00b8, B:28:0x00bc, B:30:0x00c0, B:32:0x00c4, B:43:0x012b, B:34:0x00cf, B:36:0x00da, B:38:0x00ee, B:40:0x0102, B:42:0x0117), top: B:21:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.n4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z0(@m80.k j00.c<? super m3.f1> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.z0(j00.c):java.lang.Object");
    }
}
