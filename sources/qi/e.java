package qi;

import a00.h0;
import a00.i0;
import a00.l0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.DictWiki;
import com.baicizhan.online.resource_api.MeanInfo;
import com.baicizhan.online.resource_api.SentenceInfo;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordDictV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qi.c;
import qi.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f82223b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f82224c = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f82225d = "other";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<?> f82226a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nwiki_data.kt\nKotlin\n*S Kotlin\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/ParaphrasesInfo$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 5 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,343:1\n1#2:344\n1869#3:345\n1870#3:349\n1869#3,2:350\n1869#3:352\n1870#3:356\n1869#3,2:357\n1573#3:363\n1604#3,4:364\n1573#3:369\n1604#3,4:370\n18#4,3:346\n18#4,3:360\n16#5,3:353\n216#6:359\n217#6:368\n*S KotlinDebug\n*F\n+ 1 wiki_data.kt\ncom/baicizhan/main/wikiv2/lookup/data/ParaphrasesInfo$Companion\n*L\n198#1:345\n198#1:349\n206#1:350,2\n218#1:352\n218#1:356\n235#1:357,2\n266#1:363\n266#1:364,4\n251#1:369\n251#1:370,4\n199#1:346,3\n259#1:360,3\n220#1:353,3\n258#1:359\n258#1:368\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static final int c(b bVar, b bVar2) {
            return g0.t(bVar.i(), bVar2.i());
        }

        public static final void e(ArrayList<Object> arrayList, List<c> list) {
            if (list.isEmpty()) {
                return;
            }
            List<c> list2 = list;
            ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                c cVar = (c) obj;
                cVar.s(i12);
                arrayList2.add(cVar);
                i11 = i12;
            }
            arrayList.addAll(arrayList2);
        }

        @l
        public final e b(@k TopicResourceV2 topicRes, @k HashMap<String, Integer> orderMap) {
            WordDictV2 wordDictV2;
            List<MeanInfo> list;
            List<SentenceInfo> list2;
            Integer num;
            g0.p(topicRes, "topicRes");
            g0.p(orderMap, "orderMap");
            DictWiki dictWiki = topicRes.dict_wiki;
            if (dictWiki == null || (wordDictV2 = dictWiki.dict) == null || (list = wordDictV2.chn_means) == null || list.isEmpty() || (list2 = wordDictV2.sentences) == null || list2.isEmpty()) {
                return null;
            }
            ArrayList<b> arrayList = new ArrayList(topicRes.dict_wiki.dict.getChn_meansSize());
            List<MeanInfo> chn_means = topicRes.dict_wiki.dict.chn_means;
            g0.o(chn_means, "chn_means");
            for (MeanInfo meanInfo : chn_means) {
                String str = meanInfo.mean_type;
                if (str == null || str.length() == 0) {
                    str = null;
                }
                if (str == null) {
                    str = "other";
                }
                String str2 = str;
                String mean = meanInfo.mean;
                g0.o(mean, "mean");
                long j11 = meanInfo.f28159id;
                String str3 = meanInfo.mean_type;
                if (str3 == null || str3.length() == 0) {
                    num = null;
                } else {
                    Integer num2 = orderMap.get(str3);
                    num = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                }
                arrayList.add(new b(str2, mean, j11, num != null ? num.intValue() : Integer.MAX_VALUE));
            }
            l0.r0(arrayList, new Comparator() { // from class: qi.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c11;
                    c11 = e.a.c((e.b) obj, (e.b) obj2);
                    return c11;
                }
            });
            HashMap hashMap = new HashMap(topicRes.dict_wiki.dict.getSentencesSize());
            List<SentenceInfo> sentences = topicRes.dict_wiki.dict.sentences;
            g0.o(sentences, "sentences");
            for (SentenceInfo sentenceInfo : sentences) {
                List list3 = (List) hashMap.get(Long.valueOf(sentenceInfo.chn_mean_id));
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put(Long.valueOf(sentenceInfo.chn_mean_id), list3);
                }
                c.a aVar = c.f82213i;
                g0.m(sentenceInfo);
                TopicResourceV2 topicResourceV2 = topicRes;
                c d11 = c.a.d(aVar, topicResourceV2, sentenceInfo, false, false, 12, null);
                if (d11 != null) {
                    list3.add(d11);
                }
                topicRes = topicResourceV2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (b bVar : arrayList) {
                arrayList2.add(bVar);
                Collection collection = (Collection) hashMap.get(Long.valueOf(bVar.g()));
                if (collection != null && !collection.isEmpty()) {
                    arrayList2.addAll((List) collection);
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new e(arrayList2);
        }

        @l
        public final e d(@k TopicResourceV2 topicRes) {
            WordDictV2 wordDictV2;
            List<MeanInfo> list;
            g2 g2Var;
            g0.p(topicRes, "topicRes");
            DictWiki dictWiki = topicRes.dict_wiki;
            if (dictWiki == null || (wordDictV2 = dictWiki.dict) == null || (list = wordDictV2.en_means) == null || list.isEmpty()) {
                return null;
            }
            HashMap hashMap = new HashMap(topicRes.dict_wiki.dict.getEn_meansSize());
            List<MeanInfo> en_means = topicRes.dict_wiki.dict.en_means;
            g0.o(en_means, "en_means");
            for (MeanInfo meanInfo : en_means) {
                List list2 = (List) hashMap.get(meanInfo.mean_type);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(meanInfo.mean_type, list2);
                }
                c.a aVar = c.f82213i;
                g0.m(meanInfo);
                String word = topicRes.dict_wiki.dict.word_basic_info.word;
                g0.o(word, "word");
                list2.add(aVar.a(meanInfo, word));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null || str.length() == 0) {
                    g2Var = null;
                } else {
                    arrayList.add(new b(str, "", 0L, 0, 12, null));
                    e(arrayList, (List) entry.getValue());
                    g2Var = g2.f100423a;
                }
                if (g2Var == null) {
                    arrayList2.add(new b("other", "", 0L, 0, 12, null));
                    List list3 = (List) entry.getValue();
                    if (!list3.isEmpty()) {
                        List list4 = list3;
                        ArrayList arrayList3 = new ArrayList(i0.d0(list4, 10));
                        int i11 = 0;
                        for (Object obj : list4) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                h0.b0();
                            }
                            c cVar = (c) obj;
                            cVar.s(i12);
                            arrayList3.add(cVar);
                            i11 = i12;
                        }
                        arrayList2.addAll(arrayList3);
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (arrayList.isEmpty()) {
                return null;
            }
            return new e(arrayList);
        }

        public a() {
        }
    }

    public e(@k List<?> items) {
        g0.p(items, "items");
        this.f82226a = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e c(e eVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = eVar.f82226a;
        }
        return eVar.b(list);
    }

    @k
    public final List<?> a() {
        return this.f82226a;
    }

    @k
    public final e b(@k List<?> items) {
        g0.p(items, "items");
        return new e(items);
    }

    @k
    public final List<?> d() {
        return this.f82226a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && g0.g(this.f82226a, ((e) obj).f82226a);
    }

    public int hashCode() {
        return this.f82226a.hashCode();
    }

    @k
    public String toString() {
        return "ParaphrasesInfo(items=" + this.f82226a + pn.j.f81007d;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final int f82227e = 0;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f82228a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f82229b;

        /* renamed from: c, reason: collision with root package name */
        public final long f82230c;

        /* renamed from: d, reason: collision with root package name */
        public final int f82231d;

        public b(@k String type, @k String meaning, long j11, int i11) {
            g0.p(type, "type");
            g0.p(meaning, "meaning");
            this.f82228a = type;
            this.f82229b = meaning;
            this.f82230c = j11;
            this.f82231d = i11;
        }

        public static /* synthetic */ b f(b bVar, String str, String str2, long j11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = bVar.f82228a;
            }
            if ((i12 & 2) != 0) {
                str2 = bVar.f82229b;
            }
            if ((i12 & 4) != 0) {
                j11 = bVar.f82230c;
            }
            if ((i12 & 8) != 0) {
                i11 = bVar.f82231d;
            }
            int i13 = i11;
            return bVar.e(str, str2, j11, i13);
        }

        @k
        public final String a() {
            return this.f82228a;
        }

        @k
        public final String b() {
            return this.f82229b;
        }

        public final long c() {
            return this.f82230c;
        }

        public final int d() {
            return this.f82231d;
        }

        @k
        public final b e(@k String type, @k String meaning, long j11, int i11) {
            g0.p(type, "type");
            g0.p(meaning, "meaning");
            return new b(type, meaning, j11, i11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return g0.g(this.f82228a, bVar.f82228a) && g0.g(this.f82229b, bVar.f82229b) && this.f82230c == bVar.f82230c && this.f82231d == bVar.f82231d;
        }

        public final long g() {
            return this.f82230c;
        }

        @k
        public final String h() {
            return this.f82229b;
        }

        public int hashCode() {
            return (((((this.f82228a.hashCode() * 31) + this.f82229b.hashCode()) * 31) + Long.hashCode(this.f82230c)) * 31) + Integer.hashCode(this.f82231d);
        }

        public final int i() {
            return this.f82231d;
        }

        @k
        public final String j() {
            return this.f82228a;
        }

        @k
        public String toString() {
            return "ParaphraseItem(type=" + this.f82228a + ", meaning=" + this.f82229b + ", id=" + this.f82230c + ", sortingId=" + this.f82231d + pn.j.f81007d;
        }

        public /* synthetic */ b(String str, String str2, long j11, int i11, int i12, v vVar) {
            this(str, str2, (i12 & 4) != 0 ? 0L : j11, (i12 & 8) != 0 ? 0 : i11);
        }
    }
}
