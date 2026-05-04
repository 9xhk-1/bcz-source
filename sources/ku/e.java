package ku;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e<K, V> {

    /* renamed from: c, reason: collision with root package name */
    public static final a[] f68692c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f68693d = {2, 5, 11, 17, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, R.styleable.Theme_drawable_sound1, R.styleable.Theme_drawable_syncview, R.styleable.Theme_drawable_syncview_update, R.styleable.Theme_drawable_tab_lecture, R.styleable.Theme_drawable_tab_surrounding, R.styleable.Theme_drawable_test_nodate, R.styleable.Theme_drawable_wiki_sound, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, TypedValues.AttributesType.TYPE_EASING, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 727, 733, 739, 743, 751, 757, 761, com.badlogic.gdx.graphics.f.f11647q, com.badlogic.gdx.graphics.f.f11671u, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, aq.a.f5447a, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 1009, 2053, 3079, 4057, 7103, 10949, 16069, 32609, 65867, 104729};

    /* renamed from: a, reason: collision with root package name */
    public final int f68694a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f68695b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f68696a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f68697b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f68698c;

        /* renamed from: d, reason: collision with root package name */
        public final a f68699d;

        public a(int i11, Object obj, Object obj2, a aVar) {
            this.f68696a = i11;
            this.f68697b = obj;
            this.f68698c = obj2;
            this.f68699d = aVar;
        }

        public Object a(Object obj) {
            if (this.f68697b.equals(obj)) {
                return this.f68698c;
            }
            a aVar = this.f68699d;
            if (aVar != null) {
                return aVar.a(obj);
            }
            return null;
        }
    }

    public e() {
        this(0, f68692c);
    }

    public static int c(int i11) {
        for (int i12 : f68693d) {
            if (i12 > i11) {
                return i12;
            }
        }
        return f68693d[r4.length - 1];
    }

    public static void d(a[] aVarArr, a[] aVarArr2) {
        for (a aVar : aVarArr) {
            for (; aVar != null; aVar = aVar.f68699d) {
                f(aVarArr2, aVar);
            }
        }
    }

    public static <K, V> void e(a[] aVarArr, int i11, K k11, V v11) {
        int length = i11 % aVarArr.length;
        aVarArr[length] = new a(i11, k11, v11, aVarArr[length]);
    }

    public static void f(a[] aVarArr, a aVar) {
        int i11 = aVar.f68696a;
        int length = i11 % aVarArr.length;
        a aVar2 = aVarArr[length];
        if (aVar2 == null && aVar.f68699d == null) {
            aVarArr[length] = aVar;
        } else {
            aVarArr[length] = new a(i11, aVar.f68697b, aVar.f68698c, aVar2);
        }
    }

    public e<K, V> a(K k11, V v11) {
        int i11 = this.f68694a + 1;
        a[] aVarArr = this.f68695b;
        a[] aVarArr2 = i11 > aVarArr.length ? new a[c((i11 * 2) - 1)] : new a[aVarArr.length];
        int length = aVarArr2.length;
        a[] aVarArr3 = this.f68695b;
        if (length == aVarArr3.length) {
            System.arraycopy(aVarArr3, 0, aVarArr2, 0, aVarArr3.length);
        } else {
            d(aVarArr3, aVarArr2);
        }
        e(aVarArr2, Math.abs(k11.hashCode()), k11, v11);
        return new e<>(i11, aVarArr2);
    }

    public V b(K k11) {
        if (this.f68695b.length == 0) {
            return null;
        }
        int abs = Math.abs(k11.hashCode());
        a[] aVarArr = this.f68695b;
        a aVar = aVarArr[abs % aVarArr.length];
        if (aVar == null) {
            return null;
        }
        return (V) aVar.a(k11);
    }

    public e(int i11, a[] aVarArr) {
        this.f68694a = i11;
        this.f68695b = aVarArr;
    }
}
