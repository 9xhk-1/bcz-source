package f4;

import f4.o1;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o1 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f50768b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1 f50769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k o1 o1Var, @m80.k String key, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50769c = o1Var;
            this.f50768b = key;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.bindString(0, aVar.f50768b);
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50769c.C().c5(-529672932, "SELECT gameSetting.key, gameSetting.settingValue, gameSetting.lastModifyTime FROM gameSetting WHERE key = ?", mapper, 1, new x00.l() { // from class: f4.n1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = o1.a.m(o1.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50769c.C().Y1(new String[]{"gameSetting"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50769c.C().F6(new String[]{"gameSetting"}, listener);
        }

        @m80.k
        public final String n() {
            return this.f50768b;
        }

        @m80.k
        public String toString() {
            return "GameSetting.sq:queryByKey";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.GameSettingQueries", f = "GameSettingQueries.kt", i = {0}, l = {55}, m = "insertOrReplace", n = {"gameSetting"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50770a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50771b;

        /* renamed from: d, reason: collision with root package name */
        public int f50773d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50771b = obj;
            this.f50773d |= Integer.MIN_VALUE;
            return o1.this.Q(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.q<String, String, Long, i1> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f50774a = new c();

        public c() {
            super(3, i1.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;J)V", 0);
        }

        public final i1 a(String p02, String str, long j11) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return new i1(p02, str, j11);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ i1 invoke(String str, String str2, Long l11) {
            return a(str, str2, l11.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.q<String, String, Long, i1> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50775a = new d();

        public d() {
            super(3, i1.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;J)V", 0);
        }

        public final i1 a(String p02, String str, long j11) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return new i1(p02, str, j11);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ i1 invoke(String str, String str2, Long l11) {
            return a(str, str2, l11.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 R(i1 i1Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.bindString(0, i1Var.f());
        execute.bindString(1, i1Var.h());
        execute.c(2, Long.valueOf(i1Var.g()));
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 S(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("gameSetting");
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        String string2 = cursor.getString(1);
        Long l11 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l11);
        return qVar.invoke(string, string2, l11);
    }

    public static final Object Y(x00.q qVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        String string2 = cursor.getString(1);
        Long l11 = cursor.getLong(2);
        kotlin.jvm.internal.g0.m(l11);
        return qVar.invoke(string, string2, l11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(@m80.k final f4.i1 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.o1.b
            if (r0 == 0) goto L13
            r0 = r10
            f4.o1$b r0 = (f4.o1.b) r0
            int r1 = r0.f50773d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50773d = r1
            goto L18
        L13:
            f4.o1$b r0 = new f4.o1$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50771b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50773d
            r3 = -901744740(0xffffffffca40779c, float:-3153383.0)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50770a
            f4.i1 r9 = (f4.i1) r9
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
            f4.l1 r5 = new f4.l1
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO gameSetting(key, settingValue, lastModifyTime)\nVALUES (?, ?, ?)"
            r7 = 3
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50770a = r9
            r0.f50773d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.m1 r0 = new f4.m1
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.o1.Q(f4.i1, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<i1> T() {
        return U(c.f50774a);
    }

    @m80.k
    public final <T> j.j<T> U(@m80.k final x00.q<? super String, ? super String, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return j.k.c(848608565, new String[]{"gameSetting"}, C(), "GameSetting.sq", "queryAll", "SELECT gameSetting.key, gameSetting.settingValue, gameSetting.lastModifyTime FROM gameSetting", new x00.l() { // from class: f4.j1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object V;
                V = o1.V(x00.q.this, (l.d) obj);
                return V;
            }
        });
    }

    @m80.k
    public final j.j<i1> W(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return X(key, d.f50775a);
    }

    @m80.k
    public final <T> j.j<T> X(@m80.k String key, @m80.k final x00.q<? super String, ? super String, ? super Long, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, key, new x00.l() { // from class: f4.k1
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object Y;
                Y = o1.Y(x00.q.this, (l.d) obj);
                return Y;
            }
        });
    }
}
