package u0;

import android.content.Context;
import g0.a;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x f91489a = new x();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f91490b = "image_cache";

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public static g0.a f91491c;

    @m80.k
    public final synchronized g0.a a(@m80.k Context context) {
        g0.a aVar;
        aVar = f91491c;
        if (aVar == null) {
            aVar = new a.C0620a().c(r00.o.p0(l.u(context), f91490b)).a();
            f91491c = aVar;
        }
        return aVar;
    }
}
