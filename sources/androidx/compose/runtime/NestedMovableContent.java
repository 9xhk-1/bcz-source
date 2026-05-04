package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@InternalComposeApi
/* loaded from: classes.dex */
final class NestedMovableContent {

    @k
    private final MovableContentStateReference container;

    @k
    private final MovableContentStateReference content;

    public NestedMovableContent(@k MovableContentStateReference movableContentStateReference, @k MovableContentStateReference movableContentStateReference2) {
        this.content = movableContentStateReference;
        this.container = movableContentStateReference2;
    }

    @k
    public final MovableContentStateReference getContainer() {
        return this.container;
    }

    @k
    public final MovableContentStateReference getContent() {
        return this.content;
    }
}
