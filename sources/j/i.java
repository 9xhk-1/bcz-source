package j;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nQuery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Query.kt\napp/cash/sqldelight/ExecutableQuery\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
/* loaded from: classes3.dex */
public abstract class i<RowType> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<l.d, RowType> f63067a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        g0.p(mapper, "mapper");
        this.f63067a = mapper;
    }

    public static final l.c e(i iVar, l.d cursor) {
        g0.p(cursor, "cursor");
        ArrayList arrayList = new ArrayList();
        while (cursor.next().getValue().booleanValue()) {
            arrayList.add(iVar.f63067a.invoke(cursor));
        }
        return c.d.b(c.d.c(arrayList));
    }

    public static final l.c h(i iVar, l.d cursor) {
        g0.p(cursor, "cursor");
        if (!cursor.next().getValue().booleanValue()) {
            return c.d.b(c.d.c(null));
        }
        RowType invoke = iVar.f63067a.invoke(cursor);
        if (!cursor.next().getValue().booleanValue()) {
            return c.d.b(c.d.c(invoke));
        }
        throw new IllegalStateException(("ResultSet returned more than 1 row for " + iVar).toString());
    }

    @m80.k
    public abstract <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> lVar);

    @m80.k
    public final List<RowType> d() {
        return (List) c(new x00.l() { // from class: j.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                l.c e11;
                e11 = i.e(i.this, (l.d) obj);
                return e11;
            }
        }).getValue();
    }

    @m80.k
    public final RowType f() {
        RowType g11 = g();
        if (g11 != null) {
            return g11;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    @m80.l
    public final RowType g() {
        return (RowType) c(new x00.l() { // from class: j.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                l.c h11;
                h11 = i.h(i.this, (l.d) obj);
                return h11;
            }
        }).getValue();
    }

    @m80.k
    public final x00.l<l.d, RowType> i() {
        return this.f63067a;
    }
}
