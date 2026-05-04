package com.baicizhan.main.wikiv2.activity;

import android.os.Parcel;
import android.os.Parcelable;
import e50.g;
import kotlin.jvm.internal.g0;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g
/* loaded from: classes3.dex */
public final class WikiType implements Parcelable {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WikiType[] $VALUES;

    @k
    public static final Parcelable.Creator<WikiType> CREATOR;
    public static final WikiType LOOK_UP_WIKI = new WikiType("LOOK_UP_WIKI", 0);
    public static final WikiType STUDY_WIKI = new WikiType("STUDY_WIKI", 1);
    public static final WikiType EXAM_WIKI = new WikiType("EXAM_WIKI", 2);
    public static final WikiType WIKI_SCENE = new WikiType("WIKI_SCENE", 3);
    public static final WikiType WORD_LIST_WIKI = new WikiType("WORD_LIST_WIKI", 4);

    private static final /* synthetic */ WikiType[] $values() {
        return new WikiType[]{LOOK_UP_WIKI, STUDY_WIKI, EXAM_WIKI, WIKI_SCENE, WORD_LIST_WIKI};
    }

    static {
        WikiType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        CREATOR = new Parcelable.Creator<WikiType>() { // from class: com.baicizhan.main.wikiv2.activity.WikiType.a
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WikiType createFromParcel(Parcel parcel) {
                g0.p(parcel, "parcel");
                return WikiType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WikiType[] newArray(int i11) {
                return new WikiType[i11];
            }
        };
    }

    private WikiType(String str, int i11) {
    }

    @k
    public static m00.a<WikiType> getEntries() {
        return $ENTRIES;
    }

    public static WikiType valueOf(String str) {
        return (WikiType) Enum.valueOf(WikiType.class, str);
    }

    public static WikiType[] values() {
        return (WikiType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeString(name());
    }
}
