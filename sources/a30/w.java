package a30;

import e30.c1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface w {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f1873a = new a();

        @Override // a30.w
        @m80.k
        public e30.r0 a(@m80.k ProtoBuf.Type proto, @m80.k String flexibleId, @m80.k c1 lowerBound, @m80.k c1 upperBound) {
            kotlin.jvm.internal.g0.p(proto, "proto");
            kotlin.jvm.internal.g0.p(flexibleId, "flexibleId");
            kotlin.jvm.internal.g0.p(lowerBound, "lowerBound");
            kotlin.jvm.internal.g0.p(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @m80.k
    e30.r0 a(@m80.k ProtoBuf.Type type, @m80.k String str, @m80.k c1 c1Var, @m80.k c1 c1Var2);
}
