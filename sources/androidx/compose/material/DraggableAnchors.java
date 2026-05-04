package androidx.compose.material;

import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    @l
    T closestAnchor(float f11);

    @l
    T closestAnchor(float f11, boolean z11);

    int getSize();

    boolean hasAnchorFor(T t11);

    float maxAnchor();

    float minAnchor();

    float positionOf(T t11);
}
