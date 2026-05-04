package dx;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Long f48202a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.a<io.ktor.utils.io.g> f48203b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.l Long l11, @m80.k x00.a<? extends io.ktor.utils.io.g> block) {
        g0.p(block, "block");
        this.f48202a = l11;
        this.f48203b = block;
    }

    @m80.k
    public final x00.a<io.ktor.utils.io.g> a() {
        return this.f48203b;
    }

    @m80.l
    public final Long b() {
        return this.f48202a;
    }

    public /* synthetic */ a(Long l11, x00.a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : l11, aVar);
    }
}
