package androidx.compose.ui.semantics;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import y00.a;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,198:1\n320#2:199\n320#2:200\n320#2:201\n385#2:203\n357#2,4:204\n329#2,6:208\n339#2,3:215\n342#2,9:219\n361#2:228\n386#2:229\n357#2,4:230\n329#2,6:234\n339#2,3:241\n342#2,9:245\n361#2:254\n357#2,4:255\n329#2,6:259\n339#2,3:266\n342#2,9:270\n361#2:279\n357#2,4:280\n329#2,6:284\n339#2,3:291\n342#2,9:295\n361#2:304\n1#3:202\n1399#4:214\n1270#4:218\n1399#4:240\n1270#4:244\n1399#4:265\n1270#4:269\n1399#4:290\n1270#4:294\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n41#1:199\n49#1:200\n55#1:201\n78#1:203\n78#1:204,4\n78#1:208,6\n78#1:215,3\n78#1:219,9\n78#1:228\n78#1:229\n100#1:230,4\n100#1:234,6\n100#1:241,3\n100#1:245,9\n100#1:254\n127#1:255,4\n127#1:259,6\n127#1:266,3\n127#1:270,9\n127#1:279\n184#1:280,4\n184#1:284,6\n184#1:291,3\n184#1:295,9\n184#1:304\n78#1:214\n78#1:218\n100#1:240\n100#1:244\n127#1:265\n127#1:269\n184#1:290\n184#1:294\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, a {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;

    @l
    private Map<SemanticsPropertyKey<?>, ? extends Object> mapWrapper;

    @k
    private final MutableScatterMap<SemanticsPropertyKey<?>, Object> props = ScatterMapKt.mutableScatterMapOf();

    public final void collapsePeer$ui_release(@k SemanticsConfiguration semanticsConfiguration) {
        int i11;
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap = semanticsConfiguration.props;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j11) < 128) {
                        int i16 = (i12 << 3) + i15;
                        Object obj = objArr[i16];
                        Object obj2 = objArr2[i16];
                        SemanticsPropertyKey<?> semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!this.props.contains(semanticsPropertyKey)) {
                            this.props.set(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object obj3 = this.props.get(semanticsPropertyKey);
                            g0.n(obj3, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            AccessibilityAction accessibilityAction = (AccessibilityAction) obj3;
                            MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap2 = this.props;
                            String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((AccessibilityAction) obj2).getLabel();
                            }
                            i11 = i13;
                            String str = label;
                            w action = accessibilityAction.getAction();
                            if (action == null) {
                                action = ((AccessibilityAction) obj2).getAction();
                            }
                            mutableScatterMap2.set(semanticsPropertyKey, new AccessibilityAction(str, action));
                            j11 >>= i11;
                            i15++;
                            i13 = i11;
                        }
                    }
                    i11 = i13;
                    j11 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final <T> boolean contains(@k SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.props.containsKey(semanticsPropertyKey);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap = this.props;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            if (((SemanticsPropertyKey) obj).isImportantForAccessibility$ui_release()) {
                                return true;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @k
    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return g0.g(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public final <T> T get(@k SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t11 = (T) this.props.get(semanticsPropertyKey);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(@k SemanticsPropertyKey<T> semanticsPropertyKey, @k x00.a<? extends T> aVar) {
        T t11 = (T) this.props.get(semanticsPropertyKey);
        return t11 == null ? aVar.invoke() : t11;
    }

    @l
    public final <T> T getOrElseNullable(@k SemanticsPropertyKey<T> semanticsPropertyKey, @k x00.a<? extends T> aVar) {
        T t11 = (T) this.props.get(semanticsPropertyKey);
        return t11 == null ? aVar.invoke() : t11;
    }

    @k
    public final MutableScatterMap<SemanticsPropertyKey<?>, Object> getProps$ui_release() {
        return this.props;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map<SemanticsPropertyKey<?>, ? extends Object> map = this.mapWrapper;
        if (map == null) {
            map = this.props.asMap();
            this.mapWrapper = map;
        }
        return map.entrySet().iterator();
    }

    public final void mergeChild$ui_release(@k SemanticsConfiguration semanticsConfiguration) {
        MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap = semanticsConfiguration.props;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        SemanticsPropertyKey<?> semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        Object obj3 = this.props.get(semanticsPropertyKey);
                        g0.n(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object merge = semanticsPropertyKey.merge(obj3, obj2);
                        if (merge != null) {
                            this.props.set(semanticsPropertyKey, merge);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(@k SemanticsPropertyKey<T> semanticsPropertyKey, T t11) {
        if (!(t11 instanceof AccessibilityAction) || !contains(semanticsPropertyKey)) {
            this.props.set(semanticsPropertyKey, t11);
            return;
        }
        Object obj = this.props.get(semanticsPropertyKey);
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap = this.props;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) t11;
        String label = accessibilityAction2.getLabel();
        if (label == null) {
            label = accessibilityAction.getLabel();
        }
        w action = accessibilityAction2.getAction();
        if (action == null) {
            action = accessibilityAction.getAction();
        }
        mutableScatterMap.set(semanticsPropertyKey, new AccessibilityAction(label, action));
    }

    public final void setClearingSemantics(boolean z11) {
        this.isClearingSemantics = z11;
    }

    public final void setMergingSemanticsOfDescendants(boolean z11) {
        this.isMergingSemanticsOfDescendants = z11;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = j2.O;
        }
        if (this.isClearingSemantics) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = j2.O;
        }
        MutableScatterMap<SemanticsPropertyKey<?>, Object> mutableScatterMap = this.props;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            sb2.append(str);
                            sb2.append(((SemanticsPropertyKey) obj).getName());
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = j2.O;
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb2) + " }";
    }
}
