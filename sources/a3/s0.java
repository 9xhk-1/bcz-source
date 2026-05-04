package a3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static s0 f1629b;

    /* renamed from: a, reason: collision with root package name */
    public o0 f1630a;

    public static s0 c() {
        if (f1629b == null) {
            f1629b = new s0();
        }
        return f1629b;
    }

    public final <T> int a(T[] tArr, Comparator<T> comparator, int i11) {
        int i12 = 0;
        for (int i13 = 1; i13 < i11; i13++) {
            if (comparator.compare(tArr[i13], tArr[i12]) > 0) {
                i12 = i13;
            }
        }
        return i12;
    }

    public final <T> int b(T[] tArr, Comparator<T> comparator, int i11) {
        int i12 = 0;
        for (int i13 = 1; i13 < i11; i13++) {
            if (comparator.compare(tArr[i13], tArr[i12]) < 0) {
                i12 = i13;
            }
        }
        return i12;
    }

    public <T> T d(T[] tArr, Comparator<T> comparator, int i11, int i12) {
        return tArr[e(tArr, comparator, i11, i12)];
    }

    public <T> int e(T[] tArr, Comparator<T> comparator, int i11, int i12) {
        if (i12 < 1) {
            throw new GdxRuntimeException("cannot select from empty array (size < 1)");
        }
        if (i11 > i12) {
            throw new GdxRuntimeException("Kth rank is larger than size. k: " + i11 + ", size: " + i12);
        }
        if (i11 == 1) {
            return b(tArr, comparator, i12);
        }
        if (i11 == i12) {
            return a(tArr, comparator, i12);
        }
        if (this.f1630a == null) {
            this.f1630a = new o0();
        }
        return this.f1630a.d(tArr, comparator, i11, i12);
    }
}
