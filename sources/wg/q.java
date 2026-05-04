package wg;

import android.app.Application;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c40.h1;
import c40.r0;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.main.home.experiment.repo.StudyServiceFxKt;
import com.baicizhan.main.home.experiment.repo.c0;
import com.baicizhan.main.home.player.model.AudioEffect;
import com.baicizhan.main.home.player.model.HomeMode;
import com.baicizhan.main.home.player.model.VibratePattern;
import com.baicizhan.online.user_study_api.UserBasicInfoPlusV2;
import com.jiongji.andriod.card.R;
import com.microsoft.thrifty.service.a;
import java.util.Map;
import javax.inject.Inject;
import k3.o4;
import k3.p4;
import k3.s0;
import k3.t0;
import k3.u2;
import k3.v2;
import k3.x2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.m0;
import l7.i0;
import p8.f1;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@u0({"SMAP\nPlayerModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerModel.kt\ncom/baicizhan/main/home/player/model/PlayerModel\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n+ 6 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 7 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 8 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n*L\n1#1,226:1\n10#2:227\n10#2:234\n10#2:241\n43#3:228\n43#3:235\n43#3:242\n124#4,4:229\n124#4,4:236\n124#4,4:243\n124#4,4:253\n142#5:233\n142#5:240\n142#5:247\n142#5:257\n6#6:248\n64#7,2:249\n66#7:252\n67#7,2:258\n6#8:251\n*S KotlinDebug\n*F\n+ 1 PlayerModel.kt\ncom/baicizhan/main/home/player/model/PlayerModel\n*L\n50#1:227\n51#1:234\n52#1:241\n50#1:228\n51#1:235\n52#1:242\n50#1:229,4\n51#1:236,4\n52#1:243,4\n54#1:253,4\n50#1:233\n51#1:240\n52#1:247\n54#1:257\n54#1:248\n54#1:249,2\n54#1:252\n54#1:258,2\n54#1:251\n*E\n"})
/* loaded from: classes4.dex */
public final class q extends ViewModel {

    @m80.k
    public static final b C = new b(null);
    public static final int D = 8;

    @m80.k
    public static final String E = "PlayerModel";

    @m80.k
    public final State<ug.f> A;

    @m80.k
    public final c0 B;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f96277a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.s f96278b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.experiment.repo.t f96279c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f96280d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c0 f96281e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c0 f96282f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final c0 f96283g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c0 f96284h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final m0<o4> f96285i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final m0<u2> f96286j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.c0<l3.o> f96287k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final MutableState<Boolean> f96288l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final MutableState<Boolean> f96289m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final MutableIntState f96290n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final MutableIntState f96291o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final MutableIntState f96292p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final MutableIntState f96293q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final MutableIntState f96294r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final MutableState<ug.f> f96295s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final State<Boolean> f96296t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final State<Boolean> f96297u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final State<Integer> f96298v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final State<Integer> f96299w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final State<Integer> f96300x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final State<Integer> f96301y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final State<Integer> f96302z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$1", f = "PlayerModel.kt", i = {2}, l = {91, 92, 96}, m = "invokeSuspend", n = {"basicInfo"}, s = {"L$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f96303a;

