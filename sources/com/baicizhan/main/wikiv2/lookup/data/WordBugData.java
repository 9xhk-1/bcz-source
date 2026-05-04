package com.baicizhan.main.wikiv2.lookup.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class WordBugData implements Parcelable {

    @k
    public static final a CREATOR = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f25587c = 0;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f25588a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final WordBugType f25589b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<WordBugData> {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WordBugData createFromParcel(@k Parcel parcel) {
            g0.p(parcel, "parcel");
            return new WordBugData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WordBugData[] newArray(int i11) {
            return new WordBugData[i11];
        }

        public a() {
        }
    }

    public WordBugData(@l String str, @l WordBugType wordBugType) {
        this.f25588a = str;
        this.f25589b = wordBugType;
    }

    public static /* synthetic */ WordBugData d(WordBugData wordBugData, String str, WordBugType wordBugType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wordBugData.f25588a;
        }
        if ((i11 & 2) != 0) {
            wordBugType = wordBugData.f25589b;
        }
        return wordBugData.c(str, wordBugType);
    }

    @l
    public final String a() {
        return this.f25588a;
    }

    @l
    public final WordBugType b() {
        return this.f25589b;
    }

    @k
    public final WordBugData c(@l String str, @l WordBugType wordBugType) {
        return new WordBugData(str, wordBugType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String e() {
        return this.f25588a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordBugData)) {
            return false;
        }
        WordBugData wordBugData = (WordBugData) obj;
        return g0.g(this.f25588a, wordBugData.f25588a) && this.f25589b == wordBugData.f25589b;
    }

    @l
    public final WordBugType g() {
        return this.f25589b;
    }

    public int hashCode() {
        String str = this.f25588a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        WordBugType wordBugType = this.f25589b;
        return hashCode + (wordBugType != null ? wordBugType.hashCode() : 0);
    }

    @k
    public String toString() {
        return "WordBugData(name=" + this.f25588a + ", type=" + this.f25589b + j.f81007d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int i11) {
        g0.p(parcel, "parcel");
        parcel.writeString(this.f25588a);
        parcel.writeSerializable(this.f25589b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WordBugData(@m80.k android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = r3.readString()
            java.io.Serializable r3 = r3.readSerializable()
            boolean r1 = r3 instanceof com.baicizhan.online.resource_api.WordBugType
            if (r1 == 0) goto L14
            com.baicizhan.online.resource_api.WordBugType r3 = (com.baicizhan.online.resource_api.WordBugType) r3
            goto L15
        L14:
            r3 = 0
        L15:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.lookup.data.WordBugData.<init>(android.os.Parcel):void");
    }
}
