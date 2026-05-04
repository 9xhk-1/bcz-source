package bj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.baicizhan.main.wikiv2.studyv2.data.f0;
import com.baicizhan.main.wikiv2.studyv2.data.h0;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b extends DiffUtil.Callback {

    /* renamed from: c, reason: collision with root package name */
    public static final int f6843c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<?> f6844a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<?> f6845b;

    public b(@k List<?> oldList, @k List<?> newList) {
        g0.p(oldList, "oldList");
        g0.p(newList, "newList");
        this.f6844a = oldList;
        this.f6845b = newList;
    }

    @k
    public final List<?> a() {
        return this.f6845b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i11, int i12) {
        Object obj = this.f6844a.get(i11);
        Object obj2 = this.f6845b.get(i12);
        return ((obj instanceof h0) && (obj2 instanceof h0)) ? ((h0) obj).h() == ((h0) obj2).h() : ((obj instanceof f0) && (obj2 instanceof f0) && ((f0) obj).f() != ((f0) obj2).f()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i11, int i12) {
        return true;
    }

    @k
    public final List<?> b() {
        return this.f6844a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f6845b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f6844a.size();
    }
}
