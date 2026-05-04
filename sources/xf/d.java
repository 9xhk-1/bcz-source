package xf;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.examassistant.data.MarkedWord;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import wb0.p;
import wf.m;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d implements wf.a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f98035b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<MarkedWord> f98036a;

    public d(@k List<MarkedWord> wordList) {
        g0.p(wordList, "wordList");
        this.f98036a = wordList;
    }

    public static final m c(MarkedWord markedWord) {
        m mVar = new m();
        mVar.i(0);
        mVar.n(markedWord.n());
        mVar.p(markedWord.j());
        mVar.o(markedWord.o());
        mVar.k(markedWord.l());
        mVar.l(markedWord.m());
        mVar.j(markedWord.k());
        mVar.m(f.f98037a.c(markedWord.n()));
        return mVar;
    }

    public static final m d(l lVar, Object obj) {
        return (m) lVar.invoke(obj);
    }

    @Override // wf.a
    @k
    public rx.c<List<m>> load() {
        rx.c u22 = rx.c.u2(this.f98036a);
        final l lVar = new l() { // from class: xf.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                m c11;
                c11 = d.c((MarkedWord) obj);
                return c11;
            }
        };
        rx.c<List<m>> I3 = u22.c3(new p() { // from class: xf.c
            @Override // wb0.p
            public final Object call(Object obj) {
                m d11;
                d11 = d.d(l.this, obj);
                return d11;
            }
        }).v6().I3(bc0.c.e());
        g0.o(I3, "observeOn(...)");
        return I3;
    }
}
