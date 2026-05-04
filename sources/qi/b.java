package qi;

import a00.l0;
import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.baicizhan.online.resource_api.DictWiki;
import com.baicizhan.online.resource_api.MeanInfo;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordBasicInfo;
import com.baicizhan.online.resource_api.WordDictV2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qi.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f82191m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f82192n = 8;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final Map<String, String> f82193o;

    /* renamed from: a, reason: collision with root package name */
    public final int f82194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82195b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82196c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f82197d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f82198e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f82199f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f82200g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final c f82201h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f82202i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f82203j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f82204k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Boolean f82205l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nwiki_data.kt\nKotlin\n*S Kotlin\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/BasicWordInfo$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,343:1\n1869#2,2:344\n16#3,3:346\n1#4:349\n18#5,3:350\n*S KotlinDebug\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/BasicWordInfo$Companion\n*L\n76#1:344,2\n99#1:346,3\n117#1:350,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static final int d(C1020b c1020b, C1020b c1020b2) {
            return g0.t(c1020b.f(), c1020b2.f());
        }

        @k
        public final b b(@k DictionaryRecord record) {
            g0.p(record, "record");
            int i11 = record.topicId;
            int i12 = record.bookId;
            String word = record.word;
            g0.o(word, "word");
            return new b(i11, i12, word, record.accent, null, null, null, null, record.meanCn, null, null, null, 3824, null);
        }

        @k
        public final b c(@k TopicResourceV2 topicRes, int i11) {
            c cVar;
            g0.p(topicRes, "topicRes");
            WordDictV2 wordDictV2 = topicRes.dict_wiki.dict;
            WordBasicInfo wordBasicInfo = wordDictV2.word_basic_info;
            int i12 = wordBasicInfo.topic_id;
            String word = wordBasicInfo.word;
            g0.o(word, "word");
            String str = wordBasicInfo.accent_usa;
            String str2 = wordBasicInfo.accent_usa_audio_uri;
            String str3 = wordBasicInfo.accent_uk;
            String str4 = wordBasicInfo.accent_uk_audio_uri;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<MeanInfo> chn_means = wordDictV2.chn_means;
            g0.o(chn_means, "chn_means");
            int i13 = 0;
            int i14 = 0;
            for (MeanInfo meanInfo : chn_means) {
                C1020b c1020b = (C1020b) linkedHashMap.get(meanInfo.mean_type);
                if (c1020b != null) {
                    c1020b.i(c1020b.g() + "；" + meanInfo.mean);
                } else {
                    a aVar = b.f82191m;
                    if (meanInfo.mean_type.length() > i13) {
                        i13 = meanInfo.mean_type.length();
                    }
                    String mean_type = meanInfo.mean_type;
                    g0.o(mean_type, "mean_type");
                    i14++;
                    String mean_type2 = meanInfo.mean_type;
                    g0.o(mean_type2, "mean_type");
                    String mean = meanInfo.mean;
                    g0.o(mean, "mean");
                    linkedHashMap.put(mean_type, new C1020b(i14, mean_type2, mean));
                }
            }
            String str5 = null;
            if (linkedHashMap.isEmpty()) {
                cVar = null;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(linkedHashMap.values());
                l0.r0(arrayList, new Comparator() { // from class: qi.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int d11;
                        d11 = b.a.d((b.C1020b) obj, (b.C1020b) obj2);
                        return d11;
                    }
                });
                cVar = new c(arrayList, i13);
            }
            String e11 = e(topicRes);
            List<String> exams = wordDictV2.getExams();
            if (exams != null && !exams.isEmpty()) {
                str5 = gj.b.a(r0.d6(exams));
            }
            return new b(i12, i11, word, str, str2, str3, str4, cVar, null, e11, str5, null, 2048, null);
        }

        public final String e(TopicResourceV2 topicResourceV2) {
            String str;
            String str2;
            String str3;
            DictWiki dictWiki = topicResourceV2.dict_wiki;
            if (dictWiki == null || (str = dictWiki.origin_word) == null || str.length() == 0 || (str2 = dictWiki.variant_type) == null || str2.length() == 0) {
                return null;
            }
            a aVar = b.f82191m;
            String variant_type = dictWiki.variant_type;
            g0.o(variant_type, "variant_type");
            String f11 = aVar.f(variant_type);
            if (f11 == null || f11.length() == 0) {
                str3 = null;
            } else {
                str3 = dictWiki.origin_word + " 的" + f11;
            }
            if (str3 != null) {
                return str3;
            }
            qb.c.d("wiki_data", "no type of [" + dictWiki.variant_type + "] found", new Object[0]);
            return null;
        }

        public final String f(String str) {
            Object obj = b.f82193o.get(str);
            if (obj == null) {
                obj = "";
            }
            return (String) obj;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    /* renamed from: qi.b$b, reason: collision with other inner class name */
    public static final class C1020b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f82206d = 8;

        /* renamed from: a, reason: collision with root package name */
        public final int f82207a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82208b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public String f82209c;

        public C1020b(int i11, @k String type, @k String meaning) {
            g0.p(type, "type");
            g0.p(meaning, "meaning");
            this.f82207a = i11;
            this.f82208b = type;
            this.f82209c = meaning;
        }

        public static /* synthetic */ C1020b e(C1020b c1020b, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = c1020b.f82207a;
            }
            if ((i12 & 2) != 0) {
                str = c1020b.f82208b;
            }
            if ((i12 & 4) != 0) {
                str2 = c1020b.f82209c;
            }
            return c1020b.d(i11, str, str2);
        }

        public final int a() {
            return this.f82207a;
        }

        @k
        public final String b() {
            return this.f82208b;
        }

        @k
        public final String c() {
            return this.f82209c;
        }

        @k
        public final C1020b d(int i11, @k String type, @k String meaning) {
            g0.p(type, "type");
            g0.p(meaning, "meaning");
            return new C1020b(i11, type, meaning);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1020b)) {
                return false;
            }
            C1020b c1020b = (C1020b) obj;
            return this.f82207a == c1020b.f82207a && g0.g(this.f82208b, c1020b.f82208b) && g0.g(this.f82209c, c1020b.f82209c);
        }

        public final int f() {
            return this.f82207a;
        }

        @k
        public final String g() {
            return this.f82209c;
        }

        @k
        public final String h() {
            return this.f82208b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f82207a) * 31) + this.f82208b.hashCode()) * 31) + this.f82209c.hashCode();
        }

        public final void i(@k String str) {
            g0.p(str, "<set-?>");
            this.f82209c = str;
        }

        @k
        public String toString() {
            return "Meaning(id=" + this.f82207a + ", type=" + this.f82208b + ", meaning=" + this.f82209c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final int f82210c = 8;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C1020b> f82211a;

        /* renamed from: b, reason: collision with root package name */
        public final int f82212b;

        public c(@k List<C1020b> meanings, int i11) {
            g0.p(meanings, "meanings");
            this.f82211a = meanings;
            this.f82212b = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c d(c cVar, List list, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = cVar.f82211a;
            }
            if ((i12 & 2) != 0) {
                i11 = cVar.f82212b;
            }
            return cVar.c(list, i11);
        }

        @k
        public final List<C1020b> a() {
            return this.f82211a;
        }

        public final int b() {
            return this.f82212b;
        }

        @k
        public final c c(@k List<C1020b> meanings, int i11) {
            g0.p(meanings, "meanings");
            return new c(meanings, i11);
        }

        public final int e() {
            return this.f82212b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return g0.g(this.f82211a, cVar.f82211a) && this.f82212b == cVar.f82212b;
        }

        @k
        public final List<C1020b> f() {
            return this.f82211a;
        }

        public int hashCode() {
            return (this.f82211a.hashCode() * 31) + Integer.hashCode(this.f82212b);
        }

        @k
        public String toString() {
            return "MeaningInfo(meanings=" + this.f82211a + ", maxTypeLen=" + this.f82212b + pn.j.f81007d;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pl", ExtendedWordInfo.WordDeform.f25861c);
        linkedHashMap.put(com.alipay.sdk.m.k.b.f10659o, ExtendedWordInfo.WordDeform.f25862d);
        linkedHashMap.put("past", ExtendedWordInfo.WordDeform.f25864f);
        linkedHashMap.put("done", ExtendedWordInfo.WordDeform.f25865g);
        linkedHashMap.put("ing", ExtendedWordInfo.WordDeform.f25863e);
        linkedHashMap.put("er", ExtendedWordInfo.WordDeform.f25866h);
        linkedHashMap.put("est", ExtendedWordInfo.WordDeform.f25867i);
        linkedHashMap.put("prep", ExtendedWordInfo.WordDeform.f25872n);
        linkedHashMap.put("adv", ExtendedWordInfo.WordDeform.f25871m);
        linkedHashMap.put("verb", ExtendedWordInfo.WordDeform.f25868j);
        linkedHashMap.put("adj", ExtendedWordInfo.WordDeform.f25870l);
        linkedHashMap.put("noun", ExtendedWordInfo.WordDeform.f25869k);
        linkedHashMap.put("conn", ExtendedWordInfo.WordDeform.f25873o);
        f82193o = linkedHashMap;
    }

    public b(int i11, int i12, @k String word, @l String str, @l String str2, @l String str3, @l String str4, @l c cVar, @l String str5, @l String str6, @l String str7, @l Boolean bool) {
        g0.p(word, "word");
        this.f82194a = i11;
        this.f82195b = i12;
        this.f82196c = word;
        this.f82197d = str;
        this.f82198e = str2;
        this.f82199f = str3;
        this.f82200g = str4;
        this.f82201h = cVar;
        this.f82202i = str5;
        this.f82203j = str6;
        this.f82204k = str7;
        this.f82205l = bool;
    }

    public static /* synthetic */ b o(b bVar, int i11, int i12, String str, String str2, String str3, String str4, String str5, c cVar, String str6, String str7, String str8, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bVar.f82194a;
        }
        if ((i13 & 2) != 0) {
            i12 = bVar.f82195b;
        }
        if ((i13 & 4) != 0) {
            str = bVar.f82196c;
        }
        if ((i13 & 8) != 0) {
            str2 = bVar.f82197d;
        }
        if ((i13 & 16) != 0) {
            str3 = bVar.f82198e;
        }
        if ((i13 & 32) != 0) {
            str4 = bVar.f82199f;
        }
        if ((i13 & 64) != 0) {
            str5 = bVar.f82200g;
        }
        if ((i13 & 128) != 0) {
            cVar = bVar.f82201h;
        }
        if ((i13 & 256) != 0) {
            str6 = bVar.f82202i;
        }
        if ((i13 & 512) != 0) {
            str7 = bVar.f82203j;
        }
        if ((i13 & 1024) != 0) {
            str8 = bVar.f82204k;
        }
        if ((i13 & 2048) != 0) {
            bool = bVar.f82205l;
        }
        String str9 = str8;
        Boolean bool2 = bool;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        c cVar2 = cVar;
        String str13 = str3;
        String str14 = str4;
        return bVar.n(i11, i12, str, str2, str13, str14, str12, cVar2, str10, str11, str9, bool2);
    }

    @l
    public final Boolean A() {
        return this.f82205l;
    }

    public final void B(@l Boolean bool) {
        this.f82205l = bool;
    }

    public final int b() {
        return this.f82194a;
    }

    @l
    public final String c() {
        return this.f82203j;
    }

    @l
    public final String d() {
        return this.f82204k;
    }

    @l
    public final Boolean e() {
        return this.f82205l;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f82194a == bVar.f82194a && this.f82195b == bVar.f82195b && g0.g(this.f82196c, bVar.f82196c) && g0.g(this.f82197d, bVar.f82197d) && g0.g(this.f82198e, bVar.f82198e) && g0.g(this.f82199f, bVar.f82199f) && g0.g(this.f82200g, bVar.f82200g) && g0.g(this.f82201h, bVar.f82201h) && g0.g(this.f82202i, bVar.f82202i) && g0.g(this.f82203j, bVar.f82203j) && g0.g(this.f82204k, bVar.f82204k) && g0.g(this.f82205l, bVar.f82205l);
    }

    public final int f() {
        return this.f82195b;
    }

    @k
    public final String g() {
        return this.f82196c;
    }

    @l
    public final String h() {
        return this.f82197d;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f82194a) * 31) + Integer.hashCode(this.f82195b)) * 31) + this.f82196c.hashCode()) * 31;
        String str = this.f82197d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82198e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82199f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82200g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c cVar = this.f82201h;
        int hashCode6 = (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str5 = this.f82202i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82203j;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82204k;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f82205l;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final String i() {
        return this.f82198e;
    }

    @l
    public final String j() {
        return this.f82199f;
    }

    @l
    public final String k() {
        return this.f82200g;
    }

    @l
    public final c l() {
        return this.f82201h;
    }

    @l
    public final String m() {
        return this.f82202i;
    }

    @k
    public final b n(int i11, int i12, @k String word, @l String str, @l String str2, @l String str3, @l String str4, @l c cVar, @l String str5, @l String str6, @l String str7, @l Boolean bool) {
        g0.p(word, "word");
        return new b(i11, i12, word, str, str2, str3, str4, cVar, str5, str6, str7, bool);
    }

    public final int p() {
        return this.f82195b;
    }

    @l
    public final String q() {
        return this.f82202i;
    }

    @l
    public final c r() {
        return this.f82201h;
    }

    @l
    public final String s() {
        return this.f82203j;
    }

    @l
    public final String t() {
        return this.f82204k;
    }

    @k
    public String toString() {
        return "BasicWordInfo(topicId=" + this.f82194a + ", bookId=" + this.f82195b + ", word=" + this.f82196c + ", usaAccent=" + this.f82197d + ", usaVoice=" + this.f82198e + ", ukAccent=" + this.f82199f + ", ukVoice=" + this.f82200g + ", chMeaningInfo=" + this.f82201h + ", chMeaning=" + this.f82202i + ", comparative=" + this.f82203j + ", exams=" + this.f82204k + ", isCollected=" + this.f82205l + pn.j.f81007d;
    }

    public final int u() {
        return this.f82194a;
    }

    @l
    public final String v() {
        return this.f82199f;
    }

    @l
    public final String w() {
        return this.f82200g;
    }

    @l
    public final String x() {
        return this.f82197d;
    }

    @l
    public final String y() {
        return this.f82198e;
    }

    @k
    public final String z() {
        return this.f82196c;
    }

    public /* synthetic */ b(int i11, int i12, String str, String str2, String str3, String str4, String str5, c cVar, String str6, String str7, String str8, Boolean bool, int i13, v vVar) {
        this(i11, i12, str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : cVar, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & 1024) != 0 ? null : str8, (i13 & 2048) != 0 ? null : bool);
    }
}
