package sh;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.debug.DebugConfig;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f88586e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f88587f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f88588g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f88589h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f88590i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f88591j = 21;

    /* renamed from: k, reason: collision with root package name */
    public static final int f88592k = 22;

    /* renamed from: l, reason: collision with root package name */
    public static final int f88593l = 23;

    /* renamed from: m, reason: collision with root package name */
    public static final int f88594m = 24;

    /* renamed from: n, reason: collision with root package name */
    public static final int f88595n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f88596o = 5;

    /* renamed from: p, reason: collision with root package name */
    public static final int f88597p = 6;

    /* renamed from: q, reason: collision with root package name */
    public static final int f88598q = 7;

    /* renamed from: r, reason: collision with root package name */
    public static final int f88599r = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final String f88600s = "en2mean";

    /* renamed from: t, reason: collision with root package name */
    public static final String f88601t = "listen";

    /* renamed from: u, reason: collision with root package name */
    public static final String f88602u = "mean2word";

    /* renamed from: v, reason: collision with root package name */
    public static final String f88603v = "cloze";

    /* renamed from: w, reason: collision with root package name */
    public static final String f88604w = "chunk";

    /* renamed from: x, reason: collision with root package name */
    public static final String f88605x = "speedListen";

    /* renamed from: y, reason: collision with root package name */
    public static final String f88606y = "fullspell";

    /* renamed from: z, reason: collision with root package name */
    public static final int f88607z = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f88608a;

    /* renamed from: b, reason: collision with root package name */
    public int f88609b;

    /* renamed from: c, reason: collision with root package name */
    public List<Integer> f88610c = new ArrayList(4);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<TopicRecord> f88611d = new ArrayList<>(4);

    public f(int id2, int[] options) {
        this.f88608a = id2;
        this.f88610c.add(Integer.valueOf(id2));
        this.f88611d.add(null);
        for (int i11 : options) {
            this.f88610c.add(Integer.valueOf(i11));
            this.f88611d.add(null);
        }
        this.f88609b = 0;
    }

    public static int b(int probType) {
        if (probType == 3) {
            return R.string.en_mean_title;
        }
        if (probType == 4) {
            return R.string.full_spell_title;
        }
        if (probType == 7) {
            return R.string.hear_write_title;
        }
        switch (probType) {
            case 21:
                return R.string.spell_title;
            case 22:
                return R.string.spell_review_title;
            case 23:
                return R.string.hear_recognize_title;
            case 24:
                return R.string.cn_word_title;
            default:
                return 0;
        }
    }

    public static int f(String probKey) {
        if (TextUtils.equals(probKey, f88600s)) {
            return 0;
        }
        if (TextUtils.equals(probKey, f88601t)) {
            return 1;
        }
        if (TextUtils.equals(probKey, f88602u)) {
            return 2;
        }
        if (TextUtils.equals(probKey, f88603v)) {
            return 3;
        }
        if (TextUtils.equals(probKey, f88604w)) {
            return 4;
        }
        if (TextUtils.equals(probKey, f88605x)) {
            return 5;
        }
        return TextUtils.equals(probKey, f88606y) ? 6 : -1;
    }

    public static String g(int bookId, int probType) {
        String str;
        if (probType == 3) {
            str = f88600s;
        } else if (probType == 4) {
            str = f88606y;
        } else if (probType != 7) {
            switch (probType) {
                case 21:
                    str = f88603v;
                    break;
                case 22:
                    str = f88604w;
                    break;
                case 23:
                    str = f88601t;
                    break;
                case 24:
                    str = f88602u;
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = f88605x;
        }
        return h(bookId, str);
    }

    public static String h(int bookId, String probKey) {
        return i9.f.h(i9.f.h(i9.f.X, String.valueOf(bookId)), probKey);
    }

    public static String i(int bookId, int diskIndex) {
        String str;
        switch (diskIndex) {
            case 0:
                str = f88600s;
                break;
            case 1:
                str = f88601t;
                break;
            case 2:
                str = f88602u;
                break;
            case 3:
                str = f88603v;
                break;
            case 4:
                str = f88604w;
                break;
            case 5:
                str = f88605x;
                break;
            case 6:
                str = f88606y;
                break;
            default:
                str = null;
                break;
        }
        return h(bookId, str);
    }

    public static String l(int type) {
        if (type == 3) {
            return f88600s;
        }
        if (type == 4) {
            return "write";
        }
        if (type == 5) {
            return "read";
        }
        if (type == 6) {
            return "match";
        }
        switch (type) {
            case 21:
                return f88603v;
            case 22:
                return f88604w;
            case 23:
                return f88601t;
            case 24:
                return f88602u;
            default:
                return null;
        }
    }

    public static boolean n(int probType) {
        return 3 == probType || 23 == probType || 5 == probType || 24 == probType || 21 == probType || 22 == probType || 4 == probType || 7 == probType;
    }

    public boolean a(TopicRecord record) {
        int indexOf = this.f88610c.indexOf(Integer.valueOf(record.topicId));
        if (indexOf == -1) {
            return false;
        }
        if (this.f88611d.set(indexOf, record) == null) {
            this.f88609b++;
        }
        return true;
    }

    public int c() {
        return this.f88608a;
    }

    public List<TopicRecord> d() {
        return this.f88611d;
    }

    public List<Integer> e() {
        return this.f88610c;
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        return (o11 instanceof f) && this.f88608a == ((f) o11).f88608a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f88608a));
    }

    public TopicRecord j() {
        for (int i11 = 0; i11 < this.f88611d.size(); i11++) {
            TopicRecord topicRecord = this.f88611d.get(i11);
            if (topicRecord.topicId == this.f88608a) {
                return topicRecord;
            }
        }
        return null;
    }

    public int k() {
        return (this.f88609b * 100) / this.f88610c.size();
    }

    public boolean m() {
        return this.f88609b == this.f88610c.size();
    }

    public void o(int id2) {
        this.f88608a = id2;
    }

    public void p() {
        TopicRecord j11 = j();
        Collections.shuffle(this.f88611d);
        if (DebugConfig.getsIntance().enable && DebugConfig.getsIntance().fixOptionPosition) {
            this.f88611d.remove(j11);
            this.f88611d.add(0, j11);
        }
    }

    public String toString() {
        return "ProblemAsset{id=" + this.f88608a + ", options=[" + TextUtils.join(",", this.f88610c) + "]" + l50.b.f69928j;
    }
}
