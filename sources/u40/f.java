package u40;

import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<T> extends h<T> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v40.e<T> f91788b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final w40.t<T> f91789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.k List<? extends t<? super T>> formats) {
        super(formats);
        g0.p(formats, "formats");
        this.f91788b = super.a();
        this.f91789c = super.b();
    }

    @Override // u40.h, u40.o
    @m80.k
    public v40.e<T> a() {
        return this.f91788b;
    }

    @Override // u40.h, u40.o
    @m80.k
    public w40.t<T> b() {
        return this.f91789c;
    }
}
