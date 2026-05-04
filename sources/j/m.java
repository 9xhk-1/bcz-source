package j;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m<RowType> extends i<RowType> {

    /* renamed from: b, reason: collision with root package name */
    public final int f63069b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l.e f63070c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f63071d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f63072e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f63073f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i11, @m80.k l.e driver, @m80.k String fileName, @m80.k String label, @m80.k String query, @m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        super(mapper);
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        g0.p(label, "label");
        g0.p(query, "query");
        g0.p(mapper, "mapper");
        this.f63069b = i11;
        this.f63070c = driver;
        this.f63071d = fileName;
        this.f63072e = label;
        this.f63073f = query;
    }

    @Override // j.i
    @m80.k
    public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
        g0.p(mapper, "mapper");
        return this.f63070c.c5(Integer.valueOf(this.f63069b), this.f63073f, mapper, 0, null);
    }

    @m80.k
    public String toString() {
        return this.f63071d + ':' + this.f63072e;
    }
}
