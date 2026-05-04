package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(@k p<? super Composer, ? super Integer, g2> pVar);

    <R> R delegateInvalidations(@l ControlledComposition controlledComposition, int i11, @k x00.a<? extends R> aVar);

    @InternalComposeApi
    void disposeUnusedMovableContent(@k MovableContentState movableContentState);

    @l
    ShouldPauseCallback getAndSetShouldPauseCallback(@l ShouldPauseCallback shouldPauseCallback);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(@k List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@k Set<? extends Object> set);

    void prepareCompose(@k x00.a<g2> aVar);

    boolean recompose();

    void recordModificationsOf(@k Set<? extends Object> set);

    void recordReadOf(@k Object obj);

    void recordWriteOf(@k Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
