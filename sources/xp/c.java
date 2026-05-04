package xp;

import com.google.zxing.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f98287a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f98288b;

    /* renamed from: c, reason: collision with root package name */
    public final l[] f98289c;

    public c(int i11, int[] iArr, int i12, int i13, int i14) {
        this.f98287a = i11;
        this.f98288b = iArr;
        float f11 = i12;
        float f12 = i14;
        this.f98289c = new l[]{new l(f11, f12), new l(i13, f12)};
    }

    public l[] a() {
        return this.f98289c;
    }

    public int[] b() {
        return this.f98288b;
    }

    public int c() {
        return this.f98287a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f98287a == ((c) obj).f98287a;
    }

    public int hashCode() {
        return this.f98287a;
    }
}
