package com.baicizhan.main.wordlist.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.baicizhan.client.business.dataset.models.CollectWordRecord;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.managers.LearnRecordManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import tj.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class WordListItem implements Parcelable {
    public static final Parcelable.Creator<WordListItem> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final int f27793g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final String f27794h = "更早";

    /* renamed from: i, reason: collision with root package name */
    public static final String f27795i = "今天";

    /* renamed from: j, reason: collision with root package name */
    public static final SimpleDateFormat f27796j;

    /* renamed from: k, reason: collision with root package name */
    public static final SimpleDateFormat f27797k;

    /* renamed from: l, reason: collision with root package name */
    public static final SimpleDateFormat f27798l;

    /* renamed from: a, reason: collision with root package name */
    public long f27799a;

    /* renamed from: b, reason: collision with root package name */
    public long f27800b;

    /* renamed from: c, reason: collision with root package name */
    public int f27801c;

    /* renamed from: d, reason: collision with root package name */
    public String f27802d;

    /* renamed from: e, reason: collision with root package name */
    public String f27803e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27804f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<WordListItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WordListItem createFromParcel(Parcel in2) {
            return new WordListItem(in2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WordListItem[] newArray(int size) {
            return new WordListItem[size];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Comparator<WordListItem> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(WordListItem lhs, WordListItem rhs) {
            int j11 = lhs.j();
            int j12 = rhs.j();
            if (j11 < j12) {
                return 1;
            }
            return j11 == j12 ? 0 : -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Comparator<WordListItem> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(WordListItem lhs, WordListItem rhs) {
            long m11 = lhs.m();
            long m12 = rhs.m();
            if (m11 < m12) {
                return 1;
            }
            return m11 == m12 ? 0 : -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Comparator<WordListItem> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(WordListItem lhs, WordListItem rhs) {
            String o11 = lhs.o();
            String o12 = rhs.o();
            if (o11 == null && o12 == null) {
                return 0;
            }
            if (o11 == null) {
                return 1;
            }
            if (o12 == null) {
                return -1;
            }
            return o11.toLowerCase().compareTo(o12.toLowerCase());
        }
    }

    static {
        Locale locale = Locale.CHINA;
        f27796j = new SimpleDateFormat("yyyy.MM.dd", locale);
        f27797k = new SimpleDateFormat("yyyy\nMM.dd", locale);
        f27798l = new SimpleDateFormat("yy年M月dd日", locale);
    }

    public WordListItem() {
        this.f27804f = true;
    }

    public static String b(long timestamp) {
        if (timestamp == 0) {
            return f27794h;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timestamp);
        return (!(calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) && timestamp < System.currentTimeMillis()) ? f27798l.format(new Date(timestamp)) : f27795i;
    }

    public static String c(long timestamp) {
        return timestamp == 0 ? f27794h : f27797k.format(new Date(timestamp));
    }

    public static String d(long timestamp) {
        return timestamp == 0 ? f27794h : f27796j.format(new Date(timestamp));
    }

    public static Comparator<WordListItem> g() {
        return new b();
    }

    public static Comparator<WordListItem> h() {
        return new d();
    }

    public static Comparator<WordListItem> i() {
        return new c();
    }

    public static long k(long universeTopicId) {
        TopicLearnRecord J = LearnRecordManager.A().J(UniverseTopicId.getTopicId(universeTopicId));
        if (J == null) {
            return 0L;
        }
        return J.createAt;
    }

    public static CollectWordRecord z(WordListItem item) {
        if (item == null) {
            return null;
        }
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = item.f27799a;
        collectWordRecord.word = item.o();
        collectWordRecord.accent = item.e();
        collectWordRecord.meanCn = item.p();
        return collectWordRecord;
    }

    public void a(int flag) {
        this.f27801c = flag | this.f27801c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f27803e;
    }

    public int j() {
        TopicLearnRecord J;
        int bookId = UniverseTopicId.getBookId(this.f27799a);
        int topicId = UniverseTopicId.getTopicId(this.f27799a);
        if (LearnRecordManager.A().z() != bookId || (J = LearnRecordManager.A().J(topicId)) == null) {
            return 0;
        }
        return J.errNum;
    }

    public int l() {
        return this.f27801c;
    }

    public long m() {
        return this.f27800b;
    }

    public long n() {
        return this.f27799a;
    }

    public String o() {
        return z.g().i(UniverseTopicId.getTopicId(this.f27799a));
    }

    public String p() {
        return this.f27802d;
    }

    public boolean r() {
        return this.f27804f;
    }

    public void s(int flag) {
        this.f27801c = (~flag) & this.f27801c;
    }

    public void t(String accent) {
        this.f27803e = accent;
    }

    public String toString() {
        return "WordListItem{universeTopicId=" + this.f27799a + ", timestamp=" + this.f27800b + l50.b.f69928j;
    }

    public void u(boolean mShowDivder) {
        this.f27804f = mShowDivder;
    }

    public void v(long timestamp) {
        this.f27800b = timestamp;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f27799a);
        parcel.writeLong(this.f27800b);
        parcel.writeInt(i11);
        parcel.writeString(this.f27802d);
        parcel.writeString(this.f27803e);
        parcel.writeByte(this.f27804f ? (byte) 1 : (byte) 0);
    }

    public void x(long universeTopicId) {
        this.f27799a = universeTopicId;
    }

    public void y(String wordMean) {
        this.f27802d = wordMean;
    }

    public WordListItem(Parcel in2) {
        this.f27804f = true;
        this.f27799a = in2.readLong();
        this.f27800b = in2.readLong();
        this.f27801c = in2.readInt();
        this.f27802d = in2.readString();
        this.f27803e = in2.readString();
        this.f27804f = in2.readByte() != 0;
    }
}
