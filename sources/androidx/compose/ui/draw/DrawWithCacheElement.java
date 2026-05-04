package androidx.compose.ui.draw;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {

    @k
    private final l<CacheDrawScope, DrawResult> onBuildDrawCache;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(@k l<? super CacheDrawScope, DrawResult> lVar) {
        this.onBuildDrawCache = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawWithCacheElement copy$default(DrawWithCacheElement drawWithCacheElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = drawWithCacheElement.onBuildDrawCache;
        }
        return drawWithCacheElement.copy(lVar);
    }

    @k
    public final l<CacheDrawScope, DrawResult> component1() {
        return this.onBuildDrawCache;
    }

    @k
    public final DrawWithCacheElement copy(@k l<? super CacheDrawScope, DrawResult> lVar) {
        return new DrawWithCacheElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && g0.g(this.onBuildDrawCache, ((DrawWithCacheElement) obj).onBuildDrawCache);
    }

    @k
    public final l<CacheDrawScope, DrawResult> getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithCache");
        inspectorInfo.getProperties().set("onBuildDrawCache", this.onBuildDrawCache);
    }

    @k
    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public CacheDrawModifierNodeImpl create() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.setBlock(this.onBuildDrawCache);
    }
}
