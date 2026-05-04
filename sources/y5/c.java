package y5;

import a00.l1;
import a40.j;
import c4.o;
import c40.i;
import c40.r0;
import c40.x2;
import com.baicizhan.client.business.dataset.provider.a;
import f4.i1;
import f4.o1;
import f4.v;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import w3.g;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {y5.a.class})
@u0({"SMAP\nSettingRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingRepo.kt\ncom/baicizhan/app/biz/game/repo/settings/SettingRepoImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1193#2,2:81\n1267#2,4:83\n*S KotlinDebug\n*F\n+ 1 SettingRepo.kt\ncom/baicizhan/app/biz/game/repo/settings/SettingRepoImpl\n*L\n37#1:81,2\n37#1:83,4\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements y5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h4.c f99340a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j<Map<String, String>> f99341b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.settings.SettingRepoImpl$getSetting$2", f = "SettingRepo.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f99342a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f99344c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f99345d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f99344c = str;
            this.f99345d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new a(this.f99344c, this.f99345d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super String> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String h11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f99342a;
            if (i11 == 0) {
                e.n(obj);
                h4.c cVar = c.this.f99340a;
                this.f99342a = 1;
                obj = cVar.a(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            i1 g11 = ((v) obj).t().W(this.f99344c).g();
            return (g11 == null || (h11 = g11.h()) == null) ? this.f99345d : h11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.settings.SettingRepoImpl", f = "SettingRepo.kt", i = {}, l = {37, 37}, m = "getSettings", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f99346a;

        /* renamed from: c, reason: collision with root package name */
        public int f99348c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f99346a = obj;
            this.f99348c |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.settings.SettingRepoImpl$updateSetting$2", f = "SettingRepo.kt", i = {1, 1}, l = {71, 72, 77}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-SettingRepoImpl$updateSetting$2$1"}, s = {"L$1", "I$0"}, v = 1)
    /* renamed from: y5.c$c, reason: collision with other inner class name */
    public static final class C1344c extends SuspendLambda implements p<r0, j00.c<? super Map<String, ? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f99349a;

        /* renamed from: b, reason: collision with root package name */
        public Object f99350b;

        /* renamed from: c, reason: collision with root package name */
        public int f99351c;

        /* renamed from: d, reason: collision with root package name */
        public int f99352d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f99354f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f99355g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.settings.SettingRepoImpl$updateSetting$2$1$1", f = "SettingRepo.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: y5.c$c$a */
        public static final class a extends SuspendLambda implements p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f99356a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o1 f99357b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f99358c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f99359d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o1 o1Var, String str, String str2, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f99357b = o1Var;
                this.f99358c = str;
                this.f99359d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f99357b, this.f99358c, this.f99359d, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f99356a;
                if (i11 == 0) {
                    e.n(obj);
                    o1 o1Var = this.f99357b;
                    i1 i1Var = new i1(this.f99358c, this.f99359d, g.n());
                    this.f99356a = 1;
                    if (o1Var.Q(i1Var, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1344c(String str, String str2, j00.c<? super C1344c> cVar) {
            super(2, cVar);
            this.f99354f = str;
            this.f99355g = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new C1344c(this.f99354f, this.f99355g, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Map<String, String>> cVar) {
            return ((C1344c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        
            if (j.o.a.a(r6, false, r8, r9, 1, null) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f99352d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.e.n(r13)
                return r13
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f99350b
                f4.o1 r1 = (f4.o1) r1
                java.lang.Object r1 = r12.f99349a
                f4.o1 r1 = (f4.o1) r1
                kotlin.e.n(r13)
                r9 = r12
                goto L69
            L2b:
                kotlin.e.n(r13)
                goto L42
            L2f:
                kotlin.e.n(r13)
                y5.c r13 = y5.c.this
                h4.c r13 = y5.c.f(r13)
                r12.f99352d = r4
                java.lang.Object r13 = r13.a(r12)
                if (r13 != r0) goto L42
                r9 = r12
                goto L77
            L42:
                f4.v r13 = (f4.v) r13
                f4.o1 r6 = r13.t()
                java.lang.String r13 = r12.f99354f
                java.lang.String r1 = r12.f99355g
                y5.c$c$a r8 = new y5.c$c$a
                r8.<init>(r6, r13, r1, r5)
                r12.f99349a = r6
                java.lang.Object r13 = l00.k.a(r6)
                r12.f99350b = r13
                r13 = 0
                r12.f99351c = r13
                r12.f99352d = r3
                r7 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r13 = j.o.a.a(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L69
                goto L77
            L69:
                y5.c r13 = y5.c.this
                r9.f99349a = r5
                r9.f99350b = r5
                r9.f99352d = r2
                java.lang.Object r13 = r13.a(r12)
                if (r13 != r0) goto L78
            L77:
                return r0
            L78:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.c.C1344c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Map<String, ? extends String>> cVar) {
            return invoke2(r0Var, (j00.c<? super Map<String, String>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.settings.SettingRepoImpl$updateSettings$2", f = "SettingRepo.kt", i = {1, 1}, l = {57, 58, 65}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-SettingRepoImpl$updateSettings$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super Map<String, ? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f99360a;

        /* renamed from: b, reason: collision with root package name */
        public Object f99361b;

        /* renamed from: c, reason: collision with root package name */
        public int f99362c;

        /* renamed from: d, reason: collision with root package name */
        public int f99363d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f99365f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.settings.SettingRepoImpl$updateSettings$2$1$1", f = "SettingRepo.kt", i = {0, 0, 0, 0, 0, 0}, l = {60}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", a.d.C0245a.f16161a, "value", "$i$f$forEach", "$i$a$-forEach-SettingRepoImpl$updateSettings$2$1$1$1"}, s = {"L$0", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nSettingRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingRepo.kt\ncom/baicizhan/app/biz/game/repo/settings/SettingRepoImpl$updateSettings$2$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,80:1\n216#2,2:81\n*S KotlinDebug\n*F\n+ 1 SettingRepo.kt\ncom/baicizhan/app/biz/game/repo/settings/SettingRepoImpl$updateSettings$2$1$1\n*L\n59#1:81,2\n*E\n"})
        public static final class a extends SuspendLambda implements p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f99366a;

            /* renamed from: b, reason: collision with root package name */
            public Object f99367b;

            /* renamed from: c, reason: collision with root package name */
            public Object f99368c;

            /* renamed from: d, reason: collision with root package name */
            public Object f99369d;

            /* renamed from: e, reason: collision with root package name */
            public Object f99370e;

            /* renamed from: f, reason: collision with root package name */
            public Object f99371f;

            /* renamed from: g, reason: collision with root package name */
            public int f99372g;

            /* renamed from: h, reason: collision with root package name */
            public int f99373h;

            /* renamed from: i, reason: collision with root package name */
            public int f99374i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Map<String, String> f99375j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ o1 f99376k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, String> map, o1 o1Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f99375j = map;
                this.f99376k = o1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f99375j, this.f99376k, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Iterator<Map.Entry<String, String>> it;
                Map<String, String> map;
                o1 o1Var;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f99374i;
                if (i12 == 0) {
                    e.n(obj);
                    Map<String, String> map2 = this.f99375j;
                    o1 o1Var2 = this.f99376k;
                    it = map2.entrySet().iterator();
                    map = map2;
                    o1Var = o1Var2;
                    i11 = 0;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f99372g;
                    it = (Iterator) this.f99368c;
                    o1Var = (o1) this.f99367b;
                    map = (Map) this.f99366a;
                    e.n(obj);
                }
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    i1 i1Var = new i1(key, value, g.n());
                    this.f99366a = l00.k.a(map);
                    this.f99367b = o1Var;
                    this.f99368c = it;
                    this.f99369d = l00.k.a(next);
                    this.f99370e = l00.k.a(key);
                    this.f99371f = l00.k.a(value);
                    this.f99372g = i11;
                    this.f99373h = 0;
                    this.f99374i = 1;
                    if (o1Var.Q(i1Var, this) == l11) {
                        return l11;
                    }
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, String> map, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f99365f = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new d(this.f99365f, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Map<String, String>> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (j.o.a.a(r6, false, r8, r9, 1, null) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f99363d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.e.n(r13)
                return r13
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r1 = r12.f99361b
                f4.o1 r1 = (f4.o1) r1
                java.lang.Object r1 = r12.f99360a
                f4.o1 r1 = (f4.o1) r1
                kotlin.e.n(r13)
                r9 = r12
                goto L67
            L2b:
                kotlin.e.n(r13)
                goto L42
            L2f:
                kotlin.e.n(r13)
                y5.c r13 = y5.c.this
                h4.c r13 = y5.c.f(r13)
                r12.f99363d = r4
                java.lang.Object r13 = r13.a(r12)
                if (r13 != r0) goto L42
                r9 = r12
                goto L75
            L42:
                f4.v r13 = (f4.v) r13
                f4.o1 r6 = r13.t()
                java.util.Map<java.lang.String, java.lang.String> r13 = r12.f99365f
                y5.c$d$a r8 = new y5.c$d$a
                r8.<init>(r13, r6, r5)
                r12.f99360a = r6
                java.lang.Object r13 = l00.k.a(r6)
                r12.f99361b = r13
                r13 = 0
                r12.f99362c = r13
                r12.f99363d = r3
                r7 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r13 = j.o.a.a(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L67
                goto L75
            L67:
                y5.c r13 = y5.c.this
                r9.f99360a = r5
                r9.f99361b = r5
                r9.f99363d = r2
                java.lang.Object r13 = r13.a(r12)
                if (r13 != r0) goto L76
            L75:
                return r0
            L76:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Map<String, ? extends String>> cVar) {
            return invoke2(r0Var, (j00.c<? super Map<String, String>>) cVar);
        }
    }

    public c(@k h4.c bczDb) {
        g0.p(bczDb, "bczDb");
        this.f99340a = bczDb;
        this.f99341b = a40.d.g(l1.z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // y5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.util.Map<java.lang.String, java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof y5.c.b
            if (r0 == 0) goto L13
            r0 = r6
            y5.c$b r0 = (y5.c.b) r0
            int r1 = r0.f99348c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99348c = r1
            goto L18
        L13:
            y5.c$b r0 = new y5.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f99346a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f99348c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L46
        L38:
            kotlin.e.n(r6)
            h4.c r6 = r5.f99340a
            r0.f99348c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L46
            goto L58
        L46:
            f4.v r6 = (f4.v) r6
            f4.o1 r6 = r6.t()
            j.j r6 = r6.T()
            r0.f99348c = r3
            java.lang.Object r6 = k.e.c(r6, r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r0 = 10
            int r0 = a00.i0.d0(r6, r0)
            int r0 = a00.k1.j(r0)
            r1 = 16
            int r0 = g10.u.u(r0, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L74:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r6.next()
            f4.i1 r0 = (f4.i1) r0
            java.lang.String r2 = r0.f()
            java.lang.String r0 = r0.h()
            kotlin.Pair r0 = yz.h1.a(r2, r0)
            java.lang.Object r2 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r1.put(r2, r0)
            goto L74
        L98:
            a40.j<java.util.Map<java.lang.String, java.lang.String>> r6 = r5.f99341b
            r6.g(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.a(j00.c):java.lang.Object");
    }

    @Override // y5.a
    @l
    public Object b(@k String str, @l String str2, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b().plus(x2.f8011a), new C1344c(str, str2, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // y5.a
    @k
    public Map<String, String> c() {
        return this.f99341b.d();
    }

    @Override // y5.a
    @l
    public Object d(@k String str, @l String str2, @k j00.c<? super String> cVar) {
        return i.h(o.b(), new a(str, str2, null), cVar);
    }

    @Override // y5.a
    @l
    public Object e(@k Map<String, String> map, @k j00.c<? super g2> cVar) {
        Object h11 = i.h(o.b().plus(x2.f8011a), new d(map, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
