package vj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.baicizhan.main.wordlistv2.WordTodayCategory;
import com.baicizhan.main.wordlistv2.c1;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class f extends DiffUtil.Callback {

    /* renamed from: c, reason: collision with root package name */
    public static final int f93982c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Object> f93983a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Object> f93984b;

    public f(@m80.k List<? extends Object> oldDataList, @m80.k List<? extends Object> newDataList) {
        g0.p(oldDataList, "oldDataList");
        g0.p(newDataList, "newDataList");
        this.f93983a = oldDataList;
        this.f93984b = newDataList;
    }

    @m80.k
    public final List<Object> a() {
        return this.f93984b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i11, int i12) {
        Object obj = this.f93983a.get(i11);
        Object obj2 = this.f93984b.get(i12);
        if (!(obj instanceof c1) || !(obj2 instanceof c1)) {
            return ((obj instanceof String) && (obj2 instanceof String)) ? g0.g(obj, obj2) : (obj instanceof WordTodayCategory) && (obj2 instanceof WordTodayCategory) && ((WordTodayCategory) obj).ordinal() == ((WordTodayCategory) obj2).ordinal();
        }
        c1 c1Var = (c1) obj;
        c1 c1Var2 = (c1) obj2;
        return g0.g(c1Var.w(), c1Var2.w()) && c1Var.q() == c1Var2.q() && c1Var.y() == c1Var2.y();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i11, int i12) {
        Object obj = this.f93983a.get(i11);
        Object obj2 = this.f93984b.get(i12);
        return ((obj instanceof c1) && (obj2 instanceof c1)) ? g0.g(((c1) obj).w(), ((c1) obj2).w()) : ((obj instanceof String) && (obj2 instanceof String)) ? g0.g(obj, obj2) : (obj instanceof WordTodayCategory) && (obj2 instanceof WordTodayCategory) && ((WordTodayCategory) obj).ordinal() == ((WordTodayCategory) obj2).ordinal();
    }

    @m80.k
    public final List<Object> b() {
        return this.f93983a;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f93984b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f93983a.size();
    }
}
