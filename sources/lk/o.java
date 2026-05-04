package lk;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(19)
/* loaded from: classes6.dex */
public class o implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71478d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f71479e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f71480f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f71481g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f71482h;

    /* renamed from: i, reason: collision with root package name */
    public static final Bitmap.Config[] f71483i;

    /* renamed from: a, reason: collision with root package name */
    public final c f71484a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final h<b, Bitmap> f71485b = new h<>();

    /* renamed from: c, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f71486c = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71487a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f71487a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71487a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71487a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71487a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class c extends d<b> {
        @Override // lk.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i11, Bitmap.Config config) {
            b b11 = b();
            b11.b(i11, config);
            return b11;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f71479e = configArr;
        f71480f = configArr;
        f71481g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f71482h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f71483i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + pn.j.f81007d;
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f71480f;
            }
        }
        int i11 = a.f71487a[config.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? new Bitmap.Config[]{config} : f71483i : f71482h : f71481g : f71479e;
    }

    @Override // lk.l
    public String a(int i11, int i12, Bitmap.Config config) {
        return h(fl.o.h(i11, i12, config), config);
    }

    @Override // lk.l
    public int b(Bitmap bitmap) {
        return fl.o.i(bitmap);
    }

    @Override // lk.l
    public String c(Bitmap bitmap) {
        return h(fl.o.i(bitmap), bitmap.getConfig());
    }

    public final void d(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j11 = j(bitmap.getConfig());
        Integer num2 = j11.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j11.remove(num);
                return;
            } else {
                j11.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
    }

    @Override // lk.l
    public void e(Bitmap bitmap) {
        b e11 = this.f71484a.e(fl.o.i(bitmap), bitmap.getConfig());
        this.f71485b.d(e11, bitmap);
        NavigableMap<Integer, Integer> j11 = j(bitmap.getConfig());
        Integer num = j11.get(Integer.valueOf(e11.f71489b));
        j11.put(Integer.valueOf(e11.f71489b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // lk.l
    @Nullable
    public Bitmap f(int i11, int i12, Bitmap.Config config) {
        b g11 = g(fl.o.h(i11, i12, config), config);
        Bitmap a11 = this.f71485b.a(g11);
        if (a11 != null) {
            d(Integer.valueOf(g11.f71489b), a11);
            a11.reconfigure(i11, i12, config);
        }
        return a11;
    }

    public final b g(int i11, Bitmap.Config config) {
        b e11 = this.f71484a.e(i11, config);
        Bitmap.Config[] i12 = i(config);
        int length = i12.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            Bitmap.Config config2 = i12[i13];
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i11));
            if (ceilingKey == null || ceilingKey.intValue() > i11 * 8) {
                i13++;
            } else if (ceilingKey.intValue() != i11 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f71484a.c(e11);
                return this.f71484a.e(ceilingKey.intValue(), config2);
            }
        }
        return e11;
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f71486c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f71486c.put(config, treeMap);
        return treeMap;
    }

    @Override // lk.l
    @Nullable
    public Bitmap removeLast() {
        Bitmap f11 = this.f71485b.f();
        if (f11 != null) {
            d(Integer.valueOf(fl.o.i(f11)), f11);
        }
        return f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f71485b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f71486c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f71486c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        public final c f71488a;

        /* renamed from: b, reason: collision with root package name */
        public int f71489b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f71490c;

        public b(c cVar) {
            this.f71488a = cVar;
        }

        @Override // lk.m
        public void a() {
            this.f71488a.c(this);
        }

        public void b(int i11, Bitmap.Config config) {
            this.f71489b = i11;
            this.f71490c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f71489b == bVar.f71489b && fl.o.e(this.f71490c, bVar.f71490c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f71489b * 31;
            Bitmap.Config config = this.f71490c;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f71489b, this.f71490c);
        }

        @VisibleForTesting
        public b(c cVar, int i11, Bitmap.Config config) {
            this(cVar);
            b(i11, config);
        }
    }
}
