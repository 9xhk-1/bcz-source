package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cl.p;
import fl.o;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g<T> implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f28688a;

    /* renamed from: b, reason: collision with root package name */
    public final d f28689b;

    /* renamed from: c, reason: collision with root package name */
    public final k f28690c;

    /* renamed from: d, reason: collision with root package name */
    public final a<T> f28691d;

    /* renamed from: e, reason: collision with root package name */
    public final b<T> f28692e;

    /* renamed from: f, reason: collision with root package name */
    public int f28693f;

    /* renamed from: g, reason: collision with root package name */
    public int f28694g;

    /* renamed from: i, reason: collision with root package name */
    public int f28696i;

    /* renamed from: h, reason: collision with root package name */
    public int f28695h = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28697j = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<U> {
        @NonNull
        List<U> a(int i11);

        @Nullable
        j<?> b(@NonNull U u11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T> {
        @Nullable
        int[] a(@NonNull T t11, int i11, int i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<c> f28701a;

        public d(int i11) {
            this.f28701a = o.g(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                this.f28701a.offer(new c());
            }
        }

        public c a(int i11, int i12) {
            c poll = this.f28701a.poll();
            this.f28701a.offer(poll);
            poll.f28699b = i11;
            poll.f28698a = i12;
            return poll;
        }
    }

    public g(@NonNull k kVar, @NonNull a<T> aVar, @NonNull b<T> bVar, int i11) {
        this.f28690c = kVar;
        this.f28691d = aVar;
        this.f28692e = bVar;
        this.f28688a = i11;
        this.f28689b = new d(i11 + 1);
    }

    public final void a() {
        for (int i11 = 0; i11 < this.f28689b.f28701a.size(); i11++) {
            this.f28690c.clear(this.f28689b.a(0, 0));
        }
    }

    public final void b(int i11, int i12) {
        int min;
        int i13;
        if (i11 < i12) {
            i13 = Math.max(this.f28693f, i11);
            min = i12;
        } else {
            min = Math.min(this.f28694g, i11);
            i13 = i12;
        }
        int min2 = Math.min(this.f28696i, min);
        int min3 = Math.min(this.f28696i, Math.max(0, i13));
        if (i11 < i12) {
            for (int i14 = min3; i14 < min2; i14++) {
                d(this.f28691d.a(i14), i14, true);
            }
        } else {
            for (int i15 = min2 - 1; i15 >= min3; i15--) {
                d(this.f28691d.a(i15), i15, false);
            }
        }
        this.f28694g = min3;
        this.f28693f = min2;
    }

    public final void c(int i11, boolean z11) {
        if (this.f28697j != z11) {
            this.f28697j = z11;
            a();
        }
        b(i11, (z11 ? this.f28688a : -this.f28688a) + i11);
    }

    public final void d(List<T> list, int i11, boolean z11) {
        int size = list.size();
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                e(list.get(i12), i11, i12);
            }
            return;
        }
        for (int i13 = size - 1; i13 >= 0; i13--) {
            e(list.get(i13), i11, i13);
        }
    }

    public final void e(@Nullable T t11, int i11, int i12) {
        int[] a11;
        j<?> b11;
        if (t11 == null || (a11 = this.f28692e.a(t11, i11, i12)) == null || (b11 = this.f28691d.b(t11)) == null) {
            return;
        }
        b11.into((j<?>) this.f28689b.a(a11[0], a11[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        if (this.f28696i == 0 && i13 == 0) {
            return;
        }
        this.f28696i = i13;
        int i14 = this.f28695h;
        if (i11 > i14) {
            c(i12 + i11, true);
        } else if (i11 < i14) {
            c(i11, false);
        }
        this.f28695h = i11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements p<Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28698a;

        /* renamed from: b, reason: collision with root package name */
        public int f28699b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public bl.d f28700c;

        @Override // cl.p
        @Nullable
        public bl.d f() {
            return this.f28700c;
        }

        @Override // cl.p
        public void j(@NonNull cl.o oVar) {
            oVar.e(this.f28699b, this.f28698a);
        }

        @Override // cl.p
        public void k(@Nullable bl.d dVar) {
            this.f28700c = dVar;
        }

        @Override // yk.l
        public void onDestroy() {
        }

        @Override // yk.l
        public void onStart() {
        }

        @Override // yk.l
        public void onStop() {
        }

        @Override // cl.p
        public void g(@NonNull cl.o oVar) {
        }

        @Override // cl.p
        public void i(@Nullable Drawable drawable) {
        }

        @Override // cl.p
        public void l(@Nullable Drawable drawable) {
        }

        @Override // cl.p
        public void m(@Nullable Drawable drawable) {
        }

        @Override // cl.p
        public void h(@NonNull Object obj, @Nullable dl.f<? super Object> fVar) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i11) {
    }
}
