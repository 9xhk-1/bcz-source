package ig;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.global.AppPageStatus;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f60539a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static AppPageStatus f60540b = AppPageStatus.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    public static final int f60541c = 8;

    @k
    public final AppPageStatus a() {
        return f60540b;
    }

    public final void b() {
        f60540b = AppPageStatus.DEFAULT;
    }

    public final void c(@k AppPageStatus appPageStatus) {
        g0.p(appPageStatus, "<set-?>");
        f60540b = appPageStatus;
    }
}
