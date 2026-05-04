package androidx.compose.runtime;

import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;
import x00.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class SkippableUpdater<T> {

    @k
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m1924boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1926equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && g0.g(composer, ((SkippableUpdater) obj).m1931unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1927equalsimpl0(Composer composer, Composer composer2) {
        return g0.g(composer, composer2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1928hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1929toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m1930updateimpl(Composer composer, @k l<? super Updater<T>, g2> lVar) {
        composer.startReplaceableGroup(509942095);
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m1926equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1928hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1929toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m1931unboximpl() {
        return this.composer;
    }

    @v0
    public static /* synthetic */ void getComposer$annotations() {
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m1925constructorimpl(@k Composer composer) {
        return composer;
    }
}
