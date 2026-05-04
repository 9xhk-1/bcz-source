package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f60619c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<kj.a> f60620a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<z> f60621b;

    public b0(@m80.k List<kj.a> wordBookItems, @m80.k List<z> words) {
        g0.p(wordBookItems, "wordBookItems");
        g0.p(words, "words");
        this.f60620a = wordBookItems;
        this.f60621b = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 d(b0 b0Var, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = b0Var.f60620a;
        }
        if ((i11 & 2) != 0) {
            list2 = b0Var.f60621b;
        }
        return b0Var.c(list, list2);
    }

    @m80.k
    public final List<kj.a> a() {
        return this.f60620a;
    }

    @m80.k
    public final List<z> b() {
        return this.f60621b;
    }

    @m80.k
    public final b0 c(@m80.k List<kj.a> wordBookItems, @m80.k List<z> words) {
        g0.p(wordBookItems, "wordBookItems");
        g0.p(words, "words");
        return new b0(wordBookItems, words);
    }

    @m80.k
    public final List<kj.a> e() {
        return this.f60620a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return g0.g(this.f60620a, b0Var.f60620a) && g0.g(this.f60621b, b0Var.f60621b);
    }

    @m80.k
    public final List<z> f() {
        return this.f60621b;
    }

    public int hashCode() {
        return (this.f60620a.hashCode() * 31) + this.f60621b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordFavoriteListAddedInfoExtended(wordBookItems=" + this.f60620a + ", words=" + this.f60621b + pn.j.f81007d;
    }
}
