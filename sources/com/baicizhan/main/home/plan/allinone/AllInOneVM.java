package com.baicizhan.main.home.plan.allinone;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.main.home.plan.allinone.b;
import com.baicizhan.main.rx.BookAdObservables;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@kotlin.jvm.internal.u0({"SMAP\nAllInOneVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllInOneVM.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,178:1\n17#2:179\n19#2:183\n49#2,3:184\n17#2:187\n19#2:191\n46#3:180\n51#3:182\n46#3:188\n51#3:190\n105#4:181\n105#4:189\n*S KotlinDebug\n*F\n+ 1 AllInOneVM.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneVM\n*L\n51#1:179\n51#1:183\n51#1:184,3\n77#1:187\n77#1:191\n51#1:180\n51#1:182\n77#1:188\n77#1:190\n51#1:181\n77#1:189\n*E\n"})
/* loaded from: classes4.dex */
public final class AllInOneVM extends ViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final int f21977h = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g1 f21978a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q9.x f21979b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final e1 f21980c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<Boolean> f21981d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<th.a> f21982e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<com.baicizhan.main.home.plan.allinone.b> f21983f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.m0<com.baicizhan.main.home.plan.allinone.b> f21984g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$1", f = "AllInOneVM.kt", i = {0}, l = {74}, m = "invokeSuspend", n = {"it"}, s = {"Z$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<Boolean, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21993a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f21994b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a aVar = AllInOneVM.this.new a(cVar);
            aVar.f21994b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super yz.g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f21994b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21993a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.i(c3.f22150a, "refreshDoneFlow " + z11, new Object[0]);
                if (!z11) {
                    kotlinx.coroutines.flow.y yVar = AllInOneVM.this.f21981d;
                    Boolean a11 = l00.a.a(true);
                    this.f21994b = z11;
                    this.f21993a = 1;
                    if (yVar.emit(a11, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super yz.g2> cVar) {
            return ((a) create(Boolean.valueOf(z11), cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$3", f = "AllInOneVM.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<Boolean, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21996a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return AllInOneVM.this.new b(cVar);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super yz.g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21996a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.i(c3.f22150a, "BEFORE", new Object[0]);
                AllInOneVM.this.f21980c.b();
                qb.c.i(c3.f22150a, "AFTER", new Object[0]);
                kotlinx.coroutines.flow.y yVar = AllInOneVM.this.f21981d;
                Boolean a11 = l00.a.a(false);
                this.f21996a = 1;
                if (yVar.emit(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            qb.c.i(c3.f22150a, "AFTER emit", new Object[0]);
            return yz.g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super yz.g2> cVar) {
            return ((b) create(Boolean.valueOf(z11), cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$_cardState$1", f = "AllInOneVM.kt", i = {0, 0}, l = {57}, m = "invokeSuspend", n = {"bookAdKt", "home"}, s = {"L$0", "L$1"}, v = 1)
    public static final class c extends SuspendLambda implements x00.q<th.a, c1, j00.c<? super com.baicizhan.main.home.plan.allinone.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21998a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21999b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22000c;

        public c(j00.c<? super c> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(th.a aVar, c1 c1Var, j00.c<? super com.baicizhan.main.home.plan.allinone.b> cVar) {
            c cVar2 = AllInOneVM.this.new c(cVar);
            cVar2.f21999b = aVar;
            cVar2.f22000c = c1Var;
            return cVar2.invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            th.a aVar = (th.a) this.f21999b;
            c1 c1Var = (c1) this.f22000c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21998a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            AllInOneVM allInOneVM = AllInOneVM.this;
            this.f21999b = l00.k.a(aVar);
            this.f22000c = l00.k.a(c1Var);
            this.f21998a = 1;
            Object l12 = allInOneVM.l(aVar, c1Var, this);
            return l12 == l11 ? l11 : l12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$addCount$2", f = "AllInOneVM.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22002a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f22003b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AddType f22004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, AddType addType, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f22003b = i11;
            this.f22004c = addType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f22003b, this.f22004c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22002a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                int i12 = this.f22003b;
                int ordinal = this.f22004c.ordinal() + 1;
                this.f22002a = 1;
                if (StudyServiceFXKt.a(i12, ordinal, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$allInOneState$1", f = "AllInOneVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.q<Boolean, com.baicizhan.main.home.plan.allinone.b, j00.c<? super com.baicizhan.main.home.plan.allinone.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22005a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f22006b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22007c;

        public e(j00.c<? super e> cVar) {
            super(3, cVar);
        }

        public final Object i(boolean z11, com.baicizhan.main.home.plan.allinone.b bVar, j00.c<? super com.baicizhan.main.home.plan.allinone.b> cVar) {
            e eVar = new e(cVar);
            eVar.f22006b = z11;
            eVar.f22007c = bVar;
            return eVar.invokeSuspend(yz.g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.baicizhan.main.home.plan.allinone.b bVar, j00.c<? super com.baicizhan.main.home.plan.allinone.b> cVar) {
            return i(bool.booleanValue(), bVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f22006b;
            com.baicizhan.main.home.plan.allinone.b bVar = (com.baicizhan.main.home.plan.allinone.b) this.f22007c;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22005a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.i(c3.f22150a, "combine " + z11, new Object[0]);
            return z11 ? new b.d(new Object()) : bVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$doRefresh$2", f = "AllInOneVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22008a;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return AllInOneVM.this.new f(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            AllInOneVM.this.f21980c.b();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM", f = "AllInOneVM.kt", i = {0, 0, 0}, l = {155}, m = "mapToAllInOne", n = {"bookAd", "home", "book"}, s = {"L$0", "L$1", "L$2"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f22010a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22011b;

        /* renamed from: c, reason: collision with root package name */
        public Object f22012c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22013d;

        /* renamed from: f, reason: collision with root package name */
        public int f22015f;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f22013d = obj;
            this.f22015f |= Integer.MIN_VALUE;
            return AllInOneVM.this.l(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM", f = "AllInOneVM.kt", i = {}, l = {106, 107, 108}, m = com.alipay.sdk.m.x.d.f11177w, n = {}, s = {}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f22016a;

        /* renamed from: c, reason: collision with root package name */
        public int f22018c;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f22016a = obj;
            this.f22018c |= Integer.MIN_VALUE;
            return AllInOneVM.this.m(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$refreshAd$1", f = "AllInOneVM.kt", i = {0, 0, 1, 1}, l = {121, 134}, m = "invokeSuspend", n = {"$this$flow", "book", "$this$flow", "book"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super th.a>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22019a;

        /* renamed from: b, reason: collision with root package name */
        public int f22020b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22021c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$refreshAd$1$1", f = "AllInOneVM.kt", i = {0, 0}, l = {127}, m = "invokeSuspend", n = {"$this$catch", "it"}, s = {"L$0", "L$1"}, v = 1)
        public static final class a extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super BookAdObservables.BookAdInfo>, Throwable, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f22022a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f22023b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f22024c;

            public a(j00.c<? super a> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f22023b;
                Throwable th2 = (Throwable) this.f22024c;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f22022a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    this.f22023b = l00.k.a(jVar);
                    this.f22024c = th2;
                    this.f22022a = 1;
                    if (jVar.emit(null, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                qb.c.c(c3.f22150a, "book ad info: ", th2);
                return yz.g2.f100423a;
            }

            @Override // x00.q
            public final Object invoke(kotlinx.coroutines.flow.j<? super BookAdObservables.BookAdInfo> jVar, Throwable th2, j00.c<? super yz.g2> cVar) {
                a aVar = new a(cVar);
                aVar.f22023b = jVar;
                aVar.f22024c = th2;
                return aVar.invokeSuspend(yz.g2.f100423a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$refreshAd$1$2", f = "AllInOneVM.kt", i = {0}, l = {131}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
        public static final class b extends SuspendLambda implements x00.p<BookAdObservables.BookAdInfo, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f22025a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f22026b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j<th.a> f22027c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlinx.coroutines.flow.j<? super th.a> jVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f22027c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f22027c, cVar);
                bVar.f22026b = obj;
                return bVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(BookAdObservables.BookAdInfo bookAdInfo, j00.c<? super yz.g2> cVar) {
                return ((b) create(bookAdInfo, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                BookAdObservables.BookAdInfo bookAdInfo = (BookAdObservables.BookAdInfo) this.f22026b;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f22025a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    kotlinx.coroutines.flow.j<th.a> jVar = this.f22027c;
                    th.a b11 = bookAdInfo != null ? com.baicizhan.main.rx.a.b(bookAdInfo) : null;
                    this.f22026b = bookAdInfo;
                    this.f22025a = 1;
                    if (jVar.emit(b11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                qb.c.i(c3.f22150a, "refreshAd " + (bookAdInfo != null ? bookAdInfo.toString() : null), new Object[0]);
                return yz.g2.f100423a;
            }
        }

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            i iVar = new i(cVar);
            iVar.f22021c = obj;
            return iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        
            if (r0.emit(null, r6) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            if (kotlinx.coroutines.flow.k.y0(r2, r6) == r1) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f22021c
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r6.f22020b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r0 = r6.f22019a
                com.baicizhan.client.business.dataset.models.BookRecord r0 = (com.baicizhan.client.business.dataset.models.BookRecord) r0
                kotlin.e.n(r7)
                goto L86
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                java.lang.Object r0 = r6.f22019a
                com.baicizhan.client.business.dataset.models.BookRecord r0 = (com.baicizhan.client.business.dataset.models.BookRecord) r0
                kotlin.e.n(r7)
                goto L4d
            L2a:
                kotlin.e.n(r7)
                q9.x r7 = q9.x.r()
                com.baicizhan.client.business.dataset.models.BookRecord r7 = r7.k()
                r2 = 0
                if (r7 != 0) goto L50
                java.lang.Object r3 = l00.k.a(r0)
                r6.f22021c = r3
                java.lang.Object r7 = l00.k.a(r7)
                r6.f22019a = r7
                r6.f22020b = r4
                java.lang.Object r7 = r0.emit(r2, r6)
                if (r7 != r1) goto L4d
                goto L85
            L4d:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L50:
                int r4 = r7.bookId
                rx.c r4 = com.baicizhan.main.rx.BookAdObservables.h(r4)
                java.lang.String r5 = "queryBookAd(...)"
                kotlin.jvm.internal.g0.o(r4, r5)
                kotlinx.coroutines.flow.i r4 = com.baicizhan.client.business.util.RxFlowUtilsKt.asFlow(r4)
                com.baicizhan.main.home.plan.allinone.AllInOneVM$i$a r5 = new com.baicizhan.main.home.plan.allinone.AllInOneVM$i$a
                r5.<init>(r2)
                kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.k.v(r4, r5)
                com.baicizhan.main.home.plan.allinone.AllInOneVM$i$b r5 = new com.baicizhan.main.home.plan.allinone.AllInOneVM$i$b
                r5.<init>(r0, r2)
                kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.h1(r4, r5)
                java.lang.Object r0 = l00.k.a(r0)
                r6.f22021c = r0
                java.lang.Object r7 = l00.k.a(r7)
                r6.f22019a = r7
                r6.f22020b = r3
                java.lang.Object r7 = kotlinx.coroutines.flow.k.y0(r2, r6)
                if (r7 != r1) goto L86
            L85:
                return r1
            L86:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneVM.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super th.a> jVar, j00.c<? super yz.g2> cVar) {
            return ((i) create(jVar, cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$reviewClick$1", f = "AllInOneVM.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22028a;

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return AllInOneVM.this.new j(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22028a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                g1 g1Var = AllInOneVM.this.f21978a;
                UserRecord p11 = AllInOneVM.this.f21979b.p();
                if (p11 == null || (str = String.valueOf(p11.getUniqueId())) == null) {
                    str = "";
                }
                int l12 = AllInOneVM.this.f21979b.l();
                this.f22028a = 1;
                if (g1Var.b(str, l12, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$upgrade$2", f = "AllInOneVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22030a;

        public k(j00.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return AllInOneVM.this.new k(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22030a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            AllInOneVM.this.f21980c.a();
            AllInOneVM.this.f21980c.b();
            return yz.g2.f100423a;
        }
    }

    @Inject
    public AllInOneVM(@m80.k g1 showReview, @m80.k q9.x studyMgr, @m80.k e1 homeRepo) {
        kotlin.jvm.internal.g0.p(showReview, "showReview");
        kotlin.jvm.internal.g0.p(studyMgr, "studyMgr");
        kotlin.jvm.internal.g0.p(homeRepo, "homeRepo");
        this.f21978a = showReview;
        this.f21979b = studyMgr;
        this.f21980c = homeRepo;
        kotlinx.coroutines.flow.y<Boolean> a11 = kotlinx.coroutines.flow.o0.a(Boolean.TRUE);
        this.f21981d = a11;
        pg.u0 u0Var = pg.u0.f80487a;
        final kotlinx.coroutines.flow.i v02 = kotlinx.coroutines.flow.k.v0(u0Var.r());
        final kotlinx.coroutines.flow.i<Boolean> iVar = new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AllInOneVM.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneVM\n*L\n1#1,49:1\n18#2:50\n19#2:52\n51#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f21986a;

                @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2", f = "AllInOneVM.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f21986a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2$1 r0 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2$1 r0 = new com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.L$3
                        kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                        java.lang.Object r5 = r0.L$1
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1$2$1 r5 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                        kotlin.e.n(r6)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f21986a
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L6b
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$2 = r2
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L6b
                        return r1
                    L6b:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        };
        kotlinx.coroutines.flow.i<th.a> P0 = kotlinx.coroutines.flow.k.P0(new kotlinx.coroutines.flow.i<th.a>() { // from class: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AllInOneVM.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneVM\n*L\n1#1,49:1\n50#2:50\n52#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f21991a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AllInOneVM f21992b;

                @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2", f = "AllInOneVM.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "it", "$i$a$-map-AllInOneVM$bookAd$2", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    boolean Z$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, AllInOneVM allInOneVM) {
                    this.f21991a = jVar;
                    this.f21992b = allInOneVM;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
                
                    if (r2.emit(r11, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, j00.c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2$1 r0 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2$1 r0 = new com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L5b
                        if (r2 == r4) goto L3d
                        if (r2 != r3) goto L35
                        java.lang.Object r10 = r0.L$3
                        kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                        java.lang.Object r10 = r0.L$1
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2$1 r10 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto Lc8
                    L35:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L3d:
                        int r10 = r0.I$0
                        java.lang.Object r2 = r0.L$5
                        j00.c r2 = (j00.c) r2
                        java.lang.Object r2 = r0.L$4
                        kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                        java.lang.Object r4 = r0.L$3
                        kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                        java.lang.Object r5 = r0.L$2
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1$2$1 r6 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.e.n(r11)
                        r8 = r6
                        r6 = r10
                        r10 = r7
                        r7 = r8
                        goto La0
                    L5b:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r2 = r9.f21991a
                        r11 = r10
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        com.baicizhan.main.home.plan.allinone.AllInOneVM r5 = r9.f21992b
                        kotlinx.coroutines.flow.i r5 = com.baicizhan.main.home.plan.allinone.AllInOneVM.h(r5)
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$0 = r6
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$1 = r6
                        java.lang.Object r6 = l00.k.a(r10)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r2)
                        r0.L$3 = r6
                        r0.L$4 = r2
                        java.lang.Object r6 = l00.k.a(r0)
                        r0.L$5 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.Z$0 = r11
                        r0.I$1 = r6
                        r0.label = r4
                        java.lang.Object r11 = kotlinx.coroutines.flow.k.w0(r5, r0)
                        if (r11 != r1) goto L9d
                        goto Lc7
                    L9d:
                        r5 = r10
                        r7 = r0
                        r4 = r2
                    La0:
                        java.lang.Object r10 = l00.k.a(r10)
                        r0.L$0 = r10
                        java.lang.Object r10 = l00.k.a(r7)
                        r0.L$1 = r10
                        java.lang.Object r10 = l00.k.a(r5)
                        r0.L$2 = r10
                        java.lang.Object r10 = l00.k.a(r4)
                        r0.L$3 = r10
                        r10 = 0
                        r0.L$4 = r10
                        r0.L$5 = r10
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r10 = r2.emit(r11, r0)
                        if (r10 != r1) goto Lc8
                    Lc7:
                        return r1
                    Lc8:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super th.a> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        }, c40.h1.c());
        this.f21982e = P0;
        kotlinx.coroutines.flow.i<com.baicizhan.main.home.plan.allinone.b> I = kotlinx.coroutines.flow.k.I(P0, homeRepo.c(), new c(null));
        this.f21983f = I;
        this.f21984g = kotlinx.coroutines.flow.k.Q1(kotlinx.coroutines.flow.k.I(a11, I, new e(null)), ViewModelKt.getViewModelScope(this), h0.a.b(kotlinx.coroutines.flow.h0.f68148a, 0L, 0L, 3, null), new b.d(new Object()));
        final kotlinx.coroutines.flow.i h12 = kotlinx.coroutines.flow.k.h1(u0Var.r(), new a(null));
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.h1(new kotlinx.coroutines.flow.i<Boolean>() { // from class: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @kotlin.jvm.internal.u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AllInOneVM.kt\ncom/baicizhan/main/home/plan/allinone/AllInOneVM\n*L\n1#1,49:1\n18#2:50\n19#2:52\n77#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f21988a;

                @l00.d(c = "com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2", f = "AllInOneVM.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f21988a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, j00.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2$1 r0 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2$1 r0 = new com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r5 = r0.L$3
                        kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                        java.lang.Object r5 = r0.L$1
                        com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2$2$1 r5 = (com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r5
                        kotlin.e.n(r6)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L39:
                        kotlin.e.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f21988a
                        r2 = r5
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L6b
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r2 = l00.k.a(r5)
                        r0.L$2 = r2
                        java.lang.Object r2 = l00.k.a(r6)
                        r0.L$3 = r2
                        r2 = 0
                        r0.I$0 = r2
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L6b
                        return r1
                    L6b:
                        yz.g2 r5 = yz.g2.f100423a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneVM$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : yz.g2.f100423a;
            }
        }, new b(null)), c40.h1.c()), ViewModelKt.getViewModelScope(this));
    }

    @m80.l
    public final Object i(int i11, @m80.k AddType addType, @m80.k j00.c<? super yz.g2> cVar) {
        Object h11 = c40.i.h(c40.h1.c(), new d(i11, addType, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : yz.g2.f100423a;
    }

    public final Object j(j00.c<? super yz.g2> cVar) {
        Object h11 = c40.i.h(c40.h1.c(), new f(null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : yz.g2.f100423a;
    }

    @m80.k
    public final kotlinx.coroutines.flow.m0<com.baicizhan.main.home.plan.allinone.b> k() {
        return this.f21984g;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(th.a r8, com.baicizhan.main.home.plan.allinone.c1 r9, j00.c<? super com.baicizhan.main.home.plan.allinone.b> r10) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneVM.l(th.a, com.baicizhan.main.home.plan.allinone.c1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (j(r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.baicizhan.main.home.plan.allinone.AllInOneVM.h
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.home.plan.allinone.AllInOneVM$h r0 = (com.baicizhan.main.home.plan.allinone.AllInOneVM.h) r0
            int r1 = r0.f22018c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22018c = r1
            goto L18
        L13:
            com.baicizhan.main.home.plan.allinone.AllInOneVM$h r0 = new com.baicizhan.main.home.plan.allinone.AllInOneVM$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22016a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f22018c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r7)
            goto L6a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            goto L5a
        L3b:
            kotlin.e.n(r7)
            goto L51
        L3f:
            kotlin.e.n(r7)
            kotlinx.coroutines.flow.y<java.lang.Boolean> r7 = r6.f21981d
            java.lang.Boolean r2 = l00.a.a(r5)
            r0.f22018c = r5
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L51
            goto L69
        L51:
            r0.f22018c = r4
            java.lang.Object r7 = r6.j(r0)
            if (r7 != r1) goto L5a
            goto L69
        L5a:
            kotlinx.coroutines.flow.y<java.lang.Boolean> r7 = r6.f21981d
            r2 = 0
            java.lang.Boolean r2 = l00.a.a(r2)
            r0.f22018c = r3
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L6a
        L69:
            return r1
        L6a:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.allinone.AllInOneVM.m(j00.c):java.lang.Object");
    }

    public final kotlinx.coroutines.flow.i<th.a> n() {
        return kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.K0(new i(null)), c40.h1.c());
    }

    public final void o() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new j(null), 3, null);
    }

    @m80.l
    public final Object p(@m80.k j00.c<? super yz.g2> cVar) {
        Object h11 = c40.i.h(c40.h1.c(), new k(null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : yz.g2.f100423a;
    }
}
