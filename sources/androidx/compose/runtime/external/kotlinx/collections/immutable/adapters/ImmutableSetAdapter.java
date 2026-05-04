package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class ImmutableSetAdapter<E> extends ImmutableCollectionAdapter<E> implements ImmutableSet<E> {
    public static final int $stable = 0;

    public ImmutableSetAdapter(@k Set<? extends E> set) {
        super(set);
    }
}
