package ag;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class b<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2642c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public List<T> f2643a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @l
    public a<T> f2644b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<E> {
        void a(E e11);
    }

    public static final void g(b bVar, int i11, View view) {
        a<T> aVar = bVar.f2644b;
        if (aVar != null) {
            aVar.a(bVar.f2643a.get(i11));
        }
    }

    @l
    public final a<T> c() {
        return this.f2644b;
    }

    @k
    public final List<T> d() {
        return this.f2643a;
    }

    public abstract void f(@k VH vh2, T t11, int i11);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f2643a.size();
    }

    public final void h(@k List<? extends T> data) {
        g0.p(data, "data");
        this.f2643a.clear();
        this.f2643a.addAll(data);
        notifyDataSetChanged();
    }

    public final void i(@l a<T> aVar) {
        this.f2644b = aVar;
    }

    public final void j(@k List<T> list) {
        g0.p(list, "<set-?>");
        this.f2643a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@k VH holder, final int i11) {
        g0.p(holder, "holder");
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ag.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.g(b.this, i11, view);
            }
        });
        f(holder, this.f2643a.get(i11), i11);
    }
}
