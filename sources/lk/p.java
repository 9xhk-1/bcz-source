package lk;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.NavigableMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(19)
/* loaded from: classes6.dex */
public final class p implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71491d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final b f71492a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final h<a, Bitmap> f71493b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    public final NavigableMap<Integer, Integer> f71494c = new n();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f71495a;

        /* renamed from: b, reason: collision with root package name */
        public int f71496b;

        public a(b bVar) {
            this.f71495a = bVar;
        }

        @Override // lk.m
        public void a() {
            this.f71495a.c(this);
        }

        public void b(int i11) {
            this.f71496b = i11;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f71496b == ((a) obj).f71496b;
        }

        public int hashCode() {
            return this.f71496b;
        }

        public String toString() {
            return p.g(this.f71496b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class b extends d<a> {
        @Override // lk.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i11) {
            a aVar = (a) super.b();
            aVar.b(i11);
            return aVar;
        }
    }

    public static String g(int i11) {
        return "[" + i11 + "]";
    }

    private static String h(Bitmap bitmap) {
        return g(fl.o.i(bitmap));
    }

    @Override // lk.l
    public String a(int i11, int i12, Bitmap.Config config) {
        return g(fl.o.h(i11, i12, config));
    }

    @Override // lk.l
    public int b(Bitmap bitmap) {
        return fl.o.i(bitmap);
    }

    @Override // lk.l
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    public final void d(Integer num) {
        Integer num2 = this.f71494c.get(num);
        if (num2.intValue() == 1) {
            this.f71494c.remove(num);
        } else {
            this.f71494c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // lk.l
    public void e(Bitmap bitmap) {
        a e11 = this.f71492a.e(fl.o.i(bitmap));
        this.f71493b.d(e11, bitmap);
        Integer num = this.f71494c.get(Integer.valueOf(e11.f71496b));
        this.f71494c.put(Integer.valueOf(e11.f71496b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // lk.l
    @Nullable
    public Bitmap f(int i11, int i12, Bitmap.Config config) {
        int h11 = fl.o.h(i11, i12, config);
        a e11 = this.f71492a.e(h11);
        Integer ceilingKey = this.f71494c.ceilingKey(Integer.valueOf(h11));
        if (ceilingKey != null && ceilingKey.intValue() != h11 && ceilingKey.intValue() <= h11 * 8) {
            this.f71492a.c(e11);
            e11 = this.f71492a.e(ceilingKey.intValue());
        }
        Bitmap a11 = this.f71493b.a(e11);
        if (a11 != null) {
            a11.reconfigure(i11, i12, config);
            d(ceilingKey);
        }
        return a11;
    }

    @Override // lk.l
    @Nullable
    public Bitmap removeLast() {
        Bitmap f11 = this.f71493b.f();
        if (f11 != null) {
            d(Integer.valueOf(fl.o.i(f11)));
        }
        return f11;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f71493b + "\n  SortedSizes" + this.f71494c;
    }
}
