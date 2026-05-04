package o10;

import a00.h0;
import a30.a0;
import a30.w;
import a30.y;
import java.io.InputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import p10.a0;
import p10.f0;
import x10.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends a30.c {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f75564f = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@m80.k d30.n storageManager, @m80.k h20.v finder, @m80.k a0 moduleDescriptor, @m80.k f0 notFoundClasses, @m80.k r10.a additionalClassPartsProvider, @m80.k r10.c platformDependentDeclarationFilter, @m80.k a30.n deserializationConfiguration, @m80.k f30.p kotlinTypeChecker, @m80.k w20.a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        g0.p(storageManager, "storageManager");
        g0.p(finder, "finder");
        g0.p(moduleDescriptor, "moduleDescriptor");
        g0.p(notFoundClasses, "notFoundClasses");
        g0.p(additionalClassPartsProvider, "additionalClassPartsProvider");
        g0.p(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        g0.p(deserializationConfiguration, "deserializationConfiguration");
        g0.p(kotlinTypeChecker, "kotlinTypeChecker");
        g0.p(samConversionResolver, "samConversionResolver");
        a30.p pVar = new a30.p(this);
        b30.a aVar = b30.a.f5754r;
        a30.e eVar = new a30.e(moduleDescriptor, notFoundClasses, aVar);
        a0.a aVar2 = a0.a.f1734a;
        a30.v DO_NOTHING = a30.v.f1864a;
        g0.o(DO_NOTHING, "DO_NOTHING");
        k(new a30.m(storageManager, moduleDescriptor, deserializationConfiguration, pVar, eVar, this, aVar2, DO_NOTHING, c.a.f97054a, w.a.f1873a, h0.Q(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(storageManager, moduleDescriptor), new kotlin.reflect.jvm.internal.impl.builtins.jvm.c(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, a30.l.f1785a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.e(), kotlinTypeChecker, samConversionResolver, null, y.f1881a, 262144, null));
    }

    @Override // a30.c
    @m80.l
    public a30.q e(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        InputStream b11 = h().b(fqName);
        if (b11 != null) {
            return b30.c.f5756o.a(fqName, j(), i(), b11, false);
        }
        return null;
    }
}
