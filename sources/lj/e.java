package lj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.TypeConverter;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f71435a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends bp.a<Set<? extends Long>> {
    }

    @TypeConverter
    @k
    public final String a(@l Set<Long> set) {
        if (set == null) {
            return "";
        }
        String z11 = new com.google.gson.d().z(set);
        g0.o(z11, "toJson(...)");
        return z11;
    }

    @l
    @TypeConverter
    public final Set<Long> b(@k String value) {
        g0.p(value, "value");
        return (Set) new com.google.gson.d().o(value, new a().getType());
    }
}
