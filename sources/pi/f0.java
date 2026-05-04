package pi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f0 f80554a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f80555b = 0;

    public final void a(@m80.k Object holder, @m80.k Context context, @m80.k Map<Integer, Boolean> careModeAppliedMap) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(careModeAppliedMap, "careModeAppliedMap");
        if (com.baicizhan.base.a.a(context)) {
            int hashCode = holder.hashCode();
            Boolean bool = careModeAppliedMap.get(Integer.valueOf(hashCode));
            Boolean bool2 = Boolean.TRUE;
            if (!kotlin.jvm.internal.g0.g(bool, bool2) && (holder instanceof RecyclerView.ViewHolder)) {
                View view = ((RecyclerView.ViewHolder) holder).itemView;
                kotlin.jvm.internal.g0.m(view);
                if (view instanceof ViewGroup) {
                    com.baicizhan.base.d.d((ViewGroup) view, context);
                }
                careModeAppliedMap.put(Integer.valueOf(hashCode), bool2);
            }
        }
    }
}
