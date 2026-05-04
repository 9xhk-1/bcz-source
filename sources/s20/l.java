package s20;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class l extends g<g2> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f87447b = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final l a(@m80.k String message) {
            g0.p(message, "message");
            return new b(message);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends l {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f87448c;

        public b(@m80.k String message) {
            g0.p(message, "message");
            this.f87448c = message;
        }

        @Override // s20.g
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g30.g a(@m80.k p10.a0 module) {
            g0.p(module, "module");
            return g30.i.d(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f87448c);
        }

        @Override // s20.g
        @m80.k
        public String toString() {
            return this.f87448c;
        }
    }

    public l() {
        super(g2.f100423a);
    }

    @Override // s20.g
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g2 b() {
        throw new UnsupportedOperationException();
    }
}
