package oj;

import a00.h0;
import a00.i0;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import i9.i;
import ij.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordFavoritesSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoritesSourceImpl.kt\ncom/baicizhan/main/word_book/learning/WordFavoritesSourceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n774#2:37\n865#2,2:38\n1563#2:40\n1634#2,3:41\n1563#2:45\n1634#2,3:46\n1617#2,9:49\n1869#2:58\n1870#2:60\n1626#2:61\n1563#2:62\n1634#2,3:63\n1#3:44\n1#3:59\n*S KotlinDebug\n*F\n+ 1 WordFavoritesSourceImpl.kt\ncom/baicizhan/main/word_book/learning/WordFavoritesSourceImpl\n*L\n17#1:37\n17#1:38,2\n18#1:40\n18#1:41,3\n20#1:45\n20#1:46,3\n21#1:49,9\n21#1:58\n21#1:60\n21#1:61\n27#1:62\n27#1:63,3\n21#1:59\n*E\n"})
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f77073b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f77074a;

    public c(@k Context context) {
        g0.p(context, "context");
        this.f77074a = context;
    }

    @Override // oj.b
    @k
    public List<kj.c> a(@k List<kj.b> words) {
        Object obj;
        kj.b bVar;
        String n11;
        g0.p(words, "words");
        List<kj.b> list = words;
        ArrayList<kj.b> arrayList = new ArrayList();
        for (Object obj2 : list) {
            kj.b bVar2 = (kj.b) obj2;
            if (bVar2.v().length() == 0 || bVar2.s().length() == 0 || (n11 = bVar2.n()) == null || n11.length() == 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList<Pair> arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        for (kj.b bVar3 : arrayList) {
            arrayList2.add(new Pair(Integer.valueOf(z.f60671m.b(bVar3.u())), bVar3.v()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            Context context = this.f77074a;
            ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
            for (Pair pair : arrayList2) {
                arrayList3.add(new android.util.Pair(pair.getFirst(), pair.getSecond()));
            }
            List<DictionaryRecord> e11 = i.e(context, arrayList3, null);
            if (e11 != null) {
                ArrayList<kj.b> arrayList4 = new ArrayList();
                for (DictionaryRecord dictionaryRecord : e11) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (z.f60671m.b(((kj.b) obj).u()) == dictionaryRecord.topicId) {
                            break;
                        }
                    }
                    kj.b bVar4 = (kj.b) obj;
                    if (bVar4 != null) {
                        String word = dictionaryRecord.word;
                        g0.o(word, "word");
                        String meanCn = dictionaryRecord.meanCn;
                        g0.o(meanCn, "meanCn");
                        bVar = kj.b.l(bVar4, 0L, null, null, null, word, meanCn, dictionaryRecord.accent, null, null, 399, null);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList4.add(bVar);
                    }
                }
                ArrayList arrayList5 = new ArrayList(i0.d0(arrayList4, 10));
                for (kj.b bVar5 : arrayList4) {
                    arrayList5.add(new kj.c(bVar5.u(), bVar5.v(), bVar5.s(), bVar5.n()));
                }
                return arrayList5;
            }
        }
        return h0.J();
    }
}
