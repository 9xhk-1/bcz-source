package w80;

import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class l2 extends ga0.h implements Node<z80.t> {

    /* renamed from: g, reason: collision with root package name */
    public static final String f95855g = "junit-jupiter";

    /* renamed from: f, reason: collision with root package name */
    public final v80.e0 f95856f;

    public l2(UniqueId uniqueId, v80.e0 configuration) {
        super(uniqueId, "JUnit Jupiter");
        this.f95856f = configuration;
    }

    public static /* synthetic */ p80.j H(a90.b0 b0Var, p80.n nVar) {
        return new z80.h(nVar, b0Var);
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void v(z80.t context) throws Exception {
        context.e();
    }

    public v80.e0 J() {
        return this.f95856f;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public z80.t l(z80.t context) {
        final a90.b0 r11 = a90.b0.r(context.g());
        return context.f().d(r11).c(new m2(context.h(), this, context.g(), new Function() { // from class: w80.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l2.H(a90.b0.this, (p80.n) obj);
            }
        })).a();
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    public Node.ExecutionMode j() {
        return u2.U(this.f95856f.a());
    }
}
