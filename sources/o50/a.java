package o50;

import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o50.a$a, reason: collision with other inner class name */
    public static final class C0927a extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final f50.i<?> f75916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0927a(@m80.k f50.i<?> serializer) {
            super(null);
            g0.p(serializer, "serializer");
            this.f75916a = serializer;
        }

        @Override // o50.a
        @m80.k
        public f50.i<?> a(@m80.k List<? extends f50.i<?>> typeArgumentsSerializers) {
            g0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f75916a;
        }

        @m80.k
        public final f50.i<?> b() {
            return this.f75916a;
        }

        public boolean equals(@l Object obj) {
            return (obj instanceof C0927a) && g0.g(((C0927a) obj).f75916a, this.f75916a);
        }

        public int hashCode() {
            return this.f75916a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x00.l<List<? extends f50.i<?>>, f50.i<?>> f75917a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k x00.l<? super List<? extends f50.i<?>>, ? extends f50.i<?>> provider) {
            super(null);
            g0.p(provider, "provider");
            this.f75917a = provider;
        }

        @Override // o50.a
        @m80.k
        public f50.i<?> a(@m80.k List<? extends f50.i<?>> typeArgumentsSerializers) {
            g0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f75917a.invoke(typeArgumentsSerializers);
        }

        @m80.k
        public final x00.l<List<? extends f50.i<?>>, f50.i<?>> b() {
            return this.f75917a;
        }
    }

    public /* synthetic */ a(v vVar) {
        this();
    }

    @m80.k
    public abstract f50.i<?> a(@m80.k List<? extends f50.i<?>> list);

    public a() {
    }
}
