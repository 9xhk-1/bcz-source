package qi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.SimilarWord;
import com.baicizhan.online.resource_api.SynAntInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f82248b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f82249c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<b> f82250a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final j a(@l List<? extends SimilarWord> list) {
            List<? extends SimilarWord> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = list.get(i11).topic_id;
                String word = list.get(i11).word;
                g0.o(word, "word");
                arrayList.add(new b(i12, word));
            }
            return new j(arrayList);
        }

        @l
        public final j b(@l List<? extends SynAntInfo> list) {
            List<? extends SynAntInfo> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = list.get(i11).syn_ant_topic_id;
                String syn_ant = list.get(i11).syn_ant;
                g0.o(syn_ant, "syn_ant");
                arrayList.add(new b(i12, syn_ant));
            }
            return new j(arrayList);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f82251c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f82252a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82253b;

        public b(int i11, @k String word) {
            g0.p(word, "word");
            this.f82252a = i11;
            this.f82253b = word;
        }

        public static /* synthetic */ b d(b bVar, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f82252a;
            }
            if ((i12 & 2) != 0) {
                str = bVar.f82253b;
            }
            return bVar.c(i11, str);
        }

        public final int a() {
            return this.f82252a;
        }

        @k
        public final String b() {
            return this.f82253b;
        }

        @k
        public final b c(int i11, @k String word) {
            g0.p(word, "word");
            return new b(i11, word);
        }

        public final int e() {
            return this.f82252a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f82252a == bVar.f82252a && g0.g(this.f82253b, bVar.f82253b);
        }

        @k
        public final String f() {
            return this.f82253b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f82252a) * 31) + this.f82253b.hashCode();
        }

        @k
        public String toString() {
            return "WordItem(topicId=" + this.f82252a + ", word=" + this.f82253b + pn.j.f81007d;
        }
    }

    public j(@k List<b> words) {
        g0.p(words, "words");
        this.f82250a = words;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j c(j jVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = jVar.f82250a;
        }
        return jVar.b(list);
    }

    @k
    public final List<b> a() {
        return this.f82250a;
    }

    @k
    public final j b(@k List<b> words) {
        g0.p(words, "words");
        return new j(words);
    }

    @k
    public final List<b> d() {
        return this.f82250a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && g0.g(this.f82250a, ((j) obj).f82250a);
    }

    public int hashCode() {
        return this.f82250a.hashCode();
    }

    @k
    public String toString() {
        return "WordsInfo(words=" + this.f82250a + pn.j.f81007d;
    }
}
