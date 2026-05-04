package f4;

import f4.e0;
import j.j;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e0 extends j.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<T> extends j.j<T> {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f50512b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f50513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k e0 e0Var, @m80.k String configKey, x00.l<? super l.d, ? extends T> mapper) {
            super(mapper);
            kotlin.jvm.internal.g0.p(configKey, "configKey");
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            this.f50513c = e0Var;
            this.f50512b = configKey;
        }

        public static final yz.g2 m(a aVar, l.f executeQuery) {
            kotlin.jvm.internal.g0.p(executeQuery, "$this$executeQuery");
            executeQuery.bindString(0, aVar.f50512b);
            return yz.g2.f100423a;
        }

        @Override // j.i
        @m80.k
        public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
            kotlin.jvm.internal.g0.p(mapper, "mapper");
            return this.f50513c.C().c5(205070139, "SELECT experimentRecord.configKey, experimentRecord.configValue FROM experimentRecord WHERE configKey = ?", mapper, 1, new x00.l() { // from class: f4.d0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 m11;
                    m11 = e0.a.m(e0.a.this, (l.f) obj);
                    return m11;
                }
            });
        }

        @Override // j.j
        public void j(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50513c.C().Y1(new String[]{"experimentRecord"}, listener);
        }

        @Override // j.j
        public void k(@m80.k j.a listener) {
            kotlin.jvm.internal.g0.p(listener, "listener");
            this.f50513c.C().F6(new String[]{"experimentRecord"}, listener);
        }

        @m80.k
        public final String n() {
            return this.f50512b;
        }

        @m80.k
        public String toString() {
            return "Experiment.sq:queryByKey";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.ExperimentQueries", f = "ExperimentQueries.kt", i = {}, l = {69}, m = "deleteAll", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50514a;

        /* renamed from: c, reason: collision with root package name */
        public int f50516c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50514a = obj;
            this.f50516c |= Integer.MIN_VALUE;
            return e0.this.T(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.ExperimentQueries", f = "ExperimentQueries.kt", i = {0}, l = {58}, m = "deleteByKey", n = {"configKey"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50517a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50518b;

        /* renamed from: d, reason: collision with root package name */
        public int f50520d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50518b = obj;
            this.f50520d |= Integer.MIN_VALUE;
            return e0.this.V(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.ExperimentQueries", f = "ExperimentQueries.kt", i = {0}, l = {44}, m = "insertOrReplace", n = {"experimentRecord"}, s = {"L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50521a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50522b;

        /* renamed from: d, reason: collision with root package name */
        public int f50524d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f50522b = obj;
            this.f50524d |= Integer.MIN_VALUE;
            return e0.this.Y(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements x00.p<String, String, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f50525a = new e();

        public e() {
            super(2, f0.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(String p02, String p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new f0(p02, p12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements x00.p<String, String, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50526a = new f();

        public f() {
            super(2, f0.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke(String p02, String p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return new f0(p02, p12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@m80.k l.e driver) {
        super(driver);
        kotlin.jvm.internal.g0.p(driver, "driver");
    }

    public static final yz.g2 U(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("experimentRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 W(String str, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.bindString(0, str);
        return yz.g2.f100423a;
    }

    public static final yz.g2 X(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("experimentRecord");
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(f0 f0Var, l.f execute) {
        kotlin.jvm.internal.g0.p(execute, "$this$execute");
        execute.bindString(0, f0Var.e());
        execute.bindString(1, f0Var.f());
        return yz.g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yz.g2 a0(x00.l emit) {
        kotlin.jvm.internal.g0.p(emit, "emit");
        emit.invoke("experimentRecord");
        return yz.g2.f100423a;
    }

    public static final Object d0(x00.p pVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        String string2 = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string2);
        return pVar.invoke(string, string2);
    }

    public static final Object g0(x00.p pVar, l.d cursor) {
        kotlin.jvm.internal.g0.p(cursor, "cursor");
        String string = cursor.getString(0);
        kotlin.jvm.internal.g0.m(string);
        String string2 = cursor.getString(1);
        kotlin.jvm.internal.g0.m(string2);
        return pVar.invoke(string, string2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(@m80.k j00.c<? super java.lang.Long> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof f4.e0.b
            if (r0 == 0) goto L13
            r0 = r13
            f4.e0$b r0 = (f4.e0.b) r0
            int r1 = r0.f50516c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50516c = r1
            goto L18
        L13:
            f4.e0$b r0 = new f4.e0$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f50514a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50516c
            r3 = 1593824251(0x5effd3fb, float:9.2171768E18)
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r13)
            goto L53
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L34:
            kotlin.e.n(r13)
            l.e r5 = r12.C()
            java.lang.Integer r6 = l00.a.f(r3)
            r10 = 8
            r11 = 0
            java.lang.String r7 = "DELETE FROM experimentRecord"
            r8 = 0
            r9 = 0
            l.c r13 = l.e.a.a(r5, r6, r7, r8, r9, r10, r11)
            r0.f50516c = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            java.lang.Number r13 = (java.lang.Number) r13
            long r0 = r13.longValue()
            f4.w r13 = new f4.w
            r13.<init>()
            r12.D(r3, r13)
            java.lang.Long r13 = l00.a.g(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e0.T(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(@m80.k final java.lang.String r8, @m80.k j00.c<? super java.lang.Long> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof f4.e0.c
            if (r0 == 0) goto L13
            r0 = r9
            f4.e0$c r0 = (f4.e0.c) r0
            int r1 = r0.f50520d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50520d = r1
            goto L18
        L13:
            f4.e0$c r0 = new f4.e0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f50518b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50520d
            r3 = -1636937118(0xffffffff9e6e5262, float:-1.26166515E-20)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f50517a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r9)
            goto L5d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.e.n(r9)
            l.e r9 = r7.C()
            java.lang.Integer r2 = l00.a.f(r3)
            f4.b0 r5 = new f4.b0
            r5.<init>()
            java.lang.String r6 = "DELETE FROM experimentRecord WHERE configKey = ?"
            l.c r9 = r9.v3(r2, r6, r4, r5)
            java.lang.Object r8 = l00.k.a(r8)
            r0.f50517a = r8
            r0.f50520d = r4
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            f4.c0 r0 = new f4.c0
            r0.<init>()
            r7.D(r3, r0)
            java.lang.Long r8 = l00.a.g(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e0.V(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(@m80.k final f4.f0 r9, @m80.k j00.c<? super java.lang.Long> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f4.e0.d
            if (r0 == 0) goto L13
            r0 = r10
            f4.e0$d r0 = (f4.e0.d) r0
            int r1 = r0.f50524d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50524d = r1
            goto L18
        L13:
            f4.e0$d r0 = new f4.e0$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f50522b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50524d
            r3 = -1059477283(0xffffffffc0d9a8dd, float:-6.801863)
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.f50521a
            f4.f0 r9 = (f4.f0) r9
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
            f4.x r5 = new f4.x
            r5.<init>()
            java.lang.String r6 = "INSERT OR REPLACE INTO experimentRecord(configKey, configValue)\nVALUES (?, ?)"
            r7 = 2
            l.c r10 = r10.v3(r2, r6, r7, r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f50521a = r9
            r0.f50524d = r4
            java.lang.Object r10 = r10.i(r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r9 = r10.longValue()
            f4.y r0 = new f4.y
            r0.<init>()
            r8.D(r3, r0)
            java.lang.Long r9 = l00.a.g(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e0.Y(f4.f0, j00.c):java.lang.Object");
    }

    @m80.k
    public final j.j<f0> b0() {
        return c0(e.f50525a);
    }

    @m80.k
    public final <T> j.j<T> c0(@m80.k final x00.p<? super String, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return j.k.c(1251607316, new String[]{"experimentRecord"}, C(), "Experiment.sq", "queryAll", "SELECT experimentRecord.configKey, experimentRecord.configValue FROM experimentRecord", new x00.l() { // from class: f4.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object d02;
                d02 = e0.d0(x00.p.this, (l.d) obj);
                return d02;
            }
        });
    }

    @m80.k
    public final j.j<f0> e0(@m80.k String configKey) {
        kotlin.jvm.internal.g0.p(configKey, "configKey");
        return f0(configKey, f.f50526a);
    }

    @m80.k
    public final <T> j.j<T> f0(@m80.k String configKey, @m80.k final x00.p<? super String, ? super String, ? extends T> mapper) {
        kotlin.jvm.internal.g0.p(configKey, "configKey");
        kotlin.jvm.internal.g0.p(mapper, "mapper");
        return new a(this, configKey, new x00.l() { // from class: f4.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object g02;
                g02 = e0.g0(x00.p.this, (l.d) obj);
                return g02;
            }
        });
    }
}
