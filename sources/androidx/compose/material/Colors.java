package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,352:1\n85#2:353\n113#2,2:354\n85#2:356\n113#2,2:357\n85#2:359\n113#2,2:360\n85#2:362\n113#2,2:363\n85#2:365\n113#2,2:366\n85#2:368\n113#2,2:369\n85#2:371\n113#2,2:372\n85#2:374\n113#2,2:375\n85#2:377\n113#2,2:378\n85#2:380\n113#2,2:381\n85#2:383\n113#2,2:384\n85#2:386\n113#2,2:387\n85#2:389\n113#2,2:390\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n85#1:353\n85#1:354,2\n88#1:356\n88#1:357,2\n91#1:359\n91#1:360,2\n94#1:362\n94#1:363,2\n97#1:365\n97#1:366,2\n100#1:368\n100#1:369,2\n103#1:371\n103#1:372,2\n106#1:374\n106#1:375,2\n109#1:377\n109#1:378,2\n112#1:380\n112#1:381,2\n115#1:383\n115#1:384,2\n118#1:386\n118#1:387,2\n121#1:389\n121#1:390,2\n*E\n"})
/* loaded from: classes.dex */
public final class Colors {
    public static final int $stable = 0;

    @k
    private final MutableState background$delegate;

    @k
    private final MutableState error$delegate;

    @k
    private final MutableState isLight$delegate;

    @k
    private final MutableState onBackground$delegate;

    @k
    private final MutableState onError$delegate;

    @k
    private final MutableState onPrimary$delegate;

    @k
    private final MutableState onSecondary$delegate;

    @k
    private final MutableState onSurface$delegate;

    @k
    private final MutableState primary$delegate;

    @k
    private final MutableState primaryVariant$delegate;

    @k
    private final MutableState secondary$delegate;

    @k
    private final MutableState secondaryVariant$delegate;

    @k
    private final MutableState surface$delegate;

    public /* synthetic */ Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11, v vVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11);
    }

    @k
    /* renamed from: copy-pvPzIIM, reason: not valid java name */
    public final Colors m1592copypvPzIIM(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        return new Colors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1593getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1594getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1595getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1596getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1597getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1598getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1599getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1600getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1601getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1602getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondaryVariant-0d7_KjU, reason: not valid java name */
    public final long m1603getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1604getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m2519unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1605setBackground8_81llA$material_release(long j11) {
        this.background$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setError-8_81llA$material_release, reason: not valid java name */
    public final void m1606setError8_81llA$material_release(long j11) {
        this.error$delegate.setValue(Color.m2499boximpl(j11));
    }

    public final void setLight$material_release(boolean z11) {
        this.isLight$delegate.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: setOnBackground-8_81llA$material_release, reason: not valid java name */
    public final void m1607setOnBackground8_81llA$material_release(long j11) {
        this.onBackground$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setOnError-8_81llA$material_release, reason: not valid java name */
    public final void m1608setOnError8_81llA$material_release(long j11) {
        this.onError$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1609setOnPrimary8_81llA$material_release(long j11) {
        this.onPrimary$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1610setOnSecondary8_81llA$material_release(long j11) {
        this.onSecondary$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setOnSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1611setOnSurface8_81llA$material_release(long j11) {
        this.onSurface$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setPrimary-8_81llA$material_release, reason: not valid java name */
    public final void m1612setPrimary8_81llA$material_release(long j11) {
        this.primary$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1613setPrimaryVariant8_81llA$material_release(long j11) {
        this.primaryVariant$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setSecondary-8_81llA$material_release, reason: not valid java name */
    public final void m1614setSecondary8_81llA$material_release(long j11) {
        this.secondary$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release, reason: not valid java name */
    public final void m1615setSecondaryVariant8_81llA$material_release(long j11) {
        this.secondaryVariant$delegate.setValue(Color.m2499boximpl(j11));
    }

    /* renamed from: setSurface-8_81llA$material_release, reason: not valid java name */
    public final void m1616setSurface8_81llA$material_release(long j11) {
        this.surface$delegate.setValue(Color.m2499boximpl(j11));
    }

    @k
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m2517toStringimpl(m1600getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m2517toStringimpl(m1601getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m2517toStringimpl(m1602getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m2517toStringimpl(m1603getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m2517toStringimpl(m1593getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m2517toStringimpl(m1604getSurface0d7_KjU())) + ", error=" + ((Object) Color.m2517toStringimpl(m1594getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m2517toStringimpl(m1597getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m2517toStringimpl(m1598getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m2517toStringimpl(m1595getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m2517toStringimpl(m1599getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m2517toStringimpl(m1596getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }

    private Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m2499boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z11), SnapshotStateKt.structuralEqualityPolicy());
    }
}
