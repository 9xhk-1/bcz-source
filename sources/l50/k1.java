package l50;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k1 {
    @j0
    @m80.k
    public static final <T> k50.k a(@m80.k k50.a json, @m80.k f50.e<? extends T> deserializer, @m80.k String source) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(source, "source");
        n1 a11 = o1.a(json, source);
        k50.k i11 = new j1(json, WriteMode.OBJ, a11, deserializer.a(), null).i();
        a11.z();
        return i11;
    }

    public static final <T> T b(a aVar, String str, x00.l<? super String, ? extends T> lVar) {
        String u11 = aVar.u();
        try {
            return lVar.invoke(u11);
        } catch (IllegalArgumentException unused) {
            a.B(aVar, "Failed to parse type '" + str + "' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
