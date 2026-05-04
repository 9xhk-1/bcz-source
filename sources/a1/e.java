package a1;

import a1.c;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {
    @m80.k
    public static final c a() {
        return new d();
    }

    public static final float c(com.airbnb.lottie.k kVar, h hVar, float f11) {
        if (f11 < 0.0f && kVar == null) {
            return 1.0f;
        }
        if (kVar == null) {
            return 0.0f;
        }
        if (f11 < 0.0f) {
            if (hVar == null) {
                return 1.0f;
            }
            return hVar.a(kVar);
        }
        if (hVar == null) {
            return 0.0f;
        }
        return hVar.b(kVar);
    }

    @Composable
    @m80.k
    public static final c d(@m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(-610207901);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = a();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        c cVar = (c) rememberedValue;
        composer.endReplaceableGroup();
        return cVar;
    }

    @m80.l
    public static final Object e(@m80.k c cVar, @m80.k j00.c<? super g2> cVar2) {
        Object c11 = c.a.c(cVar, null, c(cVar.getComposition(), cVar.p(), cVar.e()), 1, false, cVar2, 9, null);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }
}
