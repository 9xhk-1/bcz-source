package j5;

import a00.i0;
import a00.r0;
import f4.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import p8.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbilityScoreExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreExt.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1208#2,2:71\n1236#2,4:73\n1563#2:77\n1634#2,3:78\n1617#2,9:81\n1869#2:90\n1870#2:92\n1626#2:93\n1563#2:94\n1634#2,3:95\n1#3:91\n1#3:98\n*S KotlinDebug\n*F\n+ 1 AbilityScoreExt.kt\ncom/baicizhan/app/biz/game/repo/ability/AbilityScoreExtKt\n*L\n19#1:71,2\n19#1:73,4\n27#1:77\n27#1:78,3\n30#1:81,9\n30#1:90\n30#1:92\n30#1:93\n31#1:94\n31#1:95,3\n30#1:91\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreExtKt", f = "AbilityScoreExt.kt", i = {0, 0, 1, 1}, l = {22, 22}, m = "deleteSyncRecords", n = {"$this$deleteSyncRecords", "ids", "$this$deleteSyncRecords", "ids"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    /* renamed from: j5.a$a, reason: collision with other inner class name */
    public static final class C0732a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f63217a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63218b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f63219c;

        /* renamed from: d, reason: collision with root package name */
        public int f63220d;

        public C0732a(j00.c<? super C0732a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63219c = obj;
            this.f63220d |= Integer.MIN_VALUE;
            return a.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreExtKt", f = "AbilityScoreExt.kt", i = {0, 0, 1, 1, 1}, l = {41, 43}, m = "insertOrUpdateAbilityScore", n = {"$this$insertOrUpdateAbilityScore", "abilityScore", "$this$insertOrUpdateAbilityScore", "abilityScore", "count"}, s = {"L$0", "L$1", "L$0", "L$1", "J$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f63221a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63222b;

        /* renamed from: c, reason: collision with root package name */
        public long f63223c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f63224d;

        /* renamed from: e, reason: collision with root package name */
        public int f63225e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63224d = obj;
            this.f63225e |= Integer.MIN_VALUE;
            return a.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreExtKt", f = "AbilityScoreExt.kt", i = {0, 0, 1, 1}, l = {16, 18}, m = "loadAbilityScores", n = {"$this$loadAbilityScores", "ids", "$this$loadAbilityScores", "ids"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f63226a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63227b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f63228c;

        /* renamed from: d, reason: collision with root package name */
        public int f63229d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63228c = obj;
            this.f63229d |= Integer.MIN_VALUE;
            return a.e(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ability.AbilityScoreExtKt", f = "AbilityScoreExt.kt", i = {0, 1}, l = {13, 13}, m = "loadSyncRecords", n = {"$this$loadSyncRecords", "$this$loadSyncRecords"}, s = {"L$0", "L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f63230a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f63231b;

        /* renamed from: c, reason: collision with root package name */
        public int f63232c;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63231b = obj;
            this.f63232c |= Integer.MIN_VALUE;
            return a.f(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (((f4.v) r7).u().Q(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k h4.c r5, @m80.k java.util.List<java.lang.Long> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof j5.a.C0732a
            if (r0 == 0) goto L13
            r0 = r7
            j5.a$a r0 = (j5.a.C0732a) r0
            int r1 = r0.f63220d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63220d = r1
            goto L18
        L13:
            j5.a$a r0 = new j5.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f63219c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f63220d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f63218b
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r0.f63217a
            h4.c r5 = (h4.c) r5
            kotlin.e.n(r7)
            goto L7b
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            java.lang.Object r5 = r0.f63218b
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.f63217a
            h4.c r5 = (h4.c) r5
            kotlin.e.n(r7)
            goto L5d
        L49:
            kotlin.e.n(r7)
            java.lang.Object r7 = l00.k.a(r5)
            r0.f63217a = r7
            r0.f63218b = r6
            r0.f63220d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L5d
            goto L7a
        L5d:
            f4.v r7 = (f4.v) r7
            f4.u r7 = r7.u()
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r5 = l00.k.a(r5)
            r0.f63217a = r5
            java.lang.Object r5 = l00.k.a(r6)
            r0.f63218b = r5
            r0.f63220d = r3
            java.lang.Object r5 = r7.Q(r2, r0)
            if (r5 != r1) goto L7b
        L7a:
            return r1
        L7b:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.a(h4.c, java.util.List, j00.c):java.lang.Object");
    }

    @k
    public static final Set<Long> b(@k List<o> list) {
        g0.p(list, "<this>");
        List<o> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((o) it.next()).f()));
        }
        return r0.f6(arrayList);
    }

    @l
    public static final Integer c(@k List<o> list, @k Map<Long, f4.a> scoresMap) {
        Integer num;
        g0.p(list, "<this>");
        g0.p(scoresMap, "scoresMap");
        Iterator<T> it = list.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            f4.a aVar = scoresMap.get(Long.valueOf(((o) it.next()).f()));
            if (aVar != null) {
                num = Integer.valueOf((int) aVar.B());
            }
        } while (num == null);
        return num;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k f4.k r58, @m80.k f4.a r59, @m80.k j00.c<? super yz.g2> r60) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.d(f4.k, f4.a, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@m80.k h4.c r5, @m80.k java.util.Set<java.lang.Long> r6, @m80.k j00.c<? super java.util.Map<java.lang.Long, f4.a>> r7) {
        /*
            boolean r0 = r7 instanceof j5.a.c
            if (r0 == 0) goto L13
            r0 = r7
            j5.a$c r0 = (j5.a.c) r0
            int r1 = r0.f63229d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63229d = r1
            goto L18
        L13:
            j5.a$c r0 = new j5.a$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f63228c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f63229d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f63227b
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r5 = r0.f63226a
            h4.c r5 = (h4.c) r5
            kotlin.e.n(r7)
            goto L7f
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            java.lang.Object r5 = r0.f63227b
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.f63226a
            h4.c r5 = (h4.c) r5
            kotlin.e.n(r7)
            goto L5d
        L49:
            kotlin.e.n(r7)
            java.lang.Object r7 = l00.k.a(r5)
            r0.f63226a = r7
            r0.f63227b = r6
            r0.f63229d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L5d
            goto L7e
        L5d:
            f4.v r7 = (f4.v) r7
            f4.k r7 = r7.b()
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            j.j r7 = r7.h0(r2)
            java.lang.Object r5 = l00.k.a(r5)
            r0.f63226a = r5
            java.lang.Object r5 = l00.k.a(r6)
            r0.f63227b = r5
            r0.f63229d = r3
            java.lang.Object r7 = k.e.c(r7, r0)
            if (r7 != r1) goto L7f
        L7e:
            return r1
        L7f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r5 = 10
            int r5 = a00.i0.d0(r7, r5)
            int r5 = a00.k1.j(r5)
            r6 = 16
            int r5 = g10.u.u(r5, r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L9a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lb3
            java.lang.Object r7 = r5.next()
            r0 = r7
            f4.a r0 = (f4.a) r0
            long r0 = r0.W()
            java.lang.Long r0 = l00.a.g(r0)
            r6.put(r0, r7)
            goto L9a
        Lb3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.e(h4.c, java.util.Set, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@m80.k h4.c r5, @m80.k j00.c<? super java.util.List<f4.o>> r6) {
        /*
            boolean r0 = r6 instanceof j5.a.d
            if (r0 == 0) goto L13
            r0 = r6
            j5.a$d r0 = (j5.a.d) r0
            int r1 = r0.f63232c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63232c = r1
            goto L18
        L13:
            j5.a$d r0 = new j5.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f63231b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f63232c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f63230a
            h4.c r5 = (h4.c) r5
            kotlin.e.n(r6)
            return r6
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f63230a
            h4.c r5 = (h4.c) r5
            kotlin.e.n(r6)
            goto L52
        L40:
            kotlin.e.n(r6)
            java.lang.Object r6 = l00.k.a(r5)
            r0.f63230a = r6
            r0.f63232c = r4
            java.lang.Object r6 = r5.a(r0)
            if (r6 != r1) goto L52
            goto L6a
        L52:
            f4.v r6 = (f4.v) r6
            f4.u r6 = r6.u()
            j.j r6 = r6.W()
            java.lang.Object r5 = l00.k.a(r5)
            r0.f63230a = r5
            r0.f63232c = r3
            java.lang.Object r5 = k.e.c(r6, r0)
            if (r5 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.f(h4.c, j00.c):java.lang.Object");
    }

    @k
    public static final List<h1> g(@k List<o> list, @k Map<Long, f4.a> scoresMap) {
        g0.p(list, "<this>");
        g0.p(scoresMap, "scoresMap");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f4.a aVar = scoresMap.get(Long.valueOf(((o) it.next()).f()));
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j5.d.a((f4.a) it2.next()));
        }
        return arrayList2;
    }
}
