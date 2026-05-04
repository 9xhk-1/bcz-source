package j20;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import m80.k;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* loaded from: classes8.dex */
public final class c {
    @k
    public static final Pair<ProtoBuf.PackageFragment, a> a(@k InputStream inputStream) {
        ProtoBuf.PackageFragment packageFragment;
        g0.p(inputStream, "<this>");
        try {
            a a11 = a.f63163g.a(inputStream);
            if (a11.h()) {
                f d11 = f.d();
                b.a(d11);
                packageFragment = ProtoBuf.PackageFragment.parseFrom(inputStream, d11);
            } else {
                packageFragment = null;
            }
            Pair<ProtoBuf.PackageFragment, a> a12 = h1.a(packageFragment, a11);
            r00.b.a(inputStream, null);
            return a12;
        } finally {
        }
    }
}
