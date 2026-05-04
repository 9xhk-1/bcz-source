package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SelectionRegistrar {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    @k
    LongObjectMap<Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j11);

    void notifySelectableChange(long j11);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo1494notifySelectionUpdatenjBpvok(@k LayoutCoordinates layoutCoordinates, long j11, long j12, boolean z11, @k SelectionAdjustment selectionAdjustment, boolean z12);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j11, boolean z11);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo1495notifySelectionUpdateStartubNVwUQ(@k LayoutCoordinates layoutCoordinates, long j11, @k SelectionAdjustment selectionAdjustment, boolean z11);

    @k
    Selectable subscribe(@k Selectable selectable);

    void unsubscribe(@k Selectable selectable);
}
