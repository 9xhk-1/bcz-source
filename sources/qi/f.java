package qi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.ShortPhraseInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f82232b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f82233c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<b> f82234a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final f a(@l List<? extends ShortPhraseInfo> list) {
            List<? extends ShortPhraseInfo> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                ShortPhraseInfo shortPhraseInfo = list.get(i11);
                long j11 = shortPhraseInfo.f28161id;
                int i12 = shortPhraseInfo.topic_id;
                long j12 = shortPhraseInfo.chn_mean_id;
                String short_phrase = shortPhraseInfo.short_phrase;
                g0.o(short_phrase, "short_phrase");
                String short_phrase_trans = shortPhraseInfo.short_phrase_trans;
                g0.o(short_phrase_trans, "short_phrase_trans");
                arrayList.add(new b(j11, i12, j12, short_phrase, short_phrase_trans, shortPhraseInfo.short_phrase_topic_id));
            }
            return new f(arrayList);
        }

        public a() {
        }
    }

    public f(@k List<b> phrases) {
        g0.p(phrases, "phrases");
        this.f82234a = phrases;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f c(f fVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = fVar.f82234a;
        }
        return fVar.b(list);
    }

    @k
    public final List<b> a() {
        return this.f82234a;
    }

    @k
    public final f b(@k List<b> phrases) {
        g0.p(phrases, "phrases");
        return new f(phrases);
    }

    @k
    public final List<b> d() {
        return this.f82234a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && g0.g(this.f82234a, ((f) obj).f82234a);
    }

    public int hashCode() {
        return this.f82234a.hashCode();
    }

    @k
    public String toString() {
        return "PhrasesInfo(phrases=" + this.f82234a + pn.j.f81007d;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        public static final int f82235g = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f82236a;

        /* renamed from: b, reason: collision with root package name */
        public final int f82237b;

        /* renamed from: c, reason: collision with root package name */
        public final long f82238c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f82239d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f82240e;

        /* renamed from: f, reason: collision with root package name */
        public final int f82241f;

        public b(long j11, int i11, long j12, @k String shortPhrase, @k String shortPhraseTrans, int i12) {
            g0.p(shortPhrase, "shortPhrase");
            g0.p(shortPhraseTrans, "shortPhraseTrans");
            this.f82236a = j11;
            this.f82237b = i11;
            this.f82238c = j12;
            this.f82239d = shortPhrase;
            this.f82240e = shortPhraseTrans;
            this.f82241f = i12;
        }

        public static /* synthetic */ b h(b bVar, long j11, int i11, long j12, String str, String str2, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j11 = bVar.f82236a;
            }
            long j13 = j11;
            if ((i13 & 2) != 0) {
                i11 = bVar.f82237b;
            }
            int i14 = i11;
            if ((i13 & 4) != 0) {
                j12 = bVar.f82238c;
            }
            long j14 = j12;
            if ((i13 & 8) != 0) {
                str = bVar.f82239d;
            }
            return bVar.g(j13, i14, j14, str, (i13 & 16) != 0 ? bVar.f82240e : str2, (i13 & 32) != 0 ? bVar.f82241f : i12);
        }

        public final long a() {
            return this.f82236a;
        }

        public final int b() {
            return this.f82237b;
        }

        public final long c() {
            return this.f82238c;
        }

        @k
        public final String d() {
            return this.f82239d;
        }

        @k
        public final String e() {
            return this.f82240e;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f82236a == bVar.f82236a && this.f82237b == bVar.f82237b && this.f82238c == bVar.f82238c && g0.g(this.f82239d, bVar.f82239d) && g0.g(this.f82240e, bVar.f82240e) && this.f82241f == bVar.f82241f;
        }

        public final int f() {
            return this.f82241f;
        }

        @k
        public final b g(long j11, int i11, long j12, @k String shortPhrase, @k String shortPhraseTrans, int i12) {
            g0.p(shortPhrase, "shortPhrase");
            g0.p(shortPhraseTrans, "shortPhraseTrans");
            return new b(j11, i11, j12, shortPhrase, shortPhraseTrans, i12);
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f82236a) * 31) + Integer.hashCode(this.f82237b)) * 31) + Long.hashCode(this.f82238c)) * 31) + this.f82239d.hashCode()) * 31) + this.f82240e.hashCode()) * 31) + Integer.hashCode(this.f82241f);
        }

        public final long i() {
            return this.f82238c;
        }

        public final long j() {
            return this.f82236a;
        }

        @k
        public final String k() {
            return this.f82239d;
        }

        public final int l() {
            return this.f82241f;
        }

        @k
        public final String m() {
            return this.f82240e;
        }

        public final int n() {
            return this.f82237b;
        }

        @k
        public String toString() {
            return "PhraseItem(id=" + this.f82236a + ", topicId=" + this.f82237b + ", chnMeanId=" + this.f82238c + ", shortPhrase=" + this.f82239d + ", shortPhraseTrans=" + this.f82240e + ", shortPhraseTopicId=" + this.f82241f + pn.j.f81007d;
        }

        public /* synthetic */ b(long j11, int i11, long j12, String str, String str2, int i12, int i13, v vVar) {
            this(j11, i11, j12, str, str2, (i13 & 32) != 0 ? 0 : i12);
        }
    }
}
