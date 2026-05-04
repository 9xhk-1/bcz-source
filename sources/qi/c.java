package qi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.DictWiki;
import com.baicizhan.online.resource_api.MeanInfo;
import com.baicizhan.online.resource_api.SentenceInfo;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordBasicInfo;
import com.baicizhan.online.resource_api.WordDictV2;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f82213i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f82214j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f82215a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82216b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82217c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f82218d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f82219e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f82220f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f82221g;

    /* renamed from: h, reason: collision with root package name */
    public int f82222h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nwiki_data.kt\nKotlin\n*S Kotlin\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/IllustratedSentenceInfo$Companion\n+ 2 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 3 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,343:1\n16#2,3:344\n16#2,2:347\n18#2:352\n18#3,3:349\n*S KotlinDebug\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/IllustratedSentenceInfo$Companion\n*L\n143#1:344,3\n149#1:347,2\n149#1:352\n150#1:349,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ c d(a aVar, TopicResourceV2 topicResourceV2, SentenceInfo sentenceInfo, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            if ((i11 & 8) != 0) {
                z12 = false;
            }
            return aVar.c(topicResourceV2, sentenceInfo, z11, z12);
        }

        @k
        public final c a(@k MeanInfo info, @k String word) {
            g0.p(info, "info");
            g0.p(word, "word");
            int i11 = info.topic_id;
            String mean = info.mean;
            g0.o(mean, "mean");
            return new c(i11, word, mean, null, null, null, null, 0, R.styleable.Theme_drawable_walk_sound4, null);
        }

        @l
        public final c b(@k TopicResourceV2 topicRes) {
            WordDictV2 wordDictV2;
            g0.p(topicRes, "topicRes");
            DictWiki dictWiki = topicRes.dict_wiki;
            List<SentenceInfo> list = (dictWiki == null || (wordDictV2 = dictWiki.dict) == null) ? null : wordDictV2.sentences;
            if (list == null || list.isEmpty()) {
                return null;
            }
            a aVar = c.f82213i;
            SentenceInfo sentenceInfo = topicRes.dict_wiki.dict.sentences.get(0);
            g0.o(sentenceInfo, "get(...)");
            return aVar.c(topicRes, sentenceInfo, true, true);
        }

        @l
        public final c c(@k TopicResourceV2 topicRes, @k SentenceInfo info, boolean z11, boolean z12) {
            String str;
            WordDictV2 wordDictV2;
            g0.p(topicRes, "topicRes");
            g0.p(info, "info");
            DictWiki dictWiki = topicRes.dict_wiki;
            List<SentenceInfo> list = (dictWiki == null || (wordDictV2 = dictWiki.dict) == null) ? null : wordDictV2.sentences;
            if (list == null || list.isEmpty() || (str = info.img_uri) == null || str.length() == 0) {
                return null;
            }
            String a11 = gj.c.a(str);
            if (z11 && (a11 == null || a11.length() == 0)) {
                return null;
            }
            WordBasicInfo wordBasicInfo = topicRes.dict_wiki.dict.word_basic_info;
            int i11 = wordBasicInfo.topic_id;
            String word = wordBasicInfo.word;
            g0.o(word, "word");
            String sentence = info.sentence;
            g0.o(sentence, "sentence");
            c cVar = new c(i11, word, sentence, info.sentence_trans, info.highlight_phrase, info.audio_uri, a11, 0, 128, null);
            if (z12) {
                topicRes.dict_wiki.dict.sentences.remove(0);
            }
            return cVar;
        }

        public a() {
        }
    }

    public c(int i11, @k String word, @k String sentence, @l String str, @l String str2, @l String str3, @l String str4, int i12) {
        g0.p(word, "word");
        g0.p(sentence, "sentence");
        this.f82215a = i11;
        this.f82216b = word;
        this.f82217c = sentence;
        this.f82218d = str;
        this.f82219e = str2;
        this.f82220f = str3;
        this.f82221g = str4;
        this.f82222h = i12;
    }

    public static /* synthetic */ c j(c cVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = cVar.f82215a;
        }
        if ((i13 & 2) != 0) {
            str = cVar.f82216b;
        }
        if ((i13 & 4) != 0) {
            str2 = cVar.f82217c;
        }
        if ((i13 & 8) != 0) {
            str3 = cVar.f82218d;
        }
        if ((i13 & 16) != 0) {
            str4 = cVar.f82219e;
        }
        if ((i13 & 32) != 0) {
            str5 = cVar.f82220f;
        }
        if ((i13 & 64) != 0) {
            str6 = cVar.f82221g;
        }
        if ((i13 & 128) != 0) {
            i12 = cVar.f82222h;
        }
        String str7 = str6;
        int i14 = i12;
        String str8 = str4;
        String str9 = str5;
        return cVar.i(i11, str, str2, str3, str8, str9, str7, i14);
    }

    public final int a() {
        return this.f82215a;
    }

    @k
    public final String b() {
        return this.f82216b;
    }

    @k
    public final String c() {
        return this.f82217c;
    }

    @l
    public final String d() {
        return this.f82218d;
    }

    @l
    public final String e() {
        return this.f82219e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f82215a == cVar.f82215a && g0.g(this.f82216b, cVar.f82216b) && g0.g(this.f82217c, cVar.f82217c) && g0.g(this.f82218d, cVar.f82218d) && g0.g(this.f82219e, cVar.f82219e) && g0.g(this.f82220f, cVar.f82220f) && g0.g(this.f82221g, cVar.f82221g) && this.f82222h == cVar.f82222h;
    }

    @l
    public final String f() {
        return this.f82220f;
    }

    @l
    public final String g() {
        return this.f82221g;
    }

    public final int h() {
        return this.f82222h;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f82215a) * 31) + this.f82216b.hashCode()) * 31) + this.f82217c.hashCode()) * 31;
        String str = this.f82218d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82219e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82220f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82221g;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.f82222h);
    }

    @k
    public final c i(int i11, @k String word, @k String sentence, @l String str, @l String str2, @l String str3, @l String str4, int i12) {
        g0.p(word, "word");
        g0.p(sentence, "sentence");
        return new c(i11, word, sentence, str, str2, str3, str4, i12);
    }

    @l
    public final String k() {
        return this.f82221g;
    }

    public final int l() {
        return this.f82222h;
    }

    @l
    public final String m() {
        return this.f82219e;
    }

    @k
    public final String n() {
        return this.f82217c;
    }

    @l
    public final String o() {
        return this.f82218d;
    }

    @l
    public final String p() {
        return this.f82220f;
    }

    @k
    public final String q() {
        return this.f82216b;
    }

    public final int r() {
        return this.f82215a;
    }

    public final void s(int i11) {
        this.f82222h = i11;
    }

    @k
    public String toString() {
        return "IllustratedSentenceInfo(wordTopicId=" + this.f82215a + ", word=" + this.f82216b + ", sentence=" + this.f82217c + ", translation=" + this.f82218d + ", phrase=" + this.f82219e + ", voice=" + this.f82220f + ", imageUrl=" + this.f82221g + ", number=" + this.f82222h + pn.j.f81007d;
    }

    public /* synthetic */ c(int i11, String str, String str2, String str3, String str4, String str5, String str6, int i12, int i13, v vVar) {
        this(i11, str, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? 0 : i12);
    }
}
