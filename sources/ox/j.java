package ox;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j extends e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f78475a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e f78476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k String name, @m80.k e grammar) {
        super(null);
        g0.p(name, "name");
        g0.p(grammar, "grammar");
        this.f78475a = name;
        this.f78476b = grammar;
    }

    @m80.k
    public final e b() {
        return this.f78476b;
    }

    @m80.k
    public final String c() {
        return this.f78475a;
    }
}
