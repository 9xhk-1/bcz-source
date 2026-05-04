package coil.compose;

import android.graphics.ColorSpace;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f9680a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements f {
        @Override // coil.compose.f
        public boolean equals(@m80.l Object obj, @m80.l Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof ImageRequest) || !(obj2 instanceof ImageRequest)) {
                return g0.g(obj, obj2);
            }
            ImageRequest imageRequest = (ImageRequest) obj;
            ImageRequest imageRequest2 = (ImageRequest) obj2;
            return g0.g(imageRequest.l(), imageRequest2.l()) && g0.g(imageRequest.m(), imageRequest2.m()) && g0.g(imageRequest.G(), imageRequest2.G()) && g0.g(imageRequest.B(), imageRequest2.B()) && g0.g(imageRequest.r(), imageRequest2.r()) && imageRequest.j() == imageRequest2.j() && g0.g(imageRequest.k(), imageRequest2.k()) && g0.g(imageRequest.O(), imageRequest2.O()) && g0.g(imageRequest.x(), imageRequest2.x()) && imageRequest.g() == imageRequest2.g() && imageRequest.h() == imageRequest2.h() && imageRequest.i() == imageRequest2.i() && imageRequest.I() == imageRequest2.I() && imageRequest.C() == imageRequest2.C() && imageRequest.s() == imageRequest2.s() && imageRequest.D() == imageRequest2.D() && g0.g(imageRequest.K(), imageRequest2.K()) && imageRequest.J() == imageRequest2.J() && imageRequest.H() == imageRequest2.H() && g0.g(imageRequest.E(), imageRequest2.E());
        }

        @Override // coil.compose.f
        public int hashCode(@m80.l Object obj) {
            if (!(obj instanceof ImageRequest)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            ImageRequest imageRequest = (ImageRequest) obj;
            int hashCode = ((imageRequest.l().hashCode() * 31) + imageRequest.m().hashCode()) * 31;
            MemoryCache.Key G = imageRequest.G();
            int hashCode2 = (hashCode + (G != null ? G.hashCode() : 0)) * 31;
            MemoryCache.Key B = imageRequest.B();
            int hashCode3 = (hashCode2 + (B != null ? B.hashCode() : 0)) * 31;
            String r11 = imageRequest.r();
            int hashCode4 = (((hashCode3 + (r11 != null ? r11.hashCode() : 0)) * 31) + imageRequest.j().hashCode()) * 31;
            ColorSpace k11 = imageRequest.k();
            return ((((((((((((((((((((((((((hashCode4 + (k11 != null ? k11.hashCode() : 0)) * 31) + imageRequest.O().hashCode()) * 31) + imageRequest.x().hashCode()) * 31) + Boolean.hashCode(imageRequest.g())) * 31) + Boolean.hashCode(imageRequest.h())) * 31) + Boolean.hashCode(imageRequest.i())) * 31) + Boolean.hashCode(imageRequest.I())) * 31) + imageRequest.C().hashCode()) * 31) + imageRequest.s().hashCode()) * 31) + imageRequest.D().hashCode()) * 31) + imageRequest.K().hashCode()) * 31) + imageRequest.J().hashCode()) * 31) + imageRequest.H().hashCode()) * 31) + imageRequest.E().hashCode();
        }
    }

    @m80.k
    public static final f a() {
        return f9680a;
    }
}
