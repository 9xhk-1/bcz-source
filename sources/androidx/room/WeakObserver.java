package androidx.room;

import androidx.room.InvalidationTracker;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class WeakObserver extends InvalidationTracker.Observer {

    @m80.k
    private final WeakReference<InvalidationTracker.Observer> delegateRef;

    @m80.k
    private final InvalidationTracker tracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeakObserver(@m80.k InvalidationTracker tracker, @m80.k InvalidationTracker.Observer delegate) {
        super(delegate.getTables$room_runtime_release());
        g0.p(tracker, "tracker");
        g0.p(delegate, "delegate");
        this.tracker = tracker;
        this.delegateRef = new WeakReference<>(delegate);
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(@m80.k Set<String> tables) {
        g0.p(tables, "tables");
        InvalidationTracker.Observer observer = this.delegateRef.get();
        if (observer == null) {
            this.tracker.removeObserver(this);
        } else {
            observer.onInvalidated(tables);
        }
    }
}
