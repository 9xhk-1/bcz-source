package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import h10.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFrameScope\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,969:1\n215#2,2:970\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFrameScope\n*L\n488#1:970,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseKeyFrameScope {
    public static final int $stable = 8;

    @k
    private final Map<String, Object> customPropertiesValue;

    @k
    private final Map<String, Object> keyFramePropertiesValue;

    public /* synthetic */ BaseKeyFrameScope(v vVar) {
        this();
    }

    public static /* synthetic */ d10.c addNameOnPropertyChange$default(BaseKeyFrameScope baseKeyFrameScope, NamedPropertyOrValue namedPropertyOrValue, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNameOnPropertyChange");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return baseKeyFrameScope.addNameOnPropertyChange(namedPropertyOrValue, str);
    }

    public static /* synthetic */ d10.c addOnPropertyChange$default(BaseKeyFrameScope baseKeyFrameScope, Object obj, String str, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnPropertyChange");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return baseKeyFrameScope.addOnPropertyChange(obj, str);
    }

    private final void putValuesAsArrayElements(CLContainer cLContainer, Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            CLArray arrayOrCreate = cLContainer.getArrayOrCreate(key);
            if (value instanceof String) {
                char[] charArray = ((String) value).toCharArray();
                g0.o(charArray, "this as java.lang.String).toCharArray()");
                CLString cLString = new CLString(charArray);
                cLString.setStart(0L);
                cLString.setEnd(charArray.length - 1);
                arrayOrCreate.add(cLString);
            } else if (value instanceof Dp) {
                arrayOrCreate.add(new CLNumber(((Dp) value).m5129unboximpl()));
            } else if (value instanceof Number) {
                arrayOrCreate.add(new CLNumber(((Number) value).floatValue()));
            }
        }
    }

    @k
    public final <E extends NamedPropertyOrValue> d10.c<E> addNameOnPropertyChange(final E e11, @l final String str) {
        return (d10.c<E>) new d10.c<E>(e11) { // from class: androidx.constraintlayout.compose.BaseKeyFrameScope$addNameOnPropertyChange$1
            /* JADX WARN: Incorrect types in method signature: (Lh10/n<*>;TE;TE;)V */
            @Override // d10.c
            public void afterChange(n nVar, NamedPropertyOrValue namedPropertyOrValue, NamedPropertyOrValue namedPropertyOrValue2) {
                Map map;
                String str2 = str;
                if (str2 == null) {
                    str2 = nVar.getName();
                }
                if (namedPropertyOrValue2 != null) {
                    map = this.keyFramePropertiesValue;
                    map.put(str2, namedPropertyOrValue2.getName());
                }
            }
        };
    }

    @k
    public final <T> d10.c<T> addOnPropertyChange(final T t11, @l final String str) {
        return new d10.c<T>(t11) { // from class: androidx.constraintlayout.compose.BaseKeyFrameScope$addOnPropertyChange$1
            @Override // d10.c
            public void afterChange(n<?> nVar, T t12, T t13) {
                Map map;
                Map map2;
                if (t13 != null) {
                    map2 = this.keyFramePropertiesValue;
                    String str2 = str;
                    if (str2 == null) {
                        str2 = nVar.getName();
                    }
                    map2.put(str2, t13);
                    return;
                }
                map = this.keyFramePropertiesValue;
                String str3 = str;
                if (str3 == null) {
                    str3 = nVar.getName();
                }
                map.remove(str3);
            }
        };
    }

    public final void addToContainer$constraintlayout_compose_release(@k CLContainer cLContainer) {
        putValuesAsArrayElements(cLContainer, this.keyFramePropertiesValue);
        CLObject objectOrNull = cLContainer.getObjectOrNull("custom");
        if (objectOrNull == null) {
            objectOrNull = new CLObject(new char[0]);
            cLContainer.put("custom", objectOrNull);
        }
        putValuesAsArrayElements(objectOrNull, this.customPropertiesValue);
    }

    @k
    public final Map<String, Object> getCustomPropertiesValue$constraintlayout_compose_release() {
        return this.customPropertiesValue;
    }

    private BaseKeyFrameScope() {
        this.keyFramePropertiesValue = new LinkedHashMap();
        this.customPropertiesValue = new LinkedHashMap();
    }
}
