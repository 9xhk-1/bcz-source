package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DesignElement {
    public static final int $stable = 8;

    /* renamed from: id, reason: collision with root package name */
    @k
    private String f4241id;

    @k
    private HashMap<String, String> params;

    @k
    private String type;

    public DesignElement(@k String str, @k String str2, @k HashMap<String, String> hashMap) {
        this.f4241id = str;
        this.type = str2;
        this.params = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesignElement copy$default(DesignElement designElement, String str, String str2, HashMap hashMap, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = designElement.f4241id;
        }
        if ((i11 & 2) != 0) {
            str2 = designElement.type;
        }
        if ((i11 & 4) != 0) {
            hashMap = designElement.params;
        }
        return designElement.copy(str, str2, hashMap);
    }

    @k
    public final String component1() {
        return this.f4241id;
    }

    @k
    public final String component2() {
        return this.type;
    }

    @k
    public final HashMap<String, String> component3() {
        return this.params;
    }

    @k
    public final DesignElement copy(@k String str, @k String str2, @k HashMap<String, String> hashMap) {
        return new DesignElement(str, str2, hashMap);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DesignElement)) {
            return false;
        }
        DesignElement designElement = (DesignElement) obj;
        return g0.g(this.f4241id, designElement.f4241id) && g0.g(this.type, designElement.type) && g0.g(this.params, designElement.params);
    }

    @k
    public final String getId() {
        return this.f4241id;
    }

    @k
    public final HashMap<String, String> getParams() {
        return this.params;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.f4241id.hashCode() * 31) + this.type.hashCode()) * 31) + this.params.hashCode();
    }

    public final void setId(@k String str) {
        this.f4241id = str;
    }

    public final void setParams(@k HashMap<String, String> hashMap) {
        this.params = hashMap;
    }

    public final void setType(@k String str) {
        this.type = str;
    }

    @k
    public String toString() {
        return "DesignElement(id=" + this.f4241id + ", type=" + this.type + ", params=" + this.params + ')';
    }
}
