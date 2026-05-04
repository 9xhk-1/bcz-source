package j;

import j.j;
import java.util.Arrays;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n<RowType> extends j<RowType> {

    /* renamed from: b, reason: collision with root package name */
    public final int f63074b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String[] f63075c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final l.e f63076d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f63077e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f63078f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f63079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i11, @m80.k String[] queryKeys, @m80.k l.e driver, @m80.k String fileName, @m80.k String label, @m80.k String query, @m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        super(mapper);
        g0.p(queryKeys, "queryKeys");
        g0.p(driver, "driver");
        g0.p(fileName, "fileName");
        g0.p(label, "label");
        g0.p(query, "query");
        g0.p(mapper, "mapper");
        this.f63074b = i11;
        this.f63075c = queryKeys;
        this.f63076d = driver;
        this.f63077e = fileName;
        this.f63078f = label;
        this.f63079g = query;
    }

    @Override // j.i
    @m80.k
    public <R> l.c<R> c(@m80.k x00.l<? super l.d, ? extends l.c<R>> mapper) {
        g0.p(mapper, "mapper");
        return this.f63076d.c5(Integer.valueOf(this.f63074b), this.f63079g, mapper, 0, null);
    }

    @Override // j.j
    public void j(@m80.k j.a listener) {
        g0.p(listener, "listener");
        l.e eVar = this.f63076d;
        String[] strArr = this.f63075c;
        eVar.Y1((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    @Override // j.j
    public void k(@m80.k j.a listener) {
        g0.p(listener, "listener");
        l.e eVar = this.f63076d;
        String[] strArr = this.f63075c;
        eVar.F6((String[]) Arrays.copyOf(strArr, strArr.length), listener);
    }

    @m80.k
    public String toString() {
        return this.f63077e + ':' + this.f63078f;
    }
}
