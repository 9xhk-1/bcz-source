package o;

import a00.a0;
import j.j;
import j.t;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l.c;
import l.e;
import l.f;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLogSqliteDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogSqliteDriver.kt\napp/cash/sqldelight/logs/LogSqliteDriver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f75418a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, g2> f75419b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.logs.LogSqliteDriver$newTransaction$1", f = "LogSqliteDriver.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nLogSqliteDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogSqliteDriver.kt\napp/cash/sqldelight/logs/LogSqliteDriver$newTransaction$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class a extends SuspendLambda implements l<j00.c<? super t.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75420a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l.c<t.b> f75421b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f75422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l.c<t.b> cVar, c cVar2, j00.c<? super a> cVar3) {
            super(1, cVar3);
            this.f75421b = cVar;
            this.f75422c = cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new a(this.f75421b, this.f75422c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super t.b> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75420a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l j11 = ((c.a) this.f75421b).j();
                this.f75420a = 1;
                obj = c.a.a(j11, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f75422c.f((t.b) obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k e sqlDriver, @k l<? super String, g2> logger) {
        g0.p(sqlDriver, "sqlDriver");
        g0.p(logger, "logger");
        this.f75418a = sqlDriver;
        this.f75419b = logger;
    }

    public static final g2 i(c cVar) {
        cVar.f75419b.invoke("TRANSACTION COMMIT");
        return g2.f100423a;
    }

    public static final g2 j(c cVar) {
        cVar.f75419b.invoke("TRANSACTION ROLLBACK");
        return g2.f100423a;
    }

    @Override // l.e
    @m80.l
    public t.b A2() {
        return this.f75418a.A2();
    }

    @Override // l.e
    public void F6(@k String[] queryKeys, @k j.a listener) {
        g0.p(queryKeys, "queryKeys");
        g0.p(listener, "listener");
        this.f75419b.invoke("END " + listener + " LISTENING TO [" + a0.Eh(queryKeys, null, null, null, 0, null, null, 63, null) + l50.b.f69930l);
        this.f75418a.F6((String[]) Arrays.copyOf(queryKeys, queryKeys.length), listener);
    }

    @Override // l.e
    public void Y1(@k String[] queryKeys, @k j.a listener) {
        g0.p(queryKeys, "queryKeys");
        g0.p(listener, "listener");
        this.f75419b.invoke("BEGIN " + listener + " LISTENING TO [" + a0.Eh(queryKeys, null, null, null, 0, null, null, 63, null) + l50.b.f69930l);
        this.f75418a.Y1((String[]) Arrays.copyOf(queryKeys, queryKeys.length), listener);
    }

    @Override // l.e
    @k
    public <R> l.c<R> c5(@m80.l Integer num, @k String sql, @k l<? super l.d, ? extends l.c<R>> mapper, int i11, @m80.l l<? super f, g2> lVar) {
        g0.p(sql, "sql");
        g0.p(mapper, "mapper");
        this.f75419b.invoke("QUERY\n " + sql);
        k(lVar);
        return this.f75418a.c5(num, sql, mapper, i11, lVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75419b.invoke("CLOSE CONNECTION");
        this.f75418a.close();
    }

    public final void f(t.b bVar) {
        bVar.e(new x00.a() { // from class: o.a
            @Override // x00.a
            public final Object invoke() {
                g2 i11;
                i11 = c.i(c.this);
                return i11;
            }
        });
        bVar.d(new x00.a() { // from class: o.b
            @Override // x00.a
            public final Object invoke() {
                g2 j11;
                j11 = c.j(c.this);
                return j11;
            }
        });
    }

    public final void k(l<? super f, g2> lVar) {
        if (lVar != null) {
            d dVar = new d();
            lVar.invoke(dVar);
            List<Object> f11 = dVar.f();
            if (f11.isEmpty()) {
                return;
            }
            l<String, g2> lVar2 = this.f75419b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(f11);
            lVar2.invoke(sb2.toString());
        }
    }

    @Override // l.e
    @k
    public l.c<t.b> s6() {
        this.f75419b.invoke("TRANSACTION BEGIN");
        l.c<t.b> s62 = this.f75418a.s6();
        if (s62 instanceof c.a) {
            return c.a.b(c.a.c(new a(s62, this, null)));
        }
        if (!(s62 instanceof c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        t.b bVar = (t.b) ((c.d) s62).h();
        f(bVar);
        return c.d.b(c.d.c(bVar));
    }

    @Override // l.e
    @k
    public l.c<Long> v3(@m80.l Integer num, @k String sql, int i11, @m80.l l<? super f, g2> lVar) {
        g0.p(sql, "sql");
        this.f75419b.invoke("EXECUTE\n " + sql);
        k(lVar);
        return this.f75418a.v3(num, sql, i11, lVar);
    }

    @Override // l.e
    public void x7(@k String... queryKeys) {
        g0.p(queryKeys, "queryKeys");
        this.f75419b.invoke("NOTIFYING LISTENERS OF [" + a0.Eh(queryKeys, null, null, null, 0, null, null, 63, null) + l50.b.f69930l);
        this.f75418a.x7((String[]) Arrays.copyOf(queryKeys, queryKeys.length));
    }
}
