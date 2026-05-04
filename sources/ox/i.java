package ox;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends e implements t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e f78474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k e grammar) {
        super(null);
        g0.p(grammar, "grammar");
        this.f78474a = grammar;
    }

    @Override // ox.t
    @m80.k
    public e b() {
        return this.f78474a;
    }
}
