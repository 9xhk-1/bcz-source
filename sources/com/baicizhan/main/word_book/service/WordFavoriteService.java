package com.baicizhan.main.word_book.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import c40.h1;
import c40.l2;
import c40.l3;
import c40.m0;
import c40.r0;
import c40.s0;
import com.baicizhan.main.word_book.data.FavoriteInfo;
import com.baicizhan.main.word_book.data.db.WordBookDatabase;
import com.baicizhan.main.word_book.service.WordFavoriteService;
import com.heytap.mcssdk.constant.IntentConstant;
import e40.o;
import e40.r;
import ij.e0;
import ij.h;
import ij.q;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.k0;
import x00.p;
import yg.a0;
import yz.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordFavoriteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteService.kt\ncom/baicizhan/main/word_book/service/WordFavoriteService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,433:1\n1617#2,9:434\n1869#2:443\n1870#2:445\n1626#2:446\n1#3:444\n37#4,2:447\n*S KotlinDebug\n*F\n+ 1 WordFavoriteService.kt\ncom/baicizhan/main/word_book/service/WordFavoriteService\n*L\n112#1:434,9\n112#1:443\n112#1:445\n112#1:446\n112#1:444\n127#1:447,2\n*E\n"})
/* loaded from: classes5.dex */
public final class WordFavoriteService extends Service {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final b f27689i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f27690j = 8;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final String f27691k = "com.baicizhan.main.wordfavorites.migrate";

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final String f27692l = "com.baicizhan.main.wordfavorites.refresh";

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f27693m = "com.baicizhan.main.wordfavorites.clear";

    /* renamed from: n, reason: collision with root package name */
    public static boolean f27694n;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r0 f27695a;

    /* renamed from: b, reason: collision with root package name */
    public WordBookDatabase f27696b;

    /* renamed from: c, reason: collision with root package name */
    public q f27697c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0 f27698d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f27699e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final o<String> f27700f;

    /* renamed from: g, reason: collision with root package name */
    public rj.a f27701g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public c f27702h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.WordFavoriteService$1", f = "WordFavoriteService.kt", i = {1, 2, 3}, l = {73, 77, 80, 84}, m = "invokeSuspend", n = {IntentConstant.COMMAND, IntentConstant.COMMAND, IntentConstant.COMMAND}, s = {"L$0", "L$0", "L$0"}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f27703a;

