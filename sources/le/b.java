package le;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71176d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f71177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71178b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71179c;

    public b(int i11, int i12, boolean z11) {
        this.f71177a = i11;
        this.f71178b = i12;
        this.f71179c = z11;
    }

    public static /* synthetic */ b e(b bVar, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f71177a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f71178b;
        }
        if ((i13 & 4) != 0) {
            z11 = bVar.f71179c;
        }
        return bVar.d(i11, i12, z11);
    }

    public final int a() {
        return this.f71177a;
    }

    public final int b() {
        return this.f71178b;
    }

    public final boolean c() {
        return this.f71179c;
    }

    @k
    public final b d(int i11, int i12, boolean z11) {
        return new b(i11, i12, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f71177a == bVar.f71177a && this.f71178b == bVar.f71178b && this.f71179c == bVar.f71179c;
    }

    public final int f() {
        return this.f71177a;
    }

    public final boolean g() {
        return this.f71179c;
    }

    public final int h() {
        return this.f71178b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f71177a) * 31) + Integer.hashCode(this.f71178b)) * 31) + Boolean.hashCode(this.f71179c);
    }

    @k
    public String toString() {
        return "ReadableCoinInfo(coin=" + this.f71177a + ", todayCoin=" + this.f71178b + ", hasReadNewCoin=" + this.f71179c + j.f81007d;
    }
}
