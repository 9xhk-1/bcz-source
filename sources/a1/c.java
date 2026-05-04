package a1;

import a1.g;
import androidx.compose.runtime.Stable;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes3.dex */
public interface c extends g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ Object a(c cVar, com.airbnb.lottie.k kVar, int i11, int i12, float f11, h hVar, float f12, boolean z11, LottieCancellationBehavior lottieCancellationBehavior, boolean z12, j00.c cVar2, int i13, Object obj) {
            float f13;
            boolean z13;
            c cVar3;
            com.airbnb.lottie.k kVar2;
            j00.c cVar4;
            float c11;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            if ((i13 & 2) != 0) {
                i11 = cVar.o();
            }
            int i14 = i11;
            int d11 = (i13 & 4) != 0 ? cVar.d() : i12;
            float e11 = (i13 & 8) != 0 ? cVar.e() : f11;
            h p11 = (i13 & 16) != 0 ? cVar.p() : hVar;
            if ((i13 & 32) != 0) {
                c11 = e.c(kVar, p11, e11);
                f13 = c11;
            } else {
                f13 = f12;
            }
            boolean z14 = (i13 & 64) != 0 ? false : z11;
            LottieCancellationBehavior lottieCancellationBehavior2 = (i13 & 128) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
            if ((i13 & 256) != 0) {
                z13 = false;
                cVar3 = cVar;
                cVar4 = cVar2;
                kVar2 = kVar;
            } else {
                z13 = z12;
                cVar3 = cVar;
                kVar2 = kVar;
                cVar4 = cVar2;
            }
            return cVar3.n(kVar2, i14, d11, e11, p11, f13, z14, lottieCancellationBehavior2, z13, cVar4);
        }

        public static long b(@m80.k c cVar) {
            g0.p(cVar, "this");
            return g.a.a(cVar);
        }

        public static /* synthetic */ Object c(c cVar, com.airbnb.lottie.k kVar, float f11, int i11, boolean z11, j00.c cVar2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i12 & 1) != 0) {
                kVar = cVar.getComposition();
            }
            if ((i12 & 2) != 0) {
                f11 = cVar.getProgress();
            }
            if ((i12 & 4) != 0) {
                i11 = cVar.o();
            }
            if ((i12 & 8) != 0) {
                z11 = !(f11 == cVar.getProgress());
            }
            return cVar.h(kVar, f11, i11, z11, cVar2);
        }
    }

    @m80.l
    Object h(@m80.l com.airbnb.lottie.k kVar, float f11, int i11, boolean z11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object n(@m80.l com.airbnb.lottie.k kVar, int i11, int i12, float f11, @m80.l h hVar, float f12, boolean z11, @m80.k LottieCancellationBehavior lottieCancellationBehavior, boolean z12, @m80.k j00.c<? super g2> cVar);
}
