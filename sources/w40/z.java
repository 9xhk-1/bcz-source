package w40;

import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z<Output> implements q<Output> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.p<Output, Boolean, g2> f95299a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95300b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f95301c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(@m80.k x00.p<? super Output, ? super Boolean, g2> isNegativeSetter, boolean z11, @m80.k String whatThisExpects) {
        g0.p(isNegativeSetter, "isNegativeSetter");
        g0.p(whatThisExpects, "whatThisExpects");
        this.f95299a = isNegativeSetter;
        this.f95300b = z11;
        this.f95301c = whatThisExpects;
    }

    public static final String c(z zVar, char c11) {
        return "Expected " + zVar.f95301c + " but got " + c11;
    }

    @Override // w40.q
    @m80.k
    public Object a(Output output, @m80.k CharSequence input, int i11) {
        g0.p(input, "input");
        if (i11 >= input.length()) {
            return m.f95273b.b(i11);
        }
        final char charAt = input.charAt(i11);
        if (charAt == '-') {
            this.f95299a.invoke(output, Boolean.TRUE);
            return m.f95273b.b(i11 + 1);
        }
        if (charAt != '+' || !this.f95300b) {
            return m.f95273b.a(i11, new x00.a() { // from class: w40.y
                @Override // x00.a
                public final Object invoke() {
                    String c11;
                    c11 = z.c(z.this, charAt);
                    return c11;
                }
            });
        }
        this.f95299a.invoke(output, Boolean.FALSE);
        return m.f95273b.b(i11 + 1);
    }

    @m80.k
    public String toString() {
        return this.f95301c;
    }
}