        /* renamed from: b, reason: collision with root package name */
        public int f27704b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.service.WordFavoriteService$1$1", f = "WordFavoriteService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.word_book.service.WordFavoriteService$a$a, reason: collision with other inner class name */
        public static final class C0334a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f27706a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WordFavoriteService f27707b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0334a(WordFavoriteService wordFavoriteService, j00.c<? super C0334a> cVar) {
                super(2, cVar);
                this.f27707b = wordFavoriteService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0334a(this.f27707b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0334a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f27706a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                qb.c.b(rj.f.f84224a, "attempt to clear all...", new Object[0]);
                WordBookDatabase wordBookDatabase = this.f27707b.f27696b;
                if (wordBookDatabase == null) {
                    g0.S("wordBookDatabase");
                    wordBookDatabase = null;
                }
                wordBookDatabase.clearAllTables();
                return g2.f100423a;
            }
        }

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteService.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:9:0x0032). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007f -> B:9:0x0032). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:9:0x0032). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:9:0x0032). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00aa -> B:9:0x0032). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b3 -> B:9:0x0032). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ce -> B:8:0x00d1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f27704b
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r5) goto L26
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r9.f27703a
                java.lang.String r1 = (java.lang.String) r1
                kotlin.e.n(r10)
                goto Ld1
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f27703a
                java.lang.String r1 = (java.lang.String) r1
                goto L2f
            L2b:
                kotlin.e.n(r10)
                goto L44
            L2f:
                kotlin.e.n(r10)
            L32:
                com.baicizhan.main.word_book.service.WordFavoriteService r10 = com.baicizhan.main.word_book.service.WordFavoriteService.this
                e40.o r10 = com.baicizhan.main.word_book.service.WordFavoriteService.e(r10)
                r9.f27703a = r6
                r9.f27704b = r4
                java.lang.Object r10 = r10.H(r9)
                if (r10 != r0) goto L44
                goto Ld0
            L44:
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r1 = "."
                java.lang.String r1 = u30.k0.Q5(r10, r1, r6, r5, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "command: "
                r7.append(r8)
                r7.append(r1)
                java.lang.String r1 = r7.toString()
                r7 = 0
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r8 = "WordFavoriteService"
                qb.c.i(r8, r1, r7)
                int r1 = r10.hashCode()
                r7 = 559285831(0x21560647, float:7.251433E-19)
                if (r1 == r7) goto Lad
                r7 = 804327205(0x2ff10f25, float:4.3848405E-10)
                if (r1 == r7) goto L93
                r7 = 831442005(0x318ecc55, float:4.155974E-9)
                if (r1 == r7) goto L79
                goto L32
            L79:
                java.lang.String r1 = "com.baicizhan.main.wordfavorites.refresh"
                boolean r1 = r10.equals(r1)
                if (r1 != 0) goto L82
                goto L32
            L82:
                com.baicizhan.main.word_book.service.WordFavoriteService r1 = com.baicizhan.main.word_book.service.WordFavoriteService.this
                java.lang.Object r10 = l00.k.a(r10)
                r9.f27703a = r10
                r9.f27704b = r3
                java.lang.Object r10 = com.baicizhan.main.word_book.service.WordFavoriteService.j(r1, r9)
                if (r10 != r0) goto L32
                goto Ld0
            L93:
                java.lang.String r1 = "com.baicizhan.main.wordfavorites.migrate"
                boolean r1 = r10.equals(r1)
                if (r1 != 0) goto L9c
                goto L32
            L9c:
                com.baicizhan.main.word_book.service.WordFavoriteService r1 = com.baicizhan.main.word_book.service.WordFavoriteService.this
                java.lang.Object r10 = l00.k.a(r10)
                r9.f27703a = r10
                r9.f27704b = r5
                java.lang.Object r10 = com.baicizhan.main.word_book.service.WordFavoriteService.i(r1, r9)
                if (r10 != r0) goto L32
                goto Ld0
            Lad:
                java.lang.String r1 = "com.baicizhan.main.wordfavorites.clear"
                boolean r1 = r10.equals(r1)
                if (r1 != 0) goto Lb7
                goto L32
            Lb7:
                c40.m0 r1 = c40.h1.c()
                com.baicizhan.main.word_book.service.WordFavoriteService$a$a r7 = new com.baicizhan.main.word_book.service.WordFavoriteService$a$a
                com.baicizhan.main.word_book.service.WordFavoriteService r8 = com.baicizhan.main.word_book.service.WordFavoriteService.this
                r7.<init>(r8, r6)
                java.lang.Object r10 = l00.k.a(r10)
                r9.f27703a = r10
                r9.f27704b = r2
                java.lang.Object r10 = c40.i.h(r1, r7, r9)
                if (r10 != r0) goto Ld1
            Ld0:
                return r0
            Ld1:
                com.baicizhan.main.word_book.service.WordFavoriteService r10 = com.baicizhan.main.word_book.service.WordFavoriteService.this
                r10.stopSelf()
                goto L32
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.service.WordFavoriteService.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements DefaultLifecycleObserver {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.baicizhan.main.word_book.service.a f27708a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f27709b;

            public a(com.baicizhan.main.word_book.service.a aVar, Context context) {
                this.f27708a = aVar;
                this.f27709b = context;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
                super.onCreate(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                g0.p(owner, "owner");
                super.onDestroy(owner);
                this.f27709b.unbindService(this.f27708a);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
                super.onPause(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onResume(LifecycleOwner lifecycleOwner) {
                super.onResume(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
                super.onStart(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
                super.onStop(lifecycleOwner);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.word_book.service.WordFavoriteService$b$b, reason: collision with other inner class name */
        public static final class C0335b implements DefaultLifecycleObserver {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.baicizhan.main.word_book.service.a f27710a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f27711b;

            public C0335b(com.baicizhan.main.word_book.service.a aVar, Context context) {
                this.f27710a = aVar;
                this.f27711b = context;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
                super.onCreate(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                g0.p(owner, "owner");
                super.onDestroy(owner);
                this.f27711b.unbindService(this.f27710a);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
                super.onPause(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onResume(LifecycleOwner lifecycleOwner) {
                super.onResume(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
                super.onStart(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
                super.onStop(lifecycleOwner);
            }
        }

        public /* synthetic */ b(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@k Context context, @l rj.e eVar) {
            Map map;
            g0.p(context, "context");
            com.baicizhan.main.word_book.service.a aVar = new com.baicizhan.main.word_book.service.a(eVar);
            if (context.bindService(new Intent(context, (Class<?>) WordFavoriteService.class), aVar, 1)) {
                if (context instanceof LifecycleOwner) {
                    ((LifecycleOwner) context).getLifecycle().addObserver(new a(aVar, context));
                } else {
                    map = rj.f.f84225b;
                    map.put(Integer.valueOf(eVar != null ? eVar.hashCode() : 0), new WeakReference(aVar));
                }
            }
        }

        public final void b(@k Fragment fragment, @k rj.e callback) {
            g0.p(fragment, "fragment");
            g0.p(callback, "callback");
            com.baicizhan.main.word_book.service.a aVar = new com.baicizhan.main.word_book.service.a(callback);
            Context requireContext = fragment.requireContext();
            g0.o(requireContext, "requireContext(...)");
            if (requireContext.bindService(new Intent(requireContext, (Class<?>) WordFavoriteService.class), aVar, 1)) {
                fragment.getLifecycle().addObserver(new C0335b(aVar, requireContext));
            }
        }

        public final void c(@k Context context) {
            g0.p(context, "context");
            context.startService(new Intent(context, (Class<?>) WordFavoriteService.class));
        }

        public final void d(@k Context context, @k String action) {
            g0.p(context, "context");
            g0.p(action, "action");
            Intent intent = new Intent(context, (Class<?>) WordFavoriteService.class);
            intent.setAction(action);
            context.startService(intent);
            if (g0.g(action, WordFavoriteService.f27693m)) {
                WordFavoriteService.f27694n = true;
            }
        }

        public final void e(@k Context context) {
            g0.p(context, "context");
            if (WordFavoriteService.f27694n) {
                qb.c.b(rj.f.f84224a, "Stopping is already ongoing.", new Object[0]);
            } else {
                context.stopService(new Intent(context, (Class<?>) WordFavoriteService.class));
            }
        }

        public final void f(@k Context context, @k rj.e callback) {
            Map map;
            ServiceConnection serviceConnection;
            Map map2;
            g0.p(context, "context");
            g0.p(callback, "callback");
            map = rj.f.f84225b;
            WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(callback.hashCode()));
            if (weakReference == null || (serviceConnection = (ServiceConnection) weakReference.get()) == null) {
                return;
            }
            context.unbindService(serviceConnection);
            map2 = rj.f.f84225b;
            map2.put(Integer.valueOf(callback.hashCode()), null);
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends Binder implements ij.e {

        /* renamed from: b, reason: collision with root package name */
        public static final int f27712b = 8;

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ij.e f27713a;

        public c(@k ij.e controller) {
            g0.p(controller, "controller");
            this.f27713a = controller;
        }

        @Override // ij.m
        @k
        public Set<Integer> C() {
            return this.f27713a.C();
        }

        @Override // ij.e
        @k
        public LiveData<Throwable> F(boolean z11, @k List<Long> bookIds, @k e0... words) {
            g0.p(bookIds, "bookIds");
            g0.p(words, "words");
            return this.f27713a.F(z11, bookIds, words);
        }

        @Override // ij.e
        @k
        public LiveData<pj.b> M(boolean z11, @k e0... words) {
            g0.p(words, "words");
            return this.f27713a.M(z11, words);
        }

        @Override // ij.t
        @k
        public q O() {
            return this.f27713a.O();
        }

        @Override // ij.e
        @k
        public LiveData<dg.d<List<FavoriteInfo>>> d0(long j11) {
            return this.f27713a.d0(j11);
        }

        @Override // ij.e
        @l
        public Object o(long j11, @k j00.c<? super List<FavoriteInfo>> cVar) {
            return this.f27713a.o(j11, cVar);
        }

        @Override // ij.m
        public void q(@k h topics) {
            g0.p(topics, "topics");
            this.f27713a.q(topics);
        }

        @Override // ij.m
        public void reset() {
            this.f27713a.reset();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.WordFavoriteService$controller$1", f = "WordFavoriteService.kt", i = {}, l = {104, 105}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27714a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteService.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            if (r6.u(r5) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        
            if (c40.a1.b(300, r5) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f27714a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L43
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L2c
            L1e:
                kotlin.e.n(r6)
                r5.f27714a = r3
                r3 = 300(0x12c, double:1.48E-321)
                java.lang.Object r6 = c40.a1.b(r3, r5)
                if (r6 != r0) goto L2c
                goto L42
            L2c:
                com.baicizhan.main.word_book.service.WordFavoriteService r6 = com.baicizhan.main.word_book.service.WordFavoriteService.this
                rj.a r6 = com.baicizhan.main.word_book.service.WordFavoriteService.f(r6)
                if (r6 != 0) goto L3a
                java.lang.String r6 = "favoriteController"
                kotlin.jvm.internal.g0.S(r6)
                r6 = 0
            L3a:
                r5.f27714a = r2
                java.lang.Object r6 = r6.u(r5)
                if (r6 != r0) goto L43
            L42:
                return r0
            L43:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.service.WordFavoriteService.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.WordFavoriteService", f = "WordFavoriteService.kt", i = {0, 0, 1, 1}, l = {126, 127}, m = "migrateCollects", n = {"it", "$i$a$-let-WordFavoriteService$migrateCollects$3", "it", "$i$a$-let-WordFavoriteService$migrateCollects$3"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f27716a;

        /* renamed from: b, reason: collision with root package name */
        public int f27717b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f27718c;

        /* renamed from: e, reason: collision with root package name */
        public int f27720e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f27718c = obj;
            this.f27720e |= Integer.MIN_VALUE;
            return WordFavoriteService.this.o(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.WordFavoriteService$onStartCommand$1", f = "WordFavoriteService.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27721a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f27723c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordFavoriteService.this.new f(this.f27723c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f27721a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                o oVar = WordFavoriteService.this.f27700f;
                String str = this.f27723c;
                if (str == null) {
                    return g2.f100423a;
                }
                this.f27721a = 1;
                if (oVar.b(str, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.WordFavoriteService", f = "WordFavoriteService.kt", i = {}, l = {136, 137, 145, 146}, m = "refreshBooksIfNecessary", n = {}, s = {}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f27724a;

        /* renamed from: c, reason: collision with root package name */
        public int f27726c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f27724a = obj;
            this.f27726c |= Integer.MIN_VALUE;
            return WordFavoriteService.this.p(this);
        }
    }

    public WordFavoriteService() {
        l2 f11;
        a0 a0Var = new a0(l3.c(null, 1, null).plus(h1.e()));
        this.f27695a = a0Var;
        this.f27698d = yz.e0.c(new x00.a() { // from class: rj.b
            @Override // x00.a
            public final Object invoke() {
                jj.a q11;
                q11 = WordFavoriteService.q(WordFavoriteService.this);
                return q11;
            }
        });
        this.f27699e = yz.e0.c(new x00.a() { // from class: rj.c
            @Override // x00.a
            public final Object invoke() {
                jj.k r11;
                r11 = WordFavoriteService.r(WordFavoriteService.this);
                return r11;
            }
        });
        this.f27700f = r.d(0, null, null, 7, null);
        f11 = c40.k.f(a0Var, null, null, new a(null), 3, null);
        f11.z0(new x00.l() { // from class: rj.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = WordFavoriteService.d((Throwable) obj);
                return d11;
            }
        });
    }

    public static final g2 d(Throwable th2) {
        qb.c.b(rj.f.f84224a, "commands handler canceled: " + (th2 != null ? th2.getMessage() : null), new Object[0]);
        return g2.f100423a;
    }

    public static final jj.a q(WordFavoriteService wordFavoriteService) {
        WordBookDatabase wordBookDatabase = wordFavoriteService.f27696b;
        if (wordBookDatabase == null) {
            g0.S("wordBookDatabase");
            wordBookDatabase = null;
        }
        return wordBookDatabase.g();
    }

    public static final jj.k r(WordFavoriteService wordFavoriteService) {
        WordBookDatabase wordBookDatabase = wordFavoriteService.f27696b;
        if (wordBookDatabase == null) {
            g0.S("wordBookDatabase");
            wordBookDatabase = null;
        }
        return wordBookDatabase.h();
    }

    public final c l() {
        if (this.f27702h == null) {
            rj.a aVar = this.f27701g;
            if (aVar == null) {
                g0.S("favoriteController");
                aVar = null;
            }
            this.f27702h = new c(aVar);
            c40.k.f(this.f27695a, null, null, new d(null), 3, null);
        }
        c cVar = this.f27702h;
        g0.n(cVar, "null cannot be cast to non-null type com.baicizhan.main.word_book.service.WordFavoriteService.Controller");
        return cVar;
    }

    public final jj.a m() {
        return (jj.a) this.f27698d.getValue();
    }

    public final jj.k n() {
        return (jj.k) this.f27699e.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(3:20|21|22))(5:27|(5:30|(1:32)(8:38|(1:40)(1:51)|41|(1:43)(1:50)|44|(1:46)(1:49)|47|48)|(2:34|35)(1:37)|36|28)|52|53|(2:55|25)(1:56))|23|(4:26|13|14|15)|25))|59|6|7|(0)(0)|23|(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        qb.c.c(rj.f.f84224a, "", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.service.WordFavoriteService.o(j00.c):java.lang.Object");
    }

    @Override // android.app.Service
    @k
    public IBinder onBind(@l Intent intent) {
        qb.c.i(rj.f.f84224a, "wfs bound", new Object[0]);
        return l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        qb.c.i(rj.f.f84224a, "wfs created", new Object[0]);
        this.f27696b = new ij.l(this).getValue();
        WordBookDatabase wordBookDatabase = this.f27696b;
        m0 m0Var = null;
        Object[] objArr = 0;
        if (wordBookDatabase == null) {
            g0.S("wordBookDatabase");
            wordBookDatabase = null;
        }
        this.f27697c = new ij.r(this, wordBookDatabase).getValue();
        q qVar = this.f27697c;
        if (qVar == null) {
            g0.S("wordBookManager");
            qVar = null;
        }
        this.f27701g = new rj.a(qVar, m0Var, 2, objArr == true ? 1 : 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Map map;
        super.onDestroy();
        qb.c.i(rj.f.f84224a, "wfs destroyed", new Object[0]);
        map = rj.f.f84225b;
        map.clear();
        s0.e(this.f27695a, "cancel tasks by on-destroy", null, 2, null);
    }

    @Override // android.app.Service
    public void onRebind(@l Intent intent) {
        qb.c.i(rj.f.f84224a, "wfs rebound", new Object[0]);
        l();
    }

    @Override // android.app.Service
    public int onStartCommand(@l Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        String action = intent != null ? intent.getAction() : null;
        qb.c.i(rj.f.f84224a, "wfs action attempt: " + (action != null ? k0.Q5(action, ".", null, 2, null) : null), new Object[0]);
        c40.k.f(this.f27695a, null, null, new f(action, null), 3, null);
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(@l Intent intent) {
        qb.c.i(rj.f.f84224a, "wfs unbound", new Object[0]);
        rj.a aVar = this.f27701g;
        if (aVar == null) {
            g0.S("favoriteController");
            aVar = null;
        }
        aVar.reset();
        this.f27702h = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r9.K(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        if (r12.P(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r12 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.service.WordFavoriteService.p(j00.c):java.lang.Object");
    }
}
