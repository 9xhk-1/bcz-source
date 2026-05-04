package com.baicizhan.main.global;

import m00.a;
import m00.c;
import m80.k;
import ma.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class AppPageStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppPageStatus[] $VALUES;

    @k
    private final String value;
    public static final AppPageStatus DEFAULT = new AppPageStatus("DEFAULT", 0, "");
    public static final AppPageStatus STUDY_NORMAL = new AppPageStatus("STUDY_NORMAL", 1, v.f73035f);
    public static final AppPageStatus STUDY_FINAL_REVIEW = new AppPageStatus("STUDY_FINAL_REVIEW", 2, v.f73036g);
    public static final AppPageStatus STUDY_REINFORCE = new AppPageStatus("STUDY_REINFORCE", 3, v.f73041l);
    public static final AppPageStatus STUDY_MY_FAVOR = new AppPageStatus("STUDY_MY_FAVOR", 4, v.f73042m);
    public static final AppPageStatus EXAM_PRIMARY_STUDY_NORMAL = new AppPageStatus("EXAM_PRIMARY_STUDY_NORMAL", 5, v.f73043n);
    public static final AppPageStatus EXAM_REVIEW_STUDY_NORMAL = new AppPageStatus("EXAM_REVIEW_STUDY_NORMAL", 6, v.f73044o);
    public static final AppPageStatus EXAM_FINAL_REVIEW = new AppPageStatus("EXAM_FINAL_REVIEW", 7, v.f73045p);
    public static final AppPageStatus CAKE_STUDY = new AppPageStatus("CAKE_STUDY", 8, "cake_study");
    public static final AppPageStatus RHYME_STUDY = new AppPageStatus("RHYME_STUDY", 9, v.f73037h);
    public static final AppPageStatus RHYME_REVIEW = new AppPageStatus("RHYME_REVIEW", 10, v.f73038i);

    private static final /* synthetic */ AppPageStatus[] $values() {
        return new AppPageStatus[]{DEFAULT, STUDY_NORMAL, STUDY_FINAL_REVIEW, STUDY_REINFORCE, STUDY_MY_FAVOR, EXAM_PRIMARY_STUDY_NORMAL, EXAM_REVIEW_STUDY_NORMAL, EXAM_FINAL_REVIEW, CAKE_STUDY, RHYME_STUDY, RHYME_REVIEW};
    }

    static {
        AppPageStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AppPageStatus(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static a<AppPageStatus> getEntries() {
        return $ENTRIES;
    }

    public static AppPageStatus valueOf(String str) {
        return (AppPageStatus) Enum.valueOf(AppPageStatus.class, str);
    }

    public static AppPageStatus[] values() {
        return (AppPageStatus[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
