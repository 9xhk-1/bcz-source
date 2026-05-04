package io.ktor.client.engine.cio;

import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements ow.l<e> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f60799a = new a();

    static {
        y.a();
    }

    @Override // ow.l
    @m80.k
    public ow.a a(@m80.k x00.l<? super e, g2> block) {
        g0.p(block, "block");
        e eVar = new e();
        block.invoke(eVar);
        return new d(eVar);
    }

    public boolean equals(@m80.l Object obj) {
        return this == obj || (obj instanceof a);
    }

    public int hashCode() {
        return 1717340481;
    }

    @m80.k
    public String toString() {
        return "CIO";
    }
}
