package p50;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f79141c = "MultiTypeAdapter";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public List<?> f79142a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public p f79143b;

    public h() {
        this(Collections.EMPTY_LIST);
    }

    public final void b(@NonNull Class<?> cls) {
        if (this.f79143b.b(cls)) {
            Log.w(f79141c, "You have registered the " + cls.getSimpleName() + " type. It will override the original binder(s).");
        }
    }

    @NonNull
    public List<?> c() {
        return this.f79142a;
    }

    @NonNull
    public final e d(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.f79143b.a(viewHolder.getItemViewType());
    }

    @NonNull
    public p f() {
        return this.f79143b;
    }

    public int g(int i11, @NonNull Object obj) throws a {
        int d11 = this.f79143b.d(obj.getClass());
        if (d11 != -1) {
            return d11 + this.f79143b.e(d11).a(i11, obj);
        }
        throw new a(obj.getClass());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f79142a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i11) {
        return this.f79143b.a(getItemViewType(i11)).e(this.f79142a.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        return g(i11, this.f79142a.get(i11));
    }

    @NonNull
    @CheckResult
    public <T> n<T> h(@NonNull Class<? extends T> cls) {
        o.a(cls);
        b(cls);
        return new l(this, cls);
    }

    public <T> void i(@NonNull Class<? extends T> cls, @NonNull e<T, ?> eVar) {
        o.a(cls);
        o.a(eVar);
        b(cls);
        j(cls, eVar, new d());
    }

    public <T> void j(@NonNull Class<? extends T> cls, @NonNull e<T, ?> eVar, @NonNull g<T> gVar) {
        this.f79143b.f(cls, eVar, gVar);
        eVar.f79140a = this;
    }

    public void k(@NonNull p pVar) {
        o.a(pVar);
        int size = pVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            l(pVar.c(i11), pVar.a(i11), pVar.e(i11));
        }
    }

    public final void l(@NonNull Class cls, @NonNull e eVar, @NonNull g gVar) {
        b(cls);
        j(cls, eVar, gVar);
    }

    public void m(@NonNull List<?> list) {
        o.a(list);
        this.f79142a = list;
    }

    public void n(@NonNull p pVar) {
        o.a(pVar);
        this.f79143b = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11) {
        onBindViewHolder(viewHolder, i11, Collections.EMPTY_LIST);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return this.f79143b.a(i11).i(LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return d(viewHolder).j(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        d(viewHolder).k(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        d(viewHolder).l(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        d(viewHolder).m(viewHolder);
    }

    public h(@NonNull List<?> list) {
        this(list, new k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i11, List<Object> list) {
        this.f79143b.a(viewHolder.getItemViewType()).h(viewHolder, this.f79142a.get(i11), list);
    }

    public h(@NonNull List<?> list, int i11) {
        this(list, new k(i11));
    }

    public h(@NonNull List<?> list, @NonNull p pVar) {
        o.a(list);
        o.a(pVar);
        this.f79142a = list;
        this.f79143b = pVar;
    }
}
