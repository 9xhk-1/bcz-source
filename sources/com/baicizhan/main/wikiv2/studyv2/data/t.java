package com.baicizhan.main.wikiv2.studyv2.data;

import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.EType;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.ZAntonym;
import com.baicizhan.client.business.dataset.models.ZDerivation;
import com.baicizhan.client.business.dataset.models.ZExamInfo;
import com.baicizhan.client.business.dataset.models.ZMean;
import com.baicizhan.client.business.dataset.models.ZMnemonic;
import com.baicizhan.client.business.dataset.models.ZPhrase;
import com.baicizhan.client.business.dataset.models.ZResource;
import com.baicizhan.client.business.dataset.models.ZSentence;
import com.baicizhan.client.business.dataset.models.ZSentencePage;
import com.baicizhan.client.business.dataset.models.ZSimilar;
import com.baicizhan.client.business.dataset.models.ZSynonym;
import com.baicizhan.client.business.dataset.models.ZTvInfo;
import com.baicizhan.client.business.dataset.models.ZVariant;
import com.baicizhan.client.business.dataset.models.ZWiki;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.client.business.util.ZpkConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDataConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/main/wikiv2/studyv2/data/DataConvertKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokhttp3/internal/Util\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,442:1\n1869#2:443\n1870#2:445\n1869#2:446\n1869#2,2:447\n1869#2,2:457\n1870#2:459\n1869#2:460\n1869#2,2:469\n1869#2,2:479\n1870#2:481\n1761#2,3:482\n1#3:444\n625#4,8:449\n625#4,8:461\n625#4,8:471\n608#5:485\n1292#5,3:486\n*S KotlinDebug\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/main/wikiv2/studyv2/data/DataConvertKt\n*L\n71#1:443\n71#1:445\n82#1:446\n86#1:447,2\n95#1:457,2\n82#1:459\n237#1:460\n243#1:469,2\n251#1:479,2\n237#1:481\n308#1:482,3\n93#1:449,8\n241#1:461,8\n249#1:471,8\n365#1:485\n367#1:486,3\n*E\n"})
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f26099a = "mean";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f26100b = "phrase";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f26101c = "type";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f26102d = "word";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f26103e = "variant";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final List<String> f26104f = a00.h0.Q("v.", "vi.", "vt.", "n.", "sing.", "pl.", "pron.", "adj.", "adv.", "conj.", "prep.", "num.", "art.", "int.", "det.", "aux.", "auxv.", "linkv.", "link-v.", "pref.", "suf.", "abbr.", "phr.", "quant.", "excl.", "other");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DataConvert.kt\ncom/baicizhan/main/wikiv2/studyv2/data/DataConvertKt\n*L\n1#1,328:1\n366#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l((Integer) ((Pair) t11).getSecond(), (Integer) ((Pair) t12).getSecond());
        }
    }

    public static final boolean F(List<String> list, EType eType, long j11) {
        List<String> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (u30.f0.J2((String) it.next(), eType.getType() + "_" + j11, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final String G(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "助记" : "象形助记" : "押韵助记" : "联想助记" : "谐音助记" : "词根助记";
    }

    public static final com.baicizhan.main.wikiv2.studyv2.data.a H(TopicRecord topicRecord) {
        String wordMean = topicRecord.wordMean;
        kotlin.jvm.internal.g0.o(wordMean, "wordMean");
        return new com.baicizhan.main.wikiv2.studyv2.data.a(U(wordMean));
    }

    public static final com.baicizhan.main.wikiv2.studyv2.data.a I(DictionaryRecord dictionaryRecord) {
        String meanCn = dictionaryRecord.meanCn;
        kotlin.jvm.internal.g0.o(meanCn, "meanCn");
        return new com.baicizhan.main.wikiv2.studyv2.data.a(U(meanCn));
    }

    public static final com.baicizhan.main.wikiv2.studyv2.data.a J(Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        return new com.baicizhan.main.wikiv2.studyv2.data.a(V(triple));
    }

    public static final b K(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        List<Pair<String, Boolean>> w02 = w0(triple.getFirst().getAntonyms(), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair L;
                L = t.L(Triple.this, obj);
                return L;
            }
        });
        if (w02 != null) {
            return new b(w02);
        }
        return null;
    }

    public static final Pair L(Triple triple, Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        ZAntonym zAntonym = (ZAntonym) it;
        return new Pair(zAntonym.getWord(), Boolean.valueOf(F(((ZWiki) triple.getSecond()).getExtension().getBold(), EType.Antonym, zAntonym.getAId())));
    }

    public static final u M(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        q30.m E1;
        q30.m N1;
        List I3;
        List<ZDerivation> derivations = triple.getFirst().getDerivations();
        if (derivations != null) {
            if (derivations.isEmpty()) {
                derivations = null;
            }
            if (derivations != null && (E1 = a00.r0.E1(derivations)) != null && (N1 = q30.k0.N1(E1, new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.s
                @Override // x00.l
                public final Object invoke(Object obj) {
                    Pair N;
                    N = t.N(Triple.this, (ZDerivation) obj);
                    return N;
                }
            })) != null && (I3 = q30.k0.I3(N1)) != null) {
                if (I3.isEmpty()) {
                    I3 = null;
                }
                if (I3 != null) {
                    return new u(I3);
                }
            }
        }
        return null;
    }

    public static final Pair N(Triple triple, ZDerivation it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new Pair(new Pair(it.getWord(), it.getMean()), Boolean.valueOf(F(((ZWiki) triple.getSecond()).getExtension().getBold(), EType.Derivation, it.getDId())));
    }

    public static final v O(Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        ArrayList arrayList = new ArrayList();
        for (String str : triple.getSecond().getCnMean().getMeanOrder()) {
            StringBuilder sb2 = new StringBuilder();
            List<ZMean> enMean = triple.getFirst().getEnMean();
            if (enMean != null) {
                List J = a00.h0.J();
                for (Object obj : enMean) {
                    ZMean zMean = (ZMean) obj;
                    if (kotlin.jvm.internal.g0.g(zMean.getMeanType(), str) && F(triple.getSecond().getExtension().getBold(), EType.EnMean, zMean.getMId())) {
                        if (J.isEmpty()) {
                            J = new ArrayList();
                        }
                        kotlin.jvm.internal.g0.n(J, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                        kotlin.jvm.internal.x0.g(J).add(obj);
                    }
                }
                if (J != null) {
                    Iterator it = J.iterator();
                    while (it.hasNext()) {
                        sb2.append(((ZMean) it.next()).getMean());
                        sb2.append("; ");
                    }
                }
            }
            int length = sb2.length();
            List<ZMean> enMean2 = triple.getFirst().getEnMean();
            if (enMean2 != null) {
                List J2 = a00.h0.J();
                for (Object obj2 : enMean2) {
                    ZMean zMean2 = (ZMean) obj2;
                    if (kotlin.jvm.internal.g0.g(zMean2.getMeanType(), str) && !F(triple.getSecond().getExtension().getBold(), EType.EnMean, zMean2.getMId())) {
                        if (J2.isEmpty()) {
                            J2 = new ArrayList();
                        }
                        kotlin.jvm.internal.g0.n(J2, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                        kotlin.jvm.internal.x0.g(J2).add(obj2);
                    }
                }
                if (J2 != null) {
                    Iterator it2 = J2.iterator();
                    while (it2.hasNext()) {
                        sb2.append(((ZMean) it2.next()).getMean());
                        sb2.append("; ");
                    }
                }
            }
            if (sb2.length() > 0) {
                String sb3 = sb2.toString();
                kotlin.jvm.internal.g0.o(sb3, "toString(...)");
                arrayList.add(new b0(str, sb3, new Pair(0, Integer.valueOf(length))));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new v(arrayList);
        }
        return null;
    }

    public static final z P(TopicRecord topicRecord) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(topicRecord.wordMeanEn)) {
            String wordMeanEn = topicRecord.wordMeanEn;
            kotlin.jvm.internal.g0.o(wordMeanEn, "wordMeanEn");
            arrayList.add(new v(a00.g0.l(new b0("", wordMeanEn, null))));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new z(arrayList);
        }
        return null;
    }

    public static final z Q(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        List<Integer> order = triple.getSecond().getExtension().getOrder();
        if (order.isEmpty()) {
            order = a00.h0.Q(Integer.valueOf(EType.Phrase.getType()), Integer.valueOf(EType.Derivation.getType()), Integer.valueOf(EType.Variant.getType()), Integer.valueOf(EType.EnMean.getType()), Integer.valueOf(EType.Tv.getType()), Integer.valueOf(EType.Synonym.getType()), Integer.valueOf(EType.Antonym.getType()), Integer.valueOf(EType.Similar.getType()));
        }
        List I3 = q30.k0.I3(q30.k0.X0(q30.k0.N1(a00.r0.E1(order), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                y R;
                R = t.R(Triple.this, ((Integer) obj).intValue());
                return R;
            }
        })));
        if (I3.isEmpty()) {
            I3 = null;
        }
        if (I3 != null) {
            return new z(I3);
        }
        return null;
    }

    public static final y R(Triple triple, int i11) {
        if (i11 == EType.Phrase.getType()) {
            return Y(triple);
        }
        if (i11 == EType.Derivation.getType()) {
            return M(triple);
        }
        if (i11 == EType.Variant.getType()) {
            return r0(triple);
        }
        if (i11 == EType.EnMean.getType()) {
            return O(triple);
        }
        if (i11 == EType.Tv.getType()) {
            return q0(triple);
        }
        if (i11 == EType.Synonym.getType()) {
            return o0(triple);
        }
        if (i11 == EType.Antonym.getType()) {
            return K(triple);
        }
        if (i11 == EType.Similar.getType()) {
            return h0(triple);
        }
        return null;
    }

    public static final a0 S(TopicRecord topicRecord) {
        return !TextUtils.isEmpty(topicRecord.wordEtyma) ? new a0(G(1), topicRecord.wordEtyma, null) : !TextUtils.isEmpty(topicRecord.deformationImagePath) ? new a0(G(5), null, ZpkConfig.getZpkUriByName(topicRecord.zpkName, topicRecord.deformationImagePath, topicRecord.bookId)) : new a0("", null, null);
    }

    public static final a0 T(Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        String str;
        String imgContent;
        ZMnemonic mnemonic = triple.getFirst().getMnemonic();
        if (mnemonic == null || (str = G(mnemonic.getType())) == null) {
            str = "";
        }
        Uri uri = null;
        String content = mnemonic != null ? mnemonic.getContent() : null;
        if (mnemonic != null && (imgContent = mnemonic.getImgContent()) != null) {
            uri = ZpkConfig.getZpkUriByName(triple.getThird().zpkName, imgContent, triple.getThird().bookId);
        }
        return new a0(str, content, uri);
    }

    public static final List<b0> U(final String str) {
        ArrayList arrayList = new ArrayList();
        q30.m<Pair> q32 = q30.k0.q3(q30.k0.P0(q30.k0.N1(a00.r0.E1(f26104f), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair W;
                W = t.W(str, (String) obj);
                return W;
            }
        }), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean X;
                X = t.X((Pair) obj);
                return Boolean.valueOf(X);
            }
        }), new a());
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : q32) {
            if (arrayList2.isEmpty()) {
                arrayList2.add(pair);
            } else {
                Pair pair2 = (Pair) arrayList2.get(arrayList2.size() - 1);
                if (((Number) pair2.getSecond()).intValue() + ((String) pair2.getFirst()).length() < ((Number) pair.getSecond()).intValue()) {
                    arrayList2.add(pair);
                }
            }
        }
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            int intValue = ((Number) ((Pair) arrayList2.get(i11)).getSecond()).intValue() + ((String) ((Pair) arrayList2.get(i11)).getFirst()).length();
            Integer valueOf = Integer.valueOf(i11);
            int i12 = i11 + 1;
            if (i12 >= arrayList2.size()) {
                valueOf = null;
            }
            String substring = str.substring(intValue, valueOf != null ? ((Number) ((Pair) arrayList2.get(i12)).getSecond()).intValue() : str.length());
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            arrayList.add(new b0((String) ((Pair) arrayList2.get(i11)).getFirst(), substring, new Pair(0, Integer.valueOf(substring.length()))));
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        if ((r13 != null ? r13.contains(java.lang.Long.valueOf(r12.getMId())) : false) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.baicizhan.main.wikiv2.studyv2.data.b0> V(kotlin.Triple<com.baicizhan.client.business.dataset.models.ZResource, com.baicizhan.client.business.dataset.models.ZWiki, ? extends com.baicizhan.client.business.dataset.models.TopicRecord> r16) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.studyv2.data.t.V(kotlin.Triple):java.util.List");
    }

    public static final Pair W(String str, String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new Pair(it, Integer.valueOf(u30.k0.J3(str, it, 0, false, 6, null)));
    }

    public static final boolean X(Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return ((Number) it.getSecond()).intValue() != -1;
    }

    public static final c0 Y(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        q30.m E1;
        q30.m N1;
        List I3;
        List<ZPhrase> phrases = triple.getFirst().getPhrases();
        if (phrases != null) {
            if (phrases.isEmpty()) {
                phrases = null;
            }
            if (phrases != null && (E1 = a00.r0.E1(phrases)) != null && (N1 = q30.k0.N1(E1, new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.p
                @Override // x00.l
                public final Object invoke(Object obj) {
                    Pair Z;
                    Z = t.Z(Triple.this, (ZPhrase) obj);
                    return Z;
                }
            })) != null && (I3 = q30.k0.I3(N1)) != null) {
                if (I3.isEmpty()) {
                    I3 = null;
                }
                if (I3 != null) {
                    return new c0(I3);
                }
            }
        }
        return null;
    }

    public static final Pair Z(Triple triple, ZPhrase it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new Pair(new Pair(it.getPhrase(), it.getMean()), Boolean.valueOf(F(((ZWiki) triple.getSecond()).getExtension().getBold(), EType.Phrase, it.getPId())));
    }

    public static final f0 a0(TopicRecord topicRecord) {
        String sentence = topicRecord.sentence;
        kotlin.jvm.internal.g0.o(sentence, "sentence");
        String sentenceTrans = topicRecord.sentenceTrans;
        kotlin.jvm.internal.g0.o(sentenceTrans, "sentenceTrans");
        String word = topicRecord.word;
        kotlin.jvm.internal.g0.o(word, "word");
        Uri zpkUriByName = ZpkConfig.getZpkUriByName(topicRecord.zpkName, topicRecord.sentenceAudio, topicRecord.bookId);
        kotlin.jvm.internal.g0.o(zpkUriByName, "getZpkUriByName(...)");
        return new f0(a00.g0.l(new e0("", "", a00.g0.l(new d0(0L, sentence, sentenceTrans, word, zpkUriByName, ZpkConfig.getZpkUriByName(topicRecord.zpkName, topicRecord.imagePath, topicRecord.bookId), null, null, null, 448, null)))), 0, 2, null);
    }

    public static final f0 b0(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        List I3 = q30.k0.I3(q30.k0.N1(q30.k0.P0(q30.k0.N1(a00.r0.E1(triple.getSecond().getPages()), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair c02;
                c02 = t.c0(Triple.this, (ZSentencePage) obj);
                return c02;
            }
        }), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean f02;
                f02 = t.f0((Pair) obj);
                return Boolean.valueOf(f02);
            }
        }), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                e0 g02;
                g02 = t.g0((Pair) obj);
                return g02;
            }
        }));
        if (I3.isEmpty()) {
            throw new RuntimeException("sentence");
        }
        return new f0(I3, 0, 2, null);
    }

    public static final Pair c0(final Triple triple, ZSentencePage zpage) {
        kotlin.jvm.internal.g0.p(zpage, "zpage");
        Object obj = null;
        new Pair(null, new ArrayList());
        Iterator<T> it = ((ZResource) triple.getFirst()).getCnMean().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ZMean) next).getMId() == zpage.getMeanId()) {
                obj = next;
                break;
            }
        }
        return new Pair((ZMean) obj, q30.k0.I3(q30.k0.X0(q30.k0.N1(q30.k0.N1(a00.r0.E1(zpage.getSentenceIds()), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.q
            @Override // x00.l
            public final Object invoke(Object obj2) {
                ZSentence d02;
                d02 = t.d0(Triple.this, ((Long) obj2).longValue());
                return d02;
            }
        }), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.r
            @Override // x00.l
            public final Object invoke(Object obj2) {
                d0 e02;
                e02 = t.e0(Triple.this, (ZSentence) obj2);
                return e02;
            }
        }))));
    }

    public static final ZSentence d0(Triple triple, long j11) {
        Object obj;
        Iterator<T> it = ((ZResource) triple.getFirst()).getSentences().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ZSentence) obj).getSId() == j11) {
                break;
            }
        }
        return (ZSentence) obj;
    }

    public static final d0 e0(Triple triple, ZSentence zSentence) {
        String str = null;
        if (zSentence == null) {
            return null;
        }
        long sId = zSentence.getSId();
        String sentenceEn = zSentence.getSentenceEn();
        String translate = zSentence.getTranslate();
        String word = ((ZResource) triple.getFirst()).getWord().getWord();
        Uri zpkUriByName = ZpkConfig.getZpkUriByName(((TopicRecord) triple.getThird()).zpkName, zSentence.getAudio(), ((TopicRecord) triple.getThird()).bookId);
        kotlin.jvm.internal.g0.o(zpkUriByName, "getZpkUriByName(...)");
        String image = zSentence.getImage();
        Uri zpkUriByName2 = image != null ? ZpkConfig.getZpkUriByName(((TopicRecord) triple.getThird()).zpkName, image, ((TopicRecord) triple.getThird()).bookId) : null;
        String origin = zSentence.getOrigin();
        if (origin != null) {
            str = "来源：" + origin;
        }
        return new d0(sId, sentenceEn, translate, word, zpkUriByName, zpkUriByName2, str, zSentence.getPhrase(), null, 256, null);
    }

    public static final boolean f0(Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return (it.getFirst() == null || ((Collection) it.getSecond()).isEmpty()) ? false : true;
    }

    public static final e0 g0(Pair it) {
        kotlin.jvm.internal.g0.p(it, "it");
        Object first = it.getFirst();
        kotlin.jvm.internal.g0.m(first);
        String meanType = ((ZMean) first).getMeanType();
        Object first2 = it.getFirst();
        kotlin.jvm.internal.g0.m(first2);
        return new e0(meanType, ((ZMean) first2).getMean(), (List) it.getSecond());
    }

    public static final g0 h0(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        List<Pair<String, Boolean>> w02 = w0(triple.getFirst().getSimilars(), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair i02;
                i02 = t.i0(Triple.this, obj);
                return i02;
            }
        });
        if (w02 != null) {
            return new g0(w02);
        }
        return null;
    }

    public static final Pair i0(Triple triple, Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        ZSimilar zSimilar = (ZSimilar) it;
        return new Pair(zSimilar.getWord(), Boolean.valueOf(F(((ZWiki) triple.getSecond()).getExtension().getBold(), EType.Similar, zSimilar.getSId())));
    }

    public static final h0 j0(TopicRecord topicRecord) {
        String wordMean = topicRecord.wordMean;
        kotlin.jvm.internal.g0.o(wordMean, "wordMean");
        List<b0> U = U(wordMean);
        return new h0(q30.k0.I3(q30.k0.N1(a00.r0.E1(U), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                x m02;
                m02 = t.m0((b0) obj);
                return m02;
            }
        })), U, 0, 4, null);
    }

    public static final h0 k0(DictionaryRecord dictionaryRecord) {
        String meanCn = dictionaryRecord.meanCn;
        kotlin.jvm.internal.g0.o(meanCn, "meanCn");
        List<b0> U = U(meanCn);
        return new h0(q30.k0.I3(q30.k0.N1(a00.r0.E1(U), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                x n02;
                n02 = t.n0((b0) obj);
                return n02;
            }
        })), U, 0, 4, null);
    }

    public static final h0 l0(Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        List<Long> examOrder = triple.getSecond().getCnMean().getExamOrder();
        if (examOrder != null) {
            Iterator<T> it = examOrder.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Iterator<T> it2 = triple.getFirst().getCnMean().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((ZMean) obj).getMId() == longValue) {
                        break;
                    }
                }
                ZMean zMean = (ZMean) obj;
                if (zMean != null) {
                    arrayList.add(new x(zMean.getMeanType(), zMean.getMean(), zMean.getPercent()));
                }
            }
        }
        return new h0(arrayList, V(triple), 0, 4, null);
    }

    public static final x m0(b0 normalMean) {
        kotlin.jvm.internal.g0.p(normalMean, "normalMean");
        return new x(normalMean.h(), normalMean.g(), null);
    }

    public static final x n0(b0 normalMean) {
        kotlin.jvm.internal.g0.p(normalMean, "normalMean");
        return new x(normalMean.h(), normalMean.g(), null);
    }

    public static final i0 o0(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        List<Pair<String, Boolean>> w02 = w0(triple.getFirst().getSynonyms(), new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair p02;
                p02 = t.p0(Triple.this, obj);
                return p02;
            }
        });
        if (w02 != null) {
            return new i0(w02);
        }
        return null;
    }

    public static final Pair p0(Triple triple, Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        ZSynonym zSynonym = (ZSynonym) it;
        return new Pair(zSynonym.getWord(), Boolean.valueOf(F(((ZWiki) triple.getSecond()).getExtension().getBold(), EType.Synonym, zSynonym.getSId())));
    }

    public static final k0 q0(Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        ZTvInfo tvInfo = triple.getFirst().getTvInfo();
        if (tvInfo == null) {
            return null;
        }
        String tvPath = tvInfo.getTvPath();
        Uri zpkUriByName = ZpkConfig.getZpkUriByName(triple.getThird().zpkName, tvInfo.getTvSnapshot(), triple.getThird().bookId);
        kotlin.jvm.internal.g0.o(zpkUriByName, "getZpkUriByName(...)");
        return new k0(tvPath, zpkUriByName, false, null, null, 28, null);
    }

    public static final n0 r0(final Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        q30.m E1;
        q30.m N1;
        List I3;
        List<ZVariant> variant = triple.getFirst().getVariant();
        if (variant != null) {
            if (variant.isEmpty()) {
                variant = null;
            }
            if (variant != null && (E1 = a00.r0.E1(variant)) != null && (N1 = q30.k0.N1(E1, new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.data.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    Pair s02;
                    s02 = t.s0(Triple.this, (ZVariant) obj);
                    return s02;
                }
            })) != null && (I3 = q30.k0.I3(N1)) != null) {
                if (I3.isEmpty()) {
                    I3 = null;
                }
                if (I3 != null) {
                    return new n0(I3);
                }
            }
        }
        return null;
    }

    public static final Pair s0(Triple triple, ZVariant it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return new Pair(new Pair(it.getType(), it.getVariant()), Boolean.valueOf(F(((ZWiki) triple.getSecond()).getExtension().getBold(), EType.Variant, it.getVId())));
    }

    public static final x0 t0(TopicRecord topicRecord) {
        int i11 = topicRecord.topicId;
        int i12 = topicRecord.bookId;
        String word = topicRecord.word;
        kotlin.jvm.internal.g0.o(word, "word");
        String phonetic = topicRecord.phonetic;
        kotlin.jvm.internal.g0.o(phonetic, "phonetic");
        return new x0(i11, i12, word, null, phonetic, ZpkConfig.getZpkUriByName(topicRecord.zpkName, topicRecord.wordAudio, topicRecord.bookId), null, null, 128, null);
    }

    public static final x0 u0(DictionaryRecord dictionaryRecord) {
        int i11 = dictionaryRecord.topicId;
        int i12 = dictionaryRecord.bookId;
        String word = dictionaryRecord.word;
        kotlin.jvm.internal.g0.o(word, "word");
        String accent = dictionaryRecord.accent;
        kotlin.jvm.internal.g0.o(accent, "accent");
        return new x0(i11, i12, word, null, accent, null, null, null, 128, null);
    }

    public static final x0 v0(Triple<ZResource, ZWiki, ? extends TopicRecord> triple) {
        int topicId = triple.getFirst().getWord().getTopicId();
        int i11 = triple.getThird().bookId;
        String word = triple.getFirst().getWord().getWord();
        String wordSplit = triple.getFirst().getWord().getWordSplit();
        String accentUs = triple.getFirst().getWord().getAccentUs();
        Uri zpkUriByName = ZpkConfig.getZpkUriByName(triple.getThird().zpkName, triple.getFirst().getWord().getAudioUs(), triple.getThird().bookId);
        ZExamInfo exam = triple.getFirst().getWord().getExam();
        return new x0(topicId, i11, word, wordSplit, accentUs, zpkUriByName, exam != null ? new w(exam.getRecent(), exam.getExamName(), exam.getNums()) : null, null, 128, null);
    }

    public static final List<Pair<String, Boolean>> w0(List<? extends Object> list, x00.l<Object, Pair<String, Boolean>> lVar) {
        q30.m E1;
        q30.m N1;
        List<Pair<String, Boolean>> I3;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null && (E1 = a00.r0.E1(list)) != null && (N1 = q30.k0.N1(E1, lVar)) != null && (I3 = q30.k0.I3(N1)) != null && !I3.isEmpty()) {
                return I3;
            }
        }
        return null;
    }
}
