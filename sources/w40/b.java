package w40;

import kotlin.jvm.internal.g0;
import w40.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<Receiver> extends e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f95223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@m80.k String expected) {
        super(Integer.valueOf(expected.length()), "the predefined string " + expected, null);
        g0.p(expected, "expected");
        this.f95223c = expected;
    }

    @Override // w40.e
    @m80.l
    public g a(Receiver receiver, @m80.k CharSequence input, int i11, int i12) {
        g0.p(input, "input");
        if (g0.g(input.subSequence(i11, i12).toString(), this.f95223c)) {
            return null;
        }
        return new g.e(this.f95223c);
    }
}
