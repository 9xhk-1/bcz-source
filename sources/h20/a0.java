package h20;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import m20.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f58041b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58042a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final a0 a(@m80.k String name, @m80.k String desc) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(desc, "desc");
            return new a0(name + '#' + desc, null);
        }

        @w00.o
        @m80.k
        public final a0 b(@m80.k m20.d signature) {
            kotlin.jvm.internal.g0.p(signature, "signature");
            if (signature instanceof d.b) {
                d.b bVar = (d.b) signature;
                return d(bVar.e(), bVar.d());
            }
            if (!(signature instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVar = (d.a) signature;
            return a(aVar.e(), aVar.d());
        }

        @w00.o
        @m80.k
        public final a0 c(@m80.k k20.c nameResolver, @m80.k JvmProtoBuf.JvmMethodSignature signature) {
            kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
            kotlin.jvm.internal.g0.p(signature, "signature");
            return d(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        @w00.o
        @m80.k
        public final a0 d(@m80.k String name, @m80.k String desc) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(desc, "desc");
            return new a0(name + desc, null);
        }

        @w00.o
        @m80.k
        public final a0 e(@m80.k a0 signature, int i11) {
            kotlin.jvm.internal.g0.p(signature, "signature");
            return new a0(signature.a() + '@' + i11, null);
        }

        public a() {
        }
    }

    public /* synthetic */ a0(String str, kotlin.jvm.internal.v vVar) {
        this(str);
    }

    @m80.k
    public final String a() {
        return this.f58042a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.g0.g(this.f58042a, ((a0) obj).f58042a);
    }

    public int hashCode() {
        return this.f58042a.hashCode();
    }

    @m80.k
    public String toString() {
        return "MemberSignature(signature=" + this.f58042a + ')';
    }

    public a0(String str) {
        this.f58042a = str;
    }
}
