package sa0;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import oa0.g;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g
@u0({"SMAP\nExtensionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtensionManager.kt\norg/koin/core/extension/ExtensionManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n36#1:48\n1869#2,2:49\n*S KotlinDebug\n*F\n+ 1 ExtensionManager.kt\norg/koin/core/extension/ExtensionManager\n*L\n34#1:48\n44#1:49,2\n*E\n"})
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final na0.a f88197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HashMap<String, b> f88198b;

    public a(@k na0.a _koin) {
        g0.p(_koin, "_koin");
        this.f88197a = _koin;
        this.f88198b = new HashMap<>();
    }

    public final void a() {
        Collection<b> values = this.f88198b.values();
        g0.o(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onClose();
        }
    }

    public final /* synthetic */ <T extends b> T b(String id2) {
        g0.p(id2, "id");
        b bVar = d().get(id2);
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) bVar;
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(("Koin extension '" + id2 + "' not found.").toString());
    }

    public final /* synthetic */ <T extends b> T c(String id2) {
        g0.p(id2, "id");
        b bVar = d().get(id2);
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) bVar;
    }

    @k
    public final HashMap<String, b> d() {
        return this.f88198b;
    }

    @k
    public final na0.a f() {
        return this.f88197a;
    }

    public final <T extends b> void g(@k String id2, @k T extension) {
        g0.p(id2, "id");
        g0.p(extension, "extension");
        this.f88198b.put(id2, extension);
        extension.a(this.f88197a);
    }

    @v0
    public static /* synthetic */ void e() {
    }
}
