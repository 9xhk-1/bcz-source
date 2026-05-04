package n6;

import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nSetSettingUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetSettingUC.kt\ncom/baicizhan/app/biz/game/uc/settings/CommitSettingsUC\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n216#2,2:56\n*S KotlinDebug\n*F\n+ 1 SetSettingUC.kt\ncom/baicizhan/app/biz/game/uc/settings/CommitSettingsUC\n*L\n29#1:56,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y5.a f74475a;

    public a(@m80.k y5.a settingRepo) {
        g0.p(settingRepo, "settingRepo");
        this.f74475a = settingRepo;
    }

    @m80.l
    public final Object a(@m80.k Map<String, String> map, @m80.k j00.c<? super g2> cVar) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                j.b(key, value);
            }
        }
        Object e11 = this.f74475a.e(map, cVar);
        return e11 == kotlin.coroutines.intrinsics.b.l() ? e11 : g2.f100423a;
    }
}
