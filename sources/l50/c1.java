package l50;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c1 extends y0 {

    /* renamed from: h, reason: collision with root package name */
    public String f69953h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69954i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(@m80.k k50.a json, @m80.k x00.l<? super k50.k, g2> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(nodeConsumer, "nodeConsumer");
        this.f69954i = true;
    }

    @Override // l50.y0, l50.e
    @m80.k
    public k50.k a0() {
        return new k50.i0(f0());
    }

    @Override // l50.y0, l50.e
    public void e0(@m80.k String key, @m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(element, "element");
        if (!this.f69954i) {
            Map<String, k50.k> f02 = f0();
            String str = this.f69953h;
            if (str == null) {
                kotlin.jvm.internal.g0.S("tag");
                str = null;
            }
            f02.put(str, element);
            this.f69954i = true;
            return;
        }
        if (element instanceof k50.l0) {
            this.f69953h = ((k50.l0) element).b();
            this.f69954i = false;
        } else {
            if (element instanceof k50.i0) {
                throw i0.d(k50.k0.f65967a.a());
            }
            if (!(element instanceof k50.b)) {
                throw new NoWhenBranchMatchedException();
            }
            throw i0.d(k50.d.f65914a.a());
        }
    }
}
