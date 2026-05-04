package ma;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.Standard_extKt;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nStatsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatsUtils.kt\ncom/baicizhan/client/business/stats/report_v2/StatsUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,40:1\n13870#2,2:41\n13872#2:46\n18#3,3:43\n*S KotlinDebug\n*F\n+ 1 StatsUtils.kt\ncom/baicizhan/client/business/stats/report_v2/StatsUtils\n*L\n24#1:41,2\n24#1:46\n29#1:43,3\n*E\n"})
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u f73028a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final int f73029b = 0;

    @w00.o
    @m80.k
    public static final HashMap<String, String> a(@m80.k String key, @m80.k Object value) {
        g0.p(key, "key");
        g0.p(value, "value");
        return d(new String[]{key}, new Object[]{value}, false, 4, null);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final HashMap<String, String> b(@m80.k String[] keys, @m80.k Object[] values) {
        g0.p(keys, "keys");
        g0.p(values, "values");
        return d(keys, values, false, 4, null);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final HashMap<String, String> c(@m80.k String[] keys, @m80.k Object[] values, boolean z11) {
        g0.p(keys, "keys");
        g0.p(values, "values");
        HashMap<String, String> hashMap = new HashMap<>(1);
        if (keys.length != values.length) {
            throw new RuntimeException("keys and values should match in size!");
        }
        com.google.gson.d dVar = new com.google.gson.d();
        HashMap hashMap2 = new HashMap(1);
        int length = keys.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = keys[i11];
            int i13 = i12 + 1;
            Object obj = values[i12];
            String str2 = null;
            String orBy = Standard_extKt.orBy(obj != null ? obj.toString() : null, "");
            if (z11) {
                if (orBy != null && orBy.length() != 0) {
                    str2 = orBy;
                }
                if (str2 == null) {
                    i11++;
                    i12 = i13;
                } else {
                    orBy = str2;
                }
            }
            hashMap2.put(str, orBy);
            i11++;
            i12 = i13;
        }
        g2 g2Var = g2.f100423a;
        hashMap.put("extra_info", dVar.z(hashMap2));
        return hashMap;
    }

    public static /* synthetic */ HashMap d(String[] strArr, Object[] objArr, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return c(strArr, objArr, z11);
    }
}
