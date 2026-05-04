package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes7.dex */
public class a<T extends m<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Integer, T> f31498a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Set<Integer> f31499b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public b f31500c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31501d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31502e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    public class C0375a implements m.a<T> {
        public C0375a() {
        }

        @Override // com.google.android.material.internal.m.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t11, boolean z11) {
            if (!z11) {
                a aVar = a.this;
                if (!aVar.t(t11, aVar.f31502e)) {
                    return;
                }
            } else if (!a.this.g(t11)) {
                return;
            }
            a.this.n();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(@NonNull Set<Integer> set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t11) {
        this.f31498a.put(Integer.valueOf(t11.getId()), t11);
        if (t11.isChecked()) {
            g(t11);
        }
        t11.setInternalOnCheckedChangeListener(new C0375a());
    }

    public void f(@IdRes int i11) {
        T t11 = this.f31498a.get(Integer.valueOf(i11));
        if (t11 != null && g(t11)) {
            n();
        }
    }

    public final boolean g(@NonNull m<T> mVar) {
        int id2 = mVar.getId();
        if (this.f31499b.contains(Integer.valueOf(id2))) {
            return false;
        }
        T t11 = this.f31498a.get(Integer.valueOf(k()));
        if (t11 != null) {
            t(t11, false);
        }
        boolean add = this.f31499b.add(Integer.valueOf(id2));
        if (!mVar.isChecked()) {
            mVar.setChecked(true);
        }
        return add;
    }

    public void h() {
        boolean isEmpty = this.f31499b.isEmpty();
        Iterator<T> it = this.f31498a.values().iterator();
        while (it.hasNext()) {
            t(it.next(), false);
        }
        if (isEmpty) {
            return;
        }
        n();
    }

    @NonNull
    public Set<Integer> i() {
        return new HashSet(this.f31499b);
    }

    @NonNull
    public List<Integer> j(@NonNull ViewGroup viewGroup) {
        Set<Integer> i11 = i();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof m) && i11.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int k() {
        if (!this.f31501d || this.f31499b.isEmpty()) {
            return -1;
        }
        return this.f31499b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f31502e;
    }

    public boolean m() {
        return this.f31501d;
    }

    public final void n() {
        b bVar = this.f31500c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public void o(T t11) {
        t11.setInternalOnCheckedChangeListener(null);
        this.f31498a.remove(Integer.valueOf(t11.getId()));
        this.f31499b.remove(Integer.valueOf(t11.getId()));
    }

    public void p(@Nullable b bVar) {
        this.f31500c = bVar;
    }

    public void q(boolean z11) {
        this.f31502e = z11;
    }

    public void r(boolean z11) {
        if (this.f31501d != z11) {
            this.f31501d = z11;
            h();
        }
    }

    public void s(@IdRes int i11) {
        T t11 = this.f31498a.get(Integer.valueOf(i11));
        if (t11 != null && t(t11, this.f31502e)) {
            n();
        }
    }

    public final boolean t(@NonNull m<T> mVar, boolean z11) {
        int id2 = mVar.getId();
        if (!this.f31499b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z11 && this.f31499b.size() == 1 && this.f31499b.contains(Integer.valueOf(id2))) {
            mVar.setChecked(true);
            return false;
        }
        boolean remove = this.f31499b.remove(Integer.valueOf(id2));
        if (mVar.isChecked()) {
            mVar.setChecked(false);
        }
        return remove;
    }
}