        /* renamed from: b, reason: collision with root package name */
        public int f96304b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        
            if (r1.a(r6, r5) != r0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0015, B:9:0x006a, B:16:0x0023, B:17:0x0048, B:19:0x004e, B:20:0x0055, B:23:0x0027, B:24:0x0039, B:28:0x002e), top: B:2:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f96304b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r5.f96303a
                com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r0 = (com.baicizhan.online.user_study_api.UserBasicInfoPlusV2) r0
                kotlin.e.n(r6)     // Catch: java.lang.Exception -> L19
                goto L6a
            L19:
                r6 = move-exception
                goto L87
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L23:
                kotlin.e.n(r6)     // Catch: java.lang.Exception -> L19
                goto L48
            L27:
                kotlin.e.n(r6)     // Catch: java.lang.Exception -> L19
                goto L39
            L2b:
                kotlin.e.n(r6)
                wg.q r6 = wg.q.this     // Catch: java.lang.Exception -> L19
                r5.f96304b = r4     // Catch: java.lang.Exception -> L19
                java.lang.Object r6 = wg.q.v(r6, r5)     // Catch: java.lang.Exception -> L19
                if (r6 != r0) goto L39
                goto L69
            L39:
                wg.q r6 = wg.q.this     // Catch: java.lang.Exception -> L19
                com.baicizhan.main.home.experiment.repo.s r6 = wg.q.j(r6)     // Catch: java.lang.Exception -> L19
                r5.f96304b = r3     // Catch: java.lang.Exception -> L19
                java.lang.Object r6 = r6.k(r5)     // Catch: java.lang.Exception -> L19
                if (r6 != r0) goto L48
                goto L69
            L48:
                com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r6 = (com.baicizhan.online.user_study_api.UserBasicInfoPlusV2) r6     // Catch: java.lang.Exception -> L19
                com.baicizhan.online.user_study_api.UserLimitInfoV2 r1 = r6.limit_info     // Catch: java.lang.Exception -> L19
                if (r1 == 0) goto L55
                q9.x r3 = q9.x.r()     // Catch: java.lang.Exception -> L19
                r3.C0(r1)     // Catch: java.lang.Exception -> L19
            L55:
                wg.q r1 = wg.q.this     // Catch: java.lang.Exception -> L19
                com.baicizhan.main.home.experiment.repo.t r1 = wg.q.k(r1)     // Catch: java.lang.Exception -> L19
                java.lang.Object r3 = l00.k.a(r6)     // Catch: java.lang.Exception -> L19
                r5.f96303a = r3     // Catch: java.lang.Exception -> L19
                r5.f96304b = r2     // Catch: java.lang.Exception -> L19
                java.lang.Object r6 = r1.a(r6, r5)     // Catch: java.lang.Exception -> L19
                if (r6 != r0) goto L6a
            L69:
                return r0
            L6a:
                wg.q r6 = wg.q.this     // Catch: java.lang.Exception -> L19
                androidx.compose.runtime.MutableState r6 = wg.q.u(r6)     // Catch: java.lang.Exception -> L19
                wg.q r0 = wg.q.this     // Catch: java.lang.Exception -> L19
                q9.x r1 = q9.x.r()     // Catch: java.lang.Exception -> L19
                com.baicizhan.client.business.dataset.models.UserRecord r1 = r1.p()     // Catch: java.lang.Exception -> L19
                java.lang.String r2 = "getCurrentUser(...)"
                kotlin.jvm.internal.g0.o(r1, r2)     // Catch: java.lang.Exception -> L19
                ug.f r0 = wg.q.m(r0, r1)     // Catch: java.lang.Exception -> L19
                r6.setValue(r0)     // Catch: java.lang.Exception -> L19
                goto L8e
            L87:
                java.lang.String r0 = "PlayerModel"
                java.lang.String r1 = ""
                qb.c.c(r0, r1, r6)
            L8e:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96306a;

