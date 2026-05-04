package ed;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.baicizhan.main.fragment.WebReviewFragment;
import kotlin.jvm.internal.g0;
import m80.k;
import y9.c;
import y9.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f49650a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final int f49651b = 0;

    @k
    public final Fragment a() {
        Object c11 = e.f().c(c.f99702j, y9.b.f99687c);
        if (c11 == null) {
            return WebReviewFragment.f20827b.a(WebReviewFragment.f20830e);
        }
        WebReviewFragment.a aVar = WebReviewFragment.f20827b;
        g0.n(c11, "null cannot be cast to non-null type kotlin.String");
        return aVar.a((String) c11);
    }
}
