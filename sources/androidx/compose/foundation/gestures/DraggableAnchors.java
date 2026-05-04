package androidx.compose.foundation.gestures;

import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    @l
    T anchorAt(int i11);

    @l
    T closestAnchor(float f11);

    @l
    T closestAnchor(float f11, boolean z11);

    int getSize();

    boolean hasPositionFor(T t11);

    float maxPosition();

    float minPosition();

    float positionAt(int i11);

    float positionOf(T t11);
}
