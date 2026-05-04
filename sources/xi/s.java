package xi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s f98107a = new s();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<Integer, Boolean> f98108b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final int f98109c = 8;

    public final void a(@m80.k Object holder, @m80.k View rootView, @m80.k Context context) {
        g0.p(holder, "holder");
        g0.p(rootView, "rootView");
        g0.p(context, "context");
        if ((rootView instanceof ViewGroup) && com.baicizhan.base.a.a(context)) {
            int hashCode = rootView.hashCode();
            Map<Integer, Boolean> map = f98108b;
            Boolean bool = map.get(Integer.valueOf(hashCode));
            Boolean bool2 = Boolean.TRUE;
            if (g0.g(bool, bool2)) {
                return;
            }
            com.baicizhan.base.d.d((ViewGroup) rootView, context);
            map.put(Integer.valueOf(hashCode), bool2);
        }
    }
}
