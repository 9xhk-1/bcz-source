package nj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.main.wikiv2.studyv2.data.x0;
import com.baicizhan.main.wordlist.activity.WordListItem;
import com.baicizhan.main.wordlistv2.c1;
import ij.e0;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import qi.b;
import si.c;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0912a f75140b = new C0912a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f75141c = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f75142d = "NewCollectWordManager";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FragmentActivity f75143a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: nj.a$a, reason: collision with other inner class name */
    public static final class C0912a {
        public /* synthetic */ C0912a(v vVar) {
            this();
        }

        @o
        @k
        public final e0 a(@l Object obj) {
            String q11;
            List<b.C1020b> f11;
            b.C1020b c1020b;
            if (obj instanceof TopicRecord) {
                TopicRecord topicRecord = (TopicRecord) obj;
                int i11 = topicRecord.topicId;
                int i12 = topicRecord.bookId;
                String word = topicRecord.word;
                g0.o(word, "word");
                String str = topicRecord.wordMean;
                String str2 = str == null ? "" : str;
                String str3 = topicRecord.phonetic;
                return new e0(i11, i12, word, str2, str3 == null ? "" : str3);
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int u11 = bVar.u();
                int p11 = bVar.p();
                String z11 = bVar.z();
                b.c r11 = bVar.r();
                String str4 = ((r11 == null || (f11 = r11.f()) == null || (c1020b = f11.get(0)) == null || (q11 = c1020b.g()) == null) && (q11 = bVar.q()) == null) ? "" : q11;
                String x11 = bVar.x();
                return new e0(u11, p11, z11, str4, x11 == null ? "" : x11);
            }
            if (obj instanceof Word) {
                Word word2 = (Word) obj;
                String id2 = word2.getId();
                g0.o(id2, "getId(...)");
                int parseInt = Integer.parseInt(id2);
                int bookId = word2.getBookId();
                String word3 = word2.getWord();
                g0.o(word3, "getWord(...)");
                String cnmean = word2.getCnmean();
                g0.o(cnmean, "getCnmean(...)");
                return new e0(parseInt, bookId, word3, cnmean, word2.getAccent());
            }
            if (obj instanceof WordListItem) {
                WordListItem wordListItem = (WordListItem) obj;
                int topicId = UniverseTopicId.getTopicId(wordListItem.n());
                int bookId2 = UniverseTopicId.getBookId(wordListItem.n());
                String o11 = wordListItem.o();
                g0.o(o11, "getWord(...)");
                String p12 = wordListItem.p();
                String str5 = p12 == null ? "" : p12;
                String e11 = wordListItem.e();
                return new e0(topicId, bookId2, o11, str5, e11 == null ? "" : e11);
            }
            if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                return new e0(x0Var.q(), x0Var.m(), x0Var.r(), "", "");
            }
            if (obj instanceof c1) {
                c1 c1Var = (c1) obj;
                return new e0(c1Var.v(), -1, c1Var.w(), c1Var.r(), "");
            }
            if (!(obj instanceof c)) {
                return new e0(-1, -1, "", "", null);
            }
            c cVar = (c) obj;
            return new e0(cVar.s(), -1, cVar.t(), "", "");
        }

        public C0912a() {
        }
    }

    public a(@k FragmentActivity activity) {
        g0.p(activity, "activity");
        this.f75143a = activity;
    }

    @o
    @k
    public static final e0 a(@l Object obj) {
        return f75140b.a(obj);
    }

    @k
    public final FragmentActivity b() {
        return this.f75143a;
    }
}
