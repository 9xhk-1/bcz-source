package com.baicizhan.main.unity.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import e50.g;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class Scene implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25069b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25070a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @g
    public static final class JapaneseSentence extends Scene {

        @k
        public static final Parcelable.Creator<JapaneseSentence> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f25071d = 8;

        /* renamed from: c, reason: collision with root package name */
        public final int f25072c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Parcelable.Creator<JapaneseSentence> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JapaneseSentence createFromParcel(Parcel parcel) {
                g0.p(parcel, "parcel");
                return new JapaneseSentence(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final JapaneseSentence[] newArray(int i11) {
                return new JapaneseSentence[i11];
            }
        }

        public JapaneseSentence(int i11) {
            super(1, null);
            this.f25072c = i11;
        }

        public static /* synthetic */ JapaneseSentence d(JapaneseSentence japaneseSentence, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = japaneseSentence.f25072c;
            }
            return japaneseSentence.c(i11);
        }

        public final int b() {
            return this.f25072c;
        }

        @k
        public final JapaneseSentence c(int i11) {
            return new JapaneseSentence(i11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f25072c;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JapaneseSentence) && this.f25072c == ((JapaneseSentence) obj).f25072c;
        }

        public int hashCode() {
            return Integer.hashCode(this.f25072c);
        }

        @k
        public String toString() {
            return "JapaneseSentence(id=" + this.f25072c + j.f81007d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel dest, int i11) {
            g0.p(dest, "dest");
            dest.writeInt(this.f25072c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @g
    public static final class WordLearning extends Scene {

        @k
        public static final Parcelable.Creator<WordLearning> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f25073d = 8;

        /* renamed from: c, reason: collision with root package name */
        public final int f25074c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Parcelable.Creator<WordLearning> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WordLearning createFromParcel(Parcel parcel) {
                g0.p(parcel, "parcel");
                return new WordLearning(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WordLearning[] newArray(int i11) {
                return new WordLearning[i11];
            }
        }

        public WordLearning(int i11) {
            super(2, null);
            this.f25074c = i11;
        }

        public static /* synthetic */ WordLearning d(WordLearning wordLearning, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = wordLearning.f25074c;
            }
            return wordLearning.c(i11);
        }

        public final int b() {
            return this.f25074c;
        }

        @k
        public final WordLearning c(int i11) {
            return new WordLearning(i11);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f25074c;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WordLearning) && this.f25074c == ((WordLearning) obj).f25074c;
        }

        public int hashCode() {
            return Integer.hashCode(this.f25074c);
        }

        @k
        public String toString() {
            return "WordLearning(id=" + this.f25074c + j.f81007d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel dest, int i11) {
            g0.p(dest, "dest");
            dest.writeInt(this.f25074c);
        }
    }

    public /* synthetic */ Scene(int i11, v vVar) {
        this(i11);
    }

    public final int a() {
        return this.f25070a;
    }

    public Scene(int i11) {
        this.f25070a = i11;
    }
}
