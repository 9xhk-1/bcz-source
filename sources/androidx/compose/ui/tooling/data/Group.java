package androidx.compose.ui.tooling.data;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@UiToolingDataApi
/* loaded from: classes2.dex */
public abstract class Group {
    public static final int $stable = 8;

    @k
    private final IntRect box;

    @k
    private final Collection<Group> children;

    @k
    private final Collection<Object> data;

    @l
    private final Object identity;
    private final boolean isInline;

    @l
    private final Object key;

    @l
    private final SourceLocation location;

    @l
    private final String name;

    public /* synthetic */ Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection collection, Collection collection2, boolean z11, v vVar) {
        this(obj, str, sourceLocation, obj2, intRect, collection, collection2, z11);
    }

    @k
    public final IntRect getBox() {
        return this.box;
    }

    @k
    public final Collection<Group> getChildren() {
        return this.children;
    }

    @k
    public final Collection<Object> getData() {
        return this.data;
    }

    @l
    public final Object getIdentity() {
        return this.identity;
    }

    @l
    public final Object getKey() {
        return this.key;
    }

    @l
    public final SourceLocation getLocation() {
        return this.location;
    }

    @k
    public List<ModifierInfo> getModifierInfo() {
        return h0.J();
    }

    @l
    public final String getName() {
        return this.name;
    }

    @k
    public List<ParameterInformation> getParameters() {
        return h0.J();
    }

    public final boolean isInline() {
        return this.isInline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection<? extends Object> collection, Collection<? extends Group> collection2, boolean z11) {
        this.key = obj;
        this.name = str;
        this.location = sourceLocation;
        this.identity = obj2;
        this.box = intRect;
        this.data = collection;
        this.children = collection2;
        this.isInline = z11;
    }
}
