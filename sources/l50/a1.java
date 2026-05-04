package l50;

import java.util.ArrayList;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a1 extends e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ArrayList<k50.k> f69918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(@m80.k k50.a json, @m80.k x00.l<? super k50.k, g2> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(nodeConsumer, "nodeConsumer");
        this.f69918g = new ArrayList<>();
    }

    @Override // l50.e, j50.t1
    @m80.k
    public String I(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return String.valueOf(i11);
    }

    @Override // l50.e
    @m80.k
    public k50.k a0() {
        return new k50.b(this.f69918g);
    }

    @Override // l50.e
    public void e0(@m80.k String key, @m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(element, "element");
        this.f69918g.add(Integer.parseInt(key), element);
    }
}
