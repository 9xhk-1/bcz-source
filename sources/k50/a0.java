package k50;

import androidx.exifinterface.media.ExifInterface;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f65905a = "    ";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f65906b = "type";

    @m80.k
    public static final a a(@m80.k a from, @m80.k x00.l<? super e, g2> builderAction) {
        kotlin.jvm.internal.g0.p(from, "from");
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        e eVar = new e(from);
        builderAction.invoke(eVar);
        return new z(eVar.a(), eVar.v());
    }

    public static /* synthetic */ a b(a aVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a.f65901d;
        }
        return a(aVar, lVar);
    }

    public static final /* synthetic */ <T> T c(a aVar, k json) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return (T) aVar.e(f50.k0.n(serializersModule, null), json);
    }

    public static final /* synthetic */ <T> k d(a aVar, T t11) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return aVar.g(f50.k0.n(serializersModule, null), t11);
    }
}
