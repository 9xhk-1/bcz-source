package xw;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o implements e {

    /* renamed from: b, reason: collision with root package name */
    public final int f98453b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98454c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e f98455d;

    public o() {
        this(0, 0, null, 7, null);
    }

    public final void a(String str) {
        while (true) {
            int length = str.length();
            int i11 = this.f98453b;
            if (length <= i11) {
                this.f98455d.log(str);
                return;
            }
            String substring = str.substring(0, i11);
            g0.o(substring, "substring(...)");
            int i12 = this.f98453b;
            int X3 = k0.X3(substring, '\n', 0, false, 6, null);
            if (X3 >= this.f98454c) {
                substring = substring.substring(0, X3);
                g0.o(substring, "substring(...)");
                i12 = X3 + 1;
            }
            this.f98455d.log(substring);
            str = str.substring(i12);
            g0.o(str, "substring(...)");
        }
    }

    @Override // xw.e
    public void log(@m80.k String message) {
        g0.p(message, "message");
        a(message);
    }

    public o(int i11, int i12, @m80.k e delegate) {
        g0.p(delegate, "delegate");
        this.f98453b = i11;
        this.f98454c = i12;
        this.f98455d = delegate;
    }

    public /* synthetic */ o(int i11, int i12, e eVar, int i13, v vVar) {
        this((i13 & 1) != 0 ? 4000 : i11, (i13 & 2) != 0 ? 3000 : i12, (i13 & 4) != 0 ? g.e(e.f98405a) : eVar);
    }
}
