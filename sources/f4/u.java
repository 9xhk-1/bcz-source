package f4;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAbilityScoreSynQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityScoreSynQueries.kt\ncom/baicizhan/app/biz/game/AbilityScoreSynQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1869#2,2:65\n*S KotlinDebug\n*F\n+ 1 AbilityScoreSynQueries.kt\ncom/baicizhan/app/biz/game/AbilityScoreSynQueries\n*L\n35#1:65,2\n*E\n"})
/* loaded from: classes3.dex */
public final class u extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.AbilityScoreSynQueries", f = "AbilityScoreSynQueries.kt", i = {0, 0}, l = {38}, m = "deleteByAbilityScoreIds", n = {"abilityScoreId", "abilityScoreIdIndexes"}, s = {"L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50813a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50814b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50815c;

        /* renamed from: e, reason: collision with root package name */
        public int f50817e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50815c = obj;
            this.f50817e |= Integer.MIN_VALUE;
            return u.this.Q(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.AbilityScoreSynQueries", f = "AbilityScoreSynQueries.kt", i = {0}, l = {57}, m = "insertOrReplace", n = {"abilityScoreSyn"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50818a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50819b;

        /* renamed from: d, reason: collision with root package name */
        public int f50821d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50819b = obj;
            this.f50821d |= Integer.MIN_VALUE;
            return u.this.T(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.q<Long, String, Long, o> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50822a = new c();

        public c() {
            super(3, o.class, "<init>", "<init>(JLjava/lang/String;J)V", 0);
        }

        public final o a(long j11, String p12, long j12) {
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new o(j11, p12, j12);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ o invoke(Long l11, String str, Long l12) {
            return a(l11.longValue(), str, l12.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 R(Collection collection, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            execute.c(i11, Long.valueOf(((Number) it.next()).longValue()));
            i11++;
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("abilityScoreSyn");
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(o oVar, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.c(0, Long.valueOf(oVar.f()));
        execute.bindString(1, oVar.g());
        execute.c(2, Long.valueOf(oVar.h()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("abilityScoreSyn");
        return yz.g2.f100423a;
    }

    public static final Object Y(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        Long l11 = cursor.getLong(0);
        kotlin.jvm.internal.g0.m(l11);
        String string = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string);
        Long l12 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l12);
        return qVar.invoke(l11, string, l12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(@m80.k final java.util.Collection<java.lang.Long> r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.u.a
            if (r0 == 0) goto L13
            r0 = r10
            f4.u$a r0 = (f4.u.a) r0
            int r1 = r0.f50817e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50817e = r1
            goto L18
        L13:
            f4.u$a r0 = new f4.u$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50815c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50817e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f50814b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f50813a
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.e.n(r10)
            goto L7c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.e.n(r10)
            int r10 = r9.size()
            java.lang.String r10 = r8.B(r10)
            l.e r2 = r8.C()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DELETE FROM abilityScoreSyn WHERE abilityScoreId IN "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r5 = r9.size()
            f4.p r6 = new f4.p
            r6.<init>()
            r7 = 0
            l.c r2 = r2.v3(r7, r4, r5, r6)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50813a = r9
            java.lang.Object r9 = l00.k.a(r10)
            r0.f50814b = r9
            r0.f50817e = r3
            java.lang.Object r10 = r2.i(r0)
            if (r10 != r1) goto L7c
            return r1
        L7c:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.q r0 = new f4.q
            r0.<init>()
            r1 = 1270810608(0x4bbf07f0, float:2.5038816E7)
            r8.D(r1, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.u.Q(java.util.Collection, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(@m80.k final f4.o r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.u.b
            if (r0 == 0) goto L13
            r0 = r10
            f4.u$b r0 = (f4.u.b) r0
            int r1 = r0.f50821d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50821d = r1
            goto L18
        L13:
            f4.u$b r0 = new f4.u$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50819b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50821d
            r3 = 850577466(0x32b2c83a, float:2.081298E-8)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50818a
            f4.o r9 = (f4.o) r9
            kotlin.e.n(r10)
            goto L5e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.e.n(r10)
            l.e r10 = r8.C()
            java.lang.Integer r2 = l00.a.f(r3)
            f4.s r5 = new f4.s
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO abilityScoreSyn(abilityScoreId, gameRoundId, lastModifyTime)\nVALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50818a = r9
            r0.f50821d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.t r0 = new f4.t
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.u.T(f4.o, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<o> W() {
        return X(c.f50822a);
    }

    @m80.k
    public final <T> j.j<T> X(@m80.k final x00.q<? super Long, ? super String, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return j.k.c(-953499049, new String[]{"abilityScoreSyn"}, C(), "AbilityScoreSyn.sq", "queryAll", "SELECT abilityScoreSyn.abilityScoreId, abilityScoreSyn.gameRoundId, abilityScoreSyn.lastModifyTime FROM abilityScoreSyn", new x00.l() { // from class: f4.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Y;
                Y = u.Y(x00.q.this, (l.d) obj);
                return Y;
            }
        });
    }
}
