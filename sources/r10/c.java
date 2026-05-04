package r10;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f82856a = new a();

        @Override // r10.c
        public boolean c(@k p10.b classDescriptor, @k g functionDescriptor) {
            g0.p(classDescriptor, "classDescriptor");
            g0.p(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f82857a = new b();

        @Override // r10.c
        public boolean c(@k p10.b classDescriptor, @k g functionDescriptor) {
            g0.p(classDescriptor, "classDescriptor");
            g0.p(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().a0(d.a());
        }
    }

    boolean c(@k p10.b bVar, @k g gVar);
}
