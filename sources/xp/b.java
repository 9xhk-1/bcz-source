package xp;

import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f98285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98286b;

    public b(int i11, int i12) {
        this.f98285a = i11;
        this.f98286b = i12;
    }

    public final int a() {
        return this.f98286b;
    }

    public final int b() {
        return this.f98285a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f98285a == bVar.f98285a && this.f98286b == bVar.f98286b;
    }

    public final int hashCode() {
        return this.f98285a ^ this.f98286b;
    }

    public final String toString() {
        return this.f98285a + j.f81006c + this.f98286b + ')';
    }
}
