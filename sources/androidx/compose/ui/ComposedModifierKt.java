package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import m80.k;
import w00.j;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposedModifierKt {
    @k
    public static final Modifier composed(@k Modifier modifier, @k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new ComposedModifier(lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, l lVar, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, lVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(final Composer composer, Modifier modifier) {
        if (modifier.all(new l<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$1
            @Override // x00.l
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new p<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // x00.p
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                Modifier materializeImpl;
                boolean z11 = element instanceof ComposedModifier;
                Modifier modifier4 = element;
                if (z11) {
                    q<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
                    g0.n(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    materializeImpl = ComposedModifierKt.materializeImpl(Composer.this, (Modifier) ((q) x0.q(factory, 3)).invoke(Modifier.Companion, Composer.this, 0));
                    modifier4 = materializeImpl;
                }
                return modifier3.then(modifier4);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    @j(name = "materializeModifier")
    @k
    public static final Modifier materializeModifier(@k Composer composer, @k Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier materializeImpl = materializeImpl(composer, modifier);
        composer.endReplaceGroup();
        return materializeImpl;
    }

    @k
    public static final Modifier materializeWithCompositionLocalInjectionInternal(@k Composer composer, @k Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }

    @k
    public static final Modifier composed(@k Modifier modifier, @k String str, @m80.l Object obj, @k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier1(str, obj, lVar, qVar));
    }

    @k
    public static final Modifier composed(@k Modifier modifier, @k String str, @m80.l Object obj, @m80.l Object obj2, @k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, l lVar, q qVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (l<? super InspectorInfo, g2>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    @k
    public static final Modifier composed(@k Modifier modifier, @k String str, @m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, lVar, qVar));
    }

    @k
    public static final Modifier composed(@k Modifier modifier, @k String str, @k Object[] objArr, @k l<? super InspectorInfo, g2> lVar, @k q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, l lVar, q qVar, int i11, Object obj3) {
        if ((i11 & 8) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, lVar, qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, l lVar, q qVar, int i11, Object obj4) {
        if ((i11 & 16) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, lVar, qVar);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, l lVar, q qVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (l<? super InspectorInfo, g2>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }
}
