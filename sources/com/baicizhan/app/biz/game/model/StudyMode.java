package com.baicizhan.app.biz.game.model;

import java.util.Iterator;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class StudyMode {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ StudyMode[] $VALUES;

    @k
    public static final a Companion;
    private final int value;
    public static final StudyMode Picture = new StudyMode("Picture", 0, 0);
    public static final StudyMode Deep = new StudyMode("Deep", 1, 1);
    public static final StudyMode Context = new StudyMode("Context", 2, 2);
    public static final StudyMode Rhythm = new StudyMode("Rhythm", 3, 3);
    public static final StudyMode Professional = new StudyMode("Professional", 4, 5);
    public static final StudyMode MinorJapanese = new StudyMode("MinorJapanese", 5, 6);
    public static final StudyMode MinorFrance = new StudyMode("MinorFrance", 6, 7);
    public static final StudyMode MinorSpanish = new StudyMode("MinorSpanish", 7, 8);
    public static final StudyMode MinorKorean = new StudyMode("MinorKorean", 8, 9);
    public static final StudyMode Cake = new StudyMode("Cake", 9, 10);
    public static final StudyMode CakeJapanese = new StudyMode("CakeJapanese", 10, 11);
    public static final StudyMode CakeKorean = new StudyMode("CakeKorean", 11, 12);
    public static final StudyMode AiLeadU = new StudyMode("AiLeadU", 12, 13);
    public static final StudyMode MinorGerman = new StudyMode("MinorGerman", 13, 14);
    public static final StudyMode MinorRussian = new StudyMode("MinorRussian", 14, 15);
    public static final StudyMode MinorCantonese = new StudyMode("MinorCantonese", 15, 16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nStudyMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyMode.kt\ncom/baicizhan/app/biz/game/model/StudyMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final StudyMode a(int i11) {
            Object obj;
            Iterator<E> it = StudyMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((StudyMode) obj).getValue() == i11) {
                    break;
                }
            }
            return (StudyMode) obj;
        }

        public a() {
        }
    }

    private static final /* synthetic */ StudyMode[] $values() {
        return new StudyMode[]{Picture, Deep, Context, Rhythm, Professional, MinorJapanese, MinorFrance, MinorSpanish, MinorKorean, Cake, CakeJapanese, CakeKorean, AiLeadU, MinorGerman, MinorRussian, MinorCantonese};
    }

    static {
        StudyMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private StudyMode(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<StudyMode> getEntries() {
        return $ENTRIES;
    }

    public static StudyMode valueOf(String str) {
        return (StudyMode) Enum.valueOf(StudyMode.class, str);
    }

    public static StudyMode[] values() {
        return (StudyMode[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
