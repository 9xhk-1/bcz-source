package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f60613c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kj.a f60614a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<z> f60615b;

    public a0(@m80.k kj.a wordBookItem, @m80.k List<z> words) {
        g0.p(wordBookItem, "wordBookItem");
        g0.p(words, "words");
        this.f60614a = wordBookItem;
        this.f60615b = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a0 d(a0 a0Var, kj.a aVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a0Var.f60614a;
        }
        if ((i11 & 2) != 0) {
            list = a0Var.f60615b;
        }
        return a0Var.c(aVar, list);
    }

    @m80.k
    public final kj.a a() {
        return this.f60614a;
    }

    @m80.k
    public final List<z> b() {
        return this.f60615b;
    }

    @m80.k
    public final a0 c(@m80.k kj.a wordBookItem, @m80.k List<z> words) {
        g0.p(wordBookItem, "wordBookItem");
        g0.p(words, "words");
        return new a0(wordBookItem, words);
    }

    @m80.k
    public final kj.a e() {
        return this.f60614a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return g0.g(this.f60614a, a0Var.f60614a) && g0.g(this.f60615b, a0Var.f60615b);
    }

    @m80.k
    public final List<z> f() {
        return this.f60615b;
    }

    public int hashCode() {
        return (this.f60614a.hashCode() * 31) + this.f60615b.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordFavoriteListAddedInfo(wordBookItem=" + this.f60614a + ", words=" + this.f60615b + pn.j.f81007d;
    }
}
