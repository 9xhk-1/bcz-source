package com.baicizhan.main.selftest;

import a00.h0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c40.r0;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.selftest.FastTestStrategy;
import com.baicizhan.main.selftest.b;
import en.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import ma.t;
import org.junit.jupiter.api.j2;
import q9.l;
import x00.p;
import yh.a;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFastTestModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n827#2:223\n855#2,2:224\n1573#2:226\n1604#2,4:227\n1788#2,4:231\n827#2:236\n855#2,2:237\n1#3:235\n*S KotlinDebug\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel\n*L\n36#1:223\n36#1:224,2\n88#1:226\n88#1:227,4\n117#1:231,4\n190#1:236\n190#1:237,2\n*E\n"})
/* loaded from: classes4.dex */
public final class a extends ViewModel {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f24892i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f24893j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final String f24894k = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final FastTestStrategy f24895a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f24896b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<uh.f> f24897c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableState<com.baicizhan.main.selftest.b> f24898d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final SnapshotStateList<uh.f> f24899e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public MutableState<Integer> f24900f;

    /* renamed from: g, reason: collision with root package name */
    public int f24901g;

    /* renamed from: h, reason: collision with root package name */
    public int f24902h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$1", f = "FastTestModel.kt", i = {}, l = {60, 60}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.main.selftest.a$a, reason: collision with other inner class name */
    public static final class C0322a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f24903a;

        /* renamed from: b, reason: collision with root package name */
        public int f24904b;

