package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,125:1\n1#2:126\n75#3:127\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n58#1:127\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableStateHolderKt {
    @Composable
    @k
    public static final SaveableStateHolder rememberSaveableStateHolder(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(15454635, i11, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:56)");
        }
        composer.startReplaceGroup(-796079677);
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.m2066rememberSaveable(new Object[0], (Saver) SaveableStateHolderImpl.Companion.getSaver(), (String) null, (a) new a<SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$rememberSaveableStateHolder$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final SaveableStateHolderImpl invoke() {
                return new SaveableStateHolderImpl(null, 1, null);
            }
        }, composer, 3072, 4);
        saveableStateHolderImpl.setParentSaveableStateRegistry((SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()));
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return saveableStateHolderImpl;
    }
}
