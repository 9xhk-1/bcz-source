package androidx.compose.runtime;

import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;
import x00.l;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class Updater<T> {

    @k
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m1950boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1952equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && g0.g(composer, ((Updater) obj).m1962unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1953equalsimpl0(Composer composer, Composer composer2) {
        return g0.g(composer, composer2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1954hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m1955initimpl(Composer composer, @k final l<? super T, g2> lVar) {
        if (composer.getInserting()) {
            composer.apply(g2.f100423a, new p<T, g2, g2>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Object obj, g2 g2Var) {
                    invoke2((Updater$init$1<T>) obj, g2Var);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t11, g2 g2Var) {
                    lVar.invoke(t11);
                }
            });
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m1956reconcileimpl(Composer composer, @k final l<? super T, g2> lVar) {
        composer.apply(g2.f100423a, new p<T, g2, g2>() { // from class: androidx.compose.runtime.Updater$reconcile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Object obj, g2 g2Var) {
                invoke2((Updater$reconcile$1<T>) obj, g2Var);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t11, g2 g2Var) {
                lVar.invoke(t11);
            }
        });
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1957setimpl(Composer composer, int i11, @k p<? super T, ? super Integer, g2> pVar) {
        if (composer.getInserting() || !g0.g(composer.rememberedValue(), Integer.valueOf(i11))) {
            composer.updateRememberedValue(Integer.valueOf(i11));
            composer.apply(Integer.valueOf(i11), pVar);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1959toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m1960updateimpl(Composer composer, int i11, @k p<? super T, ? super Integer, g2> pVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !g0.g(composer.rememberedValue(), Integer.valueOf(i11))) {
            composer.updateRememberedValue(Integer.valueOf(i11));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i11), pVar);
        }
    }

    public boolean equals(Object obj) {
        return m1952equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m1954hashCodeimpl(this.composer);
    }

    public String toString() {
        return m1959toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m1962unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m1958setimpl(Composer composer, V v11, @k p<? super T, ? super V, g2> pVar) {
        if (composer.getInserting() || !g0.g(composer.rememberedValue(), v11)) {
            composer.updateRememberedValue(v11);
            composer.apply(v11, pVar);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m1961updateimpl(Composer composer, V v11, @k p<? super T, ? super V, g2> pVar) {
        boolean inserting = composer.getInserting();
        if (inserting || !g0.g(composer.rememberedValue(), v11)) {
            composer.updateRememberedValue(v11);
            if (inserting) {
                return;
            }
            composer.apply(v11, pVar);
        }
    }

    @v0
    public static /* synthetic */ void getComposer$annotations() {
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m1951constructorimpl(@k Composer composer) {
        return composer;
    }
}
