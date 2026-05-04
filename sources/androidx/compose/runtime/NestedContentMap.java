package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1791:1\n1#2:1792\n118#3,4:1793\n123#3,4:1803\n287#4,6:1797\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n*L\n1780#1:1793,4\n1780#1:1803,4\n1780#1:1797,6\n*E\n"})
/* loaded from: classes.dex */
final class NestedContentMap {

    @k
    private final MutableScatterMap<Object, Object> contentMap = MultiValueMap.m2030constructorimpl$default(null, 1, null);

    @k
    private final MutableScatterMap<Object, Object> containerMap = MultiValueMap.m2030constructorimpl$default(null, 1, null);

    public final void add(@k MovableContent<Object> movableContent, @k NestedMovableContent nestedMovableContent) {
        MultiValueMap.m2026addimpl(this.contentMap, movableContent, nestedMovableContent);
        MultiValueMap.m2026addimpl(this.containerMap, nestedMovableContent.getContainer(), movableContent);
    }

    public final void clear() {
        MultiValueMap.m2028clearimpl(this.contentMap);
        MultiValueMap.m2028clearimpl(this.containerMap);
    }

    public final boolean contains(@k MovableContent<Object> movableContent) {
        return MultiValueMap.m2031containsimpl(this.contentMap, movableContent);
    }

    @l
    public final NestedMovableContent removeLast(@k MovableContent<Object> movableContent) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m2040removeLastimpl(this.contentMap, movableContent);
        if (MultiValueMap.m2037isEmptyimpl(this.contentMap)) {
            MultiValueMap.m2028clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void usedContainer(@k final MovableContentStateReference movableContentStateReference) {
        Object obj = this.containerMap.get(movableContentStateReference);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                g0.n(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.m2041removeValueIfimpl(this.contentMap, (MovableContent) obj, new x00.l<NestedMovableContent, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(g0.g(nestedMovableContent.getContainer(), MovableContentStateReference.this));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i11 = objectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj2 = objArr[i12];
                g0.n(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.m2041removeValueIfimpl(this.contentMap, (MovableContent) obj2, new x00.l<NestedMovableContent, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(g0.g(nestedMovableContent.getContainer(), MovableContentStateReference.this));
                    }
                });
            }
        }
    }
}
