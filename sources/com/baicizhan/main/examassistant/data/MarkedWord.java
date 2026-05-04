package com.baicizhan.main.examassistant.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import e50.g;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@g
/* loaded from: classes4.dex */
public final class MarkedWord implements Parcelable {

    @k
    public static final Parcelable.Creator<MarkedWord> CREATOR = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final int f20482g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f20483a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f20484b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f20485c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f20486d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20487e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f20488f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<MarkedWord> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarkedWord createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new MarkedWord(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarkedWord[] newArray(int i11) {
            return new MarkedWord[i11];
        }
    }

    public MarkedWord(int i11, @k String word, @k String meanings, @k String audio, long j11, @l String str) {
        g0.p(word, "word");
        g0.p(meanings, "meanings");
        g0.p(audio, "audio");
        this.f20483a = i11;
        this.f20484b = word;
        this.f20485c = meanings;
        this.f20486d = audio;
        this.f20487e = j11;
        this.f20488f = str;
    }

    public static /* synthetic */ MarkedWord i(MarkedWord markedWord, int i11, String str, String str2, String str3, long j11, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = markedWord.f20483a;
        }
        if ((i12 & 2) != 0) {
            str = markedWord.f20484b;
        }
        if ((i12 & 4) != 0) {
            str2 = markedWord.f20485c;
        }
        if ((i12 & 8) != 0) {
            str3 = markedWord.f20486d;
        }
        if ((i12 & 16) != 0) {
            j11 = markedWord.f20487e;
        }
        if ((i12 & 32) != 0) {
            str4 = markedWord.f20488f;
        }
        String str5 = str4;
        long j12 = j11;
        return markedWord.h(i11, str, str2, str3, j12, str5);
    }

    public final int a() {
        return this.f20483a;
    }

    @k
    public final String b() {
        return this.f20484b;
    }

    @k
    public final String c() {
        return this.f20485c;
    }

    @k
    public final String d() {
        return this.f20486d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f20487e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkedWord)) {
            return false;
        }
        MarkedWord markedWord = (MarkedWord) obj;
        return this.f20483a == markedWord.f20483a && g0.g(this.f20484b, markedWord.f20484b) && g0.g(this.f20485c, markedWord.f20485c) && g0.g(this.f20486d, markedWord.f20486d) && this.f20487e == markedWord.f20487e && g0.g(this.f20488f, markedWord.f20488f);
    }

    @l
    public final String g() {
        return this.f20488f;
    }

    @k
    public final MarkedWord h(int i11, @k String word, @k String meanings, @k String audio, long j11, @l String str) {
        g0.p(word, "word");
        g0.p(meanings, "meanings");
        g0.p(audio, "audio");
        return new MarkedWord(i11, word, meanings, audio, j11, str);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f20483a) * 31) + this.f20484b.hashCode()) * 31) + this.f20485c.hashCode()) * 31) + this.f20486d.hashCode()) * 31) + Long.hashCode(this.f20487e)) * 31;
        String str = this.f20488f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String j() {
        return this.f20486d;
    }

    public final long k() {
        return this.f20487e;
    }

    @k
    public final String l() {
        return this.f20485c;
    }

    @l
    public final String m() {
        return this.f20488f;
    }

    public final int n() {
        return this.f20483a;
    }

    @k
    public final String o() {
        return this.f20484b;
    }

    @k
    public String toString() {
        return "MarkedWord(topicId=" + this.f20483a + ", word=" + this.f20484b + ", meanings=" + this.f20485c + ", audio=" + this.f20486d + ", createdAt=" + this.f20487e + ", phonetic=" + this.f20488f + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.f20483a);
        dest.writeString(this.f20484b);
        dest.writeString(this.f20485c);
        dest.writeString(this.f20486d);
        dest.writeLong(this.f20487e);
        dest.writeString(this.f20488f);
    }
}
