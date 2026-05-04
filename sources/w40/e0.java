package w40;

import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e0<Output> implements q<Output> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<Output, g2> f95251a;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@m80.k x00.l<? super Output, g2> operation) {
        g0.p(operation, "operation");
        this.f95251a = operation;
    }

    @Override // w40.q
    @m80.k
    public Object a(Output output, @m80.k CharSequence input, int i11) {
        g0.p(input, "input");
        this.f95251a.invoke(output);
        return m.f95273b.b(i11);
    }
}
