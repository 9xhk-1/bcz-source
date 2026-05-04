package rf;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.List;
import kotlin.jvm.internal.g0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final int f84027f = 8;

    /* renamed from: a, reason: collision with root package name */
    @wo.c("begin")
    private final int f84028a;

    /* renamed from: b, reason: collision with root package name */
    @wo.c(TtmlNode.END)
    private final int f84029b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    @wo.c("phones")
    private final List<n> f84030c;

    /* renamed from: d, reason: collision with root package name */
    @wo.c(a.b.C0242a.f16107c)
    private final int f84031d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    @wo.c("word")
    private final String f84032e;

    public m(int i11, int i12, @m80.k List<n> phones, int i13, @m80.k String word) {
        g0.p(phones, "phones");
        g0.p(word, "word");
        this.f84028a = i11;
        this.f84029b = i12;
        this.f84030c = phones;
        this.f84031d = i13;
        this.f84032e = word;
    }

    public static /* synthetic */ m g(m mVar, int i11, int i12, List list, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = mVar.f84028a;
        }
        if ((i14 & 2) != 0) {
            i12 = mVar.f84029b;
        }
        if ((i14 & 4) != 0) {
            list = mVar.f84030c;
        }
        if ((i14 & 8) != 0) {
            i13 = mVar.f84031d;
        }
        if ((i14 & 16) != 0) {
            str = mVar.f84032e;
        }
        String str2 = str;
        List list2 = list;
        return mVar.f(i11, i12, list2, i13, str2);
    }

    public final int a() {
        return this.f84028a;
    }

    public final int b() {
        return this.f84029b;
    }

    @m80.k
    public final List<n> c() {
        return this.f84030c;
    }

    public final int d() {
        return this.f84031d;
    }

    @m80.k
    public final String e() {
        return this.f84032e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f84028a == mVar.f84028a && this.f84029b == mVar.f84029b && g0.g(this.f84030c, mVar.f84030c) && this.f84031d == mVar.f84031d && g0.g(this.f84032e, mVar.f84032e);
    }

    @m80.k
    public final m f(int i11, int i12, @m80.k List<n> phones, int i13, @m80.k String word) {
        g0.p(phones, "phones");
        g0.p(word, "word");
        return new m(i11, i12, phones, i13, word);
    }

    public final int h() {
        return this.f84028a;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f84028a) * 31) + Integer.hashCode(this.f84029b)) * 31) + this.f84030c.hashCode()) * 31) + Integer.hashCode(this.f84031d)) * 31) + this.f84032e.hashCode();
    }

    public final int i() {
        return this.f84029b;
    }

    @m80.k
    public final List<n> j() {
        return this.f84030c;
    }

    public final int k() {
        return this.f84031d;
    }

    @m80.k
    public final String l() {
        return this.f84032e;
    }

    @m80.k
    public final String m() {
        return "[" + this.f84032e + j2.O + this.f84031d + "]";
    }

    @m80.k
    public String toString() {
        return "RecordWordsInfo(begin=" + this.f84028a + ", end=" + this.f84029b + ", phones=" + this.f84030c + ", score=" + this.f84031d + ", word=" + this.f84032e + pn.j.f81007d;
    }
}
