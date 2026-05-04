package b30;

import a30.t;
import d30.n;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import m80.k;
import p10.a0;
import u20.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends t implements n10.c {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f5756o = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5757n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final c a(@k n20.c fqName, @k n storageManager, @k a0 module, @k InputStream inputStream, boolean z11) {
            g0.p(fqName, "fqName");
            g0.p(storageManager, "storageManager");
            g0.p(module, "module");
            g0.p(inputStream, "inputStream");
            Pair<ProtoBuf.PackageFragment, j20.a> a11 = j20.c.a(inputStream);
            ProtoBuf.PackageFragment component1 = a11.component1();
            j20.a component2 = a11.component2();
            if (component1 != null) {
                return new c(fqName, storageManager, module, component1, component2, z11, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + j20.a.f63164h + ", actual " + component2 + ". Please update Kotlin");
        }

        public a() {
        }
    }

    public /* synthetic */ c(n20.c cVar, n nVar, a0 a0Var, ProtoBuf.PackageFragment packageFragment, j20.a aVar, boolean z11, v vVar) {
        this(cVar, nVar, a0Var, packageFragment, aVar, z11);
    }

    @Override // s10.h0, s10.m
    @k
    public String toString() {
        return "builtins package fragment for " + d() + " from " + e.s(this);
    }

    public c(n20.c cVar, n nVar, a0 a0Var, ProtoBuf.PackageFragment packageFragment, j20.a aVar, boolean z11) {
        super(cVar, nVar, a0Var, packageFragment, aVar, null);
        this.f5757n = z11;
    }
}
