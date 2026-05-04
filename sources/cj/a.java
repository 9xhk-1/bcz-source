package cj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class a<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8682b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Boolean> f8683a = new LinkedHashMap();

    public final void b(@m80.k VH holder) {
        g0.p(holder, "holder");
        Context context = holder.itemView.getContext();
        if (context == null || !com.baicizhan.base.a.a(context)) {
            return;
        }
        View itemView = holder.itemView;
        g0.o(itemView, "itemView");
        int hashCode = itemView.hashCode();
        Boolean bool = this.f8683a.get(Integer.valueOf(hashCode));
        Boolean bool2 = Boolean.TRUE;
        if (g0.g(bool, bool2)) {
            return;
        }
        if (itemView instanceof ViewGroup) {
            com.baicizhan.base.d.d((ViewGroup) itemView, context);
        }
        this.f8683a.put(Integer.valueOf(hashCode), bool2);
    }
}
