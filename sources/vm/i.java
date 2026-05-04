package vm;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final String f94073c = "MotionSpec";

    /* renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<String, j> f94074a = new SimpleArrayMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final SimpleArrayMap<String, PropertyValuesHolder[]> f94075b = new SimpleArrayMap<>();

    public static void a(@NonNull i iVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            iVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            iVar.m(objectAnimator.getPropertyName(), j.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    @Nullable
    public static i c(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @Nullable
    public static i d(@NonNull Context context, @AnimatorRes int i11) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return e(arrayList);
        } catch (Exception e11) {
            Log.w(f94073c, "Can't load animation resource ID #0x" + Integer.toHexString(i11), e11);
            return null;
        }
    }

    @NonNull
    public static i e(@NonNull List<Animator> list) {
        i iVar = new i();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a(iVar, list.get(i11));
        }
        return iVar;
    }

    @NonNull
    public final PropertyValuesHolder[] b(@NonNull PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i11 = 0; i11 < propertyValuesHolderArr.length; i11++) {
            propertyValuesHolderArr2[i11] = propertyValuesHolderArr[i11].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f94074a.equals(((i) obj).f94074a);
        }
        return false;
    }

    @NonNull
    public <T> ObjectAnimator f(@NonNull String str, @NonNull T t11, @NonNull Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t11, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @NonNull
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f94075b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public j h(String str) {
        if (k(str)) {
            return this.f94074a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f94074a.hashCode();
    }

    public long i() {
        int size = this.f94074a.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j valueAt = this.f94074a.valueAt(i11);
            j11 = Math.max(j11, valueAt.c() + valueAt.d());
        }
        return j11;
    }

    public boolean j(String str) {
        return this.f94075b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f94074a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f94075b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @Nullable j jVar) {
        this.f94074a.put(str, jVar);
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + l50.b.f69927i + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f94074a + "}\n";
    }
}
