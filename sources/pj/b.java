package pj;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.word_book.data.FavoriteInfo;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f80654d = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f80655a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<FavoriteInfo> f80656b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f80657c;

    public b(@l Boolean bool, @l List<FavoriteInfo> list, @l Throwable th2) {
        this.f80655a = bool;
        this.f80656b = list;
        this.f80657c = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b e(b bVar, Boolean bool, List list, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = bVar.f80655a;
        }
        if ((i11 & 2) != 0) {
            list = bVar.f80656b;
        }
        if ((i11 & 4) != 0) {
            th2 = bVar.f80657c;
        }
        return bVar.d(bool, list, th2);
    }

    @l
    public final Boolean a() {
        return this.f80655a;
    }

    @l
    public final List<FavoriteInfo> b() {
        return this.f80656b;
    }

    @l
    public final Throwable c() {
        return this.f80657c;
    }

    @k
    public final b d(@l Boolean bool, @l List<FavoriteInfo> list, @l Throwable th2) {
        return new b(bool, list, th2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f80655a, bVar.f80655a) && g0.g(this.f80656b, bVar.f80656b) && g0.g(this.f80657c, bVar.f80657c);
    }

    @l
    public final Throwable f() {
        return this.f80657c;
    }

    @l
    public final Boolean g() {
        return this.f80655a;
    }

    @l
    public final List<FavoriteInfo> h() {
        return this.f80656b;
    }

    public int hashCode() {
        Boolean bool = this.f80655a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<FavoriteInfo> list = this.f80656b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Throwable th2 = this.f80657c;
        return hashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f80657c == null;
    }

    @k
    public String toString() {
        return "FavoriteState(favorite=" + this.f80655a + ", targets=" + this.f80656b + ", exception=" + this.f80657c + j.f81007d;
    }
}
