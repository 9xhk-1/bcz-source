package zg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f102640a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f102641b = "kv_word_plan";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f102642c = "word_plan_golden_config";

    /* renamed from: d, reason: collision with root package name */
    public static final int f102643d = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends bp.a<GoldenNavigationAndTrainingConfig> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: zg.b$b, reason: collision with other inner class name */
    public static final class C1396b extends bp.a<GoldenNavigationAndTrainingConfig> {
    }

    @k
    public final nc.a a() {
        nc.a c11 = nc.b.c(f102641b);
        g0.o(c11, "getKv(...)");
        return c11;
    }

    @l
    public final String b(@k nc.a kv2) {
        g0.p(kv2, "kv");
        return kv2.getString(f102642c, "");
    }

    @k
    public final GoldenNavigationAndTrainingConfig c(@k String raw) {
        g0.p(raw, "raw");
        Object readFromJson = BczJson.readFromJson(raw, new a().getType());
        g0.n(readFromJson, "null cannot be cast to non-null type com.baicizhan.main.model.data.GoldenNavigationAndTrainingConfig");
        return (GoldenNavigationAndTrainingConfig) readFromJson;
    }

    public final void d(@k nc.a kv2) {
        g0.p(kv2, "kv");
        kv2.p(f102642c, "");
    }

    public final void e(@k nc.a kv2, @k GoldenNavigationAndTrainingConfig config) {
        g0.p(kv2, "kv");
        g0.p(config, "config");
        kv2.p(f102642c, BczJson.writeToJson(config, new C1396b().getType()));
    }
}
