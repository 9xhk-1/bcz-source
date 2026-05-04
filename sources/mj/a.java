package mj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.baicizhan.online.user_activity_api.ExportBanner;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class a extends DiffUtil.Callback {

    /* renamed from: c, reason: collision with root package name */
    public static final int f73272c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Object> f73273a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Object> f73274b;

    public a(@m80.k List<? extends Object> oldList, @m80.k List<? extends Object> newList) {
        kotlin.jvm.internal.g0.p(oldList, "oldList");
        kotlin.jvm.internal.g0.p(newList, "newList");
        this.f73273a = oldList;
        this.f73274b = newList;
    }

    @m80.k
    public final List<Object> a() {
        return this.f73274b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i11, int i12) {
        Object obj = this.f73273a.get(i11);
        Object obj2 = this.f73274b.get(i12);
        if ((obj instanceof ij.z) && (obj2 instanceof ij.z)) {
            ij.z zVar = (ij.z) obj;
            ij.z zVar2 = (ij.z) obj2;
            return zVar.w() == zVar2.w() && zVar.v() == zVar2.v();
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return kotlin.jvm.internal.g0.g(obj, obj2);
        }
        if ((obj instanceof ExportBanner) && (obj2 instanceof ExportBanner)) {
            return kotlin.jvm.internal.g0.g(((ExportBanner) obj).img_url, ((ExportBanner) obj2).img_url);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i11, int i12) {
        Object obj = this.f73273a.get(i11);
        Object obj2 = this.f73274b.get(i12);
        if ((obj instanceof ij.z) && (obj2 instanceof ij.z)) {
            return ((ij.z) obj).y() == ((ij.z) obj2).y();
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return kotlin.jvm.internal.g0.g(obj, obj2);
        }
        if ((obj instanceof ExportBanner) && (obj2 instanceof ExportBanner)) {
            return kotlin.jvm.internal.g0.g(((ExportBanner) obj).img_url, ((ExportBanner) obj2).img_url);
        }
        return false;
    }

    @m80.k
    public final List<Object> b() {
        return this.f73273a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f73274b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f73273a.size();
    }
}
