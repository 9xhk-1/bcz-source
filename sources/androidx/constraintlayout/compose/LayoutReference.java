package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/LayoutReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1456:1\n1#2:1457\n*E\n"})
/* loaded from: classes2.dex */
public abstract class LayoutReference {
    public static final int $stable = 0;

    @k
    private final Map<String, HelperParams> helperParamsMap = new LinkedHashMap();

    /* renamed from: id, reason: collision with root package name */
    @k
    private final Object f4243id;

    public LayoutReference(@k Object obj) {
        this.f4243id = obj;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutReference) && g0.g(getId$constraintlayout_compose_release(), ((LayoutReference) obj).getId$constraintlayout_compose_release());
    }

    public final /* synthetic */ <T extends HelperParams> T getHelperParams$constraintlayout_compose_release() {
        Map map = this.helperParamsMap;
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object obj = map.get(o0.d(HelperParams.class).C());
        g0.y(2, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) obj;
    }

    @k
    public Object getId$constraintlayout_compose_release() {
        return this.f4243id;
    }

    public int hashCode() {
        return getId$constraintlayout_compose_release().hashCode();
    }

    public final void setHelperParams$constraintlayout_compose_release(@k HelperParams helperParams) {
        String C = o0.d(helperParams.getClass()).C();
        if (C != null) {
            this.helperParamsMap.put(C, helperParams);
        }
    }
}
