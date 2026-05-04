package com.baicizhan.app.biz.game.uc.incentive;

import a00.h0;
import a00.i0;
import a00.k1;
import a00.x1;
import g10.u;
import h5.q0;
import h5.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import z8.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCheckTaskPopupDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckTaskPopupDataUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/CheckTaskPopupDataUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1208#2,2:266\n1236#2,4:268\n1208#2,2:272\n1236#2,4:274\n1563#2:291\n1634#2,2:292\n1636#2:295\n136#3,9:278\n216#3:287\n217#3:289\n145#3:290\n1#4:288\n1#4:294\n*S KotlinDebug\n*F\n+ 1 CheckTaskPopupDataUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/CheckTaskPopupDataUC\n*L\n178#1:266,2\n178#1:268,4\n179#1:272,2\n179#1:274,4\n233#1:291\n233#1:292,2\n233#1:295\n194#1:278,9\n194#1:287\n194#1:289\n194#1:290\n194#1:288\n*E\n"})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f14535c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f14536d = "CheckTaskPopupDataUC";

    /* renamed from: e, reason: collision with root package name */
    public static final int f14537e = 2;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r6.p f14538a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p5.d f14539b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14540a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14541b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<r0> f14542c;

        public b(boolean z11, boolean z12, @m80.k List<r0> progressChanges) {
            g0.p(progressChanges, "progressChanges");
            this.f14540a = z11;
            this.f14541b = z12;
            this.f14542c = progressChanges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b e(b bVar, boolean z11, boolean z12, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = bVar.f14540a;
            }
            if ((i11 & 2) != 0) {
                z12 = bVar.f14541b;
            }
            if ((i11 & 4) != 0) {
                list = bVar.f14542c;
            }
            return bVar.d(z11, z12, list);
        }

        public final boolean a() {
            return this.f14540a;
        }

        public final boolean b() {
            return this.f14541b;
        }

        @m80.k
        public final List<r0> c() {
            return this.f14542c;
        }

        @m80.k
        public final b d(boolean z11, boolean z12, @m80.k List<r0> progressChanges) {
            g0.p(progressChanges, "progressChanges");
            return new b(z11, z12, progressChanges);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14540a == bVar.f14540a && this.f14541b == bVar.f14541b && g0.g(this.f14542c, bVar.f14542c);
        }

        public final boolean f() {
            return this.f14540a;
        }

        public final boolean g() {
            return this.f14541b;
        }

        @m80.k
        public final List<r0> h() {
            return this.f14542c;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f14540a) * 31) + Boolean.hashCode(this.f14541b)) * 31) + this.f14542c.hashCode();
        }

        @m80.k
        public String toString() {
            return "TaskChangeAnalysis(hasProgressChanges=" + this.f14540a + ", hasStructureChanges=" + this.f14541b + ", progressChanges=" + this.f14542c + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {121, 138}, m = "analyzeAndProcessChanges", n = {"previousTasks", "currentTasks", com.alipay.sdk.m.t.a.f11034k, "previousTasks", "currentTasks", "analysis", com.alipay.sdk.m.t.a.f11034k}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14543a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14544b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14545c;

        /* renamed from: d, reason: collision with root package name */
        public long f14546d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14547e;

        /* renamed from: g, reason: collision with root package name */
        public int f14549g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14547e = obj;
            this.f14549g |= Integer.MIN_VALUE;
            return f.this.g(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {}, l = {93}, m = "fetchRemoteTasks", n = {}, s = {}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f14550a;

        /* renamed from: c, reason: collision with root package name */
        public int f14552c;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14550a = obj;
            this.f14552c |= Integer.MIN_VALUE;
            return f.this.j(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {}, l = {74}, m = "fetchTaskTimestamp", n = {}, s = {}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f14553a;

        /* renamed from: c, reason: collision with root package name */
        public int f14555c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14553a = obj;
            this.f14555c |= Integer.MIN_VALUE;
            return f.this.k(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {}, l = {68}, m = "hasShownToday", n = {}, s = {}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.incentive.f$f, reason: collision with other inner class name */
    public static final class C0210f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f14556a;

        /* renamed from: c, reason: collision with root package name */
        public int f14558c;

        public C0210f(j00.c<? super C0210f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14556a = obj;
            this.f14558c |= Integer.MIN_VALUE;
            return f.this.l(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {0, 0}, l = {154}, m = "initializeTaskData", n = {p5.r.f79134i, com.alipay.sdk.m.t.a.f11034k}, s = {"L$0", "J$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14559a;

        /* renamed from: b, reason: collision with root package name */
        public long f14560b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14561c;

        /* renamed from: e, reason: collision with root package name */
        public int f14563e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14561c = obj;
            this.f14563e |= Integer.MIN_VALUE;
            return f.this.m(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {2, 3, 3, 4, 4, 4, 5, 5, 5, 5}, l = {33, 39, 42, 51, 54, 57}, m = "invoke", n = {"currentTimestamp", "currentTimestamp", "previousTimestamp", "currentTasks", "currentTimestamp", "previousTimestamp", "currentTasks", "previousTasks", "currentTimestamp", "previousTimestamp"}, s = {"J$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14564a;

        /* renamed from: b, reason: collision with root package name */
        public long f14565b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14566c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14567d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14568e;

        /* renamed from: g, reason: collision with root package name */
        public int f14570g;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14568e = obj;
            this.f14570g |= Integer.MIN_VALUE;
            return f.this.n(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.CheckTaskPopupDataUC", f = "CheckTaskPopupDataUC.kt", i = {0, 0}, l = {162}, m = "updateTaskData", n = {p5.r.f79134i, com.alipay.sdk.m.t.a.f11034k}, s = {"L$0", "J$0"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14571a;

        /* renamed from: b, reason: collision with root package name */
        public long f14572b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14573c;

        /* renamed from: e, reason: collision with root package name */
        public int f14575e;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14573c = obj;
            this.f14575e |= Integer.MIN_VALUE;
            return f.this.p(null, 0L, this);
        }
    }

    public f(@m80.k r6.p fetchRankInfoUC, @m80.k p5.d taskPopupRepo) {
        g0.p(fetchRankInfoUC, "fetchRankInfoUC");
        g0.p(taskPopupRepo, "taskPopupRepo");
        this.f14538a = fetchRankInfoUC;
        this.f14539b = taskPopupRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(z8.j r18, z8.j r19, long r20, j00.c<? super h5.q0> r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.g(z8.j, z8.j, long, j00.c):java.lang.Object");
    }

    public final b h(z8.j jVar, z8.j jVar2) {
        List<g2> list = jVar.f101641a;
        if (list == null) {
            list = h0.J();
        }
        List<g2> list2 = jVar2.f101641a;
        if (list2 == null) {
            list2 = h0.J();
        }
        List<g2> list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(Integer.valueOf(((g2) obj).f101555a), obj);
        }
        List<g2> list4 = list2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(u.u(k1.j(i0.d0(list4, 10)), 16));
        for (Object obj2 : list4) {
            linkedHashMap2.put(Integer.valueOf(((g2) obj2).f101555a), obj2);
        }
        Set x11 = x1.x(linkedHashMap2.keySet(), linkedHashMap.keySet());
        Set x12 = x1.x(linkedHashMap.keySet(), linkedHashMap2.keySet());
        Set set = x11;
        boolean z11 = (set.isEmpty() && x12.isEmpty()) ? false : true;
        if (!set.isEmpty()) {
            z6.b.d(z6.b.f101032b, f14536d, "New tasks added: " + x11, null, 4, null);
        }
        if (!x12.isEmpty()) {
            z6.b.d(z6.b.f101032b, f14536d, "Tasks removed: " + x12, null, 4, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            g2 g2Var = (g2) entry.getValue();
            g2 g2Var2 = (g2) linkedHashMap.get(Integer.valueOf(intValue));
            r0 r0Var = null;
            if (g2Var2 != null && g2Var2.f101557c != g2Var.f101557c) {
                z6.b.d(z6.b.f101032b, f14536d, "Task progress changed: " + g2Var.f101556b + ' ' + g2Var2.f101557c + " -> " + g2Var.f101557c, null, 4, null);
                r0Var = new r0(g2Var.f101555a, g2Var.f101556b, g2Var2.f101557c, g2Var.f101557c, g2Var.f101558d, g2Var.f101559e == 2);
            }
            if (r0Var != null) {
                arrayList.add(r0Var);
            }
        }
        return new b(!arrayList.isEmpty(), z11, arrayList);
    }

    public final q0 i(z8.j jVar, long j11, List<r0> list) {
        List J;
        Object obj;
        List<g2> list2 = jVar.f101641a;
        if (list2 != null) {
            List<g2> list3 = list2;
            J = new ArrayList(i0.d0(list3, 10));
            for (g2 g2Var : list3) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r0) obj).n() == g2Var.f101555a) {
                        break;
                    }
                }
                r0 r0Var = (r0) obj;
                if (r0Var == null) {
                    int i11 = g2Var.f101555a;
                    String str = g2Var.f101556b;
                    int i12 = g2Var.f101557c;
                    r0Var = new r0(i11, str, i12, i12, g2Var.f101558d, g2Var.f101559e == 2);
                }
                J.add(r0Var);
            }
        } else {
            J = h0.J();
        }
        return new q0(jVar, j11, J);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:10:0x0026, B:11:0x0043, B:13:0x004c, B:19:0x0058, B:21:0x005c, B:30:0x0038), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(j00.c<? super z8.j> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.baicizhan.app.biz.game.uc.incentive.f.d
            if (r0 == 0) goto L13
            r0 = r11
            com.baicizhan.app.biz.game.uc.incentive.f$d r0 = (com.baicizhan.app.biz.game.uc.incentive.f.d) r0
            int r1 = r0.f14552c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14552c = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.f$d r0 = new com.baicizhan.app.biz.game.uc.incentive.f$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f14550a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14552c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.e.n(r11)     // Catch: java.lang.Exception -> L2a
            goto L43
        L2a:
            r0 = move-exception
            r11 = r0
            goto L6a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            kotlin.e.n(r11)
            p5.d r11 = r10.f14539b     // Catch: java.lang.Exception -> L2a
            r0.f14552c = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r11 = r11.d(r0)     // Catch: java.lang.Exception -> L2a
            if (r11 != r1) goto L43
            return r1
        L43:
            r0 = r11
            z8.j r0 = (z8.j) r0     // Catch: java.lang.Exception -> L2a
            java.util.List<z8.g2> r0 = r0.f101641a     // Catch: java.lang.Exception -> L2a
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L53
            goto L54
        L53:
            r4 = 0
        L54:
            if (r4 != 0) goto L57
            goto L58
        L57:
            r11 = r3
        L58:
            z8.j r11 = (z8.j) r11     // Catch: java.lang.Exception -> L2a
            if (r11 != 0) goto L69
            z6.b r4 = z6.b.f101032b     // Catch: java.lang.Exception -> L2a
            java.lang.String r5 = "CheckTaskPopupDataUC"
            java.lang.String r6 = "Remote task list is empty"
            r8 = 4
            r9 = 0
            r7 = 0
            z6.b.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2a
            return r3
        L69:
            return r11
        L6a:
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "CheckTaskPopupDataUC"
            java.lang.String r2 = "Failed to fetch remote tasks"
            r0.e(r1, r2, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.j(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(j00.c<? super java.lang.Long> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.biz.game.uc.incentive.f.e
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.biz.game.uc.incentive.f$e r0 = (com.baicizhan.app.biz.game.uc.incentive.f.e) r0
            int r1 = r0.f14555c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14555c = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.f$e r0 = new com.baicizhan.app.biz.game.uc.incentive.f$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14553a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14555c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            kotlin.e.n(r9)
            r6.p r9 = r8.f14538a
            r0.f14555c = r3
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            z8.t r9 = (z8.t) r9
            java.lang.Long r9 = r9.f102034f
            if (r9 == 0) goto L6d
            long r0 = r9.longValue()
            z6.b r2 = z6.b.f101032b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fetched task timestamp: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = r3.toString()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "CheckTaskPopupDataUC"
            r5 = 0
            z6.b.d(r2, r3, r4, r5, r6, r7)
            long r0 = r9.longValue()
            java.lang.Long r9 = l00.a.g(r0)
            return r9
        L6d:
            z6.b r0 = z6.b.f101032b
            r4 = 4
            r5 = 0
            java.lang.String r1 = "CheckTaskPopupDataUC"
            java.lang.String r2 = "No task timestamp available from rank info"
            r3 = 0
            z6.b.d(r0, r1, r2, r3, r4, r5)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.k(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(j00.c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.baicizhan.app.biz.game.uc.incentive.f.C0210f
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.app.biz.game.uc.incentive.f$f r0 = (com.baicizhan.app.biz.game.uc.incentive.f.C0210f) r0
            int r1 = r0.f14558c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14558c = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.f$f r0 = new com.baicizhan.app.biz.game.uc.incentive.f$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14556a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14558c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.e.n(r7)
            p5.d r7 = r6.f14539b
            r0.f14558c = r3
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            long r4 = w3.g.l()
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r7 = l00.a.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.l(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(z8.j r7, long r8, j00.c<? super yz.g2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.baicizhan.app.biz.game.uc.incentive.f.g
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.app.biz.game.uc.incentive.f$g r0 = (com.baicizhan.app.biz.game.uc.incentive.f.g) r0
            int r1 = r0.f14563e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14563e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.f$g r0 = new com.baicizhan.app.biz.game.uc.incentive.f$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14561c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14563e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f14559a
            z8.j r7 = (z8.j) r7
            kotlin.e.n(r10)
            goto L47
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r10)
            p5.d r10 = r6.f14539b
            r0.f14559a = r7
            r0.f14560b = r8
            r0.f14563e = r3
            java.lang.Object r8 = r10.b(r7, r8, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            z6.b r0 = z6.b.f101032b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Initialized task data with "
            r8.append(r9)
            java.util.List<z8.g2> r7 = r7.f101641a
            if (r7 == 0) goto L5c
            int r7 = r7.size()
            goto L5d
        L5c:
            r7 = 0
        L5d:
            r8.append(r7)
            java.lang.String r7 = " tasks"
            r8.append(r7)
            java.lang.String r2 = r8.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "CheckTaskPopupDataUC"
            r3 = 0
            z6.b.j(r0, r1, r2, r3, r4, r5)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.m(z8.j, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r1 == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r1 == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        if (r1 == r6) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@m80.k j00.c<? super h5.q0> r22) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.n(j00.c):java.lang.Object");
    }

    public final boolean o(long j11, long j12) {
        return j11 != j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(z8.j r9, long r10, j00.c<? super yz.g2> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.baicizhan.app.biz.game.uc.incentive.f.i
            if (r0 == 0) goto L13
            r0 = r12
            com.baicizhan.app.biz.game.uc.incentive.f$i r0 = (com.baicizhan.app.biz.game.uc.incentive.f.i) r0
            int r1 = r0.f14575e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14575e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.f$i r0 = new com.baicizhan.app.biz.game.uc.incentive.f$i
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f14573c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14575e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f14571a
            z8.j r9 = (z8.j) r9
            kotlin.e.n(r12)
            goto L4b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.e.n(r12)
            p5.d r12 = r8.f14539b
            java.lang.Object r2 = l00.k.a(r9)
            r0.f14571a = r2
            r0.f14572b = r10
            r0.f14575e = r3
            java.lang.Object r9 = r12.b(r9, r10, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "CheckTaskPopupDataUC"
            java.lang.String r4 = "Updated task data due to structure changes"
            r5 = 0
            z6.b.d(r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.f.p(z8.j, long, j00.c):java.lang.Object");
    }
}