        static {
            int[] iArr = new int[VibratePattern.values().length];
            try {
                iArr[VibratePattern.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VibratePattern.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96306a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f96307a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f96308b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f96309c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f96310a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f96311b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f96312c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f96310a = eVar;
                this.f96311b = cVar;
                this.f96312c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f96310a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f96310a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f96311b.b(this.f96312c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$2\n*L\n1#1,79:1\n*E\n"})
        public static final class b implements x00.a<Map<String, ? extends String>> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f96313a = new b();

            @Override // x00.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, String> invoke() {
                return i0.p();
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f96307a = dVar;
            this.f96308b = eVar;
            this.f96309c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f96308b, this.f96309c, this.f96307a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f96307a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(b.f96313a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<p8.s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$onStart$1", f = "PlayerModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96314a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HomeMode f96315b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f96316c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$onStart$1$1", f = "PlayerModel.kt", i = {}, l = {127, 130}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f96317a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeMode f96318b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f96319c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: wg.q$e$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1292a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f96320a;

                static {
                    int[] iArr = new int[HomeMode.values().length];
                    try {
                        iArr[HomeMode.WORDS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HomeMode.SENTENCES_JAPANESE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f96320a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HomeMode homeMode, q qVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f96318b = homeMode;
                this.f96319c = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f96318b, this.f96319c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
            
                if (r5.Y(r4) == r0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
            
                if (r5.c2(r4) == r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f96317a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r5)
                    goto L50
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    kotlin.e.n(r5)
                    goto L45
                L1e:
                    kotlin.e.n(r5)
                    com.baicizhan.main.home.player.model.HomeMode r5 = r4.f96318b
                    int[] r1 = wg.q.e.a.C1292a.f96320a
                    int r5 = r5.ordinal()
                    r5 = r1[r5]
                    if (r5 == r3) goto L36
                    if (r5 != r2) goto L30
                    goto L45
                L30:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L36:
                    wg.q r5 = r4.f96319c
                    k3.p4 r5 = wg.q.l(r5)
                    r4.f96317a = r3
                    java.lang.Object r5 = r5.c2(r4)
                    if (r5 != r0) goto L45
                    goto L4f
                L45:
                    wg.q r5 = r4.f96319c
                    r4.f96317a = r2
                    java.lang.Object r5 = wg.q.v(r5, r4)
                    if (r5 != r0) goto L50
                L4f:
                    return r0
                L50:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: wg.q.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HomeMode homeMode, q qVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f96315b = homeMode;
            this.f96316c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f96315b, this.f96316c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96314a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = h1.c();
                a aVar = new a(this.f96315b, this.f96316c, null);
                this.f96314a = 1;
                if (com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                ((Result) obj).m6317unboximpl();
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel", f = "PlayerModel.kt", i = {}, l = {105}, m = "refreshSettings", n = {}, s = {}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f96321a;

        /* renamed from: c, reason: collision with root package name */
        public int f96323c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f96321a = obj;
            this.f96323c |= Integer.MIN_VALUE;
            return q.this.Y(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$refreshUserInfo$1", f = "PlayerModel.kt", i = {}, l = {R.styleable.Theme_drawable_review_sound}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96324a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$refreshUserInfo$1$1", f = "PlayerModel.kt", i = {}, l = {R.styleable.Theme_drawable_revocation}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f96326a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f96327b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f96327b = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f96327b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ug.f H;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f96326a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    this.f96326a = 1;
                    obj = StudyServiceFxKt.b(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                UserBasicInfoPlusV2 userBasicInfoPlusV2 = (UserBasicInfoPlusV2) obj;
                q9.x.r().C0(userBasicInfoPlusV2.limit_info);
                MutableState mutableState = this.f96327b.f96295s;
                c0.a aVar = com.baicizhan.main.home.experiment.repo.c0.f21465d;
                q9.x r11 = q9.x.r();
                g0.o(r11, "getInstance(...)");
                UserRecord a11 = aVar.a(userBasicInfoPlusV2, r11);
                if (a11 == null || (H = this.f96327b.H(a11)) == null) {
                    return g2.f100423a;
                }
                mutableState.setValue(H);
                return g2.f100423a;
            }
        }

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new g(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96324a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = h1.c();
                a aVar = new a(q.this, null);
                this.f96324a = 1;
                if (com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                ((Result) obj).m6317unboximpl();
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$refreshUserLearningStats$1", f = "PlayerModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96328a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$refreshUserLearningStats$1$1", f = "PlayerModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f96330a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f96331b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f96331b = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f96331b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f96330a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    p8.s B = this.f96331b.B();
                    this.f96330a = 1;
                    obj = B.I1(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                f1 f1Var = (f1) obj;
                this.f96331b.f96290n.setIntValue(f1Var.f79808a);
                this.f96331b.f96291o.setIntValue(f1Var.f79809b);
                this.f96331b.f96292p.setIntValue(f1Var.f79810c);
                this.f96331b.f96293q.setIntValue(f1Var.f79811d);
                this.f96331b.f96294r.setIntValue(f1Var.f79812e);
                return g2.f100423a;
            }
        }

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96328a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = h1.c();
                a aVar = new a(q.this, null);
                this.f96328a = 1;
                if (com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                ((Result) obj).m6317unboximpl();
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$setAudioEffect$1", f = "PlayerModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96332a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f96334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z11, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f96334c = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new i(this.f96334c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96332a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                s0 C = q.this.C();
                String str = this.f96334c ? k3.u0.f65628b : "disable";
                this.f96332a = 1;
                if (C.V0(t0.f65611c, str, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            q.this.f96288l.setValue(l00.a.a(this.f96334c));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$setVibrationEffect$1", f = "PlayerModel.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96335a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f96337c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z11, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f96337c = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new j(this.f96337c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96335a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                s0 C = q.this.C();
                String str = this.f96337c ? k3.u0.f65628b : "disable";
                this.f96335a = 1;
                if (C.V0(t0.f65610b, str, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            q.this.f96289m.setValue(l00.a.a(this.f96337c));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$startFreshmanLearning$1", f = "PlayerModel.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96338a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<GameType, j00.c<? super g2>, Object> f96340c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$startFreshmanLearning$1$1", f = "PlayerModel.kt", i = {1}, l = {150, 151}, m = "invokeSuspend", n = {"type"}, s = {"L$0"}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f96341a;

            /* renamed from: b, reason: collision with root package name */
            public int f96342b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q f96343c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x00.p<GameType, j00.c<? super g2>, Object> f96344d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(q qVar, x00.p<? super GameType, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f96343c = qVar;
                this.f96344d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f96343c, this.f96344d, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
            
                if (r1.invoke(r5, r4) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
            
                if (r5 == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f96342b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f96341a
                    com.baicizhan.app.api.service.GameType r0 = (com.baicizhan.app.api.service.GameType) r0
                    kotlin.e.n(r5)
                    goto L47
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    kotlin.e.n(r5)
                    goto L34
                L22:
                    kotlin.e.n(r5)
                    wg.q r5 = r4.f96343c
                    k3.s0 r5 = wg.q.i(r5)
                    r4.f96342b = r3
                    java.lang.Object r5 = r5.s2(r4)
                    if (r5 != r0) goto L34
                    goto L46
                L34:
                    com.baicizhan.app.api.service.GameType r5 = (com.baicizhan.app.api.service.GameType) r5
                    x00.p<com.baicizhan.app.api.service.GameType, j00.c<? super yz.g2>, java.lang.Object> r1 = r4.f96344d
                    java.lang.Object r3 = l00.k.a(r5)
                    r4.f96341a = r3
                    r4.f96342b = r2
                    java.lang.Object r5 = r1.invoke(r5, r4)
                    if (r5 != r0) goto L47
                L46:
                    return r0
                L47:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: wg.q.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(x00.p<? super GameType, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super k> cVar) {
            super(2, cVar);
            this.f96340c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new k(this.f96340c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96338a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = h1.c();
                a aVar = new a(q.this, this.f96340c, null);
                this.f96338a = 1;
                if (com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, this, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                ((Result) obj).m6317unboximpl();
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.model.PlayerModel$startLearning$1", f = "PlayerModel.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class l extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96345a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GameType f96347c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f96348d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f96349e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GameType gameType, int i11, x00.a<g2> aVar, j00.c<? super l> cVar) {
            super(2, cVar);
            this.f96347c = gameType;
            this.f96348d = i11;
            this.f96349e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new l(this.f96347c, this.f96348d, this.f96349e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((l) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96345a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                p4 D = q.this.D();
                GameType gameType = this.f96347c;
                int i12 = this.f96348d;
                this.f96345a = 1;
                if (D.y0(gameType, i12, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f96349e.invoke();
            return g2.f100423a;
        }
    }

    @Inject
    public q(@m80.k Application application, @m80.k com.baicizhan.main.home.experiment.repo.s iGameHomeRepo, @m80.k com.baicizhan.main.home.experiment.repo.t iTmpRepo) {
        g0.p(application, "application");
        g0.p(iGameHomeRepo, "iGameHomeRepo");
        g0.p(iTmpRepo, "iTmpRepo");
        this.f96277a = application;
        this.f96278b = iGameHomeRepo;
        this.f96279c = iTmpRepo;
        this.f96280d = e0.c(new x00.a() { // from class: wg.k
            @Override // x00.a
            public final Object invoke() {
                p4 U;
                U = q.U(q.this);
                return U;
            }
        });
        this.f96281e = e0.c(new x00.a() { // from class: wg.l
            @Override // x00.a
            public final Object invoke() {
                v2 T;
                T = q.T(q.this);
                return T;
            }
        });
        this.f96282f = e0.c(new x00.a() { // from class: wg.m
            @Override // x00.a
            public final Object invoke() {
                s0 z11;
                z11 = q.z(q.this);
                return z11;
            }
        });
        this.f96283g = e0.c(new x00.a() { // from class: wg.n
            @Override // x00.a
            public final Object invoke() {
                Vibrator j02;
                j02 = q.j0(q.this);
                return j02;
            }
        });
        this.f96284h = e0.c(new x00.a() { // from class: wg.o
            @Override // x00.a
            public final Object invoke() {
                p8.s y11;
                y11 = q.y(q.this);
                return y11;
            }
        });
        this.f96285i = D().getState();
        this.f96286j = F().getState();
        this.f96287k = D().u();
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f96288l = mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f96289m = mutableStateOf$default2;
        MutableIntState mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f96290n = mutableIntStateOf;
        MutableIntState mutableIntStateOf2 = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f96291o = mutableIntStateOf2;
        MutableIntState mutableIntStateOf3 = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f96292p = mutableIntStateOf3;
        MutableIntState mutableIntStateOf4 = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f96293q = mutableIntStateOf4;
        MutableIntState mutableIntStateOf5 = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f96294r = mutableIntStateOf5;
        MutableState<ug.f> mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f96295s = mutableStateOf$default3;
        this.f96296t = mutableStateOf$default;
        this.f96297u = mutableStateOf$default2;
        this.f96298v = mutableIntStateOf;
        this.f96299w = mutableIntStateOf2;
        this.f96300x = mutableIntStateOf3;
        this.f96301y = mutableIntStateOf4;
        this.f96302z = mutableIntStateOf5;
        this.A = mutableStateOf$default3;
        this.B = e0.c(new x00.a() { // from class: wg.p
            @Override // x00.a
            public final Object invoke() {
                i X;
                X = q.X(q.this);
                return X;
            }
        });
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 C() {
        return (s0) this.f96282f.getValue();
    }

    public static final v2 T(q qVar) {
        dd.h.g(qVar.f96277a);
        return (v2) ((x2) c4.j.f7801a.a().P().h().i(o0.d(v2.class), null, null));
    }

    public static final p4 U(q qVar) {
        dd.h.g(qVar.f96277a);
        return (p4) ((x2) c4.j.f7801a.a().P().h().i(o0.d(p4.class), null, null));
    }

    public static final wg.i X(q qVar) {
        return new wg.i(qVar.f96277a);
    }

    public static /* synthetic */ Object g0(q qVar, GameType gameType, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return qVar.e0(gameType, i11, cVar);
    }

    public static /* synthetic */ void h0(q qVar, GameType gameType, int i11, x00.a aVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        qVar.f0(gameType, i11, aVar);
    }

    public static final Vibrator j0(q qVar) {
        return (Vibrator) qVar.f96277a.getSystemService(Vibrator.class);
    }

    public static /* synthetic */ void x(q qVar, AudioEffect audioEffect, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        qVar.w(audioEffect, obj);
    }

    public static final p8.s y(q qVar) {
        dd.h.g(qVar.f96277a).c();
        return (p8.s) w7.f.b(new d(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public static final s0 z(q qVar) {
        dd.h.g(qVar.f96277a);
        return (s0) ((x2) c4.j.f7801a.a().P().h().i(o0.d(s0.class), null, null));
    }

    @m80.k
    public final kotlinx.coroutines.flow.c0<l3.o> A() {
        return this.f96287k;
    }

    public final p8.s B() {
        return (p8.s) this.f96284h.getValue();
    }

    public final p4 D() {
        return (p4) this.f96280d.getValue();
    }

    public final v2 F() {
        return (v2) this.f96281e.getValue();
    }

    public final wg.i G() {
        return (wg.i) this.B.getValue();
    }

    public final ug.f H(UserRecord userRecord) {
        int uniqueId = userRecord.getUniqueId();
        String nickName = userRecord.getNickName();
        g0.o(nickName, "getNickName(...)");
        String image = userRecord.getImage();
        g0.o(image, "getImage(...)");
        UserRecord.Role role = userRecord.getRole();
        return new ug.f(uniqueId, nickName, image, role != null ? role.grade : 0);
    }

    @m80.k
    public final State<Boolean> I() {
        return this.f96296t;
    }

    @m80.k
    public final State<Boolean> J() {
        return this.f96297u;
    }

    @m80.k
    public final m0<o4> K() {
        return this.f96285i;
    }

    @m80.k
    public final m0<u2> L() {
        return this.f96286j;
    }

    @m80.k
    public final State<Integer> M() {
        return this.f96299w;
    }

    @m80.k
    public final State<Integer> N() {
        return this.f96301y;
    }

    @m80.k
    public final State<Integer> O() {
        return this.f96302z;
    }

    @m80.k
    public final State<Integer> P() {
        return this.f96298v;
    }

    @m80.k
    public final State<Integer> Q() {
        return this.f96300x;
    }

    @m80.k
    public final State<ug.f> R() {
        return this.A;
    }

    public final Vibrator S() {
        return (Vibrator) this.f96283g.getValue();
    }

    public final void V(@m80.k HomeMode mode) {
        g0.p(mode, "mode");
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new e(mode, this, null), 3, null);
    }

    public final void W(@m80.k HomeMode mode) {
        g0.p(mode, "mode");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof wg.q.f
            if (r0 == 0) goto L13
            r0 = r5
            wg.q$f r0 = (wg.q.f) r0
            int r1 = r0.f96323c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96323c = r1
            goto L18
        L13:
            wg.q$f r0 = new wg.q$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f96321a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f96323c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            k3.s0 r5 = r4.C()
            r0.f96323c = r3
            java.lang.Object r5 = r5.i0(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.Map r5 = (java.util.Map) r5
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.f96288l
            java.lang.String r1 = "app_sound_effect"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r2 = "enable"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            java.lang.Boolean r1 = l00.a.a(r1)
            r0.setValue(r1)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.f96289m
            java.lang.String r1 = "app_vibration_enable"
            java.lang.Object r5 = r5.get(r1)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r2)
            java.lang.Boolean r5 = l00.a.a(r5)
            r0.setValue(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.q.Y(j00.c):java.lang.Object");
    }

    public final void Z() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
    }

    public final void a0() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
    }

    public final void b0(boolean z11) {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new i(z11, null), 3, null);
    }

    public final void c0(boolean z11) {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new j(z11, null), 3, null);
    }

    public final void d0(@m80.k x00.p<? super GameType, ? super j00.c<? super g2>, ? extends Object> onStart) {
        g0.p(onStart, "onStart");
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new k(onStart, null), 3, null);
    }

    @m80.l
    public final Object e0(@m80.k GameType gameType, int i11, @m80.k j00.c<? super g2> cVar) {
        Object y02 = D().y0(gameType, i11, cVar);
        return y02 == kotlin.coroutines.intrinsics.b.l() ? y02 : g2.f100423a;
    }

    public final void f0(@m80.k GameType type, int i11, @m80.k x00.a<g2> onDone) {
        g0.p(type, "type");
        g0.p(onDone, "onDone");
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new l(type, i11, onDone, null), 3, null);
    }

    public final void i0(@m80.k VibratePattern vibratePattern) {
        VibrationEffect createPredefined;
        VibrationEffect createOneShot;
        g0.p(vibratePattern, "vibratePattern");
        if (this.f96297u.getValue().booleanValue()) {
            int i11 = c.f96306a[vibratePattern.ordinal()];
            if (i11 == 1) {
                if (Build.VERSION.SDK_INT < 29) {
                    S().vibrate(25L);
                    return;
                }
                Vibrator S = S();
                createPredefined = VibrationEffect.createPredefined(0);
                S.vibrate(createPredefined);
                return;
            }
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Build.VERSION.SDK_INT < 26) {
                S().vibrate(800L);
                return;
            }
            Vibrator S2 = S();
            createOneShot = VibrationEffect.createOneShot(800L, 150);
            S2.vibrate(createOneShot);
        }
    }

    public final void w(@m80.k AudioEffect effect, @m80.l Object obj) {
        g0.p(effect, "effect");
        if (this.f96296t.getValue().booleanValue()) {
            G().j(effect, obj);
        }
    }
}
