package x4;

import com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType;
import kotlin.jvm.internal.g0;
import l3.o;
import m80.k;
import x4.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    @k
    public static final a.b a(@k o oVar, @k EffectType effectType) {
        g0.p(oVar, "<this>");
        g0.p(effectType, "effectType");
        return new a.b(oVar, effectType);
    }

    public static /* synthetic */ a.b b(o oVar, EffectType effectType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            effectType = EffectType.Default;
        }
        return a(oVar, effectType);
    }
}
