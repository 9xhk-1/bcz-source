package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import m80.k;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Center' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class MainAxisAlignment {
    private static final /* synthetic */ MainAxisAlignment[] $VALUES;
    public static final MainAxisAlignment Center;
    public static final MainAxisAlignment End;
    public static final MainAxisAlignment SpaceAround;
    public static final MainAxisAlignment SpaceBetween;
    public static final MainAxisAlignment SpaceEvenly;
    public static final MainAxisAlignment Start;

    @k
    private final Arrangement.Vertical arrangement;

    private static final /* synthetic */ MainAxisAlignment[] $values() {
        return new MainAxisAlignment[]{Center, Start, End, SpaceEvenly, SpaceBetween, SpaceAround};
    }

    static {
        Arrangement arrangement = Arrangement.INSTANCE;
        Center = new MainAxisAlignment("Center", 0, arrangement.getCenter());
        Start = new MainAxisAlignment("Start", 1, arrangement.getTop());
        End = new MainAxisAlignment("End", 2, arrangement.getBottom());
        SpaceEvenly = new MainAxisAlignment("SpaceEvenly", 3, arrangement.getSpaceEvenly());
        SpaceBetween = new MainAxisAlignment("SpaceBetween", 4, arrangement.getSpaceBetween());
        SpaceAround = new MainAxisAlignment("SpaceAround", 5, arrangement.getSpaceAround());
        $VALUES = $values();
    }

    private MainAxisAlignment(String str, int i11, Arrangement.Vertical vertical) {
        this.arrangement = vertical;
    }

    public static MainAxisAlignment valueOf(String str) {
        return (MainAxisAlignment) Enum.valueOf(MainAxisAlignment.class, str);
    }

    public static MainAxisAlignment[] values() {
        return (MainAxisAlignment[]) $VALUES.clone();
    }

    @k
    public final Arrangement.Vertical getArrangement$flowlayout_release() {
        return this.arrangement;
    }
}