        public C0322a(j00.c<? super C0322a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new C0322a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C0322a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r1.x((yh.a.e) r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
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
                int r1 = r4.f24904b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f24903a
                com.baicizhan.main.selftest.a r1 = (com.baicizhan.main.selftest.a) r1
                kotlin.e.n(r5)
                goto L36
            L22:
                kotlin.e.n(r5)
                com.baicizhan.main.selftest.a r1 = com.baicizhan.main.selftest.a.this
                com.baicizhan.main.selftest.FastTestStrategy r5 = com.baicizhan.main.selftest.a.f(r1)
                r4.f24903a = r1
                r4.f24904b = r3
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L36
                goto L43
            L36:
                yh.a$e r5 = (yh.a.e) r5
                r3 = 0
                r4.f24903a = r3
                r4.f24904b = r2
                java.lang.Object r5 = com.baicizhan.main.selftest.a.k(r1, r5, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.C0322a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24906a;

        static {
            int[] iArr = new int[FastTestStrategy.ResetType.values().length];
            try {
                iArr[FastTestStrategy.ResetType.TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24906a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$continueHistory$1", f = "FastTestModel.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class d extends SuspendLambda implements p<a.e, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24907a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24908b;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = a.this.new d(cVar);
            dVar.f24908b = obj;
            return dVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.e eVar, j00.c<? super g2> cVar) {
            return ((d) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.e eVar = (a.e) this.f24908b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f24907a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                a.this.f24895a.r(eVar);
                a aVar = a.this;
                this.f24908b = l00.k.a(eVar);
                this.f24907a = 1;
                if (aVar.H(eVar, this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel", f = "FastTestModel.kt", i = {0}, l = {79}, m = "initialize", n = {r.f50027a}, s = {"L$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f24910a;

        /* renamed from: b, reason: collision with root package name */
        public Object f24911b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f24912c;

        /* renamed from: e, reason: collision with root package name */
        public int f24914e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f24912c = obj;
            this.f24914e |= Integer.MIN_VALUE;
            return a.this.x(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$nextPointer$1", f = "FastTestModel.kt", i = {0, 0}, l = {47}, m = "invokeSuspend", n = {"it", "$i$a$-let-FastTestModel$nextPointer$1$1"}, s = {"L$1", "I$0"}, v = 1)
    @u0({"SMAP\nFastTestModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel$nextPointer$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n360#2,7:223\n*S KotlinDebug\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel$nextPointer$1\n*L\n49#1:223,7\n*E\n"})
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f24915a;

        /* renamed from: b, reason: collision with root package name */
        public Object f24916b;

        /* renamed from: c, reason: collision with root package name */
        public Object f24917c;

        /* renamed from: d, reason: collision with root package name */
        public int f24918d;

        /* renamed from: e, reason: collision with root package name */
        public int f24919e;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new f(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            uh.f fVar;
            a aVar;
            uh.f fVar2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f24919e;
            int i12 = 0;
            if (i11 == 0) {
                kotlin.e.n(obj);
                uh.f fVar3 = (uh.f) a00.r0.b3(a.this.f24897c, a.this.f24901g);
                if (fVar3 != null) {
                    a aVar2 = a.this;
                    qb.c.b(a.f24894k, "topic " + fVar3.a() + " ready: " + (fVar3.c() != null), new Object[0]);
                    if (fVar3.c() == null) {
                        FastTestStrategy fastTestStrategy = aVar2.f24895a;
                        int a11 = fVar3.a();
                        this.f24915a = aVar2;
                        this.f24916b = fVar3;
                        this.f24917c = fVar3;
                        this.f24918d = 0;
                        this.f24919e = 1;
                        Object i13 = fastTestStrategy.i(a11, this);
                        if (i13 == l11) {
                            return l11;
                        }
                        fVar = fVar3;
                        obj = i13;
                        aVar = aVar2;
                        fVar2 = fVar;
                    }
                }
                return g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (uh.f) this.f24917c;
            fVar2 = (uh.f) this.f24916b;
            aVar = (a) this.f24915a;
            kotlin.e.n(obj);
            fVar.g((TopicRecord) obj);
            qb.c.b(a.f24894k, "topic " + fVar2.a() + " fetched done", new Object[0]);
            MutableState mutableState = aVar.f24900f;
            Iterator<T> it = aVar.f24899e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (((uh.f) it.next()).a() == fVar2.a()) {
                    break;
                }
                i12++;
            }
            mutableState.setValue(l00.a.f(i12));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel", f = "FastTestModel.kt", i = {0}, l = {131}, m = "postReset", n = {r.f50027a}, s = {"L$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f24921a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24922b;

        /* renamed from: d, reason: collision with root package name */
        public int f24924d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f24922b = obj;
            this.f24924d |= Integer.MIN_VALUE;
            return a.this.H(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$resetAll$1", f = "FastTestModel.kt", i = {}, l = {185, 185}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f24925a;

        /* renamed from: b, reason: collision with root package name */
        public int f24926b;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r1.H((yh.a.e) r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
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
                int r1 = r4.f24926b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f24925a
                com.baicizhan.main.selftest.a r1 = (com.baicizhan.main.selftest.a) r1
                kotlin.e.n(r5)
                goto L36
            L22:
                kotlin.e.n(r5)
                com.baicizhan.main.selftest.a r1 = com.baicizhan.main.selftest.a.this
                com.baicizhan.main.selftest.FastTestStrategy r5 = com.baicizhan.main.selftest.a.f(r1)
                r4.f24925a = r1
                r4.f24926b = r3
                java.lang.Object r5 = r5.n(r4)
                if (r5 != r0) goto L36
                goto L43
            L36:
                yh.a$e r5 = (yh.a.e) r5
                r3 = 0
                r4.f24925a = r3
                r4.f24926b = r2
                java.lang.Object r5 = com.baicizhan.main.selftest.a.l(r1, r5, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$resetToday$1", f = "FastTestModel.kt", i = {}, l = {179, 179}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nFastTestModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel$resetToday$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1563#2:223\n1634#2,3:224\n*S KotlinDebug\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel$resetToday$1\n*L\n179#1:223\n179#1:224,3\n*E\n"})
    public static final class i extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f24928a;

        /* renamed from: b, reason: collision with root package name */
        public int f24929b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<uh.f> f24931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<uh.f> list, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f24931d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new i(this.f24931d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
        
            if (r1.H((yh.a.e) r9, r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r9 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f24929b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.e.n(r9)
                goto L72
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                java.lang.Object r1 = r8.f24928a
                com.baicizhan.main.selftest.a r1 = (com.baicizhan.main.selftest.a) r1
                kotlin.e.n(r9)
                goto L65
            L23:
                kotlin.e.n(r9)
                com.baicizhan.main.selftest.a r1 = com.baicizhan.main.selftest.a.this
                com.baicizhan.main.selftest.FastTestStrategy r9 = com.baicizhan.main.selftest.a.f(r1)
                java.util.List<uh.f> r5 = r8.f24931d
                if (r5 == 0) goto L59
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = a00.i0.d0(r5, r7)
                r6.<init>(r7)
                java.util.Iterator r5 = r5.iterator()
            L41:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L5a
                java.lang.Object r7 = r5.next()
                uh.f r7 = (uh.f) r7
                int r7 = r7.a()
                java.lang.Integer r7 = l00.a.f(r7)
                r6.add(r7)
                goto L41
            L59:
                r6 = r2
            L5a:
                r8.f24928a = r1
                r8.f24929b = r4
                java.lang.Object r9 = r9.o(r6, r8)
                if (r9 != r0) goto L65
                goto L71
            L65:
                yh.a$e r9 = (yh.a.e) r9
                r8.f24928a = r2
                r8.f24929b = r3
                java.lang.Object r9 = com.baicizhan.main.selftest.a.l(r1, r9, r8)
                if (r9 != r0) goto L72
            L71:
                return r0
            L72:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$save$1", f = "FastTestModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements p<a.e, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24932a;

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new j(cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.e eVar, j00.c<? super g2> cVar) {
            return ((j) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f24932a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel$save$2", f = "FastTestModel.kt", i = {1}, l = {193, 196}, m = "invokeSuspend", n = {r.f50027a}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nFastTestModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel$save$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1563#2:223\n1634#2,3:224\n1869#2,2:227\n*S KotlinDebug\n*F\n+ 1 FastTestModel.kt\ncom/baicizhan/main/selftest/FastTestModel$save$2\n*L\n193#1:223\n193#1:224,3\n194#1:227,2\n*E\n"})
    public static final class k extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f24933a;

        /* renamed from: b, reason: collision with root package name */
        public int f24934b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<uh.f> f24936d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p<a.e, j00.c<? super g2>, Object> f24937e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(List<uh.f> list, p<? super a.e, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super k> cVar) {
            super(2, cVar);
            this.f24936d = list;
            this.f24937e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return a.this.new k(this.f24936d, this.f24937e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            if (r1.invoke(r7, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            if (r7 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f24934b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r6.f24933a
                yh.a$e r0 = (yh.a.e) r0
                kotlin.e.n(r7)
                goto L90
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                kotlin.e.n(r7)
                goto L63
            L23:
                kotlin.e.n(r7)
                com.baicizhan.main.selftest.a r7 = com.baicizhan.main.selftest.a.this
                com.baicizhan.main.selftest.FastTestStrategy r7 = com.baicizhan.main.selftest.a.f(r7)
                java.util.List<uh.f> r1 = r6.f24936d
                if (r1 == 0) goto L59
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = a00.i0.d0(r1, r5)
                r4.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L41:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L5a
                java.lang.Object r5 = r1.next()
                uh.f r5 = (uh.f) r5
                int r5 = r5.a()
                java.lang.Integer r5 = l00.a.f(r5)
                r4.add(r5)
                goto L41
            L59:
                r4 = 0
            L5a:
                r6.f24934b = r3
                java.lang.Object r7 = r7.p(r4, r6)
                if (r7 != r0) goto L63
                goto L8f
            L63:
                java.util.List<uh.f> r1 = r6.f24936d
                yh.a$e r7 = (yh.a.e) r7
                if (r1 == 0) goto L7f
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L6f:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L7f
                java.lang.Object r4 = r1.next()
                uh.f r4 = (uh.f) r4
                r4.i(r3)
                goto L6f
            L7f:
                x00.p<yh.a$e, j00.c<? super yz.g2>, java.lang.Object> r1 = r6.f24937e
                java.lang.Object r3 = l00.k.a(r7)
                r6.f24933a = r3
                r6.f24934b = r2
                java.lang.Object r7 = r1.invoke(r7, r6)
                if (r7 != r0) goto L90
            L8f:
                return r0
            L90:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.selftest.FastTestModel", f = "FastTestModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {89}, m = "setupTopics", n = {"topicIds", "$this$mapIndexed$iv", "$this$mapIndexedTo$iv$iv", "destination$iv$iv", "item$iv$iv", "$i$f$mapIndexed", "$i$f$mapIndexedTo", "index$iv$iv", "id", "i", "$i$a$-mapIndexed-FastTestModel$setupTopics$2"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f24938a;

        /* renamed from: b, reason: collision with root package name */
        public Object f24939b;

        /* renamed from: c, reason: collision with root package name */
        public Object f24940c;

        /* renamed from: d, reason: collision with root package name */
        public Object f24941d;

        /* renamed from: e, reason: collision with root package name */
        public Object f24942e;

        /* renamed from: f, reason: collision with root package name */
        public Object f24943f;

        /* renamed from: g, reason: collision with root package name */
        public Object f24944g;

        /* renamed from: h, reason: collision with root package name */
        public Object f24945h;

        /* renamed from: i, reason: collision with root package name */
        public int f24946i;

        /* renamed from: j, reason: collision with root package name */
        public int f24947j;

        /* renamed from: k, reason: collision with root package name */
        public int f24948k;

        /* renamed from: l, reason: collision with root package name */
        public int f24949l;

        /* renamed from: m, reason: collision with root package name */
        public int f24950m;

        /* renamed from: n, reason: collision with root package name */
        public int f24951n;

        /* renamed from: o, reason: collision with root package name */
        public int f24952o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f24953p;

        /* renamed from: r, reason: collision with root package name */
        public int f24955r;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f24953p = obj;
            this.f24955r |= Integer.MIN_VALUE;
            return a.this.O(null, this);
        }
    }

    public a(@m80.k FastTestStrategy strategy) {
        g0.p(strategy, "strategy");
        this.f24895a = strategy;
        this.f24896b = e0.c(new x00.a() { // from class: uh.a
            @Override // x00.a
            public final Object invoke() {
                l n11;
                n11 = com.baicizhan.main.selftest.a.n();
                return n11;
            }
        });
        this.f24897c = new ArrayList();
        this.f24898d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(b.e.f25042c, null, 2, null);
        this.f24899e = SnapshotStateKt.mutableStateListOf();
        this.f24900f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        this.f24902h = -1;
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new C0322a(null), 3, null);
    }

    public static final boolean A(x00.l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public static /* synthetic */ boolean C(a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return aVar.B(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void M(a aVar, List list, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aVar.s();
        }
        if ((i11 & 2) != 0) {
            pVar = new j(null);
        }
        aVar.L(list, pVar);
    }

    public static final q9.l n() {
        return new q9.l(null, 1, null);
    }

    private final void q() {
        if (c.f24906a[this.f24895a.g().ordinal()] == 1) {
            this.f24898d.setValue(new b.d(s()));
        } else {
            this.f24898d.setValue(new b.a(s()));
        }
        List<uh.f> s11 = s();
        int i11 = 0;
        if (!(s11 instanceof Collection) || !s11.isEmpty()) {
            Iterator<T> it = s11.iterator();
            while (it.hasNext()) {
                if (((uh.f) it.next()).d() && (i11 = i11 + 1) < 0) {
                    h0.a0();
                }
            }
        }
        if (i11 > 0) {
            ma.l.a(t.f73011j, ma.a.f72749g1);
        }
    }

    public static final boolean z(int i11, uh.f i12) {
        g0.p(i12, "i");
        return i12.a() == i11;
    }

    public final boolean B(boolean z11) {
        SnapshotStateList<uh.f> snapshotStateList = this.f24899e;
        List<uh.f> list = this.f24897c;
        int i11 = this.f24901g;
        N(i11 + 1);
        uh.f fVar = (uh.f) a00.r0.b3(list, i11);
        if (fVar == null) {
            qb.c.b(f24894k, "more: failed", new Object[0]);
            q();
            return false;
        }
        String str = f24894k;
        int size = this.f24899e.size();
        TopicRecord c11 = fVar.c();
        qb.c.b(str, "more: current_size = " + size + j2.O + (c11 != null ? c11.word : null), new Object[0]);
        if (z11) {
            G(fVar);
        }
        snapshotStateList.add(fVar);
        return true;
    }

    public final void D(int i11, @m80.k x00.l<? super Integer, g2> onChange) {
        g0.p(onChange, "onChange");
        int i12 = i11 + 1;
        if (i12 < s().size()) {
            onChange.invoke(Integer.valueOf(i12));
            return;
        }
        if (C(this, false, 1, null)) {
            this.f24902h = i12;
            qb.c.b(f24894k, "next: pending " + i12, new Object[0]);
            onChange.invoke(Integer.valueOf(i12));
        }
    }

    public final void F(int i11) {
        uh.f fVar = (uh.f) a00.r0.b3(s(), i11);
        if (fVar != null) {
            G(fVar);
            return;
        }
        qb.c.b(f24894k, "no topic at " + i11, new Object[0]);
    }

    public final void G(@m80.k uh.f topic) {
        g0.p(topic, "topic");
        TopicRecord c11 = topic.c();
        if (c11 != null) {
            ZPackUtils.loadAudioCompat(r(), c11, c11.wordAudio);
            return;
        }
        qb.c.q(f24894k, "no record to play: " + topic.a(), new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(yh.a.e r5, j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.baicizhan.main.selftest.a.g
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.main.selftest.a$g r0 = (com.baicizhan.main.selftest.a.g) r0
            int r1 = r0.f24924d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24924d = r1
            goto L18
        L13:
            com.baicizhan.main.selftest.a$g r0 = new com.baicizhan.main.selftest.a$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24922b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f24924d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f24921a
            yh.a$e r5 = (yh.a.e) r5
            kotlin.e.n(r6)
            goto L70
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            if (r5 == 0) goto L3d
            java.util.List<java.lang.Integer> r6 = r5.f100147c
            goto L3e
        L3d:
            r6 = 0
        L3e:
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L7f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L49
            goto L7f
        L49:
            r6 = -1
            r4.f24902h = r6
            r6 = 0
            r4.N(r6)
            androidx.compose.runtime.MutableState<com.baicizhan.main.selftest.b> r6 = r4.f24898d
            com.baicizhan.main.selftest.b$e r2 = com.baicizhan.main.selftest.b.e.f25042c
            r6.setValue(r2)
            kotlin.jvm.internal.g0.m(r5)
            java.util.List<java.lang.Integer> r6 = r5.f100147c
            java.lang.String r2 = "ids"
            kotlin.jvm.internal.g0.o(r6, r2)
            java.lang.Object r5 = l00.k.a(r5)
            r0.f24921a = r5
            r0.f24924d = r3
            java.lang.Object r5 = r4.O(r6, r0)
            if (r5 != r1) goto L70
            return r1
        L70:
            androidx.compose.runtime.MutableState<com.baicizhan.main.selftest.b> r5 = r4.f24898d
            com.baicizhan.main.selftest.b$c r6 = new com.baicizhan.main.selftest.b$c
            java.util.List r0 = r4.s()
            r6.<init>(r0)
            r5.setValue(r6)
            goto L86
        L7f:
            androidx.compose.runtime.MutableState<com.baicizhan.main.selftest.b> r5 = r4.f24898d
            com.baicizhan.main.selftest.b$b r6 = com.baicizhan.main.selftest.b.C0323b.f25038c
            r5.setValue(r6)
        L86:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.H(yh.a$e, j00.c):java.lang.Object");
    }

    public final void I(int i11, @m80.k uh.f topic, @m80.k x00.l<? super Integer, g2> onChange) {
        g0.p(topic, "topic");
        g0.p(onChange, "onChange");
        topic.h(true);
        D(i11, onChange);
    }

    public final void J() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
    }

    public final void K(@m80.l List<uh.f> list) {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new i(list, null), 3, null);
    }

    public final void L(@m80.l List<uh.f> list, @m80.k p<? super a.e, ? super j00.c<? super g2>, ? extends Object> onSaved) {
        ArrayList arrayList;
        g0.p(onSaved, "onSaved");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                uh.f fVar = (uh.f) obj;
                if (fVar.d() && !fVar.b() && !fVar.e() && fVar.c() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        qb.c.b(f24894k, "saving... count = " + (arrayList != null ? Integer.valueOf(arrayList.size()) : null), new Object[0]);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new k(arrayList, onSaved, null), 3, null);
    }

    public final void N(int i11) {
        int i12 = this.f24901g;
        this.f24901g = i11;
        if (i12 != i11) {
            c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new f(null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00f5 -> B:10:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0119 -> B:12:0x0134). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.util.List<java.lang.Integer> r25, j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.O(java.util.List, j00.c):java.lang.Object");
    }

    public final boolean o(int i11) {
        int i12 = this.f24902h;
        boolean z11 = i11 == i12;
        qb.c.b(f24894k, "check next " + z11 + ": " + i11 + j2.O + i12, new Object[0]);
        if (z11) {
            this.f24902h = -1;
        }
        return z11;
    }

    public final void p(@m80.l List<uh.f> list) {
        L(list, new d(null));
    }

    public final IAudioPlayer r() {
        return (IAudioPlayer) this.f24896b.getValue();
    }

    @m80.k
    public final List<uh.f> s() {
        return this.f24899e;
    }

    @m80.k
    public final State<Integer> t() {
        return this.f24900f;
    }

    public final int u() {
        List<uh.f> w11 = w();
        ArrayList arrayList = new ArrayList();
        for (Object obj : w11) {
            if (!((uh.f) obj).b()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() - s().size();
    }

    @m80.k
    public final State<com.baicizhan.main.selftest.b> v() {
        return this.f24898d;
    }

    @m80.k
    public final List<uh.f> w() {
        return this.f24897c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(yh.a.e r7, j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.selftest.a.e
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.selftest.a$e r0 = (com.baicizhan.main.selftest.a.e) r0
            int r1 = r0.f24914e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24914e = r1
            goto L18
        L13:
            com.baicizhan.main.selftest.a$e r0 = new com.baicizhan.main.selftest.a$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24912c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f24914e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f24911b
            androidx.compose.runtime.MutableState r7 = (androidx.compose.runtime.MutableState) r7
            java.lang.Object r0 = r0.f24910a
            yh.a$e r0 = (yh.a.e) r0
            kotlin.e.n(r8)
            goto L86
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.e.n(r8)
            androidx.compose.runtime.MutableState<com.baicizhan.main.selftest.b> r8 = r6.f24898d
            if (r7 != 0) goto L43
            com.baicizhan.main.selftest.b$b r7 = com.baicizhan.main.selftest.b.C0323b.f25038c
            goto L98
        L43:
            java.util.List<java.lang.Integer> r2 = r7.f100147c
            java.util.Collection r2 = (java.util.Collection) r2
            r4 = 0
            if (r2 == 0) goto L93
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L51
            goto L93
        L51:
            boolean r2 = r7.f100145a
            if (r2 != 0) goto L6d
            boolean r2 = r7.f100146b
            if (r2 == 0) goto L6d
            com.baicizhan.main.selftest.FastTestStrategy r7 = r6.f24895a
            boolean r7 = r7.l()
            if (r7 == 0) goto L67
            com.baicizhan.main.selftest.b$d r7 = new com.baicizhan.main.selftest.b$d
            r7.<init>(r4, r3, r4)
            goto L98
        L67:
            com.baicizhan.main.selftest.b$a r7 = new com.baicizhan.main.selftest.b$a
            r7.<init>(r4, r3, r4)
            goto L98
        L6d:
            java.util.List<java.lang.Integer> r2 = r7.f100147c
            java.lang.String r4 = "ids"
            kotlin.jvm.internal.g0.o(r2, r4)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f24910a = r7
            r0.f24911b = r8
            r0.f24914e = r3
            java.lang.Object r7 = r6.O(r2, r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            r7 = r8
        L86:
            com.baicizhan.main.selftest.b$c r8 = new com.baicizhan.main.selftest.b$c
            java.util.List r0 = r6.s()
            r8.<init>(r0)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L98
        L93:
            com.baicizhan.main.selftest.b$a r7 = new com.baicizhan.main.selftest.b$a
            r7.<init>(r4, r3, r4)
        L98:
            r8.setValue(r7)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.selftest.a.x(yh.a$e, j00.c):java.lang.Object");
    }

    public final void y(final int i11) {
        Object obj;
        Iterator<T> it = this.f24897c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((uh.f) obj).a() == i11) {
                    break;
                }
            }
        }
        uh.f fVar = (uh.f) obj;
        if (fVar != null) {
            fVar.f(true);
        }
        SnapshotStateList<uh.f> snapshotStateList = this.f24899e;
        final x00.l lVar = new x00.l() { // from class: uh.b
            @Override // x00.l
            public final Object invoke(Object obj2) {
                boolean z11;
                z11 = com.baicizhan.main.selftest.a.z(i11, (f) obj2);
                return Boolean.valueOf(z11);
            }
        };
        snapshotStateList.removeIf(new Predicate() { // from class: uh.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                boolean A;
                A = com.baicizhan.main.selftest.a.A(x00.l.this, obj2);
                return A;
            }
        });
    }
}
