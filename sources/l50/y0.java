package l50;

import java.util.LinkedHashMap;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y0 extends e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Map<String, k50.k> f70090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(@m80.k k50.a json, @m80.k x00.l<? super k50.k, g2> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(nodeConsumer, "nodeConsumer");
        this.f70090g = new LinkedHashMap();
    }

    @Override // l50.e
    @m80.k
    public k50.k a0() {
        return new k50.i0(this.f70090g);
    }

    @Override // l50.e
    public void e0(@m80.k String key, @m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(element, "element");
        this.f70090g.put(key, element);
    }

    @Override // j50.i3, i50.e
    public <T> void encodeNullableSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k f50.b0<? super T> serializer, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        if (t11 != null || this.f69976d.n()) {
            super.encodeNullableSerializableElement(descriptor, i11, serializer, t11);
        }
    }

    @m80.k
    public final Map<String, k50.k> f0() {
        return this.f70090g;
    }
}
