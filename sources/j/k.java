package j;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {
    @m80.k
    public static final <RowType> i<RowType> a(int i11, @m80.k l.e driver, @m80.k String fileName, @m80.k String label, @m80.k String query, @m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        g0.p(label, "label");
        g0.p(query, "query");
        g0.p(mapper, "mapper");
        return new m(i11, driver, fileName, label, query, mapper);
    }

    @m80.k
    public static final <RowType> i<RowType> b(int i11, @m80.k l.e driver, @m80.k String query, @m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        g0.p(driver, "driver");
        g0.p(query, "query");
        g0.p(mapper, "mapper");
        return a(i11, driver, "unknown", "unknown", query, mapper);
    }

    @m80.k
    public static final <RowType> j<RowType> c(int i11, @m80.k String[] queryKeys, @m80.k l.e driver, @m80.k String fileName, @m80.k String label, @m80.k String query, @m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        g0.p(queryKeys, "queryKeys");
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        g0.p(label, "label");
        g0.p(query, "query");
        g0.p(mapper, "mapper");
        return new n(i11, queryKeys, driver, fileName, label, query, mapper);
    }

    @m80.k
    public static final <RowType> j<RowType> d(int i11, @m80.k String[] queryKeys, @m80.k l.e driver, @m80.k String query, @m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        g0.p(queryKeys, "queryKeys");
        g0.p(driver, "driver");
        g0.p(query, "query");
        g0.p(mapper, "mapper");
        return c(i11, queryKeys, driver, "unknown", "unknown", query, mapper);
    }
}
